public class Main_data {
    public static void main(String[] args) {

        Data data1 = new Data(30, 12, 2026);

        System.out.println("Data aktuale: " + data1);

        Data data2 = data1.diteneNesermen();

        System.out.println("Data e neserme: " + data2);
    }
}

