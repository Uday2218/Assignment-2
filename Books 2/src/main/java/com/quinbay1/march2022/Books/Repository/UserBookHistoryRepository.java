package com.quinbay1.march2022.Books.Repository;


import com.quinbay1.march2022.Books.Entities.UserBookHistoryEntities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserBookHistoryRepository  extends CrudRepository<UserBookHistoryEntities,Long> {
   // Optional<UserBookHistoryEntities> ByBookidAndUserid(Long id,Long userid);
}

