
package bestgymever;

public class BestGymEver {

    public static void main(String[] args) {

        UserInput i = new UserInput();
        Filhantering f = new Filhantering();        
        
        String file = "customers.txt";
        String input = i.input();
                
        if (f.fileExist(file))
            System.out.println(f.input(input, file));
        
        
    }

}
