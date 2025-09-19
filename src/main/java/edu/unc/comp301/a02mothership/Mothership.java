
package edu.unc.comp301.a02mothership;

import java.util.ArrayList;

public class Mothership {
    private IPowerGenerator powerGenerator;
    private ThrusterModule thrusterModule;
    private ExperimentModule experimentModule;
    private ArrayList<IModule> modules;

    public Mothership(IPowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule, AModule bigModule){
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;
        modules = new ArrayList<IModule>();
        modules.add(powerGenerator);
        modules.add(thrusterModule);
        modules.add(experimentModule);
    }

    public int requestPower(){
        return powerGenerator.generatePower();
    }

    public boolean fireThruster(int availablePower){
        boolean thrust = thrusterModule.thrust(availablePower);
        return thrust;
    }

    public void runExperiment(){
        experimentModule.runExperiment();
    }

    public void printStatusReports(){
        for (int i = 0; i < modules.toArray().length; i++){
            modules.get(i).statusReport("Normal", true);
        }
    }
    public String getExperimentSummary() {
        return experimentModule.getSummary();
    }

}
