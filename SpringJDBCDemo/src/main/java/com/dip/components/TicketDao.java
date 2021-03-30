package com.dip.components;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.dip.pojo.Ticket;

@Component("ticketDao")
public class TicketDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Ticket> getTickets() {
		String SQL = "SELECT * FROM ticket_table";
		List<Ticket> list = new ArrayList<Ticket>();
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SQL);
		for (Map<String, Object> rs : result) {
			Ticket tck = new Ticket();
			tck.setId((Integer) rs.get("ticket_id"));
			tck.setDoj((String) rs.get("journey_date"));
			tck.setPassenger_name((String) rs.get("passenger_name"));
			tck.setEmail_id((String) rs.get("email_id"));
			tck.setSource_station((String) rs.get("source_station"));
			tck.setDestination_station((String) rs.get("destination_station"));
			list.add(tck);
		}
		return list;
	}

	public Ticket getTicketById(Integer id) {
		String SQL = "SELECT * FROM ticket_table WHERE ticket_id=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] { id }, new int[] { Types.INTEGER },
				new RowMapper<Ticket>() {

					@Override
					public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
						Ticket ticket = new Ticket();
						ticket.setId(rs.getInt("ticket_id"));
						ticket.setDoj(rs.getString("journey_date"));
						ticket.setEmail_id(rs.getString("email_id"));
						ticket.setPassenger_name(rs.getString("passenger_name"));
						ticket.setDestination_station(rs.getString("destination_station"));
						ticket.setSource_station(rs.getString("source_station"));
						return ticket;
					}
				});
	}

	public void addTicket(Ticket ticket) {
		String SQL = "INSERT INTO ticket_table VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(SQL,
				new Object[] { ticket.getId(), ticket.getDoj(), ticket.getDestination_station(), ticket.getEmail_id(),
						ticket.getPassenger_name(), ticket.getSource_station() },
				new int[] { Types.INTEGER, Types.DATE, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR });

	}

//	  public Ticket UpdateTicket(Ticket ticket) {
//	  
//	  }
//	  
//	  public Ticket deleteTicket(Integer id) {
//	  
//	  }

	public String getMySqlDateStr(Date date) {
		String strDate;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strDate = sdf.format(date);
		return strDate;
	}

}
