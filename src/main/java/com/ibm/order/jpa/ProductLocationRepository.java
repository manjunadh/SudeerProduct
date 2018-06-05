package com.ibm.order.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLocationRepository extends CrudRepository<ProductLocation, Integer>{

}
