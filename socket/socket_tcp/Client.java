package socket.socket_tcp;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Edwin Xu on 8/24/2020 10:16 PM
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",1000);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("hello");
            pw.flush();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
