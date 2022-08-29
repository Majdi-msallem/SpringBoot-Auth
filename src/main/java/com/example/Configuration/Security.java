package com.example.Configuration;

public class Security {
	public static final long EXPIRATION_TIME= 432000000 ; //5 days
	public static final String TOKEN_HEADER = "Bearer";
	public static final String JWT_TOKEN_HEADER = "Jwt-Token";
	public static final String TOKEN_CANNOT_BE_VERIFIED ="Token cannot be Verified";
	public static final String GET_ARRAYS_LLC = "Get ARRAYS , LLC";
	public static final String GET_ARRAYS_ADMINISTARTION = "User Managment Portal";
	public static final String AUTHORITIES= "Authorities";
	public static final String FORBIDDEN_MESSAGE ="You need to login to access this page";
	public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
	public static final String OPTION_HTTP_METHOD = "OPTIONS"; 
	public static final String[] PUBLIC_URLS = {"/user/login","/user/register","/user/resetpassword/**"};
	


	

}
