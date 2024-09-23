import java.util.Scanner;

public class balok {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang, lebar, dan tinggi balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menampilkan hasil
        System.out.println("Volume balok: " + volume + " cm³");

        scanner.close();
    }
}
