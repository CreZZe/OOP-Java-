
package bestgymever;

import junit.framework.TestCase;
import org.junit.Test;

public class UserInputTest {
    
    UserInput i = new UserInput();
    
    
    @Test
    public void isInputFormatCorrectTest() {        
        TestCase.assertTrue(i.isInputFormatCorrect("9802119384").equals("9802119384"));
        TestCase.assertTrue(i.isInputFormatCorrect("Mikael Fredriksson").equals("Mikael Fredriksson"));
        TestCase.assertTrue(i.isInputFormatCorrect("123123").equals("123123"));
        TestCase.assertTrue(i.isInputFormatCorrect("123 123 123").equals("123 123 123"));
        TestCase.assertTrue(i.isInputFormatCorrect("asd asd asd").equals("asd asd asd"));
        TestCase.assertTrue(i.isInputFormatCorrect("ÅÄÖ åäö").equals("ÅÄÖ åäö"));
        
        TestCase.assertFalse(i.isInputFormatCorrect("9802111493#").equals("9802111493#"));
        TestCase.assertFalse(i.isInputFormatCorrect("Mikael ! Fredriksson").equals("Mikael ! Fredriksson"));
        TestCase.assertFalse(i.isInputFormatCorrect(".Mikael Fredriksson").equals(".Mikael Fredriksson"));
        TestCase.assertFalse(i.isInputFormatCorrect("").equals(""));
    }
}
