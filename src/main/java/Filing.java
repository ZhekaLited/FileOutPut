import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Filing {

    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        File file = new File("D:/Android/input1.txt");

        FileWriter writer = new FileWriter(file,true);


            while (true) {
                System.out.println("Please enter your words(quit to exit program): ");
                String s = "\n====================\n";
                String input = obj.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
                writer.write(input+s);
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