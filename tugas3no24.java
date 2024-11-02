import java.util.Scanner;
public class tugas3no24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Matcha", "Teh Tarik", "Cappucino", "Chocolate Ice","Es teh"};
        String hasil = "";

        String makanan;
        System.out.println("=================================");
        System.out.println("=== SELAMAT DATANG DI MEYCAFE ===");
        System.out.println("=================================");
        System.out.println("Pilih Menu : ");
       for (int i = 0; i < menu.length; i++) {
        System.out.println(menu[i]);
        
       }

        System.out.print("Nama makanan/minuman yang ingin di pesan : ");
        makanan = sc.nextLine();


        for (int i = 0 ; i < menu.length ; i++){
            if (makanan.equalsIgnoreCase(menu [i])) {
                hasil = menu[i];
            }
        }
        if (hasil != "") {
            System.out.println("Makanan atau minuman yang ingin di pesan " + makanan + " tersedia ");
        }else
        System.out.println("Makanan atau minuman tidak tersedia");
        System.out.println();

        System.out.println("*************");
        System.out.println("TERIMAKASIH");
        System.out.println("*************");
    }
}
