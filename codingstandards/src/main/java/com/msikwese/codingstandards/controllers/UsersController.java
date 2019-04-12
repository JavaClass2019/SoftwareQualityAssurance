package com.msikwese.codingstandards.controllers;

import com.msikwese.codingstandards.models.User;
import com.msikwese.codingstandards.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/users")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "signup")
    public ModelAndView signup() {
        return new ModelAndView("/users/signup", "user", new User());
    }

    @PostMapping(path = "signup")
    public String attemptSignup(@Valid @ModelAttribute("user") User user,
                                BindingResult result,
                                ModelMap map,
                                RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "/users/signup";
        }

        userRepository.save(user);

        redirectAttributes.addFlashAttribute("message", "Sign up successful; You can now login");
        return "redirect:/users/login";
    }

    @GetMapping(path = "login")
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is invalid");
        }

        return "users/login";
    }

    @PostMapping(path = "login")
    public String attemptLogin(@RequestParam String username,
                               @RequestParam String password)
        throws UsernameNotFoundException
    {
        throw new UsernameNotFoundException("Invalid username or password");
    }
}