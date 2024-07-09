package edu.osttra.training.RandomJobCompanyName_staticMethodRef;

public class FilteredJobs {

    String jobName;
    String jobLocation;
    String companyName;

    public FilteredJobs(JobPost o) {
        jobName = o.jobName;
        jobLocation = o.jobLocation;
        companyName = o.companyName;
    }

    static String print(JobPost o) {
        return "JobName: "+o.jobName+", JobLocation: "+o.jobLocation+", CompanyName: "+o.companyName;
    }
}
