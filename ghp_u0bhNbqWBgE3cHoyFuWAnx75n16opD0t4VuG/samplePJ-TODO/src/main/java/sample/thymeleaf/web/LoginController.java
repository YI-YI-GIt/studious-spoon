package sample.thymeleaf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import sample.common.dao.entity.Login;
import sample.common.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    // ユーザ登録画面表示
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    // ユーザ登録処理
    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password) {
        loginService.register(username, password);
        return "redirect:/login";
    }

    // ログイン画面表示
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // ログイン処理
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session) {
        Login login = loginService.login(username, password);
        session.setAttribute("login", login);
        session.setMaxInactiveInterval(86400); // 1日
        return "redirect:/tasks";
    }

    // ログアウト
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
