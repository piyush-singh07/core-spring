package com.dip.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dip.components.TicketDao;
import com.dip.config.JdbcConfig;
import com.dip.pojo.Ticket;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JdbcConfig.class);
		context.refresh();
		TicketDao dao = context.getBean("ticketDao", TicketDao.class);
		dao.addTicket(new Ticket(9,"2020-05-17 19:38:47.192000", "apon", "hello@g.com", "Pushpak", "popoo"));
	}

}
