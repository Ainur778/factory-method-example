package factory;

public class ConcreteProductB implements Product {

    @Override
    public void use() {
        System.out.println("Используется продукт типа B");
    }
}
