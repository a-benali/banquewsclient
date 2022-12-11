package abenali.edu;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class BanqueWSClient {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        double montant = stub.convert(450);
        System.out.println("montant: "+ montant);
        Compte compte = stub.getCompte(5000);
        System.out.println("compte: "+ compte.getCode());
        System.out.println("compte: "+ compte.getSolde());
        System.out.println("compte: "+ compte.getDateCreation());
    }
}