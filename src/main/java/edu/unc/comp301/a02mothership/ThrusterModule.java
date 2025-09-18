

package edu.unc.comp301.a02mothership;

public class ThrusterModule extends AModule  {
    private int fuel;
    private boolean lastFired = false;

    public ThrusterModule(){
        super("Thruster Module");
        this.fuel = 100;
        this.lastFired = false;
    }
    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        if (this.lastFired == true){
            System.out.println( "Thruster Module: " + this.fuel + " units of fuel remaining. Last fired: Yes");
        }
        else{
            System.out.println("Thruster Module: " + this.fuel + " units of fuel remaining. Last fired: No");
        }
        super.statusReport(moduleStatus, isSuccessful);
    }
    public boolean thrust(int availablePower){
        if (fuel < 5 | availablePower < 5){
            this.lastFired = false;
            super.statusReport("Warning", false);
            System.out.println("ThrusterModule: Not enough power or fuel to fire.");
            return false;
        }
        else{
            this.fuel -= 5;
            this.lastFired = true;
            super.statusReport("Normal", true);
            System.out.println("ALERT Captain: 5 fuel used for propulsion maneuver.");
            return true;
        }
    }
}
