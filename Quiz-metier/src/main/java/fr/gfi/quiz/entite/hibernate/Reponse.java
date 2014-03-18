package fr.gfi.quiz.entite.hibernate;

// Generated 18 mars 2014 17:00:25 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Reponse generated by hbm2java
 */
public class Reponse implements java.io.Serializable {

	private Integer id;
	private Question question;
	private String libReponse;
	private Boolean bolTypeReponse;
	private Set<ReponseCandidat> reponseCandidats = new HashSet<ReponseCandidat>(
			0);

	public Reponse() {
	}

	public Reponse(Question question) {
		this.question = question;
	}

	public Reponse(Question question, String libReponse,
			Boolean bolTypeReponse, Set<ReponseCandidat> reponseCandidats) {
		this.question = question;
		this.libReponse = libReponse;
		this.bolTypeReponse = bolTypeReponse;
		this.reponseCandidats = reponseCandidats;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getLibReponse() {
		return this.libReponse;
	}

	public void setLibReponse(String libReponse) {
		this.libReponse = libReponse;
	}

	public Boolean getBolTypeReponse() {
		return this.bolTypeReponse;
	}

	public void setBolTypeReponse(Boolean bolTypeReponse) {
		this.bolTypeReponse = bolTypeReponse;
	}

	public Set<ReponseCandidat> getReponseCandidats() {
		return this.reponseCandidats;
	}

	public void setReponseCandidats(Set<ReponseCandidat> reponseCandidats) {
		this.reponseCandidats = reponseCandidats;
	}

}
