package edu.eci.arep.arepmath;


import edu.eci.arep.palindromo.PalindromoImpl;
import static spark.Spark.*;

/**
 *
 * @author juan.cortes-p
 */
public class ArepMath {
    
    public static void main(String[] args) { 
        
        port(getPort());
        get("/palindromo", (req, res) -> PalindromoImpl.isPalindromo(req.queryParams("name")));
        
        post("/palindromo", (req, res) -> PalindromoImpl.isPalindromo(req.queryParams("name")));
    }
    
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }
}
