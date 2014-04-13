package fr.gfi.quiz.entite.hibernate;

// Generated 2 avr. 2014 11:27:10 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 *
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Set<Quizz> quizzs = new HashSet<Quizz>(0);
	private Set<UserRoles> userRoleses = new HashSet<UserRoles>(0);

	public User() {
	}

	public User(String nom, String prenom, String login, String password, Set<Quizz> quizzs, Set<UserRoles> userRoleses) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.quizzs = quizzs;
		this.userRoleses = userRoleses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer pid) {
		this.id = pid;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String pnom) {
		this.nom = pnom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String pprenom) {
		this.prenom = pprenom;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String plogin) {
		this.login = plogin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String ppassword) {
		this.password = ppassword;
	}

	public Set<Quizz> getQuizzs() {
		return this.quizzs;
	}

	public void setQuizzs(Set<Quizz> pquizzs) {
		this.quizzs = pquizzs;
	}

	public Set<UserRoles> getUserRoleses() {
		return this.userRoleses;
	}

	public void setUserRoleses(Set<UserRoles> puserRoleses) {
		this.userRoleses = puserRoleses;
	}

	// The following is extra code specified in the hbm.xml files   toString
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
		buffer.append("id").append("='").append(getId()).append("' ");
		buffer.append("nom").append("='").append(getNom()).append("' ");
		buffer.append("prenom").append("='").append(getPrenom()).append("' ");
		buffer.append("login").append("='").append(getLogin()).append("' ");
		buffer.append("password").append("='").append(getPassword()).append("' ");
		buffer.append("quizzs").append("='").append(getQuizzs()).append("' ");
		buffer.append("userRoleses").append("='").append(getUserRoleses()).append("' ");
		buffer.append("]");
		return buffer.toString();
	}

}