public class pessoa {
    private String nome;
    private int idade = 0;
    private int telefone = 0;

    public void lerNome() {
        this.nome = "Brayan";
        System.out.println(nome);
    }

    public void lerIdade() {
        this.idade = 18;
        System.out.println(idade);
    }
    
    public void lerTelefone() {
        this.telefone = 4700000;
        System.out.println(telefone);
    }
}
