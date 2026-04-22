import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();
        input.nextLine(); // buang enter

        String[] nim = new String[jumlah];
        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        char[] grade = new char[jumlah];

        int totalNilai = 0;
        int lulus = 0, tidakLulus = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        System.out.println("\n=== INPUT DATA MAHASISWA ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData ke-" + (i + 1));

            System.out.print("NIM   : ");
            nim[i] = input.nextLine();

            System.out.print("Nama  : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            // Validasi nilai
            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Input nilai anda salah!");
                grade[i] = '-';
            } else if (nilai[i] >= 80) {
                grade[i] = 'A';
                lulus++;
                countA++;
            } else if (nilai[i] >= 70) {
                grade[i] = 'B';
                lulus++;
                countB++;
            } else if (nilai[i] >= 60) {
                grade[i] = 'C';
                lulus++;
                countC++;
            } else if (nilai[i] >= 50) {
                grade[i] = 'D';
                tidakLulus++;
                countD++;
            } else {
                grade[i] = 'E';
                tidakLulus++;
                countE++;
            }

            totalNilai += nilai[i];
        }

        // OUTPUT
        System.out.println("\n=== OUTPUT DATA MAHASISWA ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("----------------------------");
            System.out.println("NIM   : " + nim[i]);
            System.out.println("Nama  : " + nama[i]);
            System.out.println("Nilai : " + nilai[i]);
            System.out.println("Grade : " + grade[i]);
        }

        double rata = (double) totalNilai / jumlah;

        System.out.println("\n==============================");
        System.out.println("Jumlah Mahasiswa        : " + jumlah);
        System.out.println("Jumlah Lulus            : " + lulus);
        System.out.println("Jumlah Tidak Lulus      : " + tidakLulus);

        System.out.println("\nJumlah Grade:");
        System.out.println("A : " + countA);
        System.out.println("B : " + countB);
        System.out.println("C : " + countC);
        System.out.println("D : " + countD);
        System.out.println("E : " + countE);

        System.out.println("\nRata-rata Nilai : " + rata);
    }
}