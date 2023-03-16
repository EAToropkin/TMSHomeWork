package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public class University {
    private String nameUniversity;
    private int countStudent;
    private Season currentSeason;

    public University(String nameUniversity, int countStudent, Season currentSeason) {
        this.nameUniversity = nameUniversity;
        this.countStudent = countStudent;
        this.currentSeason = currentSeason;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }


}