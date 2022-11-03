package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.Patch;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    private Component parentComponent;

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    private final String ARQUIVO = "Z:\\Java\\test.txt";
    private final String ARQUIVO_Temp = "Z:\\Java\\plano_de_saude.temp";

    private static final Path path = Path.get();

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);
    }

    
        try{
            try {
            // Gravar Planos de saude

            BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.APPEND, StandardOpenOption.WRITE);
        } catch (IOException ex) {
            Logger.getLogger(PlanoDeSaudeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    catch (IOException ex

    
        ) {
                Logger.getLogger(PlanoDeSaudeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    String novoPlanoDeSaude = planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula();

    bw.
                          

    catch(IOException ex

    
        ) {
                   JOptionPane.showMessageDialog(parentComponent, "Erro ao criar Plano De Saude, digite novamente");
    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                break;
            }
        }
        // Reconstruir o arquivo atualizado, ou seja, sem o plano que foi removido
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_Temp);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bw = Files.newBufferedWriter(PATH_Temp, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            // Alterar a lista no arquivo temporário
            for (PlanoDeSaude p : planos) {
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bw.close();
            
            
            arquivo.close

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar um arquivo", "ERRO",);
        }

        return false;
    }

    /**
     *
     * @param codigo
     * @return
     */
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude e : planos) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;

    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
                
                
                
            }
        }
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void getListaPlanosDeSaude() {
        try {
            // Abrir o arquivo para leitura - Leitor
            BufferedReader br = Files.newBufferedReader(path);

            String linha = br.readLine();

            while (linha != null) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                planos.add(novoPlanoDeSaude);
                linha = br.readLine();
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro", 0);
        }
    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código",
            "Nome da operadora",
            "Tipo do plano"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
