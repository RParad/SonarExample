
package BookTest;

import com.TSITraining.Library.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

        @Test
        void testAuthorMethod() {
            Book testBook = new Book("Poe", "fantasy", "Fiction");
            assertEquals("The book has an author", "Poe", testBook.getAuthor());

    }
}