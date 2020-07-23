

package com.jtfr.piece18;
//Restricted保密、受限
public interface RestrictedUserService {
    boolean deleteUserByCellphone(String cellphone);
    boolean deleteUserById(long id);
}
