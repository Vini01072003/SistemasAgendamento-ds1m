package br.senai.sp.jandira.model;

public class Especialidade {
	
	private String nomeEspecialidade;
	private String descricaoEspecialidade;
        private Integer codigoEspecialidade;
	private static int contador = 100;
	
        
        //Construtos da classe Especialidade
        public Especialidade (String nomeEspecialidade){ 
            this.nomeEspecialidade = nomeEspecialidade;
            atualizarEspecialidade();
            
        }
        
        public Especialidade (String nomeEspecialidade, String descricaoEspecialidade){
            this.nomeEspecialidade = nomeEspecialidade;
            this.descricaoEspecialidade = descricaoEspecialidade;
            atualizarEspecialidade();
        } 
        
	public Especialidade() {
            atualizarEspecialidade();
	}
        
        //Criando método para atualizar código 
        //Não quero que me retorne nada apenas atualize o código!    
        private void atualizarEspecialidade(){
            this.codigoEspecialidade = contador;
            contador++;
        }
	
        
	// Métodos de ACESSO Setters and Getters
        
        //Settando e Gettando CODIGO_DA_ESPECIALIDADE
        public Integer getCodigoEspecialiade(){
            return codigoEspecialidade;
        }    
        
	
        //Settando e Gettando NOME DA ESPECIALIDADE 
        public void setNomeEspecialidade(String novoNome) {
		nomeEspecialidade = novoNome;
	}
	public String getNomeEspecialidade() {
		return this.nomeEspecialidade;
	}
	
        
        //Settando e Gettando DESCRIÇÃO DA ESPECIALIDADE
	public void setDescricao(String descricao) {
		this.descricaoEspecialidade = descricao;
	}
	public String getDescricao() {
		return this.descricaoEspecialidade;
	}
	
        public String getDadosEspecialiade(){
           return "A Especialidade é: " + this.nomeEspecialidade + "!" + 
                   "E a descrição da especialidade é: " + this.descricaoEspecialidade;
                 
        }     
          
        //Criando um GetContador pois precisamos que retorne o contador pra gente
        //Usando static pois é um contador, ou seja, ela tem o mesmo valor
	public static int getContador() { 
		return contador;
	}
		
}