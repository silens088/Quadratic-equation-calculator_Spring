package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greetingSubmit(Model model) {
        return "index";
    }
}