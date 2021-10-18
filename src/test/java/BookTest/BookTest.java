
package BookTest;

import com.TSITraining.Library.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BookTest {

        @Test
        public void testAuthorMethod() {
            Book testAuthor = new Book("Poe", "fantasy", "Fiction");
            assertEquals("The book has an author", "Poe", testAuthor.getAuthor());
        }

        @Test
        public void testBookTitleMethod() {
            Book testTitle = new Book("Poe", "Paperback" , "Fiction");
            assertEquals("The book is paperback", "Paperback", testTitle.getCoverType());
            }
        @Test
        public void testWritingStyleMethod() {
            Book testWriting = new Book("Harry Potter", "Thirty", "J K Rowling", "Hard Back", "Fiction");
            assertEquals("The writing style is Fiction", "Fiction", testWriting.getWritingStyle());
        }
        @Test
        public void testTitleMethod() {
            Book testTitle = new Book("Harry Potter", "Thirty", "J K Rowling", "Hardback", "Fiction");
            assertNotEquals("The book you are looking for is ", "Harry Potter", testTitle.getTitle());
        }
        @Test
        public void testCoverTypeMethod() {
            Book testCoverType = new Book("Stephen Hawking", "Paper Back");
            assertEquals("The cover is: ", "Paper Back", testCoverType.getCoverType());
        }
        @Test
        public void testChapters() {
            Book testChapter = new Book("Harry Potter", "Thirty", "J K Rowling", "Hard Back", "Fiction");
            assertEquals("There are :", "Thirty",  testChapter.getChapters());
        }


}