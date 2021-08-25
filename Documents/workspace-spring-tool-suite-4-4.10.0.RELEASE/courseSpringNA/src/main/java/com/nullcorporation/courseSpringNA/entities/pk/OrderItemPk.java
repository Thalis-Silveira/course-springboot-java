package com.nullcorporation.courseSpringNA.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.nullcorporation.courseSpringNA.entities.Order;
import com.nullcorporation.courseSpringNA.entities.Product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@EqualsAndHashCode
@Embeddable
public class OrderItemPk implements Serializable{
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
}
