package methon_test;

// 求和、求最值、判断奇偶
public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(100));
        checknum(1001);

        int list[] = new int[5];
        int arrayDemo[] = {1,1,1,1,13,5,7,9,234,22,2,55};
        int max = getMaxnumber(arrayDemo);
        System.out.println(max);
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void checknum(int n){
        if (n % 2 == 1){
            System.out.println(n + "是奇数");
        }
        else {
            System.out.println(n + "是偶数");
        }
    }
    public static int getMaxnumber(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}