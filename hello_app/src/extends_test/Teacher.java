package extends_test;

public class Teacher extends People{
    private String departmentName;

    public void teach(){
        System.out.println(super.getName()+"年龄"+super.getAge()+"岁，属于"+this.departmentName+"，需要教学");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
