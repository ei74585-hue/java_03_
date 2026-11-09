public class Main_Produkti {
    public static void main(String[] args) {
        Produkti p = new Produkti(1, "Laptop", 500, 10);

        p.shto(5);
        p.shit(3);
        p.setCmimi(600);

        System.out.println(p.getEmri());
        System.out.println(p.getCmimi());
        System.out.println(p.getSasiaNeStok());

        p.setCmimi(-5);
        p.shit(50);
        p.shto(-2);
    }
}

