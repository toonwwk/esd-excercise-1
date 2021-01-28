package kmitl.esd.exercise1.composite.business;

//client
public class Company {
    public static void main(String[] args) {
        MobileDepartment m = new MobileDepartment();
        WebDepartment w = new WebDepartment();
        DeveloperDepartment d = new DeveloperDepartment();

        d.addSubDepartment(m);
        d.addSubDepartment(w);
        d.getDepartmentSlogan();
    }
}
