package edu.osttra.training.RandomJobCompanyName_constructorMethodRef;

public class JobPost {
    long id;
    String jobName;
    String jobLocation;
    String companyName;

    public JobPost(long id, String jobName, String jobLocation, String companyName) {
        this.id = id;
        this.jobName = jobName;
        this.jobLocation = jobLocation;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    @Override
    public String toString() {
        return "Id: "+id+", Name: "+jobName+", Location: "+jobLocation+", Company: "+companyName;
    }
}
