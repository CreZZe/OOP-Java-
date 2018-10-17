
package bestgymever;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;

public class FilhanteringTest {
    Filhantering f = new Filhantering();
    
    @Test
    public void fileExistTest() {
        TestCase.assertTrue(f.fileExist("customers.txt"));
        TestCase.assertFalse(f.fileExist("asd.txt"));
        TestCase.assertFalse(f.fileExist("customer.txt"));
        TestCase.assertFalse(f.fileExist("customers.tx"));
        TestCase.assertFalse(f.fileExist("customers,txt"));
    }
    
    @Test
    public void checkIfActiveMemberTest() throws Exception {
        Calendar cal = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        cal.add(Calendar.YEAR, -1);
        Date getTime = cal.getTime();
        String oneYearAgo = format.format(getTime);
        
        cal.add(Calendar.YEAR, 1);
        cal.add(Calendar.MONTH, -3);
        getTime = cal.getTime();
        String threeMonthsAgo = format.format(getTime);
        
        cal.add(Calendar.MONTH, 3);
        cal.add(Calendar.MONTH, -15);
        getTime = cal.getTime();
        String fiftheenMonthsAgo = format.format(getTime);
        
        cal.add(Calendar.MONTH, 15);
        cal.add(Calendar.YEAR, -2);
        getTime = cal.getTime();
        String twoYearsAgo = format.format(getTime);
        
        
        TestCase.assertTrue(f.checkIfActiveMember("Name", oneYearAgo).equals("Name" + "\n" + oneYearAgo + "\nAktiv"));
        TestCase.assertTrue(f.checkIfActiveMember("Name", threeMonthsAgo).equals("Name" + "\n" + threeMonthsAgo + "\nAktiv"));
        TestCase.assertFalse(f.checkIfActiveMember("Name", fiftheenMonthsAgo).equals("Name" + "\n" + fiftheenMonthsAgo + "\nAktiv"));
        TestCase.assertFalse(f.checkIfActiveMember("Name", twoYearsAgo).equals("Name" + "\n" + twoYearsAgo + "\nAktiv"));
    }
}
