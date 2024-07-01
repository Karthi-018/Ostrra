package Problem1;

import java.util.*;

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

class Pro3 {
    
    
    public static void main(String[] args) {
        List<String> j=new ArrayList();
        List<String> loc=new ArrayList();

        for(int i=1;i<20;i++){
            j.add("JOB "+i);
            loc.add("Location "+i);
        }

        List<JobPost> li= new ArrayList<JobPost>();

        Random r=new Random();
        for(int i=1;i<10000;i++){
            li.add(new JobPost(j.get(r.nextInt(j.size())),loc.get(r.nextInt(loc.size())),i));
        }
        String keyJobName="JOB 4",keyJobLocation="Location 2";

        li.stream().filter(obj->{
            return obj.jobName.equals(keyJobName) && obj.location.equals(keyJobLocation);
        }).findFirst().ifPresentOrElse(cons->System.out.println(cons), ()->System.out.println("NOT FOUND"));

    }
}







