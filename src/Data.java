public final class Data {
    private final int dita;
    private final int muaji;
    private final int viti;
    // Konstruktori
    public Data(int dita, int muaji, int viti) {
        if (dita < 1 || dita > 31) {
            throw new IllegalArgumentException("Dita duhet te jete 1-31!");
        }
        if (muaji < 1 || muaji > 12) {
            throw new IllegalArgumentException("Muaji duhet te jete 1-12!");
        }
        this.dita = dita;
        this.muaji = muaji;
        this.viti = viti;
    }
    // Metoda qe kthen daten e neserme
    public Data diteneNesermen() {
        int ditaRe = dita + 1;
        int muajiRi = muaji;
        int vitiRi = viti;
        // Supozojme 30 dite per cdo muaj
        if (ditaRe > 30) {
            ditaRe = 1;
            muajiRi++;
            if (muajiRi > 12) {
                muajiRi = 1;
                vitiRi++;
            }
        }
        return new Data(ditaRe, muajiRi, vitiRi);
    }
    // Metoda toString()
    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d",
                dita, muaji, viti);
    }
}

