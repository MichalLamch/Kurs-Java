public class Factory {
    public void CreateProducts(){
        Product[] tab = new Product[100];
        for(int i=0; i<100; i++){
            tab[i] = new Product(i, "name");
        }
        for(Product p : tab){
            p.Uruchom();
        }
    }
}
