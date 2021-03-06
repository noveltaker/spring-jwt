package com.example.jwt.repository;

import com.example.jwt.domain.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

  @EntityGraph(attributePaths = {"user"})
  List<Order> findByUser_IdOrderByOrderDateDesc(Long userId);
}
