package edu.test.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.test.config.SpringJpaConfig;
import edu.test.daos.ICustomerDao;
import edu.test.entities.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringJpaConfig.class})
public class SpringJpaTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	ICustomerDao custDao;
	
	@Test
	public void testInsertJpa() {
		Customer c = new Customer();
		c.setCname("testUser");
		c.setAddress("hyd");
		c.setPhone(9962280029L);
		custDao.create(c);
	}
	
	@Test
	public void testReadJpa() {
		Customer c = custDao.read(1);
		System.out.println(c.getCno() + "  " + c.getCname() +" " + c.getAddress() +"  " + c.getPhone());
	}
	
	@Test
	public void testUpdateJpa(){
		Customer c = custDao.read(1);
		c.setPhone(9962280029L);
		custDao.update(c);
	}
	
	@Test
	public void testDeleteJpa(){
		Customer c = custDao.read(1);
		custDao.delete(c);
	}

	@Test
	public void testFindAllJpa(){
		List<Customer> custs = custDao.findAll();
		System.out.println("***FindAll***:" + custs.size());
	}
	
	@Test
	public void testFindByNameJpa(){
		List<Customer> custs = custDao.findByName("testUser");
		System.out.println("***FindByName***:" + custs.size());
	}
}
