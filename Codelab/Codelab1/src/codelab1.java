import java.util.Scanner;
import java.time.LocalDate;

public class codelab1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner setelah selesai digunakan
        scanner.close();

        // Menghitung umur pengguna
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin berdasarkan input
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak diketahui";
        }

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + jenisKelaminStr);
        System.out.println("Umur           : " + umur + " tahun");
    }
}