package teht2;

public class teht4 {

    public class Aannahtelyt {


        private String aannahdys;

        public Aannahtelyt(String aannahdys) {
            this.aannahdys = aannahdys;
        }

        public void aantele() {
            System.out.println(this.aannahdys);
        }

    }

    public static void main(String[] args) {
        teht4 tomipliis = new teht4();

        Aannahtelyt hui = tomipliis.new Aannahtelyt("AAAAAAA");
        Aannahtelyt ihastus = tomipliis.new Aannahtelyt("OOOOO");
        hui.aantele();
        ihastus.aantele();


    }

}


