package org.unc.comp301;

public class FuelGenerator extends ShipModule implements IPowerGenerator {
    private int fuel;

    public FuelGenerator(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int GeneratePower() {
        if (fuel >= 10) {
            fuel -= 10;
            return 10;
        } else if (fuel > 0) {
            int generated = fuel;
            fuel = 0;
            return generated;
        } else {
            return 0;
        }
    }

    @Override
    public void StatusReport(String moduleState, boolean workingCorrectly, String moduleName) {
        System.out.println("FuelGenerator: " + fuel + " units of fuel remaining.");
        super.StatusReport(moduleState, workingCorrectly, moduleName);
    }
}
