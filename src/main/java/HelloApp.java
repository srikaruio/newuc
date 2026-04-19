public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (String name : args) {
                sb.append(name);
                if (++count < args.length) {
                    sb.append(", ");
                }
            }
            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}
