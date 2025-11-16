package advanced;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class MyObject {
    public String someField = "Hien Giang";
    public MyObject() {}

    public MyObject(String s) {}

    public String doSomething() {return "";}

    public String doSomething(String s) { return s;}

}
public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class myObjectClass = MyObject.class;
        String className = myObjectClass.getName();
        String simpleName = myObjectClass.getSimpleName();
        System.out.printf("class name: %s, simple name: %s\n", className, simpleName);
        Package p = myObjectClass.getPackage();
        System.out.printf("package name = %s\n", p);

        // Constructor
        Constructor[] contructors = myObjectClass.getConstructors();
        Constructor oneParamConstructor = myObjectClass.getConstructor(new Class[]{String.class});
        Constructor defaultConstructor = MyObject.class.getConstructor();
        System.out.printf("one param constructor: %s\n", oneParamConstructor);
        System.out.printf("constructors: %s\n", Arrays.toString(contructors));
        System.out.println();
        MyObject defaultObj =  (MyObject) defaultConstructor.newInstance();

        // Field
        Field[] fields = myObjectClass.getFields();
        System.out.println(Arrays.toString(fields));
        Field someField = myObjectClass.getField("someField");
        Object someFieldType = someField.getType();
        System.out.printf("someFieldType: %s\n", someFieldType);
        MyObject objInstance = new MyObject();
        System.out.printf("someField = %s\n", someField.get(objInstance));
        someField.set(objInstance, "Giang Hien");
        System.out.printf("someField = %s\n", someField.get(objInstance));
        System.out.println();
        // Method
        Method[] methods = myObjectClass.getMethods();
        System.out.printf("methods: %s\n", Arrays.toString(methods));
        Method method = myObjectClass.getMethod("doSomething", null);
        Method paramMethod = myObjectClass.getMethod("doSomething", String.class);
        System.out.printf("method: %s\n", method);
        System.out.printf("parameters: %s\n", Arrays.toString(paramMethod.getParameters()));
        System.out.printf("return type: %s\n", paramMethod.getReturnType());
        Method baseMethod = MyObject.class.getMethod("doSomething", String.class);
        MyObject methodInstance = new MyObject();
        System.out.printf("return value after invoking method = %s",
                baseMethod.invoke(methodInstance, "Giang Tuan Hien"));
    }
}
