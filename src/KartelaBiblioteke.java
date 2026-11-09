public class KartelaBiblioteke {
    private final int numriKarteles;
    private String pronari;
    private int libraHuazuar;
    private double gjoba;
    public KartelaBiblioteke(int numriKarteles, String pronari) {
        this.numriKarteles = numriKarteles;
        this.pronari = pronari;
        this.libraHuazuar = 0;
        this.gjoba = 0;
    }
    public void huazo() {
        if (libraHuazuar < 3 && gjoba <= 5) {
            libraHuazuar++;
            System.out.println("Libri u huazua!");
        } else {
            System.out.println("Huazimi u refuzua!");
        }
    }

    public void kthe(int diteVonese) {
        if (libraHuazuar > 0) {
            libraHuazuar--;
            if (diteVonese > 0)
                gjoba += diteVonese * 0.20;
        }
    }

    public void paguajGjoben(double shuma) {
        if (shuma > 0 && shuma <= gjoba) {
            gjoba -= shuma;
        }
    }

    public void shfaqGjendjen() {
        System.out.println("Kartela: " + numriKarteles);
        System.out.println("Pronari: " + pronari);
        System.out.println("Libra te huazuar: " + libraHuazuar);
        System.out.println("Gjoba: " + gjoba + " euro");
    }
}

