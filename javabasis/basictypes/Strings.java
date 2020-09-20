package javabasis.basictypes;

/**
 * Created by Edwin Xu on 5/12/2020 9:44 PM
 */
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        sb.append(12);
        sb.append('c');
        sb.append("sdds");
        sb.deleteCharAt(0);
        String s = sb.toString();
        System.out.println(s);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Sdsd");
        stringBuffer.append("Sdsd");
        stringBuffer.append("Sdsd");

        System.out.println(stringBuffer.toString());


        String ss = new String("aaa");
        String ss1 = "aaa";
        System.out.println(ss1==ss);




    }
}
