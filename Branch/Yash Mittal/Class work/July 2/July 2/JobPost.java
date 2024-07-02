import java.util.*;

public class JobPost {
    public String jobName;
    public String location;
    public int jobId;
    public String companyName;

    public JobPost(String jobName, String location, String companyName,int jobId) {
        this.jobName = jobName;
        this.location = location;
        this.jobId = jobId;
        this.companyName =companyName;
    }
    @Override
    public String toString() {
        return "JobPost [jobName=" + jobName + ", location=" + location + ", jobId=" + jobId + ", companyName = "+companyName+"]";
    }

    
}

