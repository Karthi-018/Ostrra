import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


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

        List<String> companies = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            companies.add("company"+i);
        }

        List<jobPost> jobPosts = new ArrayList<>();
        Random r = new Random();
        for(int i = 1; i<=10000; i++){
           
            long id = System.currentTimeMillis();
            String job = jobs.get(r.nextInt(jobs.size()));
            String location = locations.get(r.nextInt(locations.size()));
            String company = companies.get(r.nextInt(companies.size()));
            jobPosts.add(new jobPost(id, job, location, company));
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("enter city");
        String searchCity = sc.next();

        System.out.println("enter job");
        String searchJob = sc.next();
        

        jobPosts.stream().filter(job -> {return job.getLocation()
            .equals(searchCity) && job.getName().equals(searchJob);})
            .findAny().ifPresentOrElse(job -> System.out.println(job.getId()),()->System.out.println("not found"));

        List<companyName> companyNames= jobPosts.stream()
        .filter(job -> {return job.getLocation().equals(searchCity) && job.getName().equals(searchJob);})
        .map(companyName::new).toList();
        companyNames.forEach(System.out::print);
    }
    
}

class jobPost{
    long id;
    String name;
    String location;
    String companyName;

    jobPost(long id, String name, String location, String companyName){
        this.id = id;
        this.name = name;
        this.location = location;
        this.companyName = companyName;
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

    public String getCompanyName() {
        return companyName + " ";
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

class companyName {
    long id;
    String job;
    String company;

    companyName(jobPost j){
        this.id = j.getId();
        this.job = j.getName();
        this.company = j.getCompanyName();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Company name - " + getCompany() + " job name - " + getJob() + " id - " + getId() + " \n";
    }
}
