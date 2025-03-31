package org.example.Class;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Not specified", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Not specified", 0.0);
    }

    public void displayInfo(String name) {
        System.out.println("Имя: " + name);
    }

    public void displayInfo(int years) {
        System.out.println("Опыт работы (в годах): " + experienceInYears);
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + " Фамилия: " + surname + " Опыт работы (в годах): " + experienceInYears + " Уровень английского: " + getEnglishLevel() + " Зарплата: " + salary);
    }
//c2
    //c3
    @Override
    public String toString() {
        return "имя: " + name;
    }

    public static double calculateAverageSalary(Tester[] testers) {
        double totalSalary = 0;
        for (Tester tester : testers) {
            totalSalary += tester.salary;
        }
        return totalSalary / testers.length;
    }
}
