package com.rk.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rk.address.Address;
import com.rk.emp.Employee;
import com.rk.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Address ad1 = new Address();
		ad1.setAddrId(101);
		ad1.setLoc("Mysore");
		ad1.setPin("12345");

		Address ad2 = new Address();
		ad2.setAddrId(102);
		ad2.setLoc("Hyd");
		ad2.setPin("1552");

		Address ad3 = new Address();
		ad3.setAddrId(103);
		ad3.setLoc("Chenni");
		ad3.setPin("6558");

		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Thirumal");
		emp1.setEmpSal(35000.0);
		emp1.setEmpAddr(ad2);

		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("Renu");
		emp2.setEmpSal(35000.0);
		emp2.setEmpAddr(ad3);

		Employee emp3 = new Employee();
		emp3.setEmpId(3);
		emp3.setEmpName("Ravi");
		emp3.setEmpSal(35000.0);
		emp3.setEmpAddr(ad1);
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			tx = ses.beginTransaction();
			ses.save(ad1);
			ses.save(ad2);
			ses.save(ad3);
			ses.save(emp1);
			ses.save(emp2);
			ses.save(emp3);
			tx.commit();
			System.out.println("Object save");
		}
	}

}
