package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.crud.CRUDProcesso;
import br.com.projeto.exception.Excecao;
import br.com.projeto.nambiquara.statusProcesso;

public class TesteAddProcesso {

	public static void main(String[] args) {
		
		try {
			CRUDProcesso crudProcesso = new CRUDProcesso(); 
			statusProcesso processo = new statusProcesso();
			processo.setStatusDocumentacao(JOptionPane.showInputDialog("Documenta��o"));
			processo.setStatusProvaPratica(JOptionPane.showInputDialog("Prova Pr�tica"));
			processo.setStatusContratacao(JOptionPane.showInputDialog("Contrata��o"));
			processo.setId(JOptionPane.showInputDialog("ID"));
		
			if (crudProcesso.add(processo)==0) {
				System.out.println("N�o gravou");
			} else {
				System.out.println("Gravado");
			}
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
