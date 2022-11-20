package ma.etudiant.tp2;

public class Soleil {

    private static Soleil s;

    private Soleil(){

    }

    public static Soleil getS() {
       if(s==null){
           s= new Soleil();
       }
       return s;
    }
}
