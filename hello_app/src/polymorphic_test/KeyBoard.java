package polymorphic_test;

public class KeyBoard implements USB{
    private String name;

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keyDown(){
        System.out.println(this.name + "键盘按下了按键！");
    }

    @Override
    public void connect() {
        System.out.println(this.name + "键盘连接到了电脑");
    }

    @Override
    public void disconnect() {
        System.out.println(this.name + "键盘从电脑移除");
    }
}
