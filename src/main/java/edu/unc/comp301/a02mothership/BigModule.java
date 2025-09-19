package edu.unc.comp301.a02mothership;

public class BigModule extends AModule{
    public BigModule(){
        super("Big Module");
    }

    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println(getName() + ": has a diameter of 1000 meters");
        super.statusReport(moduleStatus, isSuccessful);
    }
}
