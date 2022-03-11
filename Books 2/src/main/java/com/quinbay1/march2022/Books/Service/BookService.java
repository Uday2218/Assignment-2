package com.quinbay1.march2022.Books.Service;


import com.quinbay1.march2022.Books.Dto.Books;
import com.quinbay1.march2022.Books.Dto.User;
import com.quinbay1.march2022.Books.Dto.UserBookHistory;
import org.springframework.stereotype.Component;

import java.util.List;



    @Component
    public interface BookService {

        void addBook(Books books);
        void addUser(User user);
        void IssueBook(UserBookHistory userBookHistory);
        void Returnbook(UserBookHistory userBookHistory);
        List<UserBookHistory> MostPPBook();
        UserBookHistory BooksTakenMore(UserBookHistory Books);


    }

