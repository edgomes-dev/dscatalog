package eddscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import eddscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
