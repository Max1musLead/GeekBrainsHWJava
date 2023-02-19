import java.util.Scanner;
public class program {
    public static void main(String[] args) 
    {
        Scanner iScanner = new Scanner(System.in);
        int i = iScanner.nextInt();
        iScanner.close();
        System.out.println("Треугольное число = " + Treg(i) + "\n");
    }

    public static int Treg(int num) 
    {
        if (num == 1) {
            return 1;
        }
        return Treg(num - 1) + num;
    }
}
