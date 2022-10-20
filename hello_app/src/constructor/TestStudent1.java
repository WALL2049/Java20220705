package constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent1 {
    public static void main(String[] args) {
        Student s1 = new Student("小明","male",10001,175.8,20);
        Student s2 = new Student("小徐","female",10002,165.1,25);
        Student s3 = new Student("小刘","female",10003,163.2,26);
        Student s4 = new Student("小王","male",10004,179.6,22);
        Student s5 = new Student("小张","female",10005,170.4,18);
        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);
        studentlist.add(s5);

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要查询的学号:");
            int studentnumber = sc.nextInt();

            Student s = getStudentById(studentlist,studentnumber);
            if (s == null){
                System.out.println("查无此人，请重新查询！");
            }else{
                System.out.println("学生姓名："+s.getName()+"\n学生性别："+s.getGender()+"\n学生年龄："+s.getAge()+"\n学生身高："+s.getHeight());
                System.out.println("----------------------------");
            }
        }
    }


    public static Student getStudentById(ArrayList<Student> studentlist, int studentnumber){
            for (int i = 0; i < studentlist.size(); i++) {
                Student s = studentlist.get(i);
                if (studentnumber == s.getNumber()){
                    return s;
                }
            }
            return null;
            }


}
