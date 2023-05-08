package by.teachmeskills.homeworks.hw_14042023.NotifyDiscount;

import static by.teachmeskills.homeworks.hw_17032023.FilePaths.fileTestPath;

public class Main {
    public static void main(String[] args) {

        RegistrationUtils regUtils = new RegistrationUtils();
        String fileName = fileTestPath + "DiscountCard.txt";

        regUtils.createUserData(fileName);

        NotificationUtils sendUtils = new NotificationUtils();

        sendUtils.sendNotification(fileName);
    }
}