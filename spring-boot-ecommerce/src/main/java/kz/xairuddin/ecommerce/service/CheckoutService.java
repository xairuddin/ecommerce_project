package kz.xairuddin.ecommerce.service;

import kz.xairuddin.ecommerce.dto.Purchase;
import kz.xairuddin.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
