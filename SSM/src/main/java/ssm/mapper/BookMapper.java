package ssm.mapper;

import org.apache.ibatis.annotations.Mapper;
import ssm.domain.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    void save(Book book);
    void update(Book book);
    void delete(Integer id);
    
    Book findById(Integer id);
    List<Book> findAll();
}
