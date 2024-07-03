public class SearchJob {
    public static String res;
    public static String compName;

    SearchJob (JobPost res){
    this.res = res.jobs;
    this.compName = res.compName;


    
    }

   static  SearchJob display(JobPost jp){

        return new SearchJob(jp);
    }

    @Override
    public String toString() {
        return "SearchJob [res=" + res + ", compName=" + compName + "]";
    }

  
    
}

