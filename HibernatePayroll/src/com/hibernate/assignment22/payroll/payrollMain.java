package com.hibernate.assignment22.payroll;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class payrollMain {

	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();


		/////////////
		// Employee //
		/////////////
		Employee e= new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4= new Employee();
		Employee e5= new Employee();

		e.setEmpname("Rahib Amin");
		e.setEmpemail("rahib@email.com");
		e.setEmpphone("6786781144");
		e.setEmpsalaryrefe(1);
		e.setEmpAccount("Checking");
		e.setEmpoverpay(1500);
		e.setEmpstatus("Active");

		e2.setEmpname("Alex Perez");
		e2.setEmpemail("alex@email.com");
		e2.setEmpphone("6786781155");
		e2.setEmpsalaryrefe(2);
		e2.setEmpAccount("Savings");
		e2.setEmpoverpay(0);
		e2.setEmpstatus("Active");

		e3.setEmpname("Tom Holland");
		e3.setEmpemail("tom@email.com");
		e3.setEmpphone("6786784444");
		e3.setEmpsalaryrefe(3);
		e3.setEmpAccount("Checking");
		e3.setEmpoverpay(100);
		e3.setEmpstatus("Active");

		e4.setEmpname("Marry Jane");
		e4.setEmpemail("marry@email.com");
		e4.setEmpphone("6786787755");
		e4.setEmpsalaryrefe(4);
		e4.setEmpAccount("Savings");
		e4.setEmpoverpay(500);
		e4.setEmpstatus("Active");

		e5.setEmpname("Jackie James");
		e5.setEmpemail("jackie@email.com");
		e5.setEmpphone("6786786666");
		e5.setEmpsalaryrefe(5);
		e5.setEmpAccount("Checking");
		e5.setEmpoverpay(1000);
		e5.setEmpstatus("Active");

		/////////////
		// ACCOUNT //
		/////////////

		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		Account a5 = new Account();

		a1.setAccounttype("Checking");
		a1.setAccountbankname("Bank of America");
		a1.setAccountbanknumber("9995555");
		a1.setAccountroutingnumber("BOA001");


		a2.setAccounttype("Savings");
		a2.setAccountbankname("Chase Bank");
		a2.setAccountbanknumber("8887777");
		a2.setAccountroutingnumber("C0877");

		a3.setAccounttype("Checking");
		a3.setAccountbankname("BB&T");
		a3.setAccountbanknumber("2221111");
		a3.setAccountroutingnumber("BBT871");

		a4.setAccounttype("Saving");
		a4.setAccountbankname("Wells Fargo");
		a4.setAccountbanknumber("3331245");
		a4.setAccountroutingnumber("WF076");

		a5.setAccounttype("Checking");
		a5.setAccountbankname("Bank of America");
		a5.setAccountbanknumber("4751649");
		a5.setAccountroutingnumber("BOA812");


		/////////////
		// Salary //
		/////////////

		Salary s1 = new Salary();
		Salary s2 = new Salary();
		Salary s3= new Salary();
		Salary s4= new Salary();
		Salary s5= new Salary();

		s1.SalaryCal(50000.0);
		s1.setEmpid(1);

		s2.SalaryCal(45000.0);
		s2.setEmpid(2);

		s3.SalaryCal(40000.0);
		s3.setEmpid(3);

		s4.SalaryCal(35000.0);
		s4.setEmpid(4);

		s5.SalaryCal(50000.0);
		s5.setEmpid(5);


		/////////////
		// Payroll //
		/////////////

		Payroll p1 = new Payroll();
		Payroll p2 = new Payroll();
		Payroll p3 = new Payroll();
		Payroll p4 = new Payroll();
		Payroll p5 = new Payroll();
		
		p1.setPayrolldate("112019");
		p1.setPayrolltotalsalary("59250");
		p1.setPayrollsatus("Paid");
		p1.setEmpid(1);
		
		p2.setPayrolldate("122019");
		p2.setPayrolltotalsalary("66825");
		p2.setPayrollsatus("Paid");
		p2.setEmpid(2);
		
		p3.setPayrolldate("122019");
		p3.setPayrolltotalsalary("59500");
		p3.setPayrollsatus("Paid");
		p3.setEmpid(3);
		
		p4.setPayrolldate("122019");
		p4.setPayrolltotalsalary("52475");
		p4.setPayrollsatus("Paid");
		p4.setEmpid(4);
		
		p5.setPayrolldate("122019");
		p5.setPayrolltotalsalary("75250");
		p5.setPayrollsatus("Paid");
		p5.setEmpid(5);
		

		Session session = factory.openSession();


		//		System.out.println("Employee id inserted is:" +addEmployee(session, e));
		//		System.out.println("Employee id inserted is:" +addEmployee(session, e2));
		//		System.out.println("Employee id inserted is:" +addEmployee(session, e3));
		//		System.out.println("Employee id inserted is:" +addEmployee(session, e4));
		//		System.out.println("Employee id inserted is:" +addEmployee(session, e5));
		//		System.out.println("Employee id inserted is:" +addAccount(session, a1));
		//		System.out.println("Employee id inserted is:" +addAccount(session, a2));
		//		System.out.println("Employee id inserted is:" +addAccount(session, a3));
		//		System.out.println("Employee id inserted is:" +addAccount(session, a4));
		//		System.out.println("Employee id inserted is:" +addAccount(session, a5));
		
//		System.out.println("Company gave a raise of 10%");
//				System.out.println("Employee id inserted is:" +addSalary(session, s1));
//				System.out.println("Employee id inserted is:" +addSalary(session, s2));
//				System.out.println("Employee id inserted is:" +addSalary(session, s3));
//				System.out.println("Employee id inserted is:" +addSalary(session, s4));
//				System.out.println("Employee id inserted is:" +addSalary(session, s5));
//		System.out.println("Employee 1 left the company on 10/21/2019, salary only calulated for 21 days");
//		System.out.println("Employee id inserted is:" +addPayroll(session, p1));
		System.out.println("Payroll for 122019");
		System.out.println("Employee id inserted is:" +addPayroll(session, p2));
		System.out.println("Employee id inserted is:" +addPayroll(session, p3));
		System.out.println("Employee id inserted is:" +addPayroll(session, p4));
		System.out.println("Employee id inserted is:" +addPayroll(session, p5));
		
//		System.out.println("Employee 1 left the company: ");
//		updateEmployee(session, "Inactive", 1);

//		System.out.println("Employee 4 and 6 updated there account from Savings to Checking");
//		updateAccount(session, "Checking", 4);
//		updateAccount(session, "Checking", 6);
		session.close();

	}


	public static Integer addEmployee(Session session, Employee e) {
		return (Integer)session.save(e);
	}

	public static Integer addAccount(Session session, Account a) {
		return (Integer)session.save(a);
	}

	public static Integer addSalary(Session session, Salary s) {
		return (Integer)session.save(s);
	}
	public static Integer addPayroll(Session session, Payroll p) {
		return (Integer)session.save(p);
	}


	public static Employee fetchEmployee(Session session, int id) {

		//		List empList = session.createQuery(arg0).list();
		//		
		//		for (Object object : empList) {
		//			System.out.println((Employee)object);
		//		}
		return session.get(Employee.class, id);

	}

	private static void updateEmployee(Session session, String status, Integer id) {
		Transaction rx = session.beginTransaction();
		Employee emp = (Employee)session.get(Employee.class, id);
		emp.setEmpstatus(status);;

		try {
			session.update(emp);
			session.flush();
			rx.commit();
			session.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		private static void updateAccount(Session session, String account, Integer id) {
			Transaction rx = session.beginTransaction();
			Account acc =(Account)session.get(Account.class, id);
			acc.setAccounttype(account);

			try {
				session.update(acc);
				session.flush();
				rx.commit();
				session.clear();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

	private static void deleteEmployee(Session session, Integer id) {

		Transaction rx = session.beginTransaction();
		Employee emp = (Employee)session.get(Employee.class, id);
		System.out.println("Deleted: " +emp);

		try {
			session.delete(emp);
			rx.commit();
			session.clear();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	private static void readData() {
		Session session = factory.openSession();
		Transaction rx = null;
		session.close();

	}

}
