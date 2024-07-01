package JobLocationQues;

public class JobPost {
    public String jobName;
    public String location;
    public int jobId;
    public JobPost(String jobName, String location, int jobId) {
        this.jobName = jobName;
        this.location = location;
        this.jobId = jobId;
    }
    @Override
    public String toString() {
        return "JobPost [jobName=" + jobName + ", location=" + location + ", jobId=" + jobId + "]";
    }

    
}
