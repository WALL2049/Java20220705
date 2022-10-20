package constructor;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "奔驰";
        c1.price = 39.8;
        System.out.println(c1.name);
        System.out.println(c1.price);

        Car c2 = new Car("宝马", 38.9);
        System.out.println(c1.name);
        System.out.println(c1.price);
    }
}
