abstract class Shape {
  public abstract double area();
}

class Square extends Shape {
  private double sideLength;

  public Square(double sideLength) {
      this.sideLength = sideLength;
  }

  @Override
  public double area() {
      return sideLength * sideLength;
  }
}

class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  @Override
  public double area() {
      return 0.5 * base * height;
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
      this.radius = radius;
  }

  @Override
  public double area() {
      return Math.PI * radius * radius;
  }
}

public class exemplo_ocp {
  public static void main(String[] args) {
      Shape[] shapes = {new Square(5), new Triangle(4, 3), new Circle(3)};
      for (Shape shape : shapes) {
          System.out.println("Área da forma: " + shape.area());
      }
  }
}
