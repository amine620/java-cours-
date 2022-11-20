package ma.etudiant.tp2;

public class Connection {
    /* step 1 declare property private static
    * we add static keyword on Connection because we add Connection inside a static method getCon
    * if we use a class property inside static method we should make this property static */
    private static Connection con;


    /* step 2 declare private construct
    * this allow us to not make direct instance outside class */

    private Connection (){

    }

    /* step 3 declare static method and check if object are not null or not  */

    public static Connection getCon() {
        if(con==null){
            con = new Connection();
        }
        return con;
    }

}
