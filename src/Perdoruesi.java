public class Perdoruesi {
    private final String username;
    private String email, fjalekalimi;

    public Perdoruesi(String u, String e, String f) {
        if (!e.contains("@") || !e.contains("."))
            throw new IllegalArgumentException("Email gabim");

        if (f.length() < 8 || !f.matches(".*\\d.*"))
            throw new IllegalArgumentException("Fjalekalim gabim");

        username = u;
        email = e;
        fjalekalimi = f;
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }

    public boolean kontrolloFjalekalimin(String t) {
        return fjalekalimi.equals(t);
    }

    public boolean ndryshoFjalekalimin(String v, String r) {
        if (kontrolloFjalekalimin(v) &&
                r.length() >= 8 && r.matches(".*\\d.*")) {
            fjalekalimi = r;
            return true;
        }
        return false;
    }

    // Ne praktike ruhet hash per me shume siguri.
}

