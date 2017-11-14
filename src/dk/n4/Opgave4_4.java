/* OPGAVE 4.4
Opgavebeskrivelsen lyder: The area of a hexagon can be computed using the following formula (Se formel i lærebogen)
Write a program that prompts the user to enter the side of a hexagon and displays its area */

//Package, hvori klasserne er placeret
package dk.n4;

//Importerer Scanner-klassen fra "java.util"
import java.util.Scanner;

public class Opgave4_4 { //Klassenavn angivet inkl. access modifier

    public static void main(String[] args) {

        //Laver nyt objekt i klassen "Scanner" med navnet "input"
        Scanner input = new Scanner(System.in);
        //Udskriver tekst til konsollen
        System.out.print("Enter the side: ");
        //Deklarerer variablen "side" og initialiserer den med næste brugerindtastning
        double side = input.nextDouble();
        //Kalder metoden "close()" på objektet "input"
        input.close();
        //Udregner arealet af sekskant (Google var min ven)
        double area = (6.0 * side * side) / (4.0 * Math.tan(Math.PI / 6.0));
        //Udskriver arealet i konsollen
        System.out.println("The area of a hexagon is " + area);

    } //Main lukkes

} //Klassen lukkes