package com.example.bookstore.Pojo;
import com.example.bookstore.Entity.User;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPojo {
    private Integer id;

    private String email;
    private  String fullname;
    private  String password;



    public UserPojo(User user) {
        this.id=user.getId();
        this.email=user.getEmail();
        this.fullname=user.getFullname();
        this.password=user.getPassword();
    }
}
