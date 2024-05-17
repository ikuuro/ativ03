/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class ativ3 {
    
    public static void main(String[] args){
        
         try (Scanner scanner = new Scanner(System.in)) {
         
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite seu curso:");
            String curso = scanner.nextLine();
            System.out.println("Digite o nome da sua escola técnica:");
            String escola = scanner.nextLine();
            
            
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Curso: " + curso);
            System.out.println("Escola técnica: " + escola);
           
            
            if (idade < 12) {
                System.out.println("Você é uma criança.");
            } else if (idade >= 12 && idade < 18) {
                System.out.println("Você é um adolescente.");
            } else if (idade >= 18 && idade < 60) {
                System.out.println("Você é um adulto.");
            } else {
                System.out.println("Você é um idoso.");
            }
    }
    
}
}
