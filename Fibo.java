import java.io.Console;

public class Fibo {

    public static void main(String[] args) {
        Console console = System.console();

        int a = 1;
        int b = 1;
        int c;

        int n = 0;

        System.out.println('1');
        System.out.println('1');

        while (n < 23) {
          n++;

          c = a + b;

          String out = String.valueOf(c);
          System.out.println(out);

          a = b;
          b = c;
        }
  }
}
