package Pro1;

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

class Pro3 {
    
    
    public static void main(String[] args) {
        List<String> j=new ArrayList<>();
        List<String> loc=new ArrayList<>();
        List<String> comp=new ArrayList<>();

        List<JobSearch> ls = new ArrayList<>();

        for(int i=1;i<20;i++){
            j.add("JOB "+i);
            loc.add("Location "+i);
            comp.add("companyName "+i);
        }

        List<JobPost> li= new ArrayList<JobPost>();

        Random r=new Random();
        for(int i=1;i<10000;i++){
            li.add(new JobPost(j.get(r.nextInt(j.size())),loc.get(r.nextInt(loc.size())),comp.get(r.nextInt(comp.size())),i));
        }
        String keyJobName="JOB 4",keyJobLocation="Location 7",keyCompanyName = "companyName 6";

        // li.stream().filter(obj->{
        //     return obj.jobName.equals(keyJobName) && obj.location.equals(keyJobLocation) && obj.companyName.equals(keyCompanyName);
        // }).findFirst().ifPresentOrElse(cons->System.out.println(cons), ()->System.out.println("NOT FOUND"));

        ls = li.stream().filter(obj->{
            return obj.jobName.equals(keyJobName) && obj.location.equals(keyJobLocation) && obj.companyName.equals(keyCompanyName);
        }).map(JobSearch::new).toList();

        ls.forEach(n->System.out.println(n));


    }
}







