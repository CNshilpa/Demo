package com.bridgelab.fundoonote.user.service;

import java.util.List;

import com.bridgelab.fundoonote.user.dto.LoginDto;
import com.bridgelab.fundoonote.user.dto.RegisterDto;
import com.bridgelab.fundoonote.user.dto.UserDto;
import com.bridgelab.fundoonote.user.exception.UserException;
import com.bridgelab.fundoonote.user.model.User;
import com.bridgelab.fundoonote.user.utility.UserResponse;

public interface IUserService {
	
	UserResponse registration(RegisterDto registerDto) throws UserException;
	
	UserResponse login(LoginDto loginDto) throws UserException;

	UserResponse updateUser(int id, RegisterDto registerDto);

	UserResponse deleteUser(int id) throws UserException;

	UserResponse getById(int id) throws UserException;

	UserResponse userVerification(String token);

	List<UserDto> findAll();

	User forgotPassword(String email, String password) throws UserException;

}