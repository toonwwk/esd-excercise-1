package kmitl.esd.exercise1.singleton.business;

public class CompanyManager extends Position {

    public static final CompanyManager INSTANCE = new CompanyManager();

    protected CompanyManager() { salary = 100000; }

}


