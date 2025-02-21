package ssm.service.imp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.domain.Book;
import ssm.mapper.BookMapper;
import ssm.service.BookService;

import java.util.List;

@Service
@Data
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public boolean save(Book book) {
        try {
            bookMapper.save(book);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean update(Book book) {
        try {
            bookMapper.update(book);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean delete(Integer id) {
        try {
            bookMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public Book findById(Integer id) {
        return bookMapper.findById(id);
    }
    
    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
