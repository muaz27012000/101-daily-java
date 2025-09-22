import java.util.Scanner;

public class LatihanInputBiodata {
    public static void main(String[] args) {
        // Buat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan berat (kg): ");
        double berat = input.nextDouble();

        input.nextLine(); // buang enter biar aman

        System.out.print("Masukkan hobi: ");
        String hobi = input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        // Output biodata
        System.out.println("\n=== BIODATA ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur + " Tahun");
        System.out.println("Tinggi  : " + tinggi + " cm");
        System.out.println("Berat   : " + berat + " kg");
        System.out.println("Hobi    : " + hobi);
        System.out.println("Alamat  : " + alamat);

        input.close(); // tutup scanner
    }
}