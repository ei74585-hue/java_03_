public class main_perdoruesi {
    public static void main(String[] args) {
        Perdoruesi p = new Perdoruesi("Ardi", "a@gmail.com", "12345678");

        System.out.println(p.getUsername());
        System.out.println(p.kontrolloFjalekalimin("12345678"));

        System.out.println(
                p.ndryshoFjalekalimin("12345678", "Java12345")
        );
    }
}

