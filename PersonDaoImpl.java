package com.kdyzm.spring.mvc;

public class PersonDaoImpl implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("PersonDaoImpli save Person!");
	}

}
