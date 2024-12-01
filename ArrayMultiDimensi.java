
package array;

/**
 *
 * @author riskyy
 */
import java.util.Scanner;
public class ArrayMultiDimensi {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
        
        int belilagi = 0;
         
        do{
            int pilih = 0, jumlah = 0, total = 0, baris = 0, kolom = 0, grandTotal = 0;
        
            String brg[] = new String[5];
            int nota[][]    = new int [5][3];
            do{
                System.out.println("==== Aplikasi Kasir ====\n");
                System.out.println("1. Tas\n2. Sandal\n3. Sepatu\n4. Selesai");

                System.out.print("Pilih : ");
                pilih = input.nextInt();

                System.out.println();


                switch(pilih) {
                    case 1:

                        System.out.println("Tas [120.000]");
                        if(baris<5) {
                            brg[baris] = "Tas";
                            nota[baris][0] = 120000;

                            System.out.print("Jumlah : ");
                            jumlah = input.nextInt();

                            nota[baris][1] = jumlah;
                            nota[baris][2] = nota[baris][0] * nota[baris][1];

                            grandTotal += nota[baris][2];

                            baris++;

                            grandTotal += total;
                            System.out.println("Total Belanja : " + grandTotal);

                        } else {
                            System.out.println("Keranjang Penuh!");
                        }

                        System.out.println();

                    break;

                    case 2:

                        System.out.println("Sandal [30.000]");
                        if(baris<5) {
                            brg[baris] = "Sandal";
                            nota[baris][0] = 30000;

                            System.out.print("Jumlah : ");
                            jumlah = input.nextInt();

                            nota[baris][1] = jumlah;
                            nota[baris][2] = nota[baris][0] * nota[baris][1];

                            grandTotal += nota[baris][2];

                            baris++;

                            System.out.println("Total Belanja : " + grandTotal);

                        } else {
                            System.out.println("Keranjang Penuh!");
                        }

                        System.out.println();

                    break;

                    case 3:

                        System.out.println("Sepatu [100.000]");
                        if(baris<5) {
                            brg[baris] = "Sepatu";
                            nota[baris][0] = 100000;

                            System.out.print("Jumlah : ");
                            jumlah = input.nextInt();

                            nota[baris][1] = jumlah;
                            nota[baris][2] = nota[baris][0] * nota[baris][1];

                            grandTotal += nota[baris][2];

                            baris++;

                            System.out.println("Total Belanja : " + grandTotal);

                        } else {
                            System.out.println("Keranjang Penuh!");
                        }

                    break;

                    case 4:
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("Daftar Belanja");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("no\tBarang\t\tHarga\t\tJumlah\t\tTotal");
                        System.out.println("----------------------------------------------------------------------");
                            for (int i = 0; i < baris; i++) {
                                System.out.print((i + 1) + ". \t");
                                System.out.print(brg[i] + "\t \t");
                                System.out.print(nota[i][0] + "\t \t");
                                System.out.print(nota[i][1] + "\t \t");
                                System.out.println(nota[i][2]);
                            }
                        System.out.println();
                        System.out.println("Terima Kasih!");
                    break;

                    default:
                        System.out.println("Pilihan Tidak Ada!");
                }

            }while(pilih!=4);
            
            System.out.println("\nApakah Anda Ingin Melakukan Transaksi Lagi ?\n1. Ya\n2. Tidak");
            System.out.print("Pilih : ");
            
            belilagi = input.nextInt();

       }while(belilagi==1);
        
        System.out.println("----------------------------------------------------------------------");  
        System.out.println("\t\tTerima Kasih Telah Berbelanja\t\t");
        System.out.println("----------------------------------------------------------------------");  
        
    }
}
