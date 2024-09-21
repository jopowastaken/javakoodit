package tuntiteht3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Park {
    String ParkName;
    ArrayList<Employee> Employees;
    Dino[] dinotlistassa;

    int dinoCount= 0;

    int employeeCount = 0;

    public Park(String parkName) {
        ParkName = parkName;
        this.dinotlistassa = new Dino[5];
        this.Employees = new ArrayList<Employee>();
    }


    
    public Dino[] addDino(Dino d){
        if (this.dinoCount< dinotlistassa.length){
            this.dinotlistassa[this.dinoCount] = d;
            this.dinoCount++;
        }else {
            System.out.println("Puisto on täynnä. Elä enempää.");
        }
        return this.dinotlistassa;
    }

    public Dino[] removeDino(String poistettava){
        for (int index = 0; index<dinotlistassa.length;index++){
            if (dinotlistassa[index].getDinoName() == poistettava){
                dinotlistassa[index] = null;
                dinoCount--;
                break;
            }
        }
        return this.dinotlistassa;
    }

    public  void addEmployee(Employee e){
        Employees.add(e);
        employeeCount++;
    }
    public  void removeEmployee(String poistettava){
        for(Employee s: Employees){
            if(s.getEmployeeName() == poistettava){
                System.out.println("Poistetaan: " + s);
                Employees.remove(s);
                employeeCount--;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Park{" +
                "ParkName='" + ParkName + '\'' +
                ", Employees=" + Employees +
                ", dinotlistassa=" + Arrays.toString(dinotlistassa) +
                ", dinoCount=" + dinoCount +
                ", employeeCount=" + employeeCount +
                '}';
    }
}


