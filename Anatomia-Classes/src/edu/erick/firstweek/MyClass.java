package edu.erick.firstweek;
public class MyClass {
    
public static void main(String[] args) {
    String myFirstName = "Erick";
    String myLastName = "Araujo de Carvalho";

    String myFullName = fullName(myFirstName, myLastName);
    
    System.out.print(myFullName);

}

public static String fullName (String firstName, String lastName){
    return "Resultado do método (fullName): " + firstName.concat(" ").concat(lastName);
}

}
