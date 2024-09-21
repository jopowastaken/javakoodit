package tuntiteht3;

public class Dino {
    private String DinoName;
    private int DinoAge;
    private String DinoSpecies;

    public Dino(String dinoName, int dinoAge, String dinoSpecies) {
        DinoName = dinoName;
        DinoAge = dinoAge;
        DinoSpecies = dinoSpecies;
    }

    public String getDinoName() {
        return DinoName;
    }

    public int getDinoAge() {
        return DinoAge;
    }

    public String getDinoSpecies() {
        return DinoSpecies;
    }

    @Override
    public String toString() {
        return "Dino{" +
                "DinoName='" + DinoName + '\'' +
                ", DinoAge=" + DinoAge +
                ", DinoSpecies='" + DinoSpecies + '\'' +
                '}';
    }
}
