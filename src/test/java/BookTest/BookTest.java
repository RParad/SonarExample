
package BookTest;

import com.TSITraining.Library.Book;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    public static void BookTest(String[] args) {

        @Test
        void testTitle() {
            Book book = new Book("harry potter", "fantasy", "Fiction") {
                public void borrow() {
                }
            };
            assertEquals("The book was not the same name", "Harry potter", testTitle.getTitle());
        }
    }
}