class Aluno{
    private String nome;
    private long matricula;
    private double nota1, nota2, nota3;
    private double notaFinal;
    
    public Aluno(){		
	}
	
	public Aluno(String nome, long matricula, double nota1, double nota2, double nota3){
	    this.nome = nome;
	    this.matricula = matricula;
	    this.nota1 = nota1;
	    this.nota2 = nota2;
	    this.nota3 = nota3;
	    this.calcularMedia();
	    
	}
	
	public void imprimirDados(){
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nota Final: " + notaFinal);
	}
	
	public void calcularMedia(){
	    this.notaFinal = (nota1 + nota2 + nota3) / 3;
	}

	public boolean verificarAprovacao(){
		
		if (notaFinal >= 6.0){
			return true;
		}else{
			return false;
		}		
	}
}

public class Ex1Germini {
    public static void main(String args[]) {
		Aluno aluno1 = new Aluno("Mauricio", 20242160034L, 5.0, 6.0, 8.0);
		Aluno aluno2 = new Aluno("Murilo", 20242160035L, 5, 4, 6);
        
        //aluno1.calcularMedia();
        //aluno2.calcularMedia();
        
		aluno1.imprimirDados();
		System.out.println(aluno1.verificarAprovacao());
		
		System.out.println("\n");
		
		aluno2.imprimirDados();
		System.out.println(aluno2.verificarAprovacao());
    }
}
