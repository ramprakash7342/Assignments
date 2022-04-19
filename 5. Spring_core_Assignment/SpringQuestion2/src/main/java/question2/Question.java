package question2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
  
	int questionId;
	String question;
	List<String> answersList;
	Set<String>  answersSet;
	Map<Integer,String> answersMap;
	
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswersList() {
		return answersList;
	}
	public void setAnswersList(List<String> answersList) {
		this.answersList = answersList;
	}
	public Set<String> getAnswersSet() {
		return answersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}
	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
	
	
	public void ShowInfo() {
		System.out.println("id: "+getQuestionId()+"\nQuestion: "+getQuestion()+"\nList Of Answers: "+getAnswersList()
		                    +"\nSet of Anwsers: "+getAnswersSet()+"\nMap of Answers: "+getAnswersMap()
				);
	}
	
	
	
}
