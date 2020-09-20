package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by Edwin Xu on 8/7/2020 6:58 PM
 */

@Target(ElementType.METHOD)
public @interface SetName {
    String name() default "edwinxu";
    /*
    * 注解需要被解析，
    * 使用工厂来解析
    * */
}
