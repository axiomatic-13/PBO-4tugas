package per4;

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/t): ");
        char member = input.next().charAt(0);

        System.out.print("Masukkan total belanjaan (Rp): ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (member == 'y' || member == 'Y') {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double harusDibayar = totalBelanja - diskon;
        System.out.println("Total Diskon   : Rp " + diskon);
        System.out.println("Yang Harus Dibayar: Rp " + harusDibayar);

        System.out.print("Masukkan uang yang diberikan (Rp): ");
        double uangBayar = input.nextDouble();

        if (uangBayar >= harusDibayar) {
            double kembalian = uangBayar - harusDibayar;
            System.out.println("Uang Kembalian : Rp " + kembalian);
        } else {
            System.out.println("Maaf, uang Anda kurang sebesar Rp " + (harusDibayar - uangBayar));
        }
    }
}