package kmitl.esd.exercise1.composite.business;

//leaf
public class WebDepartment implements Department {
    public  WebDepartment() {}
    @Override
    public void getDepartmentSlogan() {
        System.out.println("Web is the best");
    }
}
