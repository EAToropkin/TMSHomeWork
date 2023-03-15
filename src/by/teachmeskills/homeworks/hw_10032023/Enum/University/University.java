package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public class University {
    private String nameUniversity;
    private int countStudent;
    private Season currentSeason;

    public University(String nameUniversity, int countStudent, SeasonRus currentSeasonRus) {
        this.nameUniversity = nameUniversity;
        this.countStudent = countStudent;
        this.currentSeason = getSeason(currentSeasonRus);
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

    private static Season getSeason(SeasonRus season) {
        return Season.values()[season.ordinal()];
    }
}