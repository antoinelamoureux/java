package com.antoinelamoureux.tp3;

public class Salarie {
	private int m_nMatricule;
	private int m_nCategorie;
	private int m_nService;
	private String m_strNom;
	private double m_dSalaire;
	
	public Salarie(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) {
		this.m_nMatricule = m_nMatricule;
		this.m_nCategorie = m_nCategorie;
		this.m_nService = m_nService;
		this.m_strNom = m_strNom;
		this.m_dSalaire = m_dSalaire;
	}
	
	public int getM_nMatricule() {
		return m_nMatricule;
	}
	public void setM_nMatricule(int m_nMatricule) {
		this.m_nMatricule = m_nMatricule;
	}
	public int getM_nCategorie() {
		return m_nCategorie;
	}
	public void setM_nCategorie(int m_nCategorie) {
		this.m_nCategorie = m_nCategorie;
	}
	public int getM_nService() {
		return m_nService;
	}
	public void setM_nService(int m_nService) {
		this.m_nService = m_nService;
	}
	public String getM_strNom() {
		return m_strNom;
	}
	public void setM_strNom(String m_strNom) {
		this.m_strNom = m_strNom;
	}
	public double getM_dSalaire() {
		return m_dSalaire;
	}
	public void setM_dSalaire(double m_dSalaire) {
		this.m_dSalaire = m_dSalaire;
	}
	
	public void calculSalaire(String nom, double salaire) {
		System.out.print("Le salaire de"+ nom + "est de" +salaire);
	}
}
