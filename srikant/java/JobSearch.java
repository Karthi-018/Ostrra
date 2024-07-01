import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class JobSearch {
    public static void main(String[] args) {
        List<String> jobs = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            jobs.add("job"+i);
        }

        List<String> locations = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            locations.add("location"+i);
        }

        jobs.forEach(s-> System.out.print(s+" "));
        locations.forEach(s-> System.out.print(s+" "));
        System.out.println(jobs.size());
        System.out.println(locations.size());
        List<jobPost> jobPosts = new ArrayList<>();
        Random r = new Random();
        for(int i = 1; i<=10000; i++){
           
            long id = System.currentTimeMillis();
            String job = jobs.get(r.nextInt(jobs.size()));
            String location = locations.get(r.nextInt(locations.size()));
            jobPosts.add(new jobPost(id, job, location));
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("enter city");
        String searchCity = sc.next();

        System.out.println("enter job");
        String searchJob = sc.next();
        

        jobPosts.stream().filter(job -> (job.getLocation().equals(searchCity) && job.getName().equals(searchJob))).findFirst().ifPresentOrElse(job -> System.out.println(job.getId()),()->System.out.println("not found"));;

    }
    
}

class jobPost{
    long id;
    String name;
    String location;

    jobPost(long id, String name, String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}