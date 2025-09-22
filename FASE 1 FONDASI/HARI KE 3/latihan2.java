import java.util.Scanner;

public class latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka Pertama : ");
        int a = sc.nextInt();

        System.out.println("Masukan angka Pertama : ");
        int b = sc.nextInt();

        // tampilak hasil perbandingan
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // tutup scanner
        sc.close();

    }
}
