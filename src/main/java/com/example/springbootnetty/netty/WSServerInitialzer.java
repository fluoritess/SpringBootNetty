package com.example.springbootnetty.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

public class WSServerInitialzer extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline=socketChannel.pipeline();
        //websocket基于http协议，所以要有http编解码器
        pipeline.addLast(new HttpServerCodec());
        //对写大数据流的支持
        pipeline.addLast(new ChunkedWriteHandler());
        //对httpMessage进行聚合，聚合成FullHttpRequest或FullHttpResponse,1024*64是消息的最大长度
        pipeline.addLast(new HttpObjectAggregator(1024*64));
        /**
         *webcocket服务器处理的协议，用于指定给客户端连接访问的路由:/ws
         * 本handler会帮你处理一些繁重的复杂的事
         * 对于websocket来讲，都是以frames进行传输的，不同的数据类型对应的frames也不同
         */
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));
        pipeline.addLast(new ChatHandler());

        //支持心跳
        pipeline.addLast(new IdleStateHandler(2,4,6));
        //自定义空闲检测
        pipeline.addLast(new HeatBeatHandler());
    }
}
