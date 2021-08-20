package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author taoxu.xu
 * @date 8/9/2021 9:59 AM
 */
public class TryResource {
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("D://d")) {

        } catch (IOException e) {

        }
    }
}
