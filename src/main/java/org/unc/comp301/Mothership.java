
package org.unc.comp301;

import java.util.ArrayList;

public class Mothership {
    // Initalise powerGenerator, thruster, expermentModule, and the shipModule ArrayList

    // Add constructor here

    public int requestPower() {
        // Request power fromt the power generator
    }

    public boolean fireThruster(int availablePower) {
        // Fire the thruster
    }

    public void runExperiment() {
        // Run the experment suite
    }

    public void printStatusReports() {
        for (ShipModule module : shipModules) {
            module.StatusReport("Normal", true, module.getClass().getSimpleName());
        }

    }

    public String getExperimentSummary() {
        // Get the summary from experementModule
    }
}
