package java8practice;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex{
        MALE,FEMALE
    }

    private String name;
    private LocalDate birthDay;
    private Sex sex;
    private String emailAddress;

    public Person(String name, LocalDate birthDay, Sex sex, String emailAddress) {
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.emailAddress = emailAddress;
    }

    public int getAge(){
        return birthDay.until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }

    public void printPerson(){
        System.out.println(name+", "+this.getAge());
    }

    public static int compareByAge(Person a,Person b){
        return a.birthDay.compareTo(b.birthDay);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Sex getSex() {
        return sex;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static List<Person> createRoster() {

        List<Person> roster = new ArrayList<>();
        roster.add(
                new Person(
                        "Fred",
                        IsoChronology.INSTANCE.date(1980, 6, 20),
                        Person.Sex.MALE,
                        "fred@example.com"));
        roster.add(
                new Person(
                        "Jane",
                        IsoChronology.INSTANCE.date(1990, 7, 15),
                        Person.Sex.FEMALE, "jane@example.com"));
        roster.add(
                new Person(
                        "George",
                        IsoChronology.INSTANCE.date(1991, 8, 13),
                        Person.Sex.MALE, "george@example.com"));
        roster.add(
                new Person(
                        "Bob",
                        IsoChronology.INSTANCE.date(2000, 9, 12),
                        Person.Sex.MALE, "bob@example.com"));

        return roster;
    }
}
