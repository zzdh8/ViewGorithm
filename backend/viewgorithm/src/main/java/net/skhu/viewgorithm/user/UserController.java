package net.skhu.viewgorithm.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/Vuegorithm/*")
public class UserController {
    // 메인페이지
    @RequestMapping("MainPage")
    public String MainPage(){
        return "user/MainPage";
    }

}