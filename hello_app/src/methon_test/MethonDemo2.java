package methon_test;

// 引用数据类型
public class MethonDemo2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int arr[]){
        System.out.println(arr[1]);
        arr[1] = 2222;
        System.out.println(arr[1]);
    }
}