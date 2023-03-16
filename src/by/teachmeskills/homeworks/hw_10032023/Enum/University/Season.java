package by.teachmeskills.homeworks.hw_10032023.Enum.University;

public enum Season {
    WINTER("Зима"), SPRING("Весна"), SUMMER("Лето"), AUTUMN("Осень");

    String seasonRus;

    Season(String seasonRus) {
        this.seasonRus = seasonRus;
    }

    public String getStatusWork() {
        if (this.seasonRus == "Лето") {
            return "отдыхаем";
        } else {
            return "работаем";
        }
    }
};

