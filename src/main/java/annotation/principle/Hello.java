package annotation.principle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.FIELD,ElementType.METHOD})
//解永久存活，以便我们反射获取。
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hello {
    String value();
}
/*
* 反编译：
* public interface annotation.principle.Hello extends java.lang.annotation.Annotation
* */