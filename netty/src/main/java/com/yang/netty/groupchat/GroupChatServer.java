package com.yang.netty.groupchat;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @author chilcyWind
 * @Description
 * @Author Yang
 * @Date 2021/8/16
 * @Version 1.0
 **/
public class GroupChatServer {
    private int port; //监听端口


    public GroupChatServer(int port) {
        this.port = port;
    }
    public void run(){
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup(4);
    }

    public static void main(String[] args) {

    }

}
