package socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

/**
 * Created by Edwin Xu on 8/24/2020 9:18 PM
 */
public class SocketTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getCanonicalHostName());
            byte [] bytes = inetAddress.getAddress(); //ip 地址

//            InetAddress address3 =InetAddress.getByName("212.64.87.56");
//            System.out.println(address3.getHostName());
//            System.out.println(address3.getCanonicalHostName());


            //使用URL读取网页内容
//创建一个URL实例
            URL url =new URL("https://www.heibaizhibo.com/live/soccer/zhongchao/870734#548933");
            InputStream is = url.openStream();//通过openStream方法获取资源的字节输入流
            InputStreamReader isr =new InputStreamReader(is,"UTF-8");//将字节输入流转换为字符输入流,如果不指定编码，中文可能会出现乱码
            BufferedReader br =new BufferedReader(isr);//为字符输入流添加缓冲，提高读取效率
            String data = br.readLine();//读取数据
            while(data!=null){
                System.out.println(data);//输出数据
                data = br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
