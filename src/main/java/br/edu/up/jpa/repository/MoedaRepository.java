package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.up.jpa.dominio.*;

@RepositoryRestResource(collectionResourceRel = "moeda", path = "moeda", excerptProjection = Moeda.class)
public interface MoedaRepository extends  CrudRepository<Moeda , Integer> {

}
