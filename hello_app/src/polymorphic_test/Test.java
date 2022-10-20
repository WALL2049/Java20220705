package polymorphic_test;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("联想");
        c.start();
//        c.installUSB(new Mouse("双飞燕"));
        USB u = new Mouse("双飞燕");
        c.installUSB(u);
    }
}
