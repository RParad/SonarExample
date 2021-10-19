import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItABook {
    static String isItABook(String Title) {
        return "Harry Potter".equals(Title) ? "Yes":"No";
    }

    public class stepDefinitions {
        private String title;
        private String actualAnswer;

        @Given("The book is called Harry Potter")
        public void The_book_is_called_Harry_Potter() {
            title = "Harry Potter";
        }

        @Given("This book is Avatar")
        public void The_book_is_called_Avatar() {
            title = "Avatar";
        }

        @When("I ask if it is called Harry Potter")
        public void I_ask_if_it_is_called_Harry_Potter() {
            actualAnswer = IsItABook.isItABook("Harry Potter");
        }

        @Then("I should be told {string}")
        public void I_should_be_told(String expectedAnswer) {
            assertEquals(expectedAnswer, actualAnswer);
        }
    }
}
