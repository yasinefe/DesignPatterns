package com.yefe.dp.creational.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(FactoryType factoryType) {
		if (factoryType == null) {
			return null;
		}
		if (factoryType == FactoryType.COLOR) {
			return new ColorFactory();
		}
		if (factoryType == FactoryType.SHAPE) {
			return new ShapeFactory();
		}
		return null;
	}
}
