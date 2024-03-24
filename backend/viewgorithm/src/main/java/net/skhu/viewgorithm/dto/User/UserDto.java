package net.skhu.viewgorithm.dto;
import lombok.*;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {
    private int user_pk;
    private String id;
    private String password;
    private String name;
    private String gender;
    private Date birth;
    private String phone;
    private String email;
    private Date created_at;
}
