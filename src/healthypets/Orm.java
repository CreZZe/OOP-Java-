
package healthypets;

import javax.swing.JOptionPane;

public class Orm extends Djur implements IPrint {
    public Orm(String name, int vikt) {
        super(name, vikt, "Orm");
    }
    
    public int portionsStorlek() {
        return 20;
    }
    
    public String matSort() {
        return "Ormpellets";
    }
    
    public void printMe() {
        String str = getTyp() + "en " + getName() + 
                    "\nFodertyp: " + matSort() + 
                    "\nMängd: " + portionsStorlek() + " gram";
        JOptionPane.showMessageDialog(null, str);
    }
}
