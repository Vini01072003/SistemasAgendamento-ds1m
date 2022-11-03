package br.senai.sp.jandira.dao;
import java.util.ArrayList;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
/**
 *
 * @author 22282099
 */
public class EspecialidadeDAO { 

    private static Path path;
//Simular banco de dados fake
    
    private Especialidade especialidade; //criando uma nova variável com a Especialidade
    private static ArrayList<Especialidade> especialidades = new ArrayList<>(); //criando uma array com as especialidades
    
    //criando método construtor puro DAO
    public EspecialidadeDAO(){
        
    }
    
   //criando método construtor com parâmetro DAO
    public EspecialidadeDAO (Especialidade especialidade){ 
        this.especialidades.add(especialidade); //adicionando na Arraylist
    }
    
    //criando método para pegar a Especialidade que está localizada no Especialidade.model
    public static Especialidade getEspecialidade(Integer codigoEspecialidade){
        for(Especialidade e : especialidades){
            if (e.getCodigoEspecialiade().equals(codigoEspecialidade)) {
                return e;
            }
        }
        return null;
    }
    
    //gravando os planos dentro da table
    public static void gravarEspecialidade(Especialidade especialidade){
        especialidades.add(especialidade);
    }
    
    //excluindo as especialdades dentro da table
    //Criando Looping ForEach com para excluir sempre que necessário
    public static boolean excluirEspecialidade (Integer codigoEspecialidade){    
        for(Especialidade e : especialidades){
            if (e.getCodigoEspecialiade().equals(codigoEspecialidade)){
                especialidades.remove(e);
                return true;
                }
            }
        
        return false;
    }
    
    //criando um método para atualizar a tabela/banco de dados quando alterado
    //criando um ForEach para se repitir sempre que necessário
    //vai atualizar o index daquilo que modificamos
    public static void atualizarEspecialidade(Especialidade especialidade){
        for(Especialidade e : especialidades){
            if (e.getCodigoEspecialiade().equals(especialidade.getCodigoEspecialiade())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
    }
    
    //criando método para listar as especialidades que estão presentes dentro da tabela
    public static ArrayList<Especialidade> listarEspecialidades(){
        return especialidades;
    }
    
    //criando método especialidades "fakes" 
    public static void ListagetEspecialidades(){
        try {
             BufferedReader br = Files.newBufferedReader(path);
             
             String linha = br.readLine();
                   while(linha != null) {
                    String[] linhaVetor = linha.split(";");
                    Especialidade novoEspecialidade = new Especialidade (
                    Integer.valueOf(linhaVetor[0]),
                            linhaVetor[1],
                            linhaVetor[2]);
                    Especialidade.add(novoEspecialidade);
                 linha = br.readLine(); }
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "Ocorreu um erro", 0);
            
            
        }

    }
    
    //Criando a tabela dando as colunas e linhas através do método DefaultTableModel
    public static DefaultTableModel getTableEspecialidades(){
                                                                               //Colunas            //Linhas
        Object[][] dadosEspecialidades = new Object[especialidades.size()] [3];
        
        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
            
        int i = 0;
        for (Especialidade e : especialidades){
            dadosEspecialidades[i][0] = e.getCodigoEspecialiade();
            dadosEspecialidades[i][1] = e.getNomeEspecialidade();
            dadosEspecialidades[i][2] = e.getDescricao();
            i++;
        }
        
      //Definimos um vetor com os nomes das colunas
      String [] tituloEspecialidades = {
            "Código",
          "Nome da Especialidade",
          "Descrição da especialidade"};
      
       // Criar o modelo que será utilizado pela JTable 
       // para exibir os dados dos planos
       
        DefaultTableModel tableEspecialidades = new DefaultTableModel(dadosEspecialidades, tituloEspecialidades);
        
        return tableEspecialidades ;
      
        }     
    }
       

 