package sample.common.service;

import sample.common.dao.entity.Login;

public interface LoginService {
void register(String username, String password);
Login login(String username, String password);
}
