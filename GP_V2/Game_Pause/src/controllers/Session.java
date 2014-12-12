package controllers;

import containers.*;
import db_system.*;

public interface Session {
	
	public boolean login();
	
	public boolean logout();
	
	public boolean order();
	
	public boolean checkout();
	
	public boolean comment();
	
	public boolean deleteComment();
	
	public boolean createAccount();
	
	public boolean updateAccount();

}
