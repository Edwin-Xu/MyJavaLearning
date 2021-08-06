package io.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Edwin Xu on 10/21/2020 8:46 PM.
 */

public class ByteArrPrint {
    public static void main(String[] args)  throws Exception{
        byte [] bytes = {
                65,66,10,67,68
        };
        System.out.println((int)'\n'); //10
        BufferedReader reader = new BufferedReader(new InputStreamReader( new ByteArrayInputStream(bytes)));
       System.out.println(reader.readLine());
       System.out.println(reader.readLine());

        System.out.println((-12)%(-5));
    }
}
