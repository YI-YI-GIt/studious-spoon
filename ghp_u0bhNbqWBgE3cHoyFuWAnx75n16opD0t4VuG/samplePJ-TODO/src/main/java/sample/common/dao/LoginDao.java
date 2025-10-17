package sample.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample.common.dao.entity.Login;
import sample.common.dao.mapper.LoginMapper;

@Repository
public class LoginDao {

@Autowired
private LoginMapper loginMapper;


// ユーザー登録
public void insert(Login login) {
	loginMapper.insert(login);
}

// ユーザ名＋パスワードで検索
public Login findByUsernameAndPassword(String username, String password) {
	return loginMapper.selectByUsernameAndPassword(username, password);
}
}
