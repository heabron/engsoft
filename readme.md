# Princípios de Projeto em Java

**Princípio da Segregação de Interface (ISP):**

- O Princípio da Segregação de Interface (ISP) afirma que uma classe não deve ser forçada a depender de métodos que não usa. Em outras palavras, interfaces maiores devem ser divididas em interfaces menores e mais específicas.

- Serve para evitar que as classes tenham dependências desnecessárias e mantêm as interfaces coesas. Isso ajuda a garantir que as classes que implementam interfaces tenham apenas os métodos relevantes para elas, evitando assim a poluição da interface com métodos que não serão utilizados.

**Aplicação:**

Neste exemplo, aplicamos o Princípio da Segregação de Interface (ISP) dividindo as funcionalidades relacionadas à impressão e digitalização em interfaces separadas (`Printer` e `Scanner`, respectivamente). A classe `Photocopier` implementa ambas as interfaces e fornece uma implementação para cada método (`print()` e `scan()`).

Isso evita que a classe `Photocopier` tenha dependências desnecessárias, já que ela só precisa implementar as interfaces relevantes para suas funcionalidades. Dessa forma, estamos evitando que a classe `Photocopier` dependa de métodos que não são usados por ela, seguindo o ISP.

> Exemplo: [ISP](h)

---

**Prefira Composição a Herança:**

- Este princípio sugere que os comportamentos de uma classe devem ser obtidos principalmente através da composição de objetos em vez de herança de uma classe base. Em outras palavras, em vez de herdar comportamentos de uma classe base, uma classe deve ter um objeto de outra classe como parte de sua estrutura interna.
- Serve para promover um design mais flexível e evitar problemas associados à herança, como acoplamento rígido e hierarquias profundas. Ao utilizar a composição, as classes podem ser facilmente estendidas e modificadas, e as relações entre classes tornam-se mais claras e flexíveis. Isso também evita problemas como a "herança múltipla", que pode levar a ambiguidades e complexidades desnecessárias.

**Aplicação:**

Neste exemplo, aplicamos o princípio "Prefira Composição a Herança" ao utilizar composição para incorporar o comportamento da classe `Engine` na classe `Car`, em vez de herdar diretamente da classe `Engine`.

A classe `Car` possui um objeto `Engine` como parte de sua estrutura interna. Isso promove um design mais flexível, pois podemos alterar o comportamento do motor sem afetar diretamente a classe `Car`. Além disso, evita problemas associados à herança, como acoplamento rígido e hierarquias profundas, proporcionando uma relação mais clara e flexível entre as classes.

> Exemplo: [Herança](h)

---

**Princípio Aberto-Fechado (OCP):**

- O Princípio Aberto-Fechado (OCP) afirma que uma classe deve ser aberta para extensão, mas fechada para modificação. Em outras palavras, uma classe deve permitir que novos comportamentos sejam adicionados sem modificar seu código-fonte original.
- Isso permite que o código existente seja estendido para acomodar novos requisitos ou funcionalidades sem alterar o comportamento existente. Isso ajuda a manter o código mais robusto, flexível e fácil de manter, pois as mudanças são isoladas em novas classes ou módulos, evitando assim o risco de introduzir bugs em partes existentes do sistema.

**Aplicação:**

Neste exemplo, aplicamos o Princípio Aberto-Fechado (OCP) criando uma hierarquia de classes (`Shape`, `Square`, `Triangle` e `Circle`) onde cada forma geométrica implementa o método `area()`. Novas formas geométricas podem ser adicionadas facilmente estendendo a classe abstrata `Shape` e implementando o método `area()`.

Dessa forma, estamos mantendo a classe `Shape` fechada para modificação, pois não precisamos modificar seu código-fonte original para adicionar novas formas geométricas. Ao mesmo tempo, estamos abertos para estender seu comportamento, permitindo a adição de novas formas sem alterar o código existente.

> Exemplo: [OCP](h)

---

**Princípio da Substituição de Liskov (LSP):**

- O Princípio da Substituição de Liskov (LSP) afirma que os objetos de uma classe derivada devem poder substituir os objetos de sua classe base sem interromper o funcionamento do programa. Em outras palavras, as subclasses devem ser substituíveis por suas classes base sem afetar o comportamento esperado do programa.
- Isso garante que o código que usa as classes base continue funcionando corretamente quando objetos de subclasses são passados para ele. Isso ajuda a manter a consistência e a integridade do sistema, permitindo que novas subclasses sejam adicionadas e usadas sem afetar o comportamento esperado do programa. Isso também promove a reusabilidade do código, facilitando a criação de hierarquias de classes bem projetadas e coesas.

**Aplicação:**

Neste exemplo, aplicamos o Princípio da Substituição de Liskov (LSP) ao garantir que objetos de subclasses (`Duck` e `Penguin`) possam substituir objetos de sua classe base (`Bird`) sem interromper o funcionamento do programa.

Ambas as subclasses `Duck` e `Penguin` substituem o método `makeSound()` da classe base `Bird`, retornando sons diferentes (`Quack` e `Honk`, respectivamente). No entanto, quando chamamos a função `makeBirdSound()`, passamos objetos de `Duck` e `Penguin` como argumentos, e o comportamento esperado é obtido, demonstrando que essas subclasses podem ser usadas de forma intercambiável com a classe base `Bird`, seguindo o LSP.

> Exemplo: [LSP](h)
