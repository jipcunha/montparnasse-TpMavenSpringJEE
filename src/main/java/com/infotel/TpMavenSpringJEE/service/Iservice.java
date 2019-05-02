package com.infotel.TpMavenSpringJEE.service;


import com.infotel.TpMavenSpringJEE.metier.Personne;

public interface Iservice {
	public Personne ajouterPersonne(Personne p);
	public Personne afficherPersonne(int idPersonne);
	public Personne getPersonne(int idPersonne);
	public void supprimerPersonne(Personne p);
	public Personne modifierPersonne(Personne p);
	public Iterable<Personne> findAllPersonnes();
	

}

