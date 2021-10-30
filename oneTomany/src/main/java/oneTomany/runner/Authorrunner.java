package oneTomany.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oneTomany.domain.Author;
import oneTomany.repository.Authorrepository;
@Component
public class Authorrunner implements CommandLineRunner {
	
	@Autowired
	Authorrepository authrepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*Here saving the data for many authors list*/
		authrepo.save(new Author(1000,"Ram","java"));
		authrepo.save(new Author(2000,"Ganesh","java"));
		authrepo.save(new Author(3000,"shyam","java"));
		authrepo.save(new Author(3000,"shruthi","java"));
		
	}

}
