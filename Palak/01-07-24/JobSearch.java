import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JobSearch {
    public static void main(String[] args) {
        List<String> jobs = Arrays.asList("Java","Python",".net","C++","Blockchain","AI/Ml","Job1","Job2","job3");
        List<String> locations = new ArrayList<>();
        for(int i=0;i<9;i++){
           locations.add("Location"+ i);
        }
        
        List<JobPost> addjobs = new ArrayList<>();
        Random r = new Random();
        for(int j=0;j<10000;j++){
           
            int index = r.nextInt(jobs.size());
            int i1 = r.nextInt(locations.size());

            addjobs.add(new JobPost(j,jobs.get(index),locations.get(i1)));

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Job Name");
        String jName = sc.nextLine();
        System.out.println("Location Name");
        String jLocation = sc.nextLine();




        // Stream<JobPost> s1= addjobs.stream();
        
        addjobs.parallelStream().filter(fjobs->fjobs.getJobs().equals(jName)&&fjobs.getLocations().equals(jLocation)).forEach(System.out::println);
        
        
    }
}
