package methon_test;

// 找参数index
public class MethonDemo4 {
    public static void main(String[] args) {
        int arr[] = {10,11,12,13,14,15,16,17,18};
        int result = searchelement(arr, 18);
        System.out.println(result);

    }
    public static int searchelement(int arr[], int data){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == data){
                return index;
            }
            index++;
        }
        return -1;
    }
}