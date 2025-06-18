package Methods;

import java.util.Scanner;

public class GreetUser {

    public static void main(String[] args) {

        String name = getUserName();

        greetUser(name); // Llama al método greetUser(String)

        greetUser(); // llama al metodo sin parametros

        greetUser("Amigo", "¡Hola!"); // Llama al metodo sobrecargado con dos Strings
    }

    public static String getUserName(){
        System.out.println("Enter yout name");
        Scanner scanner  = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }

    public static void greetUser(String name){
        System.out.println("Hi there " + name);
    }

    public static void greetUser(){
        System.out.println("Hello, anonymous");
    }
    public static void greetUser(String name, String greeting){ // Método greetUser SOBRECARGADO (dos parámetros)
        System.out.println(greeting + " " + name);
    }
}

