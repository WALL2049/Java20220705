package polymorphic_test;

public class Mouse implements USB{
    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doubleclick(){
        System.out.println(this.name + "鼠标进行了双击操作！");
    }

    @Override
    public void connect() {
        System.out.println(this.name + "鼠标连接到了电脑");
    }

    @Override
    public void disconnect() {
        System.out.println(this.name + "鼠标从电脑移除");
    }
}
