public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "ASUS Laptop", 5000, 3, "Siyah");
        /*product.setName("Laptop");
        product.setId(1);
        product.setDescription("ASUS Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());
        System.out.println(product.getKod());

    }
}