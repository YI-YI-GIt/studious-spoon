package sample.common.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.common.dao.LoginDao;
import sample.common.dao.entity.Login;
import sample.common.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginDao loginDao;

    @Override
    public void register(String username, String password) {
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        login.setCreatedAt(LocalDateTime.now());
        login.setUpdatedAt(LocalDateTime.now());
        loginDao.insert(login);
    }

    @Override
    public Login login(String username, String password) {
        return loginDao.findByUsernameAndPassword(username, password);
    }
}
