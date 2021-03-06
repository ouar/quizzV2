package fr.gfi.quiz.entite.hibernate;
// Generated 14 avr. 2014 16:36:23 by Hibernate Tools 4.0.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Quizz generated by hbm2java
 */
public class Quizz  implements java.io.Serializable {


     private Integer id;
     private User user;
     private Integer intDuree;
     private String prenomCandidat;
     private String nomCandidat;
     private String libCommentaire;
     private Date datQuizz;
     private Set<QuizzQuestion> quizzQuestions = new HashSet<QuizzQuestion>(0);
     private Set<QuizzSujet> quizzSujets = new HashSet<QuizzSujet>(0);
     private Set<ReponseCandidat> reponseCandidats = new HashSet<ReponseCandidat>(0);

    public Quizz() {
    }

	
    public Quizz(User user) {
        this.user = user;
    }
    public Quizz(User user, Integer intDuree, String prenomCandidat, String nomCandidat, String libCommentaire, Date datQuizz, Set<QuizzQuestion> quizzQuestions, Set<QuizzSujet> quizzSujets, Set<ReponseCandidat> reponseCandidats) {
       this.user = user;
       this.intDuree = intDuree;
       this.prenomCandidat = prenomCandidat;
       this.nomCandidat = nomCandidat;
       this.libCommentaire = libCommentaire;
       this.datQuizz = datQuizz;
       this.quizzQuestions = quizzQuestions;
       this.quizzSujets = quizzSujets;
       this.reponseCandidats = reponseCandidats;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getIntDuree() {
        return this.intDuree;
    }
    
    public void setIntDuree(Integer intDuree) {
        this.intDuree = intDuree;
    }
    public String getPrenomCandidat() {
        return this.prenomCandidat;
    }
    
    public void setPrenomCandidat(String prenomCandidat) {
        this.prenomCandidat = prenomCandidat;
    }
    public String getNomCandidat() {
        return this.nomCandidat;
    }
    
    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }
    public String getLibCommentaire() {
        return this.libCommentaire;
    }
    
    public void setLibCommentaire(String libCommentaire) {
        this.libCommentaire = libCommentaire;
    }
    public Date getDatQuizz() {
        return this.datQuizz;
    }
    
    public void setDatQuizz(Date datQuizz) {
        this.datQuizz = datQuizz;
    }
    public Set<QuizzQuestion> getQuizzQuestions() {
        return this.quizzQuestions;
    }
    
    public void setQuizzQuestions(Set<QuizzQuestion> quizzQuestions) {
        this.quizzQuestions = quizzQuestions;
    }
    public Set<QuizzSujet> getQuizzSujets() {
        return this.quizzSujets;
    }
    
    public void setQuizzSujets(Set<QuizzSujet> quizzSujets) {
        this.quizzSujets = quizzSujets;
    }
    public Set<ReponseCandidat> getReponseCandidats() {
        return this.reponseCandidats;
    }
    
    public void setReponseCandidats(Set<ReponseCandidat> reponseCandidats) {
        this.reponseCandidats = reponseCandidats;
    }




}


