package com.yuehao.ecommerce.dto;

import com.yuehao.ecommerce.entity.Address;
import com.yuehao.ecommerce.entity.Customer;
import com.yuehao.ecommerce.entity.Order;
import com.yuehao.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
