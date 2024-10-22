package dinosarus;

public class Dinosaur {
    private String name;
    private int age;
    private String species;

    private DinosaurType dinosaurType;

    public Dinosaur(String name, int age, String species, DinosaurType dinosaurType) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.dinosaurType = dinosaurType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", dinosaurType=" + dinosaurType +
                '}';
    }
}