package basics;

import java.lang.annotation.*;

@Deprecated
/*
    @deprecated Use NewComponent instead
 */
class DeprecatedComponent {
    // Compiler will show warning when using this class
}

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    String value() default "";
    String name();
    int age();
    String[] newNames();
}

@MyAnnotation(name = "Hien Giang", age = 23, newNames = {"James", "Taki"})
class MyClass {

}


class MyChildClass extends MyClass {
// Child class inherits @basics.MyAnnotation because of @Inherited is declared
}

public class Annotation {
    public static void main(String[] args) {
        DeprecatedComponent d = new DeprecatedComponent();
    }
}
