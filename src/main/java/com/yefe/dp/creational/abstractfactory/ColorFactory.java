package com.yefe.dp.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(ColorType colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType == ColorType.RED) {
			return new Red();
		}
		if (colorType == ColorType.BLUE) {
			return new Blue();
		}
		if (colorType == ColorType.GREEN) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(ShapeType shapeType) {
		return null;
	}

}
