class Post { 
    private String conteudo; 
    private String autor; 
    private int curtidas; 
    private boolean publico;
    
    public Post(String conteudo, String autor){
        this(conteudo, autor, true);
    }
    
    public Post(String conteudo, String autor, boolean publico){
        validarConteudo(conteudo);
        
        if(conteudo == null || conteudo.isEmpty() || autor == null || conteudo.isEmpty()){
            return;
        }
        
        this.conteudo = conteudo;
        this.autor = autor;
        this.publico = publico;
    }
    
    private boolean validarQuantidade(int quantidade){
        if(quantidade > 0){
            return true;
        }
        
        return false;
    }
    
    private void validarConteudo(String conteudo){
        if(conteudo == null || conteudo.trim().isEmpty() ){
            throw new IllegalArgumentException("Conteudo não pode ser vazio!");
        }
    }
    
    public void curtir(){
        this.curtidas++;
    }
    
    public void curtir(int quantidade){
        if(validarQuantidade(quantidade)){
            this.curtidas += quantidade;
        }
    }
    
    public void display(){
        System.out.println(this.conteudo + "\n" + this.autor + "\n" + this.curtidas);
    }
}

public class Q2Lista2{
    public static void main(String args[]){
        Post p1 = new Post("Oi", "Mauricio");
        
        p1.curtir(1);
        
        p1.display();
        
    }
}  