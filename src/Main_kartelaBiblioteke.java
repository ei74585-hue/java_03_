
public class Main_kartelaBiblioteke {
    public static void main(String[] args) {

        KartelaBiblioteke k = new KartelaBiblioteke(101, "Arta");

        k.huazo();
        k.huazo();
        k.huazo();
        k.huazo(); // Refuzohet

        k.kthe(10); // Gjobe 2 euro

        k.shfaqGjendjen();

        k.paguajGjoben(2);

        k.huazo();

        k.shfaqGjendjen();
    }
}

