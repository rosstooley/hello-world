public class HelloWorld {
    private String out;

    public HelloWorld(String out) {
        this.out = out;
    }

    public void write() {
        System.out.println(out);
    }

    public static void main(String[] args) {
        HelloWorld helloer = new HelloWorld("Hello World");
        helloer.write();
    }
}
