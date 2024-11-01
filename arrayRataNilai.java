import java.util.Scanner;

public class arrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        double rataLulus = jmlLulus > 0 ? totalLulus / jmlLulus : 0;
        double rataTidakLulus = jmlTidakLulus > 0 ? totalTidakLulus / jmlTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
