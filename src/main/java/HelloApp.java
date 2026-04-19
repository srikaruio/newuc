public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = "";
            for (int i = 0; i < args.length; i++) {
                names += args[i];
                if (i < args.length - 1) {
                    names += ", ";
                }
            }
            System.out.println("Hello, " + names + "!");
        }
    }
}
