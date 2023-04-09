package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public class University {
    private String universityName;
    private int studentsCount;
    private Season currentSeason;

    public University(String universityName, int studentsCount, Season currentSeason) {
        this.universityName = universityName;
        this.studentsCount = studentsCount;
        this.currentSeason = currentSeason;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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