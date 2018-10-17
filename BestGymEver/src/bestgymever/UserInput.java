
package bestgymever;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UserInput {
    
    public String input() {
        String input = JOptionPane.showInputDialog(null, "Mata in kundens personnummer eller fullständiga namn!");
        
        if (input == null) {
            System.exit(0);
        }
        
        return isInputFormatCorrect(input.trim());
    }
    
    public String isInputFormatCorrect(String input) {
        
        if (!input.equals("")) {
            Pattern p = Pattern.compile("[^a-zåäöÅÄÖ0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(input);
            boolean b = m.find();
            
            if(!b) {
                return input;
            }
        }
        
        return "Fel inmatning!";
    }
}