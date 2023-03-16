package tests;

import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {
    static Faker faker = new Faker(new Locale("sv"));


    static String firstName,
            lastName,
            userMail,
            userNumber,
            currentAddress;
    static String[] genders = {"Male", "Female", "Other"};
    static String gender = genders[faker.random().nextInt(genders.length)];
    static String monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December");
    static String dayOfBirth = String.valueOf(faker.number().numberBetween(10, 28));
    static String yearOfBirth = String.valueOf(faker.number().numberBetween(1950, 2022));
    static String[] subjects = {"Economics", "Hindi", "Arts"};
    static String subject = subjects[faker.random().nextInt(subjects.length)];
    static String[] hobbies = {"Sports", "Reading", "Music"};
    static String hobby = hobbies[faker.random().nextInt(hobbies.length)];






}
