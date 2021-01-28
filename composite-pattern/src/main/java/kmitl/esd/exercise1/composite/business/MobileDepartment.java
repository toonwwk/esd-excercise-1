package kmitl.esd.exercise1.composite.business;

//leaf
public class MobileDepartment implements Department {
    public MobileDepartment() {}
    @Override
    public void getDepartmentSlogan() {
        System.out.println("Mobile dev in the best");
    }
}
