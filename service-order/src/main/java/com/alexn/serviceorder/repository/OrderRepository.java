package com.alexn.serviceorder.repository;

import com.alexn.serviceorder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long>{
}
