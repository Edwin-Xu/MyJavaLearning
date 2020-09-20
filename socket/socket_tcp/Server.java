package socket.socket_tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Edwin Xu on 8/24/2020 10:01 PM
 */
public class Server {


    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1000);
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine())!=null){
                System.out.println(msg);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
