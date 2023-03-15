package tests;

import org.junit.jupiter.api.Test;

public class PracticeBoxWithObjectsAndFakerTest extends TestBase {



    @Test
    void practicefillformtest() {


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMail(userMail)
                .setGender()
                .setPhone(userNumber)
                .setBirthDate("18", "December", "2001")
                .setSecondSubject("Economics")
                .setHobby("Reading")
                .setPicture()
                .setAddress(currentAddress)
                .setState("Rajasthan")
                .setCity("Jaipur")
                .clickSubmit()
                .verifyModal()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", userMail)
                .verifyResult("Gender", "Other")
                .verifyResult("Mobile", userNumber)
                .verifyResult("Date of Birth", "18 December,2001")
                .verifyResult("Subjects", "Economics")
                .verifyResult("Hobbies", "Reading")
                .verifyResult("Picture", "exmpl.jpg")
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", "Rajasthan Jaipur");
    }

}
