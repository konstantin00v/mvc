package com.konstantin.mvc.Service;



import com.konstantin.mvc.entity.BookStock;

import java.util.List;

public interface
BookStockService {

    public List<BookStock> getAllBookStock();

    public void deleteBookStock();

    public void saveBookStock();


    void deleteBookStock(int id);

    void saveBookStock(BookStock booksWarehouse);

    List<BookStock> findAllByBookAndPriceMVC(String name, Integer price);
//    List<BookStock> findAllByBookAndPrice(String name, int price);


}
