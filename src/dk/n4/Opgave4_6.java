/* OPGAVE 4.6
Opgavebeskrivelsen lyder: Write a program that generates three random points on a circle centered at (0, 0)
with radius 40 and display three angles in a triangle formed by these three points (Se figur i lærebogen) */

//Package, hvori klasserne er placeret
package dk.n4;

public class Opgave4_6 { //Klassenavn angivet inkl. access modifier

    public static void main(String[] args) { //Main-metoden eksekveres

        /* Her laves en tilfældig vinkel i radian mellem 0 og 2π
        Læs mere om radian-begrebet her: https://da.wikipedia.org/wiki/Radian */
        double theta = Math.random() * 2 * Math.PI; //Deklarerer variabel "theta" og initialiserer med Math-klassen
        double radius = 1.0; //Deklarerer variabel "radius" og initialiserer med double-værdien 1.0
        double x = radius * Math.cos(theta); //Deklarerer variabel "x" og initialiserer med bl.a. Math-klassen
        double y = radius * Math.sin(theta); //Deklarerer variabel "y" og initialiserer med bl.a. Math-klassen
        //Printer resultatet af x og y i konsollen
        System.out.println("x = " + x + " og " + " y = " + y);

    } //Main lukkes

} //Klassen lukkes