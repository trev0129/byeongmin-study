package com.bitcamp.board.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

// 스프링 IoC 컨테이너의 설정
//1) DB 커넥션 객체 관리자 준비 : DataSource
//2) 트랜잭션 관리자 준비 : TransactionManager
//3) 어떤 패키지에 있는 객체를 자동으로 생성할 것인지 지정한다.
@ComponentScan(value="com.bitcamp.board")
// com.bitcamp.board 패키지 및 그 하위 패키지에 소속된 클래스 중에서
// @Component, @Contoller, @Service, @Repository 등의 애노테이션이 붙은 클래스를 찾아
// 객체를 생성한다.
public class AppConfig {

  public AppConfig() {
    System.out.println("AppConfig() 생성자 호출됨!");
  }

  //
  @Bean("DataSource")
  public DataSource createDataSource() {
    System.out.println("createDataSource() 호출됨!");

    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("org.mariadb.jdbc.Driver");
    ds.setUrl("jdbc:mariadb://localhost:3306/studydb");
    ds.setUsername("study");
    ds.setPassword("1111");
    return ds;
  }

  @Bean("transactionManager")
  public PlatformTransactionManager createTransactionManager(DataSource ds) {
    // Spring IoC 컨테이너는 이 메서드를 호출하기 전에 
    // 먼저 이 메서드가 원하는 파라미터값인 DataSource를 먼저 생성한다.
    // => createDataSource() 메서드를 먼저 호출한다.
    System.out.println("createTransactionManager() 호출됨!");

    return new DataSourceTransactionManager(ds);
  }

}
