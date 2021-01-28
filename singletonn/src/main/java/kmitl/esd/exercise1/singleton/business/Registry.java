package kmitl.esd.exercise1.singleton.business;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    public static final Registry INSTANCE = new Registry();
    private static Map<Position, Employee> positions = new HashMap();

    private Registry() {}

    public void getNameOf(Position p) {
        System.out.println(Registry.positions.get(p).getFirstName() + "\n");
    }

    public void addEmployee(Position p, Employee e) {
        Registry.positions.put(p, e);
    }
}
