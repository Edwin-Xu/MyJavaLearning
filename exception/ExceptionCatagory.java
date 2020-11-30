package exception;

import java.lang.String;

/**
 * Created by Edwin Xu on 6/23/2020 4:05 PM
 */
public class ExceptionCatagory {
    private static void mythrow(int a){
        if (a<0){
            throw new ArithmeticException("a < 0 !!!");
        }else if (a==0){
//            throw new Exception("a < 0 !!!");
//            throw new NoSuchFieldException("df");
        }
        /*
        * 如果是Checked异常，就必须放在try中，或者方法throws
        * 否则，如果是RUNTIME异常，throw即可，运行时自动抛出，中断方法执行。
        *
        * */
    }
    public static void main(String[] args) {
        ExceptionCatagory.mythrow(-1);
    }
}

/*
*
* Throwable：
*   - Error:
*       - outofmemory
*   - Exception:
*       - RuntimeException
*       - IOException and other exceptions
*
* */