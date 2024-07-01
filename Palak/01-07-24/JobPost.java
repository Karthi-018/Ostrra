public class JobPost {
    int jobId;
    String jobs;
    String locations;
     
    public JobPost(int jobId,String jobs,String locations){
        this.jobId= jobId;
        this.jobs= jobs;
        this.locations = locations;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getJobs() {
        return jobs;
    }

    public String getLocations() {
        return locations;
    }

    

    public int getJobId() {
        return jobId;
    }

    @Override
    public String toString() {
        return " jobId:" + " " + jobId + " " + "jobs:" + " " + jobs + " " + "Locations" + " " + locations;
    }

    
    
    

}
