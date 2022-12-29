package com.ltp.gradesubmission;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class Grade {
    @NotBlank(message = "Name field cannot be blank")
    private String name;
    @NotBlank(message = "Subject field cannot be blank!")
    private String subject;
    @Score(message = "Score must be a letter grade!")
    private String score;
    private String id;

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public Grade(String name, String subject, String score, String id) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.id = id;
    }

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
