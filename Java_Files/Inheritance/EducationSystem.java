public class EducationSystem {
	private String educationType;
	private int numberOfInstitutes;

	public EducationSystem() {
		schoolName = "ABC";
		address = "XYZ";
	}
	
	public void printSchool() {
		System.out.println("Education Type "+ educationType);
		System.out.println("Number of Institutes "+ numberOfInstitutes);
	}

	public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    public int getNumberOfInstitutes() {
        return numberOfInstitutes;
    }

    public void setNumberOfInstitutes(String numberOfInstitutes) {
        this.numberOfInstitutes = numberOfInstitutes;
    }
}