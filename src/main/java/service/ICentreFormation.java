package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ICentreFormation {
    @WebMethod
    String inscrireStagiaire(@WebParam(name = "nom") String nom,
                             @WebParam(name = "prenom") String prenom,
                             @WebParam(name = "formation") String formation);
    @WebMethod
    double calculerMoyenne(@WebParam(name = "note1") double note1,
                           @WebParam(name = "note2") double note2,
                           @WebParam(name = "note3") double note3);
}
