import java.util.Comparator;
class SortByStudentMark implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            if(s1.getmarks()>s2.getmarks()){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
