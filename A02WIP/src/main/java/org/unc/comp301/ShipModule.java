package org.unc.comp301;

public abstract class ShipModule {

    public void StatusReport(String moduleState, boolean workingCorrectly, String moduleName) {
        System.out.println("Attention Captain " + moduleName + " is " + moduleState);
        if(workingCorrectly){
            System.out.println("All systems are working correctly nothing is inccorect.");

        }
        else{
            System.out.println(moduleName + " needs immediate attention!");
        }
    }

}
