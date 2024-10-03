import java.util.Scanner;
public class Pemilihan2Percobaan126 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tahun25;

        System.out.print("masukkan tahun: ");
        tahun25 = input.nextInt();

        if ((tahun25 % 4) == 0) {
            if ((tahun25 % 100) != 0) {
                System.out.println("tahun kabisat");
            }else
            System.out.println("bukan tahun kabisat");
        }
    }
}