public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private double kapasitas; // dalam kg

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitas = kapasitas;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 800_000; // misal 800rb per hari
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}
