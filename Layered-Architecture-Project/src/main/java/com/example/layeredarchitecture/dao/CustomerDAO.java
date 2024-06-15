package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {


         ArrayList<CustomerDTO> loadAllCustomer() throws SQLException, ClassNotFoundException;

         void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

         void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

         boolean exitCustomer(String id) throws SQLException, ClassNotFoundException ;


         void deleteCustomer(String id) throws SQLException, ClassNotFoundException;


         ResultSet generateNewId() throws SQLException, ClassNotFoundException;

         CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;


}
