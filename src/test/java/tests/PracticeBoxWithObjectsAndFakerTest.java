package tests;

import org.junit.jupiter.api.Test;


public class PracticeBoxWithObjectsAndFakerTest extends TestBase {


    @Test
    void practicefillformtest() {


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMail(userMail)
                .setGender(gender)
                .setPhone(userNumber)
                .setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSecondSubject(subject)
                .setHobby(hobby)
                .setPicture()
                .setAddress(currentAddress)
                .setState("Rajasthan")
                .setCity("Jaipur")
                .clickSubmit()
                .verifyModal()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", userMail)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", userNumber)
                .verifyResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobby)
                .verifyResult("Picture", "exmpl.jpg")
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", "Rajasthan Jaipur");
    }

}