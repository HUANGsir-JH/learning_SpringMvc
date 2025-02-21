package ssm.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import ssm.config.SpringConfig;
import ssm.domain.Book;

@SpringJUnitConfig(classes = SpringConfig.class)
@WebAppConfiguration
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    
    @Test
    public void testFindById() {
        Book book = bookService.findById(1);
        System.out.println(book);
    }
}
