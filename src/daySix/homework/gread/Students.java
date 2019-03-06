package daySix.homework.gread;

public class Students {

private String firsName;
private String lastName;
private  double grade;

    public Students(String firsName, String lastName, double grade) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
