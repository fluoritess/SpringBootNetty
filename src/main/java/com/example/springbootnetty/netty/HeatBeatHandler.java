package com.example.springbootnetty.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.concurrent.GlobalEventExecutor;

public class HeatBeatHandler  extends ChannelInboundHandlerAdapter {
    public static ChannelGroup channels=new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
       if(evt instanceof IdleStateEvent){
                IdleStateEvent event=(IdleStateEvent)evt;
                if(event.state()== IdleState.READER_IDLE){
                    System.out.print("进入读空闲");
                }else if(event.state()==IdleState.WRITER_IDLE){
                    System.out.print("进入写空闲");
                }
                else if(event.state()==IdleState.ALL_IDLE){
                    Channel channel=ctx.channel();
                    channel.close();
                    System.out.print("channel关闭后,users的数量为:"+  HeatBeatHandler.channels.size());
                }
       }
    }
}
