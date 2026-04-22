class Aluno{
    private String matricula;
    private String nome;
    private int idade;
    private String curso;
    
    public Aluno(String matricula, String nome){
        this(matricula, nome, 0, null);
    }
    
    public Aluno(String matricula, String nome, int idade){
        this(matricula, nome, idade, null);
        
    }
    public Aluno(String matricula, String nome, int idade, String curso){
        validarMatricula(matricula);
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    public String getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    
    public void display(){
        System.out.println(matricula + "\n" + nome + "\n" + idade + "\n" + curso);
    }
    
    private void validarMatricula(String matricula){
        if(matricula.isEmpty()){
           throw new IllegalArgumentException("Matricula não pode ser vazia!");
        }
    }
    
}

public class Q3Lista2{
    public static void main(String args[]){
        Aluno a1 = new Aluno("20242160034", "Mauricio");
        a1.display();
        System.out.println(a1.getNome());
        System.out.println(a1.getMatricula());
    }
}