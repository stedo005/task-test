package de.neuefische.shopping;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopServiceTest {

    @Test
    void integrationTest() {
        var shopService = new ShopService(new ProductRepo(), new OrderRepo());

        var products = new ArrayList<>(shopService.listProducts());
        assertEquals(5, products.size());
        assertTrue(shopService.getProduct("4712").isPresent());
        assertFalse(shopService.getProduct("1234").isPresent());

        shopService.addOrder(new Order("0001", Arrays.asList(products.get(0), products.get(3))));

        var allOrders = new ArrayList<>(shopService.listOrders());
        assertEquals(1, allOrders.size());

        var order = shopService.getOrder("0001");
        assertTrue(order.isPresent());
        assertEquals(allOrders.get(0), order.get());
        assertTrue(order.get().products().containsAll(List.of(products.get(0), products.get(3))));
    }

}