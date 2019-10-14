package com.example.model;

import java.util.OptionalInt;

public class Output extends IndentationInputAndObject {

    private OptionalInt label;

    public Output(Integer indent, String text) {
        super(indent, text);
        label = OptionalInt.empty();
    }

    public Output(Integer labelText, Integer indent, String text) {
        super(indent, text);
        label = OptionalInt.of(labelText);
    }

    public OptionalInt getLabel() {
        return label;
    }

}
