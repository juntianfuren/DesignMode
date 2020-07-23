

package com.jtfr.piece18;

public class UserServiceImpl implements UserService, RestrictedUserService{

    @Override
    public boolean register(String cellphone, String password) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean login(String cellphone, String password) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserInfo getUserInfoByCellphone(String cellphone) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteUserByCellphone(String cellphone) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteUserById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

}
