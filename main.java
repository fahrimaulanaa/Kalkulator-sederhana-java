import java.util.*;
public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Deklarasi variabel
        int num1, num2, operator, total, penjumlahan, pengurangan, pembagian, perkalian, modulus;

        System.out.println("Kalkulator Sederhana \n");
        System.out.println("Kode operator aritmatika:");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Modulus \n");

        //Deklarasi input variabel
        System.out.println("Masukkan bilangan pertama: ");
        num1 = sc.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        num2 = sc.nextInt();

        System.out.println("Masukkan kode operator: ");
        operator = sc.nextInt();
        System.out.println("");

        //Deklarasi rumus
        penjumlahan = num1 + num2;
        pengurangan = num1 - num2;
        perkalian = num1 * num2;
        pembagian = num1 / num2;
        modulus = num1 % num2;

        //Seleksi kondisi
        if (operator == 1) {
            System.out.println("Hasil: "+penjumlahan);
        }
        else if(operator == 2){
            System.out.println("Hasil: "+pengurangan);
        }
        else if(operator == 3){
            System.out.println("Hasil: "+perkalian);
        }
        else if(operator == 4){
            System.out.println("Hasil: "+pembagian);
        }
        else if(operator == 5){
            System.out.println("Hasil: "+modulus);
        }else{
            System.out.println("Parameter Invalid");
        }
    }    
}