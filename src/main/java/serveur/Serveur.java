package serveur;
import jakarta.xml.ws.Endpoint;
import service.CentreFormation;

public class Serveur {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/centreFormation";
        Endpoint.publish(url, new CentreFormation());
        System.out.println("Service Web CentreFormation publié à l'adresse : " + url);
    }
}
