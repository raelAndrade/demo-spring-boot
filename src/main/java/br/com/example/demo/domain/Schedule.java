package br.com.example.demo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.example.demo.domain.enums.Payment;

@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sch_id")
	private Long id;
	
	@Column(name = "sch_children_id")
	private Children children;
	
	@Column(name = "sch_date")
	private LocalDateTime date;
	
	@Column(name = "sch_hour_initial")
	private LocalDateTime hourInitial;
	
	@Column(name = "sch_hour_finale")
	private LocalDateTime hourFinale;
	
	@Column(name = "sch_payment")
	@Enumerated(EnumType.STRING)
	private Payment payment;
	
	@Column(name = "sch_amount")
	private BigDecimal amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Children getChildren() {
		return children;
	}

	public void setChildren(Children children) {
		this.children = children;
	}

	public LocalDateTime getHourInitial() {
		return hourInitial;
	}

	public void setHourInitial(LocalDateTime hourInitial) {
		this.hourInitial = hourInitial;
	}

	public LocalDateTime getHourFinale() {
		return hourFinale;
	}

	public void setHourFinale(LocalDateTime hourFinale) {
		this.hourFinale = hourFinale;
	}
	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
