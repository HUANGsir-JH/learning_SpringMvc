package ssm.service;

import ssm.domain.Book;

import java.util.List;

public interface BookService {
    // 保存图书
    boolean save(Book book);
    // 更新图书
    boolean update(Book book);
    // 删除图书
    boolean delete(Integer id);
    // 查询图书
    Book findById(Integer id);
    // 查询所有图书
    List<Book> findAll();
    
}
