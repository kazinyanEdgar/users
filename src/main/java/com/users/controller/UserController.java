package com.users.controller;

import com.users.model.User;
import com.users.service.UserService;
import com.users.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

//  слой контроллера отвечает за обработку запросов пользователей и возвращение результатов пользователю
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    private String email;

    @GetMapping("/")
    public String mainRedirect() {
        return "redirect:/main";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllTheUsers());
        return "users";
    }


    @GetMapping("/users/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/users/add")
    public String addUser(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        userValidator.validate(user, bindingResult);
        if (bindingResult.hasErrors())
            return "addUser";
        userService.addUser(user);
        return "redirect:/users";
    }


    @GetMapping("/users/get")
    public String getUser() {
        return "getUser";
    }


    @GetMapping("/users/getUser")
    public String getUser(@RequestParam("id") Long id, Model model) {
        User user = userService.getUser(id);
        if (user == null) {
            return "errorGetOrUpdateOrDelete";
        }
        model.addAttribute("user", user);
        return "getUserResult";
    }


    @GetMapping("users/update")
    public String updateUser(Model model) {
        model.addAttribute("user", new User());
        return "updateUser";
    }

    @PostMapping("users/update")
    public String updateUser(@RequestParam("id") Long id, Model model) {
        User user = userService.getUser(id);
        if (user == null)
            return "errorGetOrUpdateOrDelete";
        email = user.getEmail();
        model.addAttribute("user", user);
        return "updateUserResult";
    }

    @PostMapping("users/updateUser")
    public String updateUser(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        if (!email.equals(user.getEmail()))
            userValidator.validate(user, bindingResult);
        if (bindingResult.hasErrors())
            return "/updateUserResult";
        userService.updateUser(user);
        return "redirect:/users";
    }


    @GetMapping("users/delete")
    public String deleteUser() {
        return "deleteUser";
    }

    @PostMapping("users/delete")
    public String deleteUser(@RequestParam("id") Long id) {
        if (userService.deleteUser(id))
            return "redirect:/users";
        return "errorGetOrUpdateOrDelete";

    }


    @GetMapping("/usersSort")
    public String getUsersSort() {
        return "usersSortBy";
    }

    @GetMapping("/usersSortBySurname")
    public String getUsersSortBySurname(Model model) {
        model.addAttribute("users", userService.getAllSortTheUsers(1));
        return "users";
    }

    @GetMapping("/usersSortByName")
    public String getUsersSortByName(Model model) {
        model.addAttribute("users", userService.getAllSortTheUsers(2));
        return "users";
    }

    @GetMapping("/usersSortByEmail")
    public String getUsersSortByEmail(Model model) {
        model.addAttribute("users", userService.getAllSortTheUsers(3));
        return "users";
    }

    @GetMapping("/usersSortByCity")
    public String getUsersSortByCity(Model model) {
        model.addAttribute("users", userService.getAllSortTheUsers(4));
        return "users";
    }
}
