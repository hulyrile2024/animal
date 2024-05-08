class Animal {
    String nome;
    String dieta;

}

class Peixe extends Animal {
    String tipo;

    public Peixe(String nome, String dieta, String tipo) {
        this.nome = nome;
        this.dieta = dieta;
        this.tipo = tipo;
    }

    void dieta() {
        System.out.println("O peixe " + nome + " é do tipo " + tipo + " e tem uma dieta " + dieta + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Espada", "carnívora", "de água doce e salgada");

        peixe.dieta();
    }
}
