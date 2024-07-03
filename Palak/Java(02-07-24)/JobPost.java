public class JobPost {
    int jobId;
    String jobs;
    String locations;
    String compName;
     
    public JobPost(int jobId,String jobs,String compName,String locations){
        this.jobId= jobId;
        this.jobs= jobs;
        this.locations = locations;
        this.compName = compName;

    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompName() {
        return compName;
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
        return "compName" + " " + compName + " " + "Locations" + " " + locations +" jname " +jobs;
                // return " jobId:" + " " + jobId + " " + "jobs:" + " " + jobs + " " + "Locations" + " " + locations;
    }

    
    
    

}






