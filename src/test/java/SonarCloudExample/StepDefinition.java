package SonarCloudExample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

    public class StepDefinition {
        private String Title;
        private String actualAnswer;

        @Given("The book is called Harry Potter")
        public void The_book_is_called_Harry_Potter() {
            Title = "Harry Potter";
        }

        @Given("This book is Avatar")
        public void The_book_is_called_Avatar() {
            Title = "Avatar";
        }

        @When("I ask if it is called Harry Potter")
        public void I_ask_if_it_is_called_Harry_Potter() {
            actualAnswer = IsItABook.isItABook(Title);
        }

        @Then("I should be told {string}")
        public void I_should_be_told(String expectedAnswer) {
            assertEquals(expectedAnswer, actualAnswer);
        }
    }

