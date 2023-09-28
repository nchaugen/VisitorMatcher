package model;

import visitor.CarElementVisitor;

public record Wheel(String position) implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

}
