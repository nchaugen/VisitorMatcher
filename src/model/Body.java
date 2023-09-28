package model;

import visitor.CarElementVisitor;

public record Body(String colour) implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

}
