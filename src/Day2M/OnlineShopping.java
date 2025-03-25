abstract class Product {
    double price;

    Product(double price) { // Constructor should not have a return type
        this.price = price;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product {
    public Electronics(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10; // 10% discount for electronics
    }
}

class Clothing extends Product {
    public Clothing(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05; // 5% discount for clothing
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Product phone = new Electronics(50000);
        Product shirt = new Clothing(2000);

        System.out.println("Electronics Discount: " + phone.calculateDiscount());
        System.out.println("Clothing Discount: " + shirt.calculateDiscount());
    }
}
