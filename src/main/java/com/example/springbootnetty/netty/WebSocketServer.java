package com.example.springbootnetty.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Component;

@Component
class WebScoketServer<main> {

    private EventLoopGroup mianGroup;
    private EventLoopGroup subGroup;
    private ServerBootstrap serverBootstrap;
    private ChannelFuture channelFuture;

    private static class SingletionWSServer {
        static final WebScoketServer instance = new WebScoketServer();
    }

    public static WebScoketServer getInstance() {
        return SingletionWSServer.instance;
    }

    public WebScoketServer() {
        mianGroup = new NioEventLoopGroup();
        subGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(mianGroup, subGroup).channel(NioServerSocketChannel.class).childHandler(new WSServerInitialzer());
    }

    public void start() {
        this.channelFuture = serverBootstrap.bind(8088);
        System.err.print("netty websocket server 启动完毕");
    }
}

