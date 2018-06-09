package com.ibm.order.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.order.jpa.ProductLocation;
import com.ibm.order.jpa.ProductLocationRepository;

@RestController
public class SudeerController {

    @Autowired
    ProductLocationRepository productLocationRepository;
    @RequestMapping(value="/order")
    public String getOrders(@PathParam(value="id") Integer id){
	return "Returning order for order id : "+id;
    }
    
    @RequestMapping(value="/productLocation",method=RequestMethod.GET)
   public ProductLocation getProductLocationById(@PathParam(value="id") Integer id){
       Optional<ProductLocation> productLocationOptional=productLocationRepository.findById(id);
       
       if(productLocationOptional.isPresent()){
	   return productLocationOptional.get();
       }
       return null;
       
   }
    
    @RequestMapping(value="/productLocation/storeNo")
    public List<ProductLocation> getProductLocationByStoreNo(@PathParam(value="storeNo") Integer storeNo){
	return productLocationRepository.findByStoreNo(storeNo);
    }
    
    @RequestMapping(value="/productLocation/locationId")
    public List<ProductLocation> getProductLocationByLocationId(@PathParam(value="locationId") Integer locationId){
	return productLocationRepository.findByLocationId(locationId);
    }
    
    @RequestMapping(value="//productLocation/locationId/storeNo")
    public List<ProductLocation> getProductLocationByStoreNoAndLocationId(@PathParam(value="storeNo") Integer storeNo,@PathParam(value="locationId") Integer locationId){
	return productLocationRepository.findByStoreNoAndLocationId(storeNo, locationId);
	
    }
}
