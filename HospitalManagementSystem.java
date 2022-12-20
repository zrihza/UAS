package UAS;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // Menambahkan beberapa pasien ke dalam binary tree
        bt.addPatient(13477, "Figaro");

        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.println("Pilih menu yang diinginkan:");
            System.out.println("1. Tambah pasien");
            System.out.println("2. Cari pasien");
            System.out.println("3. Tampilkan data pasien");
            System.out.println("4. Hapus pasien");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                // Menambahkan pasien baru
                System.out.print("Masukkan id pasien: ");
                int patientId = scanner.nextInt();
                System.out.print("Masukkan nama pasien: ");
                String patientName = scanner.next();
                bt.addPatient(patientId, patientName);
                System.out.println("Pasien berhasil ditambahkan.");
            } 
            else if (menu == 2) {
                // Mencari pasien
                System.out.print("Masukkan id pasien: ");
                int patientId = scanner.nextInt();
                boolean found = bt.findPatient(patientId);
                if (found) {
                    System.out.println("Pasien telah ditemukan.");
                    bt.printPatients();
                } else {
                    System.out.println("Pasien tidak ditemukan.");
                } 
            }
            else if (menu == 3) {
                // Menampilkan pasien
                System.out.println("Data Pasien: ");
                bt.printPatients();
                }
            else if (menu == 4) {
                // Menghapus pasien
                System.out.print("Masukkan id pasien: ");
                int patientId = scanner.nextInt();
                bt.deletePatient(patientId);
                System.out.println("Pasien berhasil dihapus.");
            } 
            else if (menu == 5) {
                // Keluar dari program
                break;
            } 
            else {
                System.out.println("Menu yang Anda pilih tidak tersedia.");
            }
        }
    }
}