package org.example.OutraParte.src.DataBase;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
  public Connection recoveringConnection(){
      try {
        //  return DriverManager.getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=Rafael234");
          return this.dataSource().getConnection();
      }catch (SQLException ex){
          throw new RuntimeException(ex);
      }

  }

  private HikariDataSource dataSource(){
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl("jdbc:mysql://localhost:3306/comex");
      config.setUsername("root");
      config.setPassword("Rafael234");
      config.setMaximumPoolSize(10);
      return new HikariDataSource(config);
  }


}
