package com.yuehao.ecommerce.service;

import com.yuehao.ecommerce.dto.Purchase;
import com.yuehao.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
