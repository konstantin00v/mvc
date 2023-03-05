package com.konstantin.mvc.Service;

import com.konstantin.mvc.entity.BookStock;
import com.konstantin.mvc.repository.BookStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookStockServiceImpl implements BookStockService {
    @Autowired
    public BookStockRepository booksStockRepository;

//    @Autowired
//    public BookRepository bookRepository;

    public List<BookStock> getAllBooks() {
        return booksStockRepository.findAll();
    }

    public BookStock getBooksWarehouseById(int id) {
        BookStock booksWarehouse = null;
        Optional<BookStock> b = booksStockRepository.findById(id);
        if (b.isPresent()) {
            booksWarehouse = b.get();
        }
        return booksWarehouse;
    }


    @Override
    public List<BookStock> getAllBookStock() {
        return null;
    }

    @Override
    public void deleteBookStock() {

    }

    @Override
    public void saveBookStock() {

    }

    @Override
    public void deleteBookStock(int id) {
        booksStockRepository.deleteById(id);
    }

    @Override
    public void saveBookStock(BookStock booksWarehouse) {
        booksStockRepository.save(booksWarehouse);
    }


//    @Override
//    public List<BookStock> findAllByBookAndPrice(String name, int price) {
//        return null;
//    }
    @Override
    public List<BookStock> findAllByBookAndPriceMVC(String name, Integer price) {
        if (name != null && price != 0) {
            return booksStockRepository.findAllByBookAndPrice(name, price);
        } else {
            return booksStockRepository.findAll();
        }
    }
}
