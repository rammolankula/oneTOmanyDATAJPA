package oneTomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oneTomany.domain.Book;
@Repository
public interface Bookrepository extends JpaRepository<Book,Integer> {
}
