package teht3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JalkapalloTulokset {
    private String joukkue1;
    private String joukkue2;
    private int joukkue1tulos;
    private int joukkue2tulos;


    public JalkapalloTulokset(String joukkue1, String joukkue2, int joukkue1tulos, int joukkue2tulos) {
        this.joukkue1 = joukkue1;
        this.joukkue2 = joukkue2;
        this.joukkue1tulos = joukkue1tulos;
        this.joukkue2tulos = joukkue2tulos;
    }

    public String getJoukkue1() {
        return joukkue1;
    }

    public String getJoukkue2() {
        return joukkue2;
    }

    public int getJoukkue1tulos() {
        return joukkue1tulos;
    }

    public int getJoukkue2tulos() {
        return joukkue2tulos;
    }
    public String getVoittaja() {
        if (joukkue1tulos==joukkue2tulos){
            return "Tasapeli!";
        }
        if (joukkue1tulos>joukkue2tulos){
            return joukkue1;
        }else {
            return joukkue2;
        }
    }



    @Override
    public String toString() {
        return "JalkapalloTulokset{" +
                "joukkue1='" + joukkue1 + '\'' +
                ", joukkue2='" + joukkue2 + '\'' +
                ", joukkue1tulos=" + joukkue1tulos +
                ", joukkue2tulos=" + joukkue2tulos +
                '}'+'\'';
    }
}
