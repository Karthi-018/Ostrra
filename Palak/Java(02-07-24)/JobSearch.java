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
        List<String> compName = new ArrayList<>();
        for(int i =0;i<9;i++){
            compName.add("Company"+ i);
        }
        List<JobPost> addjobs = new ArrayList<>();
        Random r = new Random();
        for(int j=0;j<10000;j++){
           
            int index = r.nextInt(jobs.size());
            int i1 = r.nextInt(locations.size());
            int i2 = r.nextInt(compName.size());

            addjobs.add(new JobPost(j,jobs.get(index),compName.get(i2),locations.get(i1)));

        }

        List<SearchJob> newjobs = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Job Name");
        String jName = sc.nextLine();
        // String jName = "Python";
        System.out.println("Location Name");
        String jLocation = sc.nextLine();
        // String jLocation = "Location2";


    //    addjobs.forEach(System.out::println);

        // Stream<JobPost> s1= addjobs.stream();
        
        System.out.println("-------------------");
        // addjobs.stream().filter(fjobs->{ return fjobs.getJobs().equals(jName)&&fjobs.getLocations().equals(jLocation);}).forEach(n->System.out.println("hi "+n));

        System.out.println("-------------------");
        // addjobs.parallelStream().filter(fjobs->fjobs.getJobs().equals(jName)&&fjobs.getLocations().equals(jLocation)).forEach(n1->newjobs.add(new SearchJob(n1.toString())));
       // newjobs = addjobs.parallelStream().filter(fjobs->{ return fjobs.getJobs().equals(jName)&&fjobs.getLocations().equals(jLocation);}).map(SearchJob::new).toList();
        newjobs = addjobs.parallelStream().filter(fjobs->{ return fjobs.getJobs().equals(jName)&&fjobs.getLocations().equals(jLocation);}).map(SearchJob::display).toList();
        newjobs.forEach(System.out::println);
        
        
    }
}
