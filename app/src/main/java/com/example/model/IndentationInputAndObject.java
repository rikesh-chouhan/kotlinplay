package com.example.model;

public class IndentationInputAndObject {

    protected String value;
    protected Integer indentation;

    public IndentationInputAndObject(Integer indentation, String text) {
        value = text;
    }

    public String getValue() {
        return value;
    }

    public Integer getIndentation() {
        return indentation;
    }
}
