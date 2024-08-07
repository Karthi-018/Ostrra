public class Job {
    String name;
    String loc;
    int id;
    String company;

    public Job(String name, String loc, int id, String company) {
        this.name = name;
        this.loc = loc;
        this.id = id;
        this.company = company;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Job{");
        sb.append("name=").append(name);
        sb.append(", loc=").append(loc);
        sb.append(", id=").append(id);
        sb.append(", company=").append(company);
        sb.append('}');
        return sb.toString();
    }

}