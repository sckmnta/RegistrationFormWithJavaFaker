package tests.pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestData;
import tests.pages.сomponents.CalendarComponent;
import tests.pages.сomponents.RegistrationModal;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage extends TestData {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationModal registrationModal = new RegistrationModal();
    private SelenideElement
            firstNameInput = $x("//input[@id='firstName']"),
            lastNameInput = $x("//input[@id='lastName']"),
            mailInput = $x("//input[@id='userEmail']"),
            numberInput = $("#userNumber"),
            addressInput = $("#currentAddress"),
            genderInput = $("#genterWrapper"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"), //$x("//label[text()='Reading']"), не работает почему то):
            uploadPicture = $x("//input[@id='uploadPicture']"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitClick = $(".btn-primary");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setMail(String value) {
        mailInput.setValue(value);
        return this;
    }

    public RegistrationPage setPhone(String value) {
        numberInput.setValue(value);
        return this;
    }

    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage verifyModal() {
        registrationModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationModal.verifyResult(key, value);
        return this;
    }

    public RegistrationPage setSecondSubject(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        stateInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setCity(String value) {
        cityInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage clickSubmit() {
        submitClick.click();
        return this;
    }


}

