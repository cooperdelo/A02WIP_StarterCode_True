package edu.unc.comp301.a02mothership;


public interface IPowerGenerator {
    void StatusReport(String moduleState, boolean workingCorrectly, String moduleName);

    int GeneratePower();
}
