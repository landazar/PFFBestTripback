package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.model.Activite;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Integer> {
	@Query(value = "select id from activite where id_experience=:id_experience", nativeQuery = true)
	List<Integer> findByIdExperience(@Param("id_experience") int id_experience);
}
