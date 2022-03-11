package com.quinbay1.march2022.Books.Repository;

import com.quinbay1.march2022.Books.Entities.Bookentities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository  extends CrudRepository<Bookentities,Long> {
}

