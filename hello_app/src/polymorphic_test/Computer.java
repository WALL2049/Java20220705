package polymorphic_test;

public class Computer {
    private String name;

    public Computer(){

    }

    public Computer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(this.name+"电脑开机了！");
    }

    public void installUSB(USB u){
        u.connect();
        if(u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.doubleclick();
        }else if(u instanceof KeyBoard){
            KeyBoard k = (KeyBoard) u;
            k.keyDown();
        }
        u.disconnect();
    }



}
