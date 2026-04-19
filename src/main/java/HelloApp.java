public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String names = "";
            int count = 0;
            for (String name : args) {
                names += name;
                if (++count < args.length) {
                    names += ", ";
                }
            }
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
