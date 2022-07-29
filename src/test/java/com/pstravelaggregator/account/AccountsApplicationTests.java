package com.pstravelaggregator.account;

import com.pstravelaggregator.account.controller.LoginController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AccountsApplicationTests {

	@Autowired
	LoginController loginController;

	@Test
	void contextLoads() {
		Assert.assertNotNull(loginController);

	}

}
