package tuntiteht3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Dino dino0 = new Dino("Pekka", 13, "T-Rex");
        Dino dino1 = new Dino("Raptori", 15, "Velociraptor");
        Dino dino2 = new Dino("Spike", 8, "Triceratops");
        Dino dino3 = new Dino("Sara", 10, "Stegosaurus");
        Dino dino4 = new Dino("Toby", 20, "Brontosaurus");

        Employee emp0 = new Employee("Jameson", "Park Director", 5);
        Employee emp1 = new Employee("Rebecca", "Dinosaur Trainer", 3);
        Employee emp2 = new Employee("Michael", "Paleontologist", 7);
        Employee emp3 = new Employee("Linda", "Veterinarian", 10);
        Employee emp4 = new Employee("Daniel", "Tour Guide", 2);

        Park puisto1 = new Park("Jyräsic parkki");
        puisto1.addDino(dino0);
        puisto1.addDino(dino1);
        puisto1.removeDino("Raptori");
        puisto1.addDino(dino2);
        puisto1.addDino(dino3);
        puisto1.addDino(dino4);
        puisto1.addEmployee(emp0);
        puisto1.addEmployee(emp1);
        puisto1.addEmployee(emp2);
        puisto1.removeEmployee("Jameson");
        System.out.println(puisto1.Employees);
    }

    public static void printDinoInfo(Dino dino){

        System.out.println(dino.toString());
    }
    public static void printEmployeeInfo(Employee employee){
        System.out.println(employee.toString());
    }



}
