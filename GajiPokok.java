package per4;

import java.util.Scanner;

public class GajiPokok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        double gajiPokok = 0;
        String status = "";

        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                status = "Menikah";
                break;
            case 2:
                gajiPokok = 1500000;
                status = "Belum menikah";
                break;
            case 3:
                gajiPokok = 1750000;
                status = "Cerai";
                break;
            case 4:
                gajiPokok = 2000000;
                status = "Menikah dan punya anak";
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }
        double tunjanganPasangan = (kodeGolongan == 1 || kodeGolongan == 4) ? 0.10 * gajiPokok : 0;
        
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n--- STRUK GAJI KARYAWAN ---");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Status       : " + status);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
    }
}
