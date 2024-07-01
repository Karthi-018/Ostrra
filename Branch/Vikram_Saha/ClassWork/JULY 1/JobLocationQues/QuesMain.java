package JobLocationQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuesMain {

    public static void main(String[] args) {
        List<String> jobs=new ArrayList();
        List<String> locations=new ArrayList();

        for(int i=1;i<20;i++){
            jobs.add("JOB "+i);
            locations.add("Location "+i);
        }

        List<JobPost> li= new ArrayList<JobPost>();

        Random r=new Random();
        for(int i=1;i<10000;i++){
            li.add(new JobPost(jobs.get(r.nextInt(jobs.size())),locations.get(r.nextInt(locations.size())),i));
        }
        // li.forEach(n->System.out.println(n));
        String keyJobName="JOB 4",keyJobLocation="Location 2";
        // String keyJobName=li.get(0).jobName,keyJobLocation=li.get(0).location;

        li.stream().filter(obj->{
            return obj.jobName.equals(keyJobName) && obj.location.equals(keyJobLocation);
        }).findFirst().ifPresentOrElse(cons->System.out.println(cons), ()->System.out.println("NOT FOUND"));

    }
}
