package net.codejava.ProductManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>, JpaRepository<Product, Long> {

//    search
@Query("SELECT p FROM Product p WHERE p.name LIKE %?1%"
        + " OR p.brand LIKE %?1%"
        + " OR p.madein LIKE %?1%"
        + " OR CONCAT(p.price, '') LIKE %?1%")
public List<Product> search(String keyword);
}
