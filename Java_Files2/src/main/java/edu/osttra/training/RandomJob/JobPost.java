package edu.osttra.training.RandomJob;

public class JobPost {
    long id;
    String jobName;
    String jobLocation;

    public JobPost(long id, String jobName, String jobLocation) {
        this.id = id;
        this.jobName = jobName;
        this.jobLocation = jobLocation;
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
        return "Id: "+id+", Name: "+jobName+", Location: "+jobLocation;
    }
}
