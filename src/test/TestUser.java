package test;

import java.util.List;

import manager.UserManager;
import model.User;

import org.junit.Test;

public class TestUser {
	
	
	@Test
	public void testQueryAllUser(){
		List<User> list=UserManager.GetStudents();
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
