

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
        String status = "";
        if (this.lastFired == false){
            status = "No";
        }
        else{
            status = "Yes";
        }
        System.out.println(getName() + ": " + this.fuel + " units of fuel remaining. Last fired: " + status);
        super.statusReport(moduleStatus, isSuccessful);
    }
    public boolean thrust(int availablePower){
        if (this.fuel < 5 || availablePower < 5){
            this.lastFired = false;
            System.out.println(getName() + ": Not enough power or fuel to fire.");
            return false;
        }
        else{
            this.fuel -= 5;
            this.lastFired = true;
            System.out.println("ALERT Captain: 5 fuel used for propulsion maneuver.");
            return true;
        }
    }
}
