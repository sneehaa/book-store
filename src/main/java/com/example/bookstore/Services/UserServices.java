package com.example.bookstore.Services;

import com.example.bookstore.Entity.User;
import com.example.bookstore.Pojo.UserPojo;

public interface UserServices {
    UserPojo save (UserPojo userPojo);
    User findByEmail(String email);

    User findBYId(Integer id);


}
