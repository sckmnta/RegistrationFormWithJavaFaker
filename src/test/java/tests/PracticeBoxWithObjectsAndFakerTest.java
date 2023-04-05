package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("fillForm")
public class PracticeBoxWithObjectsAndFakerTest extends TestBase {


    @Test
    @Feature("Registration Modal Test")
    @Story("Fill Form And Check Results")
    @Owner("sckmnta")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Registration Form", url = "https://demoqa.com/")
    @DisplayName("Fill form and verify results")
    void practiceFillFormTest() {


        step("Open form", () -> {
            registrationPage.openPage();
        });
        step("Set Firstname", () -> {
            registrationPage.setFirstName(firstName);
        });
        step("Set Lastname", () -> {
            registrationPage.setLastName(lastName);
        });
        step("Set Mail", () -> {
            registrationPage.setMail(userMail);
        });
        step("Set Gender", () -> {
            registrationPage.setGender(gender);
        });
        step("set Phone", () -> {
            registrationPage.setPhone(userNumber);
        });
        step("Set Birth Date", () -> {
            registrationPage.setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth);
        });
        step("Set Second Subject", () -> {
            registrationPage.setSecondSubject(subject);
        });
        step("Set Hobby", () -> {
            registrationPage.setHobby(hobby);
        });
        step("Upload Picture", () -> {
            registrationPage.setPicture(picture);
        });
        step("Set Address", () -> {
            registrationPage.setAddress(currentAddress)
                    .setState(state)
                    .setCity(city)
                    .clickSubmit()
                    .verifyModal();
        });
        step("Verify Result", () -> {
            registrationPage.verifyResult("Student Name", firstName + " " + lastName)
                    .verifyResult("Student Email", userMail)
                    .verifyResult("Gender", gender)
                    .verifyResult("Mobile", userNumber)
                    .verifyResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                    .verifyResult("Subjects", subject)
                    .verifyResult("Hobbies", hobby)
                    .verifyResult("Picture", picture)
                    .verifyResult("Address", currentAddress)
                    .verifyResult("State and City", state + " " + city);
        });


    }

}
