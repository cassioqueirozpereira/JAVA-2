// A Set é uma interface em Java, o que significa que ela define um conjunto de comportamentos e métodos que outras classes devem implementar. O principal conceito de uma Set é que ela é uma coleção que não permite elementos duplicados.

// Pense em uma Set como um conjunto matemático. Você pode adicionar quantos elementos quiser, mas se tentar adicionar um elemento que já está lá, a operação é ignorada.

// As principais características de uma Set são:

//     Não permite duplicatas: Cada elemento é único.

//     Não tem índice: Você não pode acessar um elemento pelo seu índice (set.get(0)) porque a ordem dos elementos não é garantida.

//     Performance: A adição, remoção e verificação da existência de um elemento (set.contains()) são, em geral, muito eficientes.

// O que é uma HashSet?

// A HashSet é uma classe concreta que implementa a interface Set. Ela é uma das implementações mais comuns de Set e usa uma tabela de hash por baixo dos panos para armazenar os elementos.

// Isso a torna extremamente rápida para operações como adicionar, remover e verificar se um elemento existe, desde que os objetos armazenados implementem corretamente o método hashCode().

// A principal característica de uma HashSet é que ela não mantém a ordem de inserção. Ou seja, a ordem em que os elementos são adicionados não é a ordem em que eles serão iterados ou exibidos.

// Qual a diferença entre Set e HashSet?

//     Set é o contrato (a interface). Ela diz "você deve ser uma coleção sem duplicatas".

//     HashSet é a implementação (a classe). Ela diz "eu sou uma coleção sem duplicatas, e vou fazer isso de forma muito rápida usando uma tabela de hash, mas sem manter a ordem".

// Em resumo, você usa a interface Set para declarar a variável (para se referir a uma coleção sem duplicatas de forma genérica) e usa a classe HashSet para instanciá-la (criar o objeto de fato).

import java.util.Set;
import java.util.HashSet;

public class Add_remove {
    public static void main(String[] args) {
        // Create a new ArrayList
        Set<String> carros = new HashSet<>();

        carros.add("Sonic");
        carros.add("Celta");
        carros.add("Corsa");
        carros.add("Sonic"); // Duplicate, will not be added
        carros.add("Celta"); // Duplicate, will not be added
        carros.remove("Corsa");
        carros.remove("Celta");

        for (String carro : carros) {
            System.out.println(carro);
        }
    }
}