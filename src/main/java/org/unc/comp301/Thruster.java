

package org.unc.comp301;

public class Thruster extends ShipModule {
    // Define vars fuel and lastFired

    public Thruster() {
        // Initalise fuel to 100 and lastFired to false
    }

    // Define StatusReport here

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
