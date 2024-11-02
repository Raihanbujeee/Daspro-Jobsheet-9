import java.util.Scanner;
public class tugas2no24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahPesanan, total = 0 ;
        System.out.println("***************************");
        System.out.println("===== LA BLANCO CAFE ======");
        System.out.println("***************************");
        System.out.print(" Masukkan jumlah pesanan : ");
        jumlahPesanan = sc.nextInt();
        String[] pesanan = new String [jumlahPesanan];
        int[] harga = new int [jumlahPesanan];
        
        for (int i = 0 ; i < jumlahPesanan ; i++){
            sc.nextLine();
            System.out.print("Makanan atau minuman yang ingin di pesan ke " + (i+1) + " : " );
            pesanan [i] = sc.nextLine();
            System.out.print("Harga Makanan atau Minuman pesanan ke  " + (i+1) + " : ");
            harga [i] = sc.nextInt();
        }
        for (int i = 0 ; i <harga.length ; i++){
            System.out.println("Pesanan ke " + (i+1)  + " " +pesanan [i] + " harga " + harga[i]);
            total += harga[i];
        }
        System.out.println("Total harga : " + total);
        
        System.out.println("----------------------");
        System.out.println(" --TERIMAKASI--");
        System.out.println("----------------------");
        
    }
}
