/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
     private final static String ARQUIVO = "C:\\Users\\22282112\\Documents\\NetBeansProjects\\sistema-agendamento-completo\\src\\br\\senai\\sp\\jandira\\arquivos\\medico.txt";
    private final static String ARQUIVO_TEMP = "C:\\Users\\22282081\\Documents\\NetBeansProjects\\projeto\\02-2022-ds1m-b\\src\\br\\senai\\sp\\jandira\\arquivos\\medico_temp.txt";
    private static Path PATH = Paths.get(ARQUIVO);
    private static Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();

    public MedicoDAO() {

    }

    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);

    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static void gravar(Medico medico) {

        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            bw.write(medico.getMedicoSeparadoporPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
        medicos.add(medico);
    }
    
     public static Medico getEspecialidade(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;

            }

        }
        return null;
    }

      public static boolean excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();

        return false;
    }
      
      public static void editar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
        }
        atualizarArquivo();

    }
      
      private static void atualizarArquivo() {
        //Reconstruir um arquivo atualizado
        //sem o plano que foi removido
        //Passo 1 - Criar uma representação dos arquivos que serão manipulados
          File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            //Criar o arquivo temporario
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na liosta para adicionar os planos no arquivo temporario
            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoporPontoEVirgula());
                bwTemp.newLine();

            }
            //Fechar o arquivo temporario
            bwTemp.close();

            //Excluir arquivo atual - planoDeSaude
            arquivoAtual.delete();

            //Renomear o arquivo temporario
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
      
      
      public static void GetListaMedicos() {

        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            // ler uma linha do arquivo e armazenar na variavel linha
            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {

                String[] linhaVetor = linha.split(";");
                Medico m = new Medico(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]);
                medicos.add(m);
                linha = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O arquivo medico não existe");

        }
    }
      
      public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[medicos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Crm", "Nome do Médico"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
}
    

