public class School extends EducationSystem {
	private String schoolName;
	private String address;

	public School() {
		schoolName = "ABC";
		address = "XYZ";
	}

	public void printSchool() {
		System.out.println("School Name "+ schoolName);
		System.out.println("Address "+ address);
	}
	
	public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}