package edu.unc.comp301.a02mothership;

public class SolarGenerator extends ShipModule implements IPowerGenerator{

    // Write the Status report methoid for Solar Generator

    @Override
    public int GeneratePower() {
        return 10;
    }

}
