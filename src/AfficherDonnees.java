import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
import java.util.*;

public class AfficherDonnees {

    public static void main(String args[]){
    
        if(args.length != 1){
            
            System.out.println("Usage java AfficherDonnees Nom_Fichier");
        
        }else{
        
            try{
                
                Path fichier = Paths.get(args[0]);
                List<String> lignes = Files.readAllLines(fichier, StandardCharsets.UTF_8);
            
                for(int i = 1; i < lignes.size(); i++){
                    String[] colonnes = lignes.get(i).split(";");
                    System.out.println("id : " + colonnes[0]);
                    System.out.println("nom : " + colonnes[1]);
                    System.out.println("prenom : " + colonnes[2]);
                    System.out.println("adresse : " + colonnes[3]);
                    System.out.println("================================\n");
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
    }
    
}
        
