

package edu.eci.arep.arepproxy;
import edu.eci.arep.httpconnection.HttpConnectionExample;
import static spark.Spark.*;
public class ArepProxy {

    public static void main(String[] args) { 
        staticFiles.location("/public");
        port(getPort());
        get("/palindromo", (req, res) -> HttpConnectionExample.consultar(req.queryParams("name")));
        
        post("/palindromo", (req, res) -> HttpConnectionExample.consultar(req.queryParams("name")));
    }
    
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
