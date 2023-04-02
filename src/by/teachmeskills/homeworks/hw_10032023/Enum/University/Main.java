package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public class Main {

    private static String getInfo(University university) {
        return university.getUniversityName()
                + ", учащихся " + university.getStudentsCount()
                + ", сейчас мы " + university.getCurrentSeason().getStatusWork();
    }

    public static void main(String[] args) {

        University university1 = new University("Школа 888", 500, Season.WINTER);
        University university2 = new University("Лицей 555", 600, Season.SUMMER);

        System.out.println(getInfo(university1));
        System.out.println(getInfo(university2));
    }
}