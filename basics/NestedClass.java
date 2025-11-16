package basics;

class Enclosing {
    private final static int x = 1;
    public static class StaticNested {
        public void run() {
            System.out.println(x);
        }
    }
}

class Outer {
    class Inner {

    }
}

class EnclosingLocal {
    void run() {
        class Local {
            void run() {
                System.out.println("Call nested run()!");
            }
        }
        Local local = new Local();
        local.run();
    }
}

abstract class SimpleAbstractClass {
    abstract void run();
}

class NewOuter {

    int a = 1;
    static int b = 2;

    public class Inner {
        int a = 3;
        static int b = 4;
        public void run () {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("basics.NewOuter.this.a = " + NewOuter.this.a);
            System.out.println("basics.NewOuter.b = " + NewOuter.b);
            System.out.println("basics.NewOuter.this.b = " + NewOuter.this.b);
        }
    }
}

public class NestedClass {

    public static void main(String[] args) {
        Enclosing.StaticNested nestedClass = new Enclosing.StaticNested();
        nestedClass.run();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        EnclosingLocal enclosingLocal = new EnclosingLocal();
        enclosingLocal.run();

        SimpleAbstractClass simpleAbstractClass = new SimpleAbstractClass() {
            @Override
            void run() {
                System.out.println("Run in method of anonymous class");
            }
        };
        simpleAbstractClass.run();

        NewOuter newOuter = new NewOuter();
        NewOuter.Inner newInner = newOuter.new Inner();
        newInner.run();
    }
}
