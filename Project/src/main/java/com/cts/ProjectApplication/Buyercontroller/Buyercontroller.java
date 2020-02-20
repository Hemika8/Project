package com.cts.ProjectApplication.Buyercontroller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.ProjectApplication.Buyer.Buyer;
import com.cts.ProjectApplication.BuyerService.BuyerService;
//import com.cts.ProjectApplication.Buyerservice.BuyerService;
//import com.cts.ProjectApplication.Buyer.Buyer;
//import com.cts.ProjectApplication.BuyerInterfaceservice.IBuyerService;


@RestController
public class Buyercontroller {

	@Autowired
	private BuyerService service;
	@RequestMapping(value = "/buyer", method = RequestMethod.POST, produces = "application/json")
	public Integer createOrUpdate (@RequestBody Buyer buyer) {
		
		return service.createOrUpdate(buyer);
	}
	@RequestMapping(value = "deleteById/{bid}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("bid") Integer buyerId) {
		
		service.deleteById(buyerId);
	}
	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public Buyer updatePerson(@RequestBody Buyer buyer) {
		
		return service.update(buyer);
	}
}
