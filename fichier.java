// Déclaration du package (optionnel pour un petit exemple)
package com.example;

// Classe principale
public class Calculatrice {

    // Méthode principale (point d'entrée du programme)
    public static void main(String[] args) {
        int nombre1 = 5;
        int nombre2 = 7;
        
        // Appel de la méthode d'addition
        int resultat = additionner(nombre1, nombre2);
        
        // Affichage du résultat
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + resultat);
    }

    // Méthode pour additionner deux nombres
    public static int additionner(int a, int b) {
        return a + b;
    }
}