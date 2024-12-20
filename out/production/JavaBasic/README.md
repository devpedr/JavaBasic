# ☕ Collection Framework API
### 📋 Descrição
• Uma coleção(collection) é uma estrutura de dados que serve para agrupar muitos elementos numa única unidade, este elementos precisa ser Objetos.

• Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.

• O núcleo principal das coleções é formando pelas _interfaces_ da figura abaixo, essas interfaces permitem manipular a coleção independentemente do nível de detalhe que eles representam.

• Temos quatro grandes tipos de coleções: List (Lista), Set (Conjunto), Queue(Fila) e Map(mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam formas diferentes de se trabalhar com cada coleção.


<p align="center">
    <img src="Image/Collections-uml.png" alt="Diagrama de CLasses">
</p>
• Todas as _interfaces_ e classes são encontradas dentro do pacote(package) java.util.

• Embora a _interface_ Map não ser filha direta da _interface_ Collection ela também é considerada uma coleção a sua função.
### `List Interface`
• A _interface_ list é uma coleção ordenada que permite a inclusão de elementos duplicados.

• É um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são ArrayList e LinkedList.

• A List se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.

• A _interface_ List fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistas usando índices.

• A classe Collections fornece algoritmos úteis para manipulação de List, como ordenação (sort), embaralhamento (shuffle), reversão (reverse) e busca binária (binarySearch).

ArrayList: O ArrayList armazena os elementos numa estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do ArrayList é o acesso rápido aos elementos por meio de índices, o que permite recuperar um elemento específico de forma eficiente. No entanto, adicionar ou remover elementos no meio da lista pode ser mais lento, pois requer a realocação de elementos.

LinkedList: O LinkedList armazena os elementos numa lista duplamente vinculada. Cada elemento contém referências para o elemento anterior e próximo na lista. A principal vantagem do LinkedList é a eficiência na adição, remoção de elementos no início ou no final da lista, pois não é necessário realocar elementos. No entanto, o acesso aos elementos por meio de índices é mais lento, pois requer percorrer a lista até o elemento desejado. 

