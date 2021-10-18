package DVDTest;

import com.TSITraining.Library.DVD;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DVDTest {

        @Test
        public void testDirectorMethod() {
            DVD testDirector = new DVD("Avatar", "James Cameron", 2009);
            assertEquals("The director of this DVD is:", "James Cameron", testDirector.getDirector());
        }
        @Test
        public void testTitleMethodDVD() {
            DVD testTitle = new DVD("Avatar", "James Camreon", 2009);
            assertEquals("The title of this DVD is:", "Avatar", testTitle.getTitle());
        }


}

