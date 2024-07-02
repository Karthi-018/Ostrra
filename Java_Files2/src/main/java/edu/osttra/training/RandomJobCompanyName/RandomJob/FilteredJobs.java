package edu.osttra.training.RandomJobCompanyName.RandomJob;

public class FilteredJobs {
    static String jobName;
    static String jobLocation;
    static String companyName;

//    String jobName;
//    String jobLocation;
//    String companyName;

    public FilteredJobs(JobPost o) {
        jobName = o.jobName;
        jobLocation = o.jobLocation;
        companyName = o.companyName;
    }

//    public String getJobName() {
//        return jobName;
//    }
//
//    public void setJobName(String jobName) {
//        this.jobName = jobName;
//    }
//
//    public String getJobLocation() {
//        return jobLocation;
//    }
//
//    public void setJobLocation(String jobLocation) {
//        this.jobLocation = jobLocation;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }

//    @Override
//    public String toString() {
//        return "JobName: "+jobName+", JobLocation: "+jobLocation+", CompanyName: "+companyName;
//    }

    static String print(JobPost o) {
        return "JobName: "+o.jobName+", JobLocation: "+o.jobLocation+", CompanyName: "+o.companyName;
    }
}
