public class Bus extends Kendaraan implements DapatDisewa {

    public Bus(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 1_000_000; // misal 1jt per hari
    }

    @Override
    public boolean perluSupir() {
        return true;
    }
}
