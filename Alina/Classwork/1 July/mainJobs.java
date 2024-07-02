import java.util.*;
public class mainJobs {   
    public static void main(String[] args) {
        List<String> j = new ArrayList<>();
        List<String> loc = new ArrayList<>();
        List<String> comp = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            j.add("Job " + i);
            loc.add("Location " + i);
            comp.add("companyName " + i);
        }

        List<Jobs> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 10000; i++) {
            list.add(new Jobs(j.get(r.nextInt(j.size())), loc.get(r.nextInt(loc.size())), comp.get(r.nextInt(comp.size())), i));
        }
        String keyJobName = "Job 4";
        String keyJobLocation = "Location 2";
        String keyCompanyName = "companyName 6";
        list.add(new Jobs(keyJobName, keyJobLocation, keyCompanyName, 9999));

        list.stream()
            .filter(obj -> obj.jobName.equals(keyJobName) && obj.location.equals(keyJobLocation) && obj.companyName.equals(keyCompanyName))
            .findFirst()
            .ifPresentOrElse(
                System.out::println, 
                () -> System.out.println("NOT FOUND")
            );
    }
}
