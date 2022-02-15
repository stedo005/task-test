package de.neuefische.shopping;

import java.util.Collection;
import java.util.Optional;

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Optional<Product> getProduct(String id) {
        return productRepo.get(id);
    }

    public Collection<Product> listProducts() {
        return productRepo.list();
    }

    public void addOrder(Order order) {
        orderRepo.add(order);
    }

    public Optional<Order> getOrder(String id) {
        return orderRepo.get(id);
    }

    public Collection<Order> listOrders() {
        return orderRepo.list();
    }
}