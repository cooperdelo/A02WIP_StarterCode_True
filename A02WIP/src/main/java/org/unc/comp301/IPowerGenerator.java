package org.unc.comp301;


public interface IPowerGenerator {
    void StatusReport(String moduleState, boolean workingCorrectly, String moduleName);

    int GeneratePower();
}
