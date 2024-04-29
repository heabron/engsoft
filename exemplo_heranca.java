class Engine {
  public void start() {
      System.out.println("Engine started");
  }

  public void stop() {
      System.out.println("Engine stopped");
  }
}

class Car {
  private Engine engine;

  public Car() {
      this.engine = new Engine();
  }

  public void start() {
      engine.start();
  }

  public void stop() {
      engine.stop();
  }
}

public class exemplo_heranca {
  public static void main(String[] args) {
      Car car = new Car();
      car.start();  // Saída: "Engine started"
      car.stop();   // Saída: "Engine stopped"
  }
}
