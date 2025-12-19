package factory;

public class Main {

    public static void main(String[] args) {

        Product product1 = ProductFactory.createProduct("A");
        product1.use();

        Product product2 = ProductFactory.createProduct("B");
        product2.use();

        try {
            Product product3 = ProductFactory.createProduct("C");
            product3.use();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
