import java.util.*;

public class JobsSearch {
    public static void main(String[] args) {
        
    
    List<String> jobname = new ArrayList<>();
    List<String> joblocation = new ArrayList<>();

for(int i=0;i<20;i++){
    jobname.add("JOB"+i);
    joblocation.add("location"+i);
}
List<jobPost> li=new ArrayList<jobPost>();

Random r=new Random();
for(int i=1;i<10000;i++){
    li.add(new jobPost(i,jobname.get(r.nextInt(jobname.size())),joblocation.get(r.nextInt(joblocation.size()))));
}
// li.forEach(n->System.out.println(n));
String keyJobName="JOB 4",keyJobLocation="Location 2";
// String keyJobName=li.get(0).jobName,keyJobLocation=li.get(0).location;

li.stream().filter(obj->{
    return obj.jobName.equals(keyJobName) && obj.jobLocation.equals(keyJobLocation);
}).findFirst().ifPresentOrElse(cons->System.out.println(cons), ()->System.out.println("NOT FOUND"));

}}
