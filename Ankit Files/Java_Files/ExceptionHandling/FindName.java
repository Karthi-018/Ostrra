public class FindName {
    public void findName(String name) {
        String names[] = {"A", "B", "C"};
        int found = 0;
        for(String n: names) {
            if(n.equals(name)) {
                System.out.println("Found");
                found = 1;
                break;
            }
        }
        try {
            if(found == 0) {
                throw new NameNotFoundException();
            }
        } catch (NameNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
