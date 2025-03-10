// Kelas Main untuk menjalankan program
public class Codelab2 {
    public static void main(String[] args) {
        // Membuat objek rekening1 dan rekening2
        RekeningBank rekening1 = new RekeningBank("202410370110048", "Vito", 500000);
        RekeningBank rekening2 = new RekeningBank("123456789", "Jonathan", 300000);

        // Menampilkan informasi awal kedua rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(100000);
        rekening1.tarikUang(200000);

        rekening2.setorUang(50000);
        rekening2.tarikUang(400000);
    }
}
// Kelas RekeningBank
class RekeningBank {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println();
    }

    // Metode untuk setor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Berhasil menyetor Rp " + jumlah);
        System.out.println("Saldo saat ini: Rp " + saldo);
        System.out.println();
    }

    // Metode untuk tarik uang
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan Rp " + jumlah);
        }
        System.out.println("Saldo saat ini: Rp " + saldo);
        System.out.println();
    }
}