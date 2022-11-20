package ma.etudiant.tp2;

public class Salle {
    long id;
    String nom;

    Salle(){

    }
    Salle(String nom){
     this.nom=nom;
    }
    Salle(long id,String nom){
        this.nom=nom;
        this.id=id;
    }

}
