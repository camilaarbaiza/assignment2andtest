import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment2Test {
    @org.junit.Test
    public void displayTipsAndTotal() throws Exception {

        String expected = "The gratuity is: $20.0 and the total is: $120.0";
        Assert.assertEquals(expected,Assignment2.displayTipsAndTotal(100,20));


    }

}