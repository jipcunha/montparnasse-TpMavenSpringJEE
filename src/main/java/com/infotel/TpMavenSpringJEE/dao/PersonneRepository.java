package com.infotel.TpMavenSpringJEE.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringJEE.metier.Personne;

@Transactional
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
