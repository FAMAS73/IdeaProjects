import java.util.Scanner;

public class DeicmalToHexa_Proc {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        num = sc.nextInt();
        System.out.println("Hexadecimal number is: ");
        String hex = hexdec(num);
        System.out.print(hex);
    }

    static String hexdec(int q) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hd = "";
        while (q != 0) {
            int rem;
            rem = q % 16;
            hd = ch[rem] + hd;
            q = q / 16;
        }
        return hd;
    }
}