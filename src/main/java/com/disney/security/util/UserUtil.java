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

    public static void validatePageNumber(Integer pageNumber){

        if(pageNumber == null){
            throw new BadRequestException("The page number cannot be null");
        }

        if(pageNumber < 0){
            throw new BadRequestException("The page number cannot be minor than 0");
        }

    }

    public static void validateTotalPages(Integer totalPages, Integer pageNumber){

        if(totalPages < pageNumber){
            throw new BadRequestException("The page number is greater than the total number of pages");
        }

    }

}
