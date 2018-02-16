import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class AlphasTest
{
    
    void setup()
    {
        
        System.out.print("Cool");
        
    }

    @Test
    void test() throws FileNotFoundException
    {
        
//        assert(true);
        
        //ByteArrayInputStream in = new ByteArrayInputStream("begin.txt".getBytes());
        
        Alphas.home(new FileInputStream(new File("begin.txt")));
        
        assertEquals("Let's practice to make sure you have the home row placement down.", Alphas.currentText);
        
        //fail("Not yet implemented");
    }

}
