public class Student implements Comparable<Student>
    {
        String sName;
        int mark;
        public Student(String sNAme, int mark){
            this.sName = sNAme;
            this.mark = mark;
        }
    
        public void setMark(int mark) {
            this.mark = mark;
        }
    
        public void setsName(String sName) {
            this.sName = sName;
        }
        
        public String getsName(){
            return sName;
        }
        public int getmarks(){
            return mark;
    
        }
        
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "sName - " + sName + " mark - " + mark;
        }
    
        @Override
        public int compareTo(Student o) {
            // if(this.mark>o.mark){
            //     return -1;
    
            // }
            // else{
            //     return 1;
            // }
    
            return this.sName.compareTo(o.sName);
        }
            
        }
