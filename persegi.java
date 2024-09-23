import java.util.Scanner;

public class persegi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan hasil
        System.out.println("Luas persegi panjang: " + luas + " cm²");
        System.out.println("Keliling persegi panjang: " + keliling + " cm");

        scanner.close();
    }
}
