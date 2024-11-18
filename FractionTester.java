public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        f.setNumerator(12);
        f.setDenominator(1);
        
        
        // toString():

        System.out.println(f.toString());

        // Encapsulation, Getter und Setter:

        Fraction n = new Fraction();
        System.out.println(n);

        // Copy-Konstruktor und equals():

        Fraction g = f;
        System.out.println(g);

        System.out.println(f.equals(g));
        
        // Klassen- und Instanzenmethoden:

        Fraction a = Fraction.add(f,g);
        System.out.println(a);
        f.add(g);
        System.out.println(f);

        // statische Variablen:

        System.out.println(Fraction.numberOfFractions);

        // final double PI = 3.14159;
        // PI += 10;
        // System.out.println(PI);

        //public bedeutet weil man es von überall zugreifen kann
        //static weil man nicht will dass es von anderen Programmen verändert wird
        //void da es nichts zurück gibt

        //Encapsulation gelernt, Getter und Setter Methode
        //Wie man mit Klassen in Java programmiert 
        //toString Methode
        //neue Shortcuts
        //Programmieren mehr gelernt

}
