public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String joined = String.join(", ", args);
            System.out.println("Hello, " + joined + "!");
        }
    }
}
