public class InstanceBlock {
    {
        System.out.println("Instance block 1");
    }

    public InstanceBlock() {
        System.out.println("InstanceBlock");
    }

    {
        System.out.println("Instance block 2");
    }

    public static void main(String[] args) {
        InstanceBlock instance = new InstanceBlock();
        System.out.println("Main method");
        InstanceBlock anotherInstance = new InstanceBlock();

    }
}
