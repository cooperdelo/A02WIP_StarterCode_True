package org.unc.comp301;

public class SolarGenerator extends ShipModule implements IPowerGenerator{

    @Override
    public void StatusReport(String moduleState, boolean workingCorrectly, String moduleName) {
        System.out.println("Solar Generators will never die");
        super.StatusReport(moduleState, workingCorrectly, moduleName);
    }

    @Override
    public int GeneratePower() {
        return 10;
    }

}
