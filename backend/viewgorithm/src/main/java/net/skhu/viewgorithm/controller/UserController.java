package net.skhu.viewgorithm.controller;


import net.skhu.viewgorithm.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import net.skhu.viewgorithm.dto.User.*;

@Controller
@RequestMapping("/ViewGorithm/*")

// api를 줄거니까 여기서 @ResponseBody 첨가해야함
public class UserController {
    //@Autowired
    private UserServiceImpl userService;
    @RequestMapping("MainPage")
    public String MainPage(){
        return "user/ViewgorithmMainPageTest";
    }

    //JWT 방식으로.
    @RequestMapping("Login")
    public String Login(){
        return "";
    }

//    UserDto userDto 가 import가 현재 안됌
    @RequestMapping("RegisterId")
    public String RegisterId(){

        return "";
    }


}
