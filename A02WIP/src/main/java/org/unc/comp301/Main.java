
package org.unc.comp301;

public class Main {
    public static void main(String[] args) {
        IPowerGenerator generator = new SolarGenerator();
        // To swap use: IPowerGenerator generator = new FuelGenerator(50);

        Thruster thruster = new Thruster();
        double[] experimentParams = {1.2, 3.4, 5.6};
        ExperimentModule experimentModule = new ExperimentModule("TestExp", experimentParams);

        Mothership mothership = new Mothership(generator, thruster, experimentModule);

        int power = mothership.requestPower();
        System.out.println("Mothership requested power: " + power);

        boolean thrusterFired = mothership.fireThruster(power);
        System.out.println("Thruster fired: " + thrusterFired);

        mothership.runExperiment();
        System.out.println(mothership.getExperimentSummary());

        mothership.printStatusReports();
    }
}