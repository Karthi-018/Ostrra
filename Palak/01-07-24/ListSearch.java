import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ListSearch{
    
    public static void main(String[] args) {
      List<String> names = Arrays.asList("Palak","Ankit","Alina","Srikant");
      // Optional<String> str = names.stream().filter(name->name.contains("S")).findFirst();
      // String str = names.stream().filter(name->name.contains("S")).findFirst().orElse("Name not found.");
      
      Consumer c = new Consumer<>() {
        @Override
        public void accept(Object o) {
          System.out.println(o);
        };
       };
       Runnable r = new Runnable() {
        @Override
        public void run() {
          System.out.println("Not found");
        };
       };
  
      // names.stream().filter(name->name.contains("S")).findFirst().ifPresentOrElse(c, r);
      names.parallelStream().filter(name->name.contains("a")).findAny().ifPresentOrElse(c, r);
      // names.stream().filter(name->name.contains("S")).findFirst().ifPresentOrElse(c-> System.out.println(c),()-> System.out.println("Name not found"));
      // System.out.println(str);
    










      //   List<String> names = new ArrayList<>();
      //   names.add("Palak");
      //   names.add("alina");
      //   String ctr= "a";
      //   String found = "";
      //   for (String s : names) 
      //   {
      //     if(s.contains(ctr)){
      //       found = s;
      //       break;
      //     }    
      //   }
      //  if(found!=""){
      //   System.out.println("found at " + found);
      //  }
      //  else{
      //   System.out.println("Not found");
      //  }
        
    }
}