package com.dao;

import org.hibernate.cfg.Configuration;

public class CustomerDao {
	public static Configuration getCustomConfig() {
		Configuration conf = new Configuration();
		conf.configure("customer.cfg.xml");
		return conf;
	}


}
