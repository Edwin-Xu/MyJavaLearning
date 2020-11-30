package io.nio;

/**
 * Created by Edwin Xu on 9/27/2020 5:01 PM
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * 阻塞点this.selector.select();
 * 轮询器虽然是一个线程内部也是线程池
 */
public class NioSocket {
    private Selector selector;   //通道管理器(管理器)

    /**
     * 初始化Channel并绑定端口
     * @param port
     * @throws IOException
     */
    public void initServer(int port) throws IOException {
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.configureBlocking(false);  //非阻塞
        serverChannel.socket().bind(new InetSocketAddress(port));

        this.selector = Selector.open();
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务器已启动...");

    }

    /**
     * 监听轮询器
     * @throws IOException
     */
    public void listenSelector() throws IOException {
        //轮询监听selector
        while (true){
            //等待客户连接
            //select模型,多路复用
            //this.selector.select();   //在这里会阻塞,无论是连接还是客户端发送数据还是客户端关闭,这里都会触发
            this.selector.selectNow();   //这里不阻塞会立即执行
            Iterator<SelectionKey> iteKey = this.selector.selectedKeys().iterator();
            while (iteKey.hasNext()){
                SelectionKey key = iteKey.next();
                iteKey.remove();  //移除,防止重复处理
                //处理请求
                handler(key);
            }
        }
    }

    /**
     * 处理客户端请求
     * @param key
     */
    private void handler(SelectionKey key) throws IOException {
        if (key.isAcceptable()){  //处理连接请求
            //处理客户端连接请求事件
            ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
            SocketChannel socketChannel = serverChannel.accept();
            //接受客户端发送的信息时,需要给通道设置读权限
            socketChannel.configureBlocking(false);
            socketChannel.register(selector,SelectionKey.OP_READ);
        }else if(key.isReadable()){   //处理读请求
            //处理读事件
            SocketChannel socketChannel = (SocketChannel) key.channel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int readData = socketChannel.read(buffer);
            if (readData>0){
                String info  = new String(buffer.array(),"GBK").trim();
                System.out.println("服务端收到数据: "+Thread.currentThread()+info);
            }else {
                System.out.println("客户端关闭了...");
                key.cancel();
            }
        }
    }


    public static void main(String[] args) throws IOException {
        NioSocket nio = new NioSocket();
        nio.initServer(8888);
        nio.listenSelector();
    }

}