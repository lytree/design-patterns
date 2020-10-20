package com.design.chain_of_responsibility.middleware;

import com.design.chain_of_responsibility.server.Server;

/**
 * ConcreteHandler。 检查具有给定凭据的用户是否存在。 检查用户登录信息
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
