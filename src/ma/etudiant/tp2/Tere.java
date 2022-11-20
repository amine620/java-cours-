package ma.etudiant.tp2;

public class Tere {
    Tere o;
    private Tere(){

    }

    public Tere getO() {
        if(o==null){
         o= new Tere();
        }
        return o;
    }
}
