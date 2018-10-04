
package healthypets;

import javax.swing.JOptionPane;

public class Katt extends Djur implements IPrint {
    public Katt(String name, int vikt) {
        super(name, vikt, "Katt");
    }
    
    public int portionsStorlek() {
        return getVikt()/150;
    }
    
    public String matSort() {
        return "Kattfoder";
    }
    
    public void printMe() {
        String str = getTyp() + "en " + getName() + 
                    "\nFodertyp: " + matSort() + 
                    "\nMängd: " + portionsStorlek() + " gram";
        JOptionPane.showMessageDialog(null, str);
    }
}
