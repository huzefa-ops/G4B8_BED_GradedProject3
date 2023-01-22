package com.tickettrack.start.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ticket_title")
	private String tickettitle;

	@Column(name = "ticket_desc")
	private String ticketdesc;

	@Column(name = "ticket_createdOn")
	private String ticketdate;
	private String ticketcontent;

	public TEntity(Long id, String tickettitle, String ticketdesc, String ticketdate) {
		super();
		this.id = id;
		this.tickettitle = tickettitle;
		this.ticketdesc = ticketdesc;
		this.ticketdate = ticketdate;
		this.ticketcontent=ticketcontent;
	}

	public TEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTickettitle() {
		return tickettitle;
	}

	public void setTickettitle(String tickettitle) {
		this.tickettitle = tickettitle;
	}

	public String getTicketdesc() {
		return ticketdesc;
	}

	public void setTicketdesc(String ticketdesc) {
		this.ticketdesc = ticketdesc;
	}

	public String getTicketdate() {
		return ticketdate;
	}

	public void setTicketdate(String ticketdate) {
		this.ticketdate = ticketdate;
	}

	public String getTicketcontent() {
		return ticketcontent;
	}

	public void setTicketcontent(String ticketcontent) {
		this.ticketcontent = ticketcontent;
	}

	@Override
	public String toString() {
		return "TEntity [id=" + id + ", tickettitle=" + tickettitle + ", ticketdesc=" + ticketdesc + ", ticketdate="
				+ ticketdate + ", ticketcontent=" + ticketcontent + "]";
	}

	
}
