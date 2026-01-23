package POO.aula8;

public class Aluno {
    private Long id;
    private String nome;
    private Integer idade;

    public Aluno(Long id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public boolean isMenorIdade() {
        return idade < 18;
    }

    public void validate() {
        if(nome == null || nome.isEmpty()) {
            throw new RuntimeException("Nome é obrigatorio");
        }
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
