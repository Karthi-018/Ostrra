package edu.osttra.training.RandomJob;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> jobName = Arrays.asList("Job1", "Job2", "Job3", "Job4", "Job5", "Job6", "Job7", "Job8", "Job9", "Job10", "Job11", "Job12", "Job13", "Job14", "Job15");
        List<String> jobLocation = Arrays.asList("Location1", "Location2", "Location3", "Location4", "Location5", "Location6", "Location7", "Location8", "Location9", "Location10", "Location11", "Location12", "Location13", "Location14", "Location15");
        List<JobPost> jobData = new ArrayList<>();

        Random r = new Random();
        for(int i = 0; i < 10000; i++) {
            JobPost job = new JobPost(System.currentTimeMillis(), jobName.get(r.nextInt(jobName.size())), jobLocation.get(r.nextInt(jobLocation.size())));
            jobData.add(job);
        }

        jobData.parallelStream().filter(obj->obj.getJobName().contains("Job1") && obj.getJobLocation().contains("Location3")).findAny().ifPresentOrElse((c) -> System.out.println(c),()-> System.out.println("Not Found"));
    }
}
