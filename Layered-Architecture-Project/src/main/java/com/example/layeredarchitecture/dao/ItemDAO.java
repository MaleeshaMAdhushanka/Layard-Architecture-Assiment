package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
     ArrayList<ItemDTO> loadAllItem() throws SQLException, ClassNotFoundException;

     void deleteItem(String code) throws SQLException, ClassNotFoundException;

     void saveItem(ItemDTO item) throws SQLException, ClassNotFoundException;
        //Save Item

     boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

     boolean exitItem(String code) throws SQLException, ClassNotFoundException;

      ResultSet generateNewId() throws SQLException, ClassNotFoundException;

      ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;



}
