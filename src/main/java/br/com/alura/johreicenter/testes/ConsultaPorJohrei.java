package br.com.alura.johreicenter.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.johreicenter.modelo.JohreiCenter;
import br.com.alura.johreicenter.modelo.Pessoa;

public class ConsultaPorJohrei {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("johreis"); 
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		 String jpql = "select p from Pessoa p join p.jc j where j = :pJohrei";
		 
		 	JohreiCenter jc = new JohreiCenter();
		 	jc.setId(2L);

	        TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class);
	        query.setParameter("pJohrei", jc);

	        List<Pessoa> resultList = query.getResultList();
	
			for (Pessoa p : resultList){
			    System.out.println(p.getNome());
			}
			
	
		
		em.getTransaction().commit();
		
		
	}

}
