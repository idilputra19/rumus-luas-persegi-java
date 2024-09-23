public class fungsi {

    public static void main(String[] args) {
        // Bagian atas
        cetakHeader("BIODATA SINGKAT");

        // Data Diri
        cetakBagian("1. Data Diri");
        cetakData(
            "Nama Lengkap        : Idil Putra",
            "Nama Panggilan      : Idil",
            "Jenis Kelamin       : Laki - Laki",
            "Agama               : Islam",
            "Kewarganegaraan     : Indonesia",
            "Tempat Tgl Lahir    : Halaban/ 19 Januari 199*",
            "Umur                : 30 tahun",
            "Tinggi Dan Berat BB : 160 Cm/ 60 kg",
            "No Hp               : 0812-6613-3094",
            "E-Mail              : idilputra.com@gmail.vom",
            "Alamat              : Jl. Syekh Ibrahim No.96",
            "Hobi                : 1. Game, 2. Bersepeda, 3. Mendengarkan Music"
        );

        // Riwayat Pendidikan
        cetakBagian("2. Riwayat Pendidikan");
        cetakData(
            "Taman Kanak- kanak  : TK Pertiwi",
            "SD                  : SD N 33 Koto Baru",
            "SMP                 : SMPN 4 Kubung",
            "SMA                 : SMKN 1 Kota Solok",
            "Kuliah Diploma      : DIII DI AMIK Solok",
            "Prodi               : Managemen Infomatika"
        );
    }

    // Fungsi untuk mencetak header
    static void cetakHeader(String judul) {
        System.out.println("---------------------------------------------------------");
        System.out.println("======================*" + judul + "*===================");
        System.out.println("---------------------------------------------------------");
    }

    // Fungsi untuk mencetak bagian
    static void cetakBagian(String bagian) {
        System.out.println(bagian + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=========================================================");
    }

    // Fungsi untuk mencetak data
    static void cetakData(String... data) {
        for (String item : data) {
            System.out.println(item);
        }
        System.out.println("=========================================================");
    }
}
