package edu.unc.comp301.a02mothership;

public class FuelGenerator extends AModule implements IPowerGenerator {
    private int fuel;

    public FuelGenerator(int fuel){
        super("Fuel Generator");
        this.fuel = fuel;
    }

    public void statusReport(String moduleStatus, boolean isSuccessful){
        System.out.println("FuelGenerator: " + this.fuel + " units of fuel remaining.");
        super.statusReport(moduleStatus, isSuccessful);
    }

    public int generatePower(){
        if (this.fuel >= 10){
            this.fuel -= 10;
            return 10;
        }
        else{
            int fuelTemp = this.fuel;
            this.fuel = 0;
            return fuelTemp;
        }
    }





}
