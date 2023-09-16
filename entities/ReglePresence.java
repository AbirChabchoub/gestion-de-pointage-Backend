package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="regle-presence")
public class ReglePresence {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idReglePresence;
	    private String nomRegle;
	    private Date debutRegle;
	    private Date finRegle;
	    private float margeRetard;
	    private float margeDebut;
	    private Date debutEntree;
	    private Date finEntree;
	    private Date debutSortie;
	    private Date finSortie;
	    private float jourTravaille;
	    private float travHoraire;
	    private boolean pointageEntree;
	    private boolean pointageSortie;
	    private String refRegle;
	    private Date dateDeb;
	    private Date dateFin;
	    private String joursRepos;
	    
	    
		public Long getIdReglePresence() {
			return idReglePresence;
		}
		public void setIdReglePresence(Long idReglePresence) {
			this.idReglePresence = idReglePresence;
		}
		public String getNomRegle() {
			return nomRegle;
		}
		public void setNomRegle(String nomRegle) {
			this.nomRegle = nomRegle;
		}
		public Date getDebutRegle() {
			return debutRegle;
		}
		public void setDebutRegle(Date debutRegle) {
			this.debutRegle = debutRegle;
		}
		public Date getFinRegle() {
			return finRegle;
		}
		public void setFinRegle(Date finRegle) {
			this.finRegle = finRegle;
		}
		public float getMargeRetard() {
			return margeRetard;
		}
		public void setMargeRetard(float margeRetard) {
			this.margeRetard = margeRetard;
		}
		public float getMargeDebut() {
			return margeDebut;
		}
		public void setMargeDebut(float margeDebut) {
			this.margeDebut = margeDebut;
		}
		public Date getDebutEntree() {
			return debutEntree;
		}
		public void setDebutEntree(Date debutEntree) {
			this.debutEntree = debutEntree;
		}
		public Date getFinEntree() {
			return finEntree;
		}
		public void setFinEntree(Date finEntree) {
			this.finEntree = finEntree;
		}
		public Date getDebutSortie() {
			return debutSortie;
		}
		public void setDebutSortie(Date debutSortie) {
			this.debutSortie = debutSortie;
		}
		public Date getFinSortie() {
			return finSortie;
		}
		public void setFinSortie(Date finSortie) {
			this.finSortie = finSortie;
		}
		public float getJourTravaille() {
			return jourTravaille;
		}
		public void setJourTravaille(float jourTravaille) {
			this.jourTravaille = jourTravaille;
		}
		public float getTravHoraire() {
			return travHoraire;
		}
		public void setTravHoraire(float travHoraire) {
			this.travHoraire = travHoraire;
		}
		public boolean isPointageEntree() {
			return pointageEntree;
		}
		public void setPointageEntree(boolean pointageEntree) {
			this.pointageEntree = pointageEntree;
		}
		public boolean isPointageSortie() {
			return pointageSortie;
		}
		public void setPointageSortie(boolean pointageSortie) {
			this.pointageSortie = pointageSortie;
		}
		public String getRefRegle() {
			return refRegle;
		}
		public void setRefRegle(String refRegle) {
			this.refRegle = refRegle;
		}
		public Date getDateDeb() {
			return dateDeb;
		}
		public void setDateDeb(Date dateDeb) {
			this.dateDeb = dateDeb;
		}
		public Date getDateFin() {
			return dateFin;
		}
		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}
		public String getJoursRepos() {
			return joursRepos;
		}
		public void setJoursRepos(String joursRepos) {
			this.joursRepos = joursRepos;
		}
		public ReglePresence(Long idReglePresence, String nomRegle, Date debutRegle, Date finRegle, float margeRetard,
				float margeDebut, Date debutEntree, Date finEntree, Date debutSortie, Date finSortie,
				float jourTravaille, float travHoraire, boolean pointageEntree, boolean pointageSortie, String refRegle,
				Date dateDeb, Date dateFin, String joursRepos) {
			super();
			this.idReglePresence = idReglePresence;
			this.nomRegle = nomRegle;
			this.debutRegle = debutRegle;
			this.finRegle = finRegle;
			this.margeRetard = margeRetard;
			this.margeDebut = margeDebut;
			this.debutEntree = debutEntree;
			this.finEntree = finEntree;
			this.debutSortie = debutSortie;
			this.finSortie = finSortie;
			this.jourTravaille = jourTravaille;
			this.travHoraire = travHoraire;
			this.pointageEntree = pointageEntree;
			this.pointageSortie = pointageSortie;
			this.refRegle = refRegle;
			this.dateDeb = dateDeb;
			this.dateFin = dateFin;
			this.joursRepos = joursRepos;
		}
	    
		public ReglePresence() {
			
		}
	    
		@ManyToMany(fetch = FetchType.EAGER)
	    private List<CycleTravail> Cycles;

}
