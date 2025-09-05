package org.unc.comp301;

public class FuelGenerator{

    // Constructor gose here. Parameters are fuel which is an int.

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
        // Status report for the FuelGenerator Module
    }
}
