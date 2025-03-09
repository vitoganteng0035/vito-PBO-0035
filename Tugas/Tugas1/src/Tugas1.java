import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        if (pilihan == 1) { // Login sebagai Admin
            System.out.print("Masukkan Username: ");
            String username = input.nextLine();
            System.out.print("Masukkan Password: ");
            String password = input.nextLine();

            // Validasi login admin
            if (username.equals("Admin123") && password.equals("Pass123")) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) { // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            // Validasi login mahasiswa
            if (nama.equals("Ahmad Raviqto Finanda Sultan Allam") && nim.equals("202410370110035")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else { // Jika memilih selain 1 atau 2
            System.out.println("Pilihan tidak valid.");
        }

        input.close(); // Menutup Scanner
    }
}
