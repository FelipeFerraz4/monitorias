// Classe base
class Animal {
    String nome;
    int idade;
    double peso;

    Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    void fazerSom() {
        System.out.println(nome + " está fazendo um som.");
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos, Peso: " + peso + " kg");
    }
}

// Anfíbios
class Anfibio extends Animal {
    boolean temPelePermeavel;
    boolean viveEmAguaEDTerra;

    Anfibio(String nome, int idade, double peso, boolean temPelePermeavel, boolean viveEmAguaEDTerra) {
        super(nome, idade, peso);
        this.temPelePermeavel = temPelePermeavel;
        this.viveEmAguaEDTerra = viveEmAguaEDTerra;
    }
}

// Método Main
public class ReinoAnimal {
    public static void main(String[] args) {
        Anfibio sapo = new Anfibio("Sapo", 2, 0.5, true, true);
        
        // Teste de comportamento
        System.out.println("\n Informacoes dos animais:");
        sapo.exibirInfo();
        
        System.out.println("\n Sons dos animais:");
        sapo.fazerSom();
    }
}
