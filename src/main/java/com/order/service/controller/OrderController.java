package com.order.service.controller;

import com.ecommerce.app.config.EcomResponse;
import com.ecommerce.app.domain.request.UserRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class OrderController.
 *
 * @author Mohit.Bindal
 */
@RestController
@RequestMapping(path = "/v1/order/")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    /**
     * Add to cart
     *
     * @param request
     * @return the response entity
     * @throws Exception the exception
     */
    @PostMapping("add-cart")
    public ResponseEntity<?> addToCart(@Validated @RequestBody UserRequest request) {
        logger.info("Add product to final checkout from cart");
        EcomResponse<String> response = new EcomResponse<>();
        return ResponseEntity.status(200).body("");
    }
}
