package edu.osttra.training.RandomJobCompanyName_constructorMethodRef;

public class FilteredJobs {
    static String jobName;
    static String jobLocation;
    static String companyName;

    public FilteredJobs(JobPost o) {
        jobName = o.jobName;
        jobLocation = o.jobLocation;
        companyName = o.companyName;
    }

    @Override
    public String toString() {
        return "JobName: "+jobName+", JobLocation: "+jobLocation+", CompanyName: "+companyName;
    }
}
