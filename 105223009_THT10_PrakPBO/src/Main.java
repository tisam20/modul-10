public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B2468MNO", "Hyundai Ioniq", 2020);
        Kendaraan bus = new Bus("D7890HIJ", "Mercedes Benz", 2018);
        Truk truk = new Truk("F9012DEF", "Mitsubishi Fuso", 2019, 5000.0);

        System.out.println("--- Mobil Pribadi ---");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa 3 hari : " + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu Supir       : " + mobil.perluSupir());

        System.out.println("\n--- Bus ---");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa 2 hari : " + bus.hitungBiayaSewa(2));
        System.out.println("Perlu Supir       : " + bus.perluSupir());

        System.out.println("\n--- Truk ---");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa 4 hari : " + truk.hitungBiayaSewa(4));
        System.out.println("Perlu Supir       : " + truk.perluSupir());
        System.out.println("Kapasitas Muatan  : " + truk.kapasitasMuatan() + " kg");
    }
}
