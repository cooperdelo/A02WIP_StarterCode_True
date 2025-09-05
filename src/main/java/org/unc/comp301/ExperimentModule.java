package org.unc.comp301;

public class ExperimentModule extends ShipModule {
    // Define all of the experimentName, parameters, result, and hasRun: make sure nobody can acess them if they are not supposed to

    public ExperimentModule(String experimentName, double[] parameters) {
        // set up contructor (hint remeber Arrays are last via reference)
    }

    public void RunExperiment() {
        result = 0;
        for (double p : parameters) {
            result += p * Math.random();
        }
        hasRun = true;
    }

    public String GetSummary() {
        // Return the summary
    }

    // Write the StatusReport methoid
}
