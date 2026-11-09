public class Nota {
    private double vlera;

    public Nota(double vlera) {
        if (vlera < 5 || vlera > 10)
            throw new IllegalArgumentException("Note e pavlefshme!");

        this.vlera = vlera;
    }

    public void setVlera(double vlera) {
        if (vlera >= 5 && vlera <= 10)
            this.vlera = vlera;
        else
            System.out.println("Note e pavlefshme!");
    }

    public double getVlera() {
        return vlera;
    }
}

