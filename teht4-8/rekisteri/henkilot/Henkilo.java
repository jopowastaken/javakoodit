package rekisteri.henkilot;

public class Henkilo {
    private String name;
    private int age;

    public Henkilo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
