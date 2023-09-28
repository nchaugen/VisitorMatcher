package model;

import visitor.CarElementVisitor;

public record Engine(String power) implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

}
