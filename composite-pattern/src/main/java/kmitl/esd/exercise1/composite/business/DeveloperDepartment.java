package kmitl.esd.exercise1.composite.business;//Composite
//Web and mobile department are under developer department
import java.util.ArrayList;
import java.util.List;

public class DeveloperDepartment implements Department {

    private List<Department> subDepartments = new ArrayList<>();

    public DeveloperDepartment() {}

    public void addSubDepartment(Department d) {
        subDepartments.add(d);
    }

    @Override
    public void getDepartmentSlogan() {
        for (Department d: subDepartments) {
            d.getDepartmentSlogan();
        }
        System.out.println("So developers are the best");
    }
}
