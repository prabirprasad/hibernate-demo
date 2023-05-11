/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author prabi
 */
@Entity
public class Question implements Serializable {
    
    @Id
    private Integer questionId;
    private String question;
    
    @OneToOne
    @JoinColumn(name = "answerid")
    private Answer answer;

    public Question() {
    }

    public Question(Integer questionId, String question, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", question=" + question + ", answer=" + answer + '}';
    }
    
}
