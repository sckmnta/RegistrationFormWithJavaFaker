package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.RandomUtils.*;


public class TestData {
    static Faker faker;

    static {
        faker = new Faker(new Locale("sv"));
    }

    public static String firstName = randomFirstName(),
            lastName = randomLastName(),
            userMail = randomUserMail(),
            userNumber = randomUserNumber(),
            currentAddress = randomCurrentAddress(),
            gender = randomGender(),
            monthOfBirth = randomMonthOfBirth(),
            dayOfBirth = String.valueOf(randomDayOfBirth()),
            yearOfBirth = String.valueOf(randomYearOfBirth()),
            subject = String.valueOf(randomSubject()),
            hobby = String.valueOf(randomHobbies()),
            state = randomState(),
            city = randomCity(),
            picture = "exmpl.jpg";


}
