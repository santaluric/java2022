public class Main {
    public static void main(String[] args) {
        Product product =new Product();
        product.set_name("Laptop");
        product.set_description("Asus i5 Z530 Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);
        product.setId(13523);


        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_Kod());



    }
}