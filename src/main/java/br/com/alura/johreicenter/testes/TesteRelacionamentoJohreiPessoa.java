package br.com.alura.johreicenter.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.johreicenter.modelo.JohreiCenter;
import br.com.alura.johreicenter.modelo.Pessoa;

public class TesteRelacionamentoJohreiPessoa {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("johreis"); 
		EntityManager em = emf.createEntityManager();
		
		JohreiCenter jc01 = new JohreiCenter();
		jc01.setNome("Johrei Center Imperador");
		jc01.setEndereco("Av Imperador, 10");
		
		JohreiCenter jc02 = new JohreiCenter();
		jc02.setNome("Johrei Center Penha");
		jc02.setEndereco("Av Vilela, 11");
		
		
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Tiago Held");
		pessoa01.setIdade(41);
		pessoa01.setMembro(true);
		pessoa01.setJc(jc01);
		
		Pessoa pessoa02 = new Pessoa();
		pessoa02.setNome("Maria de Lourdes");
		pessoa02.setIdade(41);
		pessoa02.setMembro(true);
		pessoa02.setJc(jc01);
		
		Pessoa pessoa03 = new Pessoa();
		pessoa03.setNome("Elisa");
		pessoa03.setIdade(30);
		pessoa03.setMembro(true);
		pessoa03.setJc(jc02);
		
		jc01.getPessoas().add(pessoa01);
	    jc01.getPessoas().add(pessoa02);
		
		em.getTransaction().begin();
		em.persist(pessoa01);
		em.persist(pessoa02);
		em.persist(pessoa03);
		em.persist(jc01);
		em.persist(jc02);
		
		em.getTransaction().commit();
	}
	
	

}
