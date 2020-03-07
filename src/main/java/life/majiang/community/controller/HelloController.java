package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : fjf
 * @Date : Created in 11:45 2020/3/6
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name" ) String name,Model model){
        model.addAttribute("name",name);
        return  "hello";
    }
}
