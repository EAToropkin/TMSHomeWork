package by.teachmeskills.homeworks.hw_14042023.NotifyDiscount;

import java.io.Serializable;

public class DiscountCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fio;
    private String gender;
    private String birthDate;
    private String contact;

    public DiscountCard(String fio, String gender, String birthDate, String contact) {
        this.fio = fio;
        this.gender = gender;
        this.birthDate = birthDate;
        this.contact = contact;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Serialize{" +
                "fio =" + fio +
                ", gender =" + gender +
                ", birthDate =" + birthDate +
                ", contact =" + contact +
                '}';
    }
}