package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public class University {
    private String nameUniversity;
    private int studentsCount;
    private Season currentSeason;

    public University(String nameUniversity, int studentsCount, Season currentSeason) {
        this.nameUniversity = nameUniversity;
        this.studentsCount = studentsCount;
        this.currentSeason = currentSeason;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }


}