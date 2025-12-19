package factory;

public class ProductFactory {

    public static Product createProduct(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Тип продукта не может быть null");
        }

        switch (type.toUpperCase()) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Неподдерживаемый тип продукта: " + type);
        }
    }
}
