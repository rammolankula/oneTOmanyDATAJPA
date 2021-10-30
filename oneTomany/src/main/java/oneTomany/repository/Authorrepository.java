package oneTomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import oneTomany.domain.Author;

public interface Authorrepository extends JpaRepository<Author, Integer>{

	Author findByAuthorId(Integer AuthorId);
}