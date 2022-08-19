package com.authorization.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.authorization.model.User;
import com.authorization.repository.UserDao;

@DataJpaTest
class UserDaoTest {

	@MockBean
	private UserDao dao;
	
	@Test
	void testUserDaoFindByName() {
		User user = new User(1,"sindhu", "password");
		when(dao.findByUserName("sindhu")).thenReturn(user);
		assertThat(dao.findByUserName("sindhu").equals(user));
	}

}
