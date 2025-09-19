package edu.unc.comp301.a02mothership;

public class Main {
    public static void main(String[] args){
        IPowerGenerator solarGenerator = new SolarGenerator();
        ThrusterModule thrusterMod = new ThrusterModule();
        ExperimentModule experimentMod = new ExperimentModule("exper", new double[]{2.0, 5.0, 5.5, 10.8, 22.4});
        BigModule bigModule = new BigModule();

        Mothership ship = new Mothership(solarGenerator, thrusterMod, experimentMod, bigModule);
        int power = ship.requestPower();
        boolean result = ship.fireThruster(power);
        if (result == true){
            System.out.println("The thruster has fired.");
        }
        else{
            System.out.println("The thruster has failed to fire due to insufficient power or fuel");
        }
        ship.runExperiment();
        System.out.println(experimentMod.getSummary());
        ship.printStatusReports();
    }

}
