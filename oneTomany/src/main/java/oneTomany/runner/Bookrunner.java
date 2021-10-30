package oneTomany.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oneTomany.domain.Book;
import oneTomany.repository.Authorrepository;
import oneTomany.repository.Bookrepository;
@Component
public class Bookrunner implements CommandLineRunner {
	/*Here oneTOmany HAS-A mapping onebook can have many authors
	 * ONE BOOK CAN HAVE MANY AUTHORS
	 * PARENT.CLASS IS BOOK
	 * CHILD.CLASS IS AUTHOR*/
	
	@Autowired
	Authorrepository authrepo;

	@Autowired
	Bookrepository bookrepo;
	
	
	@Override
	public void run(String... args) throws Exception {
        /*Here iam setting the data one book to many authors using findByAuthorId*/
		Book book=new Book();
		book.setBookId(1);
		book.setBookFname("Ram");
		book.setBookName("Java");
		book.setAuthlist(Arrays.asList(
				
				authrepo.findByAuthorId(1000),
				authrepo.findByAuthorId(2000),
				authrepo.findByAuthorId(3000)
				)
				
				);
		bookrepo.save(book);
		
	}

}
