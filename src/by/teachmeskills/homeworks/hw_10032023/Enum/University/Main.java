package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public class Main {
    private static String getStatusStudy(Season season) {
        if (season == Season.SUMMER) {
            return "отдыхаем";
        }
        return "учимся";
    }

    private static String getInfo(University university) {
        return university.getNameUniversity()
                + ", учащихся " + university.getCountStudent()
                + ", сейчас мы " + getStatusStudy(university.getCurrentSeason());
    }

    public static void main(String[] args) {

        University university1 = new University("Школа 888", 500, SeasonRus.Зима);
        University university2 = new University("Лицей 555", 600, SeasonRus.Лето);

        System.out.println(getInfo(university1));
        System.out.println(getInfo(university2));
    }
}