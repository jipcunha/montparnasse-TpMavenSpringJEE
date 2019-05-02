package com.infotel.TpMavenSpringJEE.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringJEE.dao.PersonneRepository;
import com.infotel.TpMavenSpringJEE.metier.Personne;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	PersonneRepository personneRepository;
	
	
	public Personne ajouterPersonne(Personne p) {
		return personneRepository.save(p);
	}

	public Personne afficherPersonne(int id) {
		return personneRepository.findById(id).get();
	}

	
	public void supprimerPersonne(Personne p) {
		personneRepository.delete(p);
	}

	
	public Personne modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	
	public Iterable<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	
	public Personne getPersonne(int id) {
		// TODO Auto-generated method stub
		return personneRepository.getOne(id);
	}

}
