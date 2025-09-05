

package org.unc.comp301;

public class ExperimentModule extends ShipModule {
    private String experimentName;
    private double[] parameters;
    private double result;
    private boolean hasRun;

    public ExperimentModule(String experimentName, double[] parameters) {
        this.experimentName = experimentName;
        this.parameters = parameters.clone();
        this.hasRun = false;
    }

    public void RunExperiment() {
        result = 0;
        for (double p : parameters) {
            result += p * Math.random();
        }
        hasRun = true;
    }

    public String GetSummary() {
        if (!hasRun) {
            return "Experiment not run yet.";
        }
        return "Experiment '" + experimentName + "' result: " + result;
    }

    @Override
    public void StatusReport(String moduleState, boolean workingCorrectly, String moduleName) {
        System.out.println("ExperimentModule: " + experimentName + (hasRun ? " completed." : " pending."));
        super.StatusReport(moduleState, workingCorrectly, moduleName);
    }
}
