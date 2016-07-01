package com.yefe.dp.creational.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();
		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		rectangle.draw();
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
		Color red = colorFactory.getColor(ColorType.RED);
		red.fill();
		Color blue = colorFactory.getColor(ColorType.BLUE);
		blue.fill();
		Color green = colorFactory.getColor(ColorType.GREEN);
		green.fill();

	}

}
