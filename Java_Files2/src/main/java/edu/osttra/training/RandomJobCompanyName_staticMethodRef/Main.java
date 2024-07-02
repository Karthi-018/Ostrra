package edu.osttra.training.RandomJobCompanyName_staticMethodRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> jobName = Arrays.asList("Job1", "Job2", "Job3", "Job4", "Job5", "Job6", "Job7", "Job8", "Job9", "Job10", "Job11", "Job12", "Job13", "Job14", "Job15");
        List<String> jobLocation = Arrays.asList("Location1", "Location2", "Location3", "Location4", "Location5", "Location6", "Location7", "Location8", "Location9", "Location10", "Location11", "Location12", "Location13", "Location14", "Location15");
        List<String> companyName = Arrays.asList("Company1", "Company2", "Company3", "Company4", "Company5");

        List<JobPost> jobData = new ArrayList<>();
        List<JobPost> jobObj = new ArrayList<>();
        List<FilteredJobs> result = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        Random r = new Random();
        for(int i = 0; i < 10000; i++) {
            JobPost job = new JobPost(System.currentTimeMillis(), jobName.get(r.nextInt(jobName.size())), jobLocation.get(r.nextInt(jobLocation.size())), companyName.get(r.nextInt(companyName.size())));
            jobData.add(job);
        }

        jobObj = jobData.stream().filter(obj->obj.getJobName().contentEquals("Job1") && obj.getJobLocation().contentEquals("Location3")).toList();
        ans = jobObj.stream().map(FilteredJobs::print).toList();
        ans.forEach(System.out::println);


//        Constructor Method Reference
//        result = jobObj.stream().map(FilteredJobs::new).toList();
//        result.forEach(System.out::println);

    }
}
