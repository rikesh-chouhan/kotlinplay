package com.example.model;

import java.util.OptionalInt;

public class Goto extends IndentationInputAndObject {

    private OptionalInt label;

    public Goto(Integer labelText, Integer indent) {
        super(indent, "");
        label = OptionalInt.of(labelText);
    }

    public OptionalInt getLabel() {
        return label;
    }
}
