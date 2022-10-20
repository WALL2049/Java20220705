package methon_test;

// 方法重载
public class MethonDemo5 {
    public static void main(String[] args) {
        fire();
        fire("miguo");
        fire("daoguo", 1000);
    }

    public static void fire() {
        fire("Aguo", 1);
    }

    public static void fire(String location) {
        fire(location, 20);
    }

    public static void fire(String location, int num) {
        if (num >100){
            return;
        }
        System.out.println("向" + location + "发射" + num + "一枚武器!");
    }
}
