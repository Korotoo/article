package com.article;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le nombre total d'articles dans le panier : ");
        int nombreArticles = scanner.nextInt();
        
        double total = 0.0;
        
        for (int i = 1; i <= nombreArticles; i++) {
            System.out.print("Entrez le prix de l'article " + i + " : ");
            double prixArticle = scanner.nextDouble();
            total += prixArticle;
        }
        
        System.out.println("Le total du panier est : " + total);
        
        scanner.close(); 
    }
}