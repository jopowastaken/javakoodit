package teht2;

public class elukka {
    private String elukkaName;
    private String species;
    private String sound;
    private String color;

    public elukka(String elukkaName, String species, String sound, String color) {
        this.elukkaName = elukkaName;
        this.species = species;
        this.sound = sound;
        this.color = color;
    }

    public String getElukkaName() {
        return elukkaName;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return "elukka{" +
                "elukkaName='" + elukkaName + '\'' +
                ", species='" + species + '\'' +
                ", sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
