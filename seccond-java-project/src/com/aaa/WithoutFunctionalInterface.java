package com.aaa;

interface Drawable {
	public void draw();
}

public class WithoutFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int width = 10;

		Drawable d = new Drawable() {

			public void draw() {
				System.out.println("Drawing:" + width);
			}
		};
		d.draw();

	}

}
