package edu.unc.comp301.a02mothership;

public interface IModule {
    String getName();
    void statusReport(String moduleStatus, boolean isSuccessful);
}
