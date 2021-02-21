package pl.sda.javalondek4springdemo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private static final Logger logger = LoggerFactory.getLogger(BookRepository.class);

    private List<Book> books;

    public BookRepository() {
        List<Book> someBooks = List.of(
                new Book(1L, "Henryk S.", "Potopem"),
                new Book(1L, "Henryk S.", "Pan Woo"),
                new Book(1L, "Henryk S.", "Quo V.")
        );

        this.books = new ArrayList<>(someBooks);

        logger.info("book repository initialized with books: {}", books);
    }


}
