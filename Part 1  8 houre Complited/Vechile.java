class Car {
    String brand; // instance member veriable or NON-Static memebr veriable
    int price;
    String color;
    String carnum = "BR01FP0403";
    static int x =23;

    void detail() { // Instance member function
        System.out.println(brand);
        System.out.println(price);
        System.out.println(color);

    }

}

public class Vechile {
    public static void main(String[] args) {
        Car creta = new Car(); // OBJECT

        creta.brand = "hundail";
        creta.color = "Black";
        creta.price = 2000000;

        creta.detail();
        System.out.println(creta.carnum);

        System.out.println(Car.x);
        

    }
}
