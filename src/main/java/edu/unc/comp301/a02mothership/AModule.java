package edu.unc.comp301.a02mothership;

public abstract class AModule implements IModule{
    private String name;

    public AModule(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println(this.name + " is " + moduleStatus + "...");

        if (isSuccessful){
            System.out.println("Action Successful");
        }
        else {
            System.out.println(this.name + " needs immediate attention!");
        }
    }

}

