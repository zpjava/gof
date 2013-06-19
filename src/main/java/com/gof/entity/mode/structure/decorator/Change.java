package com.gof.entity.mode.structure.decorator;

public class Change implements TheGreatestSage{
	private TheGreatestSage sage;

	public Change(TheGreatestSage sage) {
		this.sage = sage;
	}

	@Override
	public void move() {
		// 代码
		sage.move();
	}
}
