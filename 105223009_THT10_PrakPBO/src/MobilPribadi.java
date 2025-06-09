public class MobilPribadi extends Kendaraan implements DapatDisewa {

    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 300_000; // misal 300rb per hari
    }

    @Override
    public boolean perluSupir() {
        return false;
    }
}
