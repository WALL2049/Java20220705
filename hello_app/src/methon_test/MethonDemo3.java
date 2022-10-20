package methon_test;

// 打印数组
public class MethonDemo3 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        printarray(arr1);
        System.out.println("\n--------------------");
        int arr2[] = null;
        printarray(arr2);
        System.out.println("\n--------------------");
        int arr3[] = {};
        printarray(arr3);
    }

    public static void printarray(int arr[]){
        System.out.print("[");
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++){
                System.out.print((i == arr.length-1 ? arr[i] : arr[i] + ", "));
            }
        }
        System.out.print("]");
    }
}