package com.ibm.order.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SudeerController {

    @RequestMapping(value="/order")
    public String getOrders(@PathParam(value="id") Integer id){
	return "Returning order for order id : "+id;
    }
}
