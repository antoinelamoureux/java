package com.antoinelamoureux.tp2;

public class Batiment {
private String adresse;

public Batiment() {
	super();
}

public Batiment(String adresse) {
	super();
	this.adresse = adresse;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

@Override
public String toString() {
	return "Batiment [adresse=" + adresse + "]";
}

}
