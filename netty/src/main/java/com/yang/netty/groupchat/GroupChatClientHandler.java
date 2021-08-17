package com.yang.netty.groupchat;

/**
 * @author chilcyWind
 * @Description
 * @Author Yang
 * @Date 2021/8/16
 * @Version 1.0
 **/

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class GroupChatClientHandler extends SimpleChannelInboundHandler<String> {

    //从服务器拿到的数据
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(msg.trim());
    }
}
