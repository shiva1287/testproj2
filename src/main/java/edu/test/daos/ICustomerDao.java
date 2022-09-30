package edu.test.daos;

import java.util.List;

import edu.test.entities.Customer;

public interface ICustomerDao {
	public void create(Customer c);
	public Customer read(int cno);
	public void update(Customer c);
	public void delete(Customer c);
	
	//finder methods
	public List<Customer> findAll();
	public List<Customer> findByName(String cname);
}
