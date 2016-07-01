package com.yefe.dp.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(ColorType colorType) {
		return null;
	}

	@Override
	Shape getShape(ShapeType shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType == ShapeType.CIRCLE) {
			return new Circle();
		}
		if (shapeType == ShapeType.RECTANGLE) {
			return new Rectangle();
		}
		if (shapeType == ShapeType.SQUARE) {
			return new Square();
		}
		return null;
	}

}
