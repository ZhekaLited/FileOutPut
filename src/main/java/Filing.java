import java.io.*;
import java.util.Scanner;

public class Filing {

    public static void main(String[] args) throws Exception {
        System.out.println("Path? ");
        Scanner obj = new Scanner(System.in);
        String path = obj.next();
        System.out.println("Name of Directory? ");
        path = path + obj.next();
        File file = new File(path);
                //File.createTempFile("input", null);
        if (!file.exists()) file.mkdir();

        PrintWriter writer = new PrintWriter(path + "\\input1.txt");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your words(quit to exit program): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            writer.println(input);
        }

        writer.close();
    }
}




     //   file.getParentFile().mkdirs();

    //    }
  //  }
//}77


        /* run();
    }
    private static void run() throws Exception {

        Scanner scan = new Scanner(new File("D:\\Android\\input.txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        PrintWriter writer = new PrintWriter("D:\\Android\\output.txt");
        writer.print(a + b);
        writer.close();
    }
}
*/
