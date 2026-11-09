public class Produkti {
    private final int kodi;
    private String emri;
    private double cmimi;
    private int sasiaNeStok;

    public Produkti(int kodi, String emri, double cmimi, int sasia) {
        if (cmimi <= 0 || sasia < 0)
            throw new IllegalArgumentException("Te dhena gabim!");

        this.kodi = kodi;
        this.emri = emri;
        this.cmimi = cmimi;
        this.sasiaNeStok = sasia;
    }

    public int getKodi() { return kodi; }
    public String getEmri() { return emri; }
    public double getCmimi() { return cmimi; }
    public int getSasiaNeStok() { return sasiaNeStok; }

    public void setCmimi(double cmimi) {
        if (cmimi > 0)
            this.cmimi = cmimi;
        else
            System.out.println("Cmimi nuk eshte valid!");
    }

    public void shto(int sasia) {
        if (sasia > 0)
            sasiaNeStok += sasia;
    }

    public void shit(int sasia) {
        if (sasia > 0 && sasia <= sasiaNeStok)
            sasiaNeStok -= sasia;
        else
            System.out.println("Stok i pamjaftueshem!");
    }
}

