package api_test;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{10,20,30,40};
        String a = "123";
        System.out.println(a);
        System.out.println(arr3.toString());
        System.out.println(toString(arr1));
        System.out.println(toString(arr2));
        System.out.println(toString(arr3));
    }

    /**
     * 输出任何int数组的内容
     * @return
     */
    public static String toString(int[] arr){
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i != arr.length - 1 ? ", " : "");
            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }
    }
}
