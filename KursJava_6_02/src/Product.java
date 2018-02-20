public class Product {
    private static int id = 0;
    private final String nazwa;
    private int temp_id;
    Product(int temp_id, String nazwa) {
        this.temp_id = temp_id;
        this.nazwa = nazwa;
        id++;
    }
    public void Uruchom(){
        System.out.println("Identyfikator:" + temp_id + " Nazwa:" + nazwa);
    }
}
