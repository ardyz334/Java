package org.example;

import org.example.Class.Tester;

public class Main {
    public static void main(String[] args) {

        Tester[] testers = {
                new Tester("Вова", "Пэйн", 3, "C1", 5000),
                new Tester("Михаил", "Войпер", 5, "B2", 6000),
                new Tester("Коля", "Пугна", 2, "B1", 4000)
        };
        double averageSalary = Tester.calculateAverageSalary(testers);
        System.out.println("Средняя зарплата: " + averageSalary);

        Tester tester = new Tester("Никита", "боров", 3, "B2", 2000);
        System.out.println(tester);
        tester.displayInfo();
        tester.displayInfo(tester.getExperienceInYears());
        tester.displayInfo(tester.getName());
    }
}