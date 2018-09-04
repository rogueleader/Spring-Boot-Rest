package org.cap.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("orderDbDao")
@Transaction
public interface IOrderDbDao extends JpaRepository<Order, Integer> {

}
