/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author prabi
 */
@Entity
class Answer implements Serializable {
    
    @Id
    private Integer answerId;
    private String answer;
    
    @OneToOne(mappedBy = "answer")
    private Question question;

    public Answer() {
    }

    public Answer(Integer answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" + "answerId=" + answerId + ", answer=" + answer + ", question=" + question + '}';
    }
    
}
