
package healthypets;

import java.util.List;
import javax.swing.JOptionPane;

public class Inmatning {
        public static void inmatning(List<Djur> djur) {
            String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

            boolean check = true;
            while (check) {
                int counter = 0;

                if (input == null) {
                    System.exit(0);
                }

                for (Djur j : djur) {
                    String name = j.getName();
                    name = name.toLowerCase();
                    input = input.toLowerCase();

                    if (input.equals(name)) {
                        j.printMe();
                        check = false;
                    }
                }

                if (!check) {
                    break;
                }

                input = JOptionPane.showInputDialog("Felaktig inmatning. Ange vilket djur som ska få mat!");
        }
    }
}
