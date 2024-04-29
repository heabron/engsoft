interface Printer {
  void print();
}

interface Scanner {
  void scan();
}

class Photocopier implements Printer, Scanner {
  @Override
  public void print() {
      // Implementação da impressão
      System.out.println("Printing document...");
  }

  @Override
  public void scan() {
      // Implementação da digitalização
      System.out.println("Scanning document...");
  }

  public void photocopy() {
      scan();
      print();
  }
}

public class exemplo_isp {
  public static void main(String[] args) {
      Photocopier photocopier = new Photocopier();
      photocopier.photocopy();
  }
}
