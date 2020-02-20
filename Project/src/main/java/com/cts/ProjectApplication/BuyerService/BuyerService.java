package com.cts.ProjectApplication.BuyerService;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ProjectApplication.Buyer.Buyer;
import com.cts.ProjectApplication.BuyerDao.IBuyerDao;
@Service
public class BuyerService {
	@Autowired
	private IBuyerDao dao;
	
	public Integer createOrUpdate(Buyer buyer) {
		Buyer buyer1 =(Buyer)dao.save(buyer);
		return buyer1.getBuyerId();
	}

	
	public void deleteById(Integer buyerId) {
Optional<Buyer> buyer = dao.findById(buyerId);
		
		if(buyer.isPresent()) {
		dao.deleteById(buyerId);
		}
		
		
	}

	
	public Buyer update(Buyer buyer) {
		Optional<Buyer> per = dao.findById(buyer.getBuyerId());
		Buyer newBuyer = null;
		if(per.isPresent()) {
			 newBuyer = per.get();
			 newBuyer.setUserName(buyer.getUserName());
			 newBuyer.setPassword(buyer.getPassword());
			 newBuyer = dao.save( newBuyer);
		}
		return newBuyer;
	}
}
