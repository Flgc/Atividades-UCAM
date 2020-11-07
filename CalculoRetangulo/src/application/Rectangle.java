package application;

import java.util.Scanner;

public class Rectangle {

		private float width=5;
		private float height=5;

		public float getWidth() {
			return width;
		}

		public boolean setWidth(float width) {

			if ((width < 0.0) || (width > 50.0)) {
				System.out.println("Incorrect number!");
				return false;
			} else {
				this.width = width;
				return true;
			}
		}

		public float getHeight() {
			return height;
		}

		public boolean setHeight(float height) {

			if ((height < 0.0) || (height > 50.0)) {
				System.out.println("Incorrect number!");
				return false;
			} else {
				this.height = height;
				return true;
			}
		}

		public float calcularPerimetro() {
			float p = 2 * (height + width);
			return p;
		}

		public float calcularArea() {
			float a = (height * width);
			return a;
		}
	
	public static void main(String[] args) {
		Rectangle ret = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.print("height:");
		ret.setHeight(input.nextFloat());
		System.out.print("width:");
		ret.setWidth(input.nextFloat());
		System.out.print("perimetro : " + ret.calcularPerimetro() + " calcularArea :" + ret.calcularArea());
		input.close();
	}
}
