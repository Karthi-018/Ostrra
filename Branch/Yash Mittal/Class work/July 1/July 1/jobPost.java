
public class jobPost {
    public int jobId;
    public String jobName;
    public String jobLocation;

public jobPost(int jobId,String jobName,String jobLocation){
    this.jobId=jobId;
    this.jobName=jobName;
    this.jobLocation=jobLocation;
}
@Override
 public String toString(){
    return "jobPost[jobid=" + jobId +" jobname="+ jobName+" location="+jobLocation+"]";
 }

}