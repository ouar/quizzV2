package fr.gfi.quiz.entite.hibernate;

// Generated 18 mars 2014 17:00:25 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TypeSujet generated by hbm2java
 */
public class TypeSujet implements java.io.Serializable {

	private Integer id;
	private Langage langage;
	private String libelle;
	private Set<Question> questions = new HashSet<Question>(0);
	private Set<QuizzSujet> quizzSujets = new HashSet<QuizzSujet>(0);

	public TypeSujet() {
	}

	public TypeSujet(Langage langage, String libelle) {
		this.langage = langage;
		this.libelle = libelle;
	}

	public TypeSujet(Langage langage, String libelle, Set<Question> questions,
			Set<QuizzSujet> quizzSujets) {
		this.langage = langage;
		this.libelle = libelle;
		this.questions = questions;
		this.quizzSujets = quizzSujets;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Langage getLangage() {
		return this.langage;
	}

	public void setLangage(Langage langage) {
		this.langage = langage;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public Set<QuizzSujet> getQuizzSujets() {
		return this.quizzSujets;
	}

	public void setQuizzSujets(Set<QuizzSujet> quizzSujets) {
		this.quizzSujets = quizzSujets;
	}

}