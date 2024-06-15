package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OderDAO {
      String generateNewOrderID() throws SQLException, ClassNotFoundException;

      boolean exitOrder(String orderId) throws SQLException, ClassNotFoundException;

      boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException;

}
