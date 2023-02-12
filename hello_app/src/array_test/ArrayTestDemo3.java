package array_test;

public class ArrayTestDemo3 {
    public static void main(String[] args) {
        int[] grades = {16,26,36,6,100};
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        System.out.println(sum);
        int max = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (grades[i] > max){
                max = grades[i];
            }
        }
        System.out.println(max);
    }
}
