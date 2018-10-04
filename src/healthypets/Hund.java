
package healthypets;

import javax.swing.JOptionPane;

public class Hund extends Djur implements IPrint {    
    public Hund(String name, int vikt) {
        super(name, vikt, "Hund");
    }
    
    public int portionsStorlek() {
        return getVikt()/100;
    }
    
    public String matSort() {
        return "Hundfoder";
    }
    
    public void printMe() {
        String str = getTyp() + "en " + getName() + 
                    "\nFodertyp: " + matSort() + 
                    "\nMängd: " + portionsStorlek() + " gram";
        JOptionPane.showMessageDialog(null, str);
    }
}
