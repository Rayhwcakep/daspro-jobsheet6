import java.util.Scanner;
public class Pemilihan2Percobaan126 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int tahun;

        System.out.print("masukkan tahun: ");
        tahun = input26.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("tahun kabisat");
            }else
            System.out.println("bukan tahun kabisat");

        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}