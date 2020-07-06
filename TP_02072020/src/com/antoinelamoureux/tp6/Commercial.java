package com.antoinelamoureux.tp6;

public class Commercial extends Salarie {
	private double m_dChiffreAffaire;
	private int m_pcCommission;

	public Commercial(double m_dChiffreAffaire, int m_pcCommission, int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) {
		super(m_nMatricule, m_nCategorie, m_nService, m_strNom, m_dSalaire);
		this.m_dChiffreAffaire = m_dChiffreAffaire;
		this.m_pcCommission = m_pcCommission;
	}

	public double getM_dChiffreAffaire() {
		return m_dChiffreAffaire;
	}

	public void setM_dChiffreAffaire(double m_dChiffreAffaire) {
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}

	public double getM_pcCommission() {
		return m_pcCommission;
	}

	public void setM_pcCommission(int m_pcCommission) {
		this.m_pcCommission = m_pcCommission;
	}

	@Override
	public String calculSalaire(String nom, double salaire) {
		return "Le salaire réel de "+ nom + " est de " + (salaire + m_dChiffreAffaire / 100 * m_pcCommission) +"€";
	}
	
	@Override
	public String toString() {
		return String.format(getM_nMatricule() + ", " + getM_nCategorie() + ", "+ getM_nService() + 
				", "+ getM_strNom() + ", " + getM_dSalaire())+ ", " +m_pcCommission ;
	}
	
}

