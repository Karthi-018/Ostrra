package JobLocationQues;

public class JobPost {
    public String jobName;
    public String location;
    public String company;
    public int jobId;
    public JobPost(String jobName, String location, int jobId) {
        this.jobName = jobName;
        this.location = location;
        this.jobId = jobId;
    }
    public JobPost(String jobName, String location, String company, int jobId) {
        this.jobName = jobName;
        this.location = location;
        this.company = company;
        this.jobId = jobId;
    }
    @Override
    public String toString() {
        return "JobPost [jobName=" + jobName + ", location=" + location + ", company=" + company + ", jobId=" + jobId
                + "]";
    }
    

    
}
