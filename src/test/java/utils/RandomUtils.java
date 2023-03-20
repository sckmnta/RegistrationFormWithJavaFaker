package utils;

import com.github.javafaker.Faker;
import static tests.TestData.state;

import java.util.Locale;
import java.util.Map;


public class RandomUtils {

    static Faker faker = new Faker(new Locale("sv"));

    public static String randomFirstName() {
        return new Faker().name().firstName();
    }
    public static String randomLastName() {
        return new Faker().name().lastName();
    }
    public static String randomUserMail() {
        return new Faker().internet().emailAddress();
    }
    public static String randomUserNumber() {
        return new Faker().phoneNumber().subscriberNumber(10);
    }
    public static String randomCurrentAddress() {
        return new Faker().address().fullAddress();
    }
    public static String randomGender() {
        return new Faker().options().option("Male", "Female", "Other");
    }
    public static String randomMonthOfBirth() {
        return new Faker().options().option("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
    }
    public static int randomDayOfBirth() {
        return new Faker().number().numberBetween(1, 28);
    }
    public static int randomYearOfBirth() {
        return new Faker().number().numberBetween(1941, 1991);
    }
    public static String randomSubject() {
        return new Faker().options().option("Economics", "Hindi", "Arts");
    }
    public static String randomHobbies() {
        return new Faker().options().option("Sports", "Reading", "Music");
    }

    static Map<String, String[]> getRandomStateAndCity = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"}
    );

    public static String randomState() {
        return new Faker().options().option(getRandomStateAndCity.keySet().toArray()).toString();
    }

    public static String randomCity() {
        return new Faker().options().option(getRandomStateAndCity.get(state));
    }
}







