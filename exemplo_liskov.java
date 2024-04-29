class Bird {
  public String makeSound() {
      return "Chirp";
  }
}

class Duck extends Bird {
  @Override
  public String makeSound() {
      return "Quack";
  }
}

class Penguin extends Bird {
  @Override
  public String makeSound() {
      return "Honk";
  }
}

public class exemplo_liskov {
  public static void makeBirdSound(Bird bird) {
      System.out.println(bird.makeSound());
  }

  public static void main(String[] args) {
      Duck duck = new Duck();
      Penguin penguin = new Penguin();

      makeBirdSound(duck);    // Saída: "Quack"
      makeBirdSound(penguin); // Saída: "Honk"
  }
}
