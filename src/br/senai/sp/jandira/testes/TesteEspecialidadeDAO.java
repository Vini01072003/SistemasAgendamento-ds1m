/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;

/**
 *
 * @author 22282099
 */
public class TesteEspecialidadeDAO {
    
    public static void main(String[] args) {
        
        Especialidade especialidade1 = new Especialidade("Pediatra",
            "Especialidade dedicada a crianças e ao adolescente!");
    
        Especialidade especialidade2 = new Especialidade("Cardiologia",
            "Atendimento de doenças que acometem o coração");
    
    
        System.out.println(Especialidade.getContador());
        
        System.out.println(especialidade1.getCodigoEspecialiade());
        System.out.println(especialidade2.getCodigoEspecialiade());
        
        System.out.println(especialidade1.getDadosEspecialiade());
        System.out.println(especialidade2.getDadosEspecialiade());
        
        EspecialidadeDAO.gravarEspecialidade(especialidade1);
        EspecialidadeDAO.gravarEspecialidade(especialidade2);
        
        EspecialidadeDAO.excluirEspecialidade(101);
        EspecialidadeDAO.listarEspecialidades();
         
        
    }
    
   
    
    
}
