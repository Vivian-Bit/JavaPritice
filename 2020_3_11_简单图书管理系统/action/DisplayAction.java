package java15_0308_book.action;

import java15_0308_book.book.Book;
import java15_0308_book.book.BookList;

public class DisplayAction implements IAction {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
