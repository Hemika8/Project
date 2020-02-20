package com.cts.ProjectApplication.BuyerDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ProjectApplication.Buyer.Buyer;

@Repository
public interface IBuyerDao extends JpaRepository<Buyer,Integer>  {

}
