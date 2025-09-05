
package org.unc.comp301;

import java.util.ArrayList;

public class Mothership {
    private IPowerGenerator powerGenerator;
    private Thruster thruster;
    private ExperimentModule experimentModule;
    private ArrayList<ShipModule> shipModules = new ArrayList<>();

    public Mothership(IPowerGenerator powerGenerator, Thruster thruster, ExperimentModule experimentModule) {
        this.powerGenerator = powerGenerator;
        this.thruster = thruster;
        this.experimentModule = experimentModule;
        shipModules.add((ShipModule) powerGenerator);
        shipModules.add(thruster);
        shipModules.add(experimentModule);
    }

    public int requestPower() {
        return powerGenerator.GeneratePower();
    }

    public boolean fireThruster(int availablePower) {
        return thruster.Thrust(availablePower);
    }

    public void runExperiment() {
        experimentModule.RunExperiment();
    }

    public void printStatusReports() {
        for (ShipModule module : shipModules) {
            module.StatusReport("Normal", true, module.getClass().getSimpleName());
        }
    }

    public String getExperimentSummary() {
        return experimentModule.GetSummary();
    }
}
