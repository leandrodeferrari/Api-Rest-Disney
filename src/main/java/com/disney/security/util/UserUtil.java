package com.disney.security.util;

import com.disney.exception.BadRequestException;

public class UserUtil {

    public static void validateUserNameAndPassword(String userName, String password){

        if(userName == null && password == null){
            throw new BadRequestException("The username and password cannot be null");
        }

    }

    public static void validateBlankInUserName(String userName){

        if(userName.isBlank()){
            throw new BadRequestException("The username cannot be blank");
        }

    }

    public static void validateBlankInPassword(String password){

        if(password.isBlank()){
            throw new BadRequestException("The password cannot be blank");
        }

    }

}
