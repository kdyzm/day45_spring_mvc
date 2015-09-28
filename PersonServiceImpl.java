package com.kdyzm.spring.mvc;

public class PersonServiceImpl implements PersonService {
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson() {
		personDao.savePerson();
	}

}
