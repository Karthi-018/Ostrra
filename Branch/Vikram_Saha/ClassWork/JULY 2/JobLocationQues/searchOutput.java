package JobLocationQues;

import java.util.ArrayList;
import java.util.List;

public class searchOutput {
    public String jobName;
    public String jobLoc;
    public String companyName;

    public searchOutput(JobPost res) {
        jobName= res.jobName;
        jobLoc= res.company;
        companyName= res.location;
    }

    
    @Override
    public String toString() {
        return "searchOutput [jobName=" + jobName + ", jobLoc=" + jobLoc + ", companyName=" + companyName + "]";
    }


    public static searchOutput getObj(JobPost j){
        return new searchOutput(j);
    }
    

}
