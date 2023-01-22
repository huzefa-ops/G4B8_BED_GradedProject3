package com.tickettrack.start.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tickettrack.start.entity.TEntity;

@Repository
public interface TRepository extends JpaRepository<TEntity, Long> {
	@Query("SELECT t FROM TEntity t WHERE t.tickettitle LIKE %?1%" + " OR t.ticketdesc LIKE %?1%"
			+ " OR t.ticketdate LIKE %?1%")
	public List<TEntity> search(String keyword);
}
