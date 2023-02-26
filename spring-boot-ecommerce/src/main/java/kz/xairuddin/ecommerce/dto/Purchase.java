package kz.xairuddin.ecommerce.dto;

import kz.xairuddin.ecommerce.entity.Address;
import kz.xairuddin.ecommerce.entity.Customer;
import kz.xairuddin.ecommerce.entity.Order;
import kz.xairuddin.ecommerce.entity.OrderItem;
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
