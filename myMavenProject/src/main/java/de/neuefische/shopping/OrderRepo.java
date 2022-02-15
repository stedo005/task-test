package de.neuefische.shopping;

import java.util.*;

public class OrderRepo {

    private final Map<String, Order> orders = new HashMap<>();

    public Collection<Order> list() {
        return Collections.unmodifiableCollection(orders.values());
    }

    public Optional<Order> get(String id) {
        return Optional.ofNullable(orders.get(id));
    }

    public void add(Order order) {
        orders.put(order.id(), order);
    }
}
