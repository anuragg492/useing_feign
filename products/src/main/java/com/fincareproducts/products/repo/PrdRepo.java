package com.fincareproducts.products.repo;


import com.fincareproducts.products.entity.PrdEntiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrdRepo extends JpaRepository<PrdEntiry,Integer> {
}
