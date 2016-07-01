package com.yefe.dp.behavioral.state;

public class StopState implements State {
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop State";
	}
}
