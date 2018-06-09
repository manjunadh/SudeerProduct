package com.ibm.order.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLocationRepository extends CrudRepository<ProductLocation, Integer>{

    List<ProductLocation> findByStoreNo(Integer storeNO);
    List<ProductLocation> findByLocationId(Integer locationId);
    List<ProductLocation> findByStoreNoAndLocationId(Integer storeNo,Integer locationId);
}
