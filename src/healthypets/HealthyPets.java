/*
Klasser:
- Djur (Superklass)
- Hund
- Katt
- Orm

Djur-klass som ärvs:
- Metod som returnerar mat-sorten
- printMe() för varje djur

Interface:
- Metod som returnerar mängden mat

Program:
- input Pop-up 
    Vem ska få mat?
- Message Pop-up
    Hur mycket gram mat som skall serveras till det angivna djuret
    Vilken sort mat som skall serveras (kattfoder, hundfoder eller ormpellets)

UTFÖR ALLA KONTROLLER MED toLowerCase()


Utförande anteckningar:
- Alla objekt måste sparas i en lista
    Detta för att kunna loopa igenom och kontrollera vilket djur som matades in
- portionsStorlek får "Hund", "Katt" eller "Orm"
    Djursorten kontrolleras i en if-sats och returnerar rätt mängd mat för den djursorten
    20 g ormpellets för ormar
    Hundens vikt i gram / 100 för hundar
    Kattens vikt i gram / 150 för katter



GÖR ETT TILL LIKADANT PROGRAM MEN UTAN LISTA OCH MED IF-SATSER ISTÄLLET SÅ MAN KAN CALLA PÅ RÄTT OBJEKT (t.ex. Hund istället för Djur)

*/
package healthypets;

import java.util.List;
import java.util.ArrayList;

public class HealthyPets {

    public static void main(String[] args) {
        List<Djur> djur = new ArrayList<>();
        
        Hund Sixten = new Hund("Sixten", 5000);
        Hund Dogge = new Hund("Dogge", 10000);
        djur.add(Sixten);
        djur.add(Dogge);
        
        Katt Venus = new Katt("Venus", 5000);
        Katt Ove = new Katt("Ove", 3000);
        djur.add(Venus);
        djur.add(Ove);
        
        Orm Hypno = new Orm("Hypno", 1000);
        djur.add(Hypno);
        
        Inmatning.inmatning(djur);
    }

}
