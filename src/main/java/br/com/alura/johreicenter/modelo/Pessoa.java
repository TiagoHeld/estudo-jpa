package br.com.alura.johreicenter.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer idade;
	private Boolean membro;
	
	@ManyToOne
	JohreiCenter jc;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean getMembro() {
		return membro;
	}

	public void setMembro(Boolean membro) {
		this.membro = membro;
	}

	public JohreiCenter getJc() {
		return jc;
	}

	public void setJc(JohreiCenter jc) {
		this.jc = jc;
	}


	
	
	
	
}
