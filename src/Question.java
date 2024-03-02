import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Question 1
        System.out.println("1. What is JavaScript?");
        System.out.print("Your answer: ");
        scanner.nextLine();
        System.out.println("Correct answer: JavaScript is a programming language used to make web pages interactive.");
        System.out.println();
        
        // Question 2
        System.out.println("2. When was JavaScript created?");
        System.out.print("Your answer: ");
        scanner.nextLine();
        System.out.println("Correct answer: JavaScript was created in 1995.");
        System.out.println();
        
        // Question 3
        System.out.println("3. Where can JavaScript be executed?");
        System.out.print("Your answer: ");
        scanner.nextLine();
        System.out.println("Correct answer: JavaScript can be executed in web browsers, servers, and other devices with a JavaScript engine.");
        System.out.println();
        
        // Question 4
        System.out.println("4. What is the purpose of JavaScript in web development?");
        System.out.print("Your answer: ");
        scanner.nextLine();
        System.out.println("Correct answer: JavaScript is used to add interactivity, validate forms, manipulate HTML elements, make asynchronous requests, and more.");
        System.out.println();
        
        // Question 5
        System.out.println("5. What are some popular JavaScript engines?");
        System.out.print("Your answer: ");
        scanner.nextLine();
        System.out.println("Correct answer: Some popular JavaScript engines are V8 (used in Chrome and Opera) and SpiderMonkey (used in Firefox).");
        System.out.println();
        
        // Add more questions...
        
        scanner.close();
    }
}
