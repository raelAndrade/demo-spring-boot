package br.com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.example.demo.domain.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

}
