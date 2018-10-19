
package bestgymever;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Filhantering {
    public boolean fileExist(String name) {
        File file = new File(name);
        
        if (file.exists()) {
            if (file.isFile()) {
                return true;
            }
        }
        return false;
    }
    
    
    public String input(String input, String name) {
        if (!input.equals("Fel inmatning!")) {
            try (Scanner scan = new Scanner(new File(name))) {
                String tempLine;

                while ((tempLine = scan.nextLine()) != null && !tempLine.equals("")) {
                    if (scan.hasNext()) {
                        String[] split = tempLine.split(",");

                        String date = scan.nextLine();

                        
                        
                        if (split[0].toLowerCase().equals(input.toLowerCase()) || split[1].toLowerCase().trim().equals(input.toLowerCase())) {
                            String check = checkIfActiveMember(tempLine, date);
                            return check;
                        }
                    }
                }
            }
            catch (Exception e) {
                    System.out.println(e);
            }
        }
        return input + "\nInte ansluten";
    }
    
    public String checkIfActiveMember(String tempLine, String date) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        
        Date currentDate = new Date();
        Date firstDate = sdf.parse(date);
        
        long diffInMillies = Math.abs(currentDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                        
        if (diff <= 365 && diff >= 0) {
            output(tempLine, sdf.format(currentDate));
            return tempLine + "\n" + date + "\nAktiv";
        }
        else {
            return tempLine + "\n" + date + "\nInte aktiv";
        }
    }
    
    public void output(String name, String currentDate) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("customers_visitors.txt", true))) {
            
            
            out.write(name);
            out.newLine();
            out.write(currentDate);
            out.newLine();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
