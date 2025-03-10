// Kelas Main
public class Codelab1 {
    public static void main(String[] args) {
        // Membuat objek hewan1 dan hewan2
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Miauwww~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo() dari kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}// Kelas Hewan
class Hewan {
    // Atribut
    String nama;
    String jenis;
    String suara;

    // Konstruktor
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println(); // Spasi tambahan untuk kejelasan output
    }
}