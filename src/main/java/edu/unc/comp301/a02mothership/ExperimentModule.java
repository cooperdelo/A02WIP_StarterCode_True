package edu.unc.comp301.a02mothership;

public class ExperimentModule extends AModule{
    private String experimentName;
    private double[] parameters;
    private double result;
    private boolean hasRun;

    public ExperimentModule(String experimentName, double[] parameters){
        super(experimentName);
        this.experimentName = experimentName;
        this.parameters = parameters;
        this.hasRun = false;
        this.result = 0;
    }

    public void runExperiment(){
        for (int i=0; i < parameters.length; i++){
            this.result += parameters[i] * Math.random();
            this.hasRun = true;
        }
    }
    public String getSummary() {
        if (hasRun) {
            return "Experiment " + this.experimentName + " result: " + this.result;
        } else {
            return "Experiment not run yet.";
        }
    }
    public void statusReport(String moduleStatus, boolean isSuccessful){
        if (hasRun) {
            System.out.println("ExperimentModule: " + this.experimentName + " completed.");
        }
        else{
            System.out.println("ExperimentModule: " + this.experimentName + " pending.");
        }
        super.statusReport(moduleStatus, isSuccessful);
    }
}
