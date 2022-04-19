package question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Question2Test {

	Question qu=new Question();
	@Test
	@DisplayName("Testing by Id")
	void test() {
		qu.setQuestionId(10);
		assertEquals(10,qu.getQuestionId());
	}
	@Test
	@DisplayName("Testing by Question")
	void test1() {
		qu.setQuestion("How are You");
		assertEquals("How are You",qu.getQuestion());
	}
	

}
