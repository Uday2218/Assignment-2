package com.quinbay1.march2022.Books.Controller;

import com.quinbay1.march2022.Books.Dto.Books;
import com.quinbay1.march2022.Books.Dto.User;
import com.quinbay1.march2022.Books.Dto.UserBookHistory;
import com.quinbay1.march2022.Books.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookServiceController {
    @Autowired
    BookService bookService;

    @PostMapping("/Books")
    public void addBooks(@RequestBody @Valid Books books){
        bookService.addBook(books);

    }

    @PostMapping("/User")
    public void addUser(@RequestBody @Valid User user)
    {
        bookService.addUser(user);

    }
    @PostMapping("/issuebook")
    public void IssueBook(@RequestBody  @Valid UserBookHistory userBookHistory)
    {
        bookService.IssueBook(userBookHistory);
    }

    @PutMapping("/returnbook")
    public void Returnbook(@RequestBody UserBookHistory userBookHistory)
    {
        bookService.Returnbook(userBookHistory);
    }

    @GetMapping("/MostPPBook")
    public List<UserBookHistory> UserBookHistory(){
        return  bookService.MostPPBook();
    }

    @GetMapping("/BooksTakenMore")
    public UserBookHistory BooksTakenMore(){
       return bookService.BooksTakenMore(BooksTakenMore());
    }


}
