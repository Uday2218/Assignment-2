package com.quinbay1.march2022.Books.Service;

import com.quinbay1.march2022.Books.Dto.Books;
import com.quinbay1.march2022.Books.Dto.User;
import com.quinbay1.march2022.Books.Dto.UserBookHistory;
import com.quinbay1.march2022.Books.Entities.Bookentities;
import com.quinbay1.march2022.Books.Entities.UserBookHistoryEntities;
import com.quinbay1.march2022.Books.Entities.Userentities;
import com.quinbay1.march2022.Books.Repository.BookRepository;
import com.quinbay1.march2022.Books.Repository.UserBookHistoryRepository;
import com.quinbay1.march2022.Books.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl  implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserBookHistoryRepository userBookHistoryRepository;
    @Autowired
    UserRepository userRepository;


    @Override
    public void addBook(Books books) {
        bookRepository.save(new Bookentities(books.getId(),books.getName(),books.getWriter(),books.getSummary(),books.getCategory()));
    }

    @Override
    public void addUser(User user) {
        userRepository.save(new Userentities(user.getId(),user.getName(),user.getAddress(),user.getPhNumber()));
    }

    @Override
    public void IssueBook(UserBookHistory userBookHistory) {

                userBookHistoryRepository.save(new UserBookHistoryEntities(userBookHistory.getId(), userBookHistory.getUserid(), userBookHistory.getStartdate(), null));

            }


    @Override
    public void Returnbook(UserBookHistory userBookHistory) {

//        Optional<UserBookHistoryEntities> findbyBookidAndUserid = userBookHistoryRepository.ByBookidAndUserid(userBookHistory.getUserid()
//                , userBookHistory.getId());
//        if(findbyBookidAndUserid.isPresent()){
//            UserBookHistoryEntities userBookHistoryEntities = findbyBookidAndUserid.get();
//            userBookHistoryEntities.getEnddate();
//            userBookHistoryRepository.save(userBookHistoryEntities);
//        }

    }

    @Override
    public List<UserBookHistory> MostPPBook() {
//        List<UserBookHistory>list=new ArrayList();
//
////
//
//
//        User user=new User();
//        for (Userentities  userentities : userRepository.findAll()) {
//            if (userentities.getUserid()==) {
//                user.setId(userentities.getUserid();
//                user.setName(userentities.getName());
//                user.setAddress(userentities.getAddress());
//                user.setPhNumber(userentities.getPhNumber());
//
//            }
//        }
        return null;
    }





    @Override
    public UserBookHistory BooksTakenMore(UserBookHistory Books) {
        return null;
    }






}
