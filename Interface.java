interface IHello {
    String hello = "Hello";
    void sayHello();
}

interface IHello2 {
    String hello = "hello2";
    void sayHello();
}

interface IGoodbye extends  IGreeting {
    String goodbye = "Goodbye";
    void sayGoodbye();
}

interface IGreeting {

}

class Hello implements IHello, IHello2, IGoodbye {
    @Override
    public void sayHello() {
        System.out.println(IHello.hello);
    }
    @Override
    public void sayGoodbye() {
        System.out.println(IGoodbye.goodbye);
    }
}

interface ResourceLoader {
    static boolean isPathExisted(String path) {
        return true;
    }
    default void defaultLoad(String resourcePath) {
        if (!ResourceLoader.isPathExisted(resourcePath)) {
            return;
        }
    }

    void load(String resourcePath);
}

class FileLoader implements ResourceLoader {
    @Override
    public void load(String resourcePath) {

    }
}


public class Interface {
    public static void main(String[] args) {
//        IHello myInterface = new MyInterfaceImpl();
    }
}
