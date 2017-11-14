/* OPGAVE 4.1
Opgavebeskrivelsen lyder: Write a program that prompts the user to enter the length from the center of a pentagon
to a vertex and computes the area of the pentagon (Se figur og formel i lærebogen) */

//Package, hvori klasserne er placeret
package dk.n4;

//Importerer Scanner-klassen fra "java.util"
import java.util.Scanner;

public class Opgave4_1 { //Klassenavn angivet inkl. access modifier

    public static void main(String[] args) { //Main-metoden eksekveres

        //Laver nyt objekt i klassen "Scanner" med navnet "input"
        Scanner input = new Scanner(System.in);
        //Udskriver tekst til konsollen
        System.out.print("Enter a length from the center to a vertex: ");
        //Deklarerer variablen "radius" og initialiserer den med næste brugerindtastning
        double radius = input.nextDouble();
        //Kalder metoden "close()" på objektet "input"
        input.close();
        //Udregner arealet af femkant (Google var min ven)
        double s = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI/5));
        //Udskriver arealet i konsollen
        System.out.printf("The area of the pentagon is %.2f", area); //Tekst formateret (2 decimaler)

    } //Main lukkes

} //Klassen lukkes