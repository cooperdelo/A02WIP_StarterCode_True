

package org.unc.comp301;

public class Thruster extends ShipModule {
    private int fuel;
    private boolean lastFired;

    public Thruster() {
        this.fuel = 100;
        this.lastFired = false;
    }

    @Override
    public void StatusReport(String moduleState, boolean workingCorrectly, String moduleName) {
        System.out.println("Thruster: " + fuel + " units of fuel remaining. Last fired: " + (lastFired ? "Yes" : "No"));
        super.StatusReport(moduleState, workingCorrectly, moduleName);
    }

    public boolean Thrust(int availablePower) {
        if (availablePower >= 5 && fuel >= 5) {
            fuel -= 5;
            lastFired = true;
            System.out.println("ALERT Captain: 5 fuel used for propulsion maneuver.");
            return true;
        } else {
            lastFired = false;
            System.out.println("Thruster: Not enough power or fuel to fire.");
            return false;
        }
    }
}
