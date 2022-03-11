package com.quinbay1.march2022.Books.Repository;

import com.quinbay1.march2022.Books.Entities.Userentities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository  extends CrudRepository<Userentities,Long> {
}