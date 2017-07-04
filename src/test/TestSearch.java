package test;

import java.util.List;

import manager.UserManager;
import model.User;

import org.junit.Test;

public class TestSearch {
	
	@Test
	public void testQueryAllUser(){
		String testpeople="丁";
		List<User> list=UserManager.SearchStudents(testpeople);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
