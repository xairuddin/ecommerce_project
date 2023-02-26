package kz.xairuddin.ecommerce.repo;

import kz.xairuddin.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}

//
//    drop  table product_category;
//        drop  table product;
//        -- -----------------------------------------------------
//        -- Table `full-stack-ecommerce`.`product_category`
//        -- -----------------------------------------------------
//        CREATE TABLE IF NOT EXISTS product_category
//        (
//        id            BIGINT       NOT NULL primary key generated by default as identity,
//        category_name VARCHAR(255) NULL DEFAULT NULL
//        );
//
//        -- -----------------------------------------------------
//        -- Table `full-stack-ecommerce`.`product`
//        -- -----------------------------------------------------
//        CREATE TABLE IF NOT EXISTS product
//        (
//        id             BIGINT NOT NULL primary key generated by default as identity,
//        sku            VARCHAR(255)   DEFAULT NULL,
//        name           VARCHAR(255)   DEFAULT NULL,
//        description    VARCHAR(255)   DEFAULT NULL,
//        unit_price     DECIMAL(13, 2) DEFAULT NULL,
//        image_url      VARCHAR(255)   DEFAULT NULL,
//        active         bool        default true,
//        units_in_stock int            DEFAULT NULL,
//        date_created   timestamp      DEFAULT NULL,
//        last_updated   timestamp      DEFAULT NULL,
//        category_id    BIGINT NOT NULL references product_category (id)
//        );
//
//        -- -----------------------------------------------------
//        -- Add sample data
//        -- -----------------------------------------------------
//
//        INSERT INTO product_category(category_name) VALUES ('BOOKS');
//
//        INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
//        unit_price, category_id, date_created)
//        VALUES ('BOOK-TECH-1000', 'JavaScript - The Fun Parts', 'Learn JavaScript',
//        'assets/images/products/placeholder.png'
//        ,true,100,19.99,1, NOW());
//
//        INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
//        unit_price, category_id, date_created)
//        VALUES ('BOOK-TECH-1001', 'Spring Framework Tutorial', 'Learn Spring',
//        'assets/images/products/placeholder.png'
//        ,true,100,29.99,1, NOW());
//
//        INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
//        unit_price, category_id, date_created)
//        VALUES ('BOOK-TECH-1002', 'Kubernetes - Deploying Containers', 'Learn Kubernetes',
//        'assets/images/products/placeholder.png'
//        ,true,100,24.99,1, NOW());
//
//        INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
//        unit_price, category_id, date_created)
//        VALUES ('BOOK-TECH-1003', 'Internet of Things (IoT) - Getting Started', 'Learn IoT',
//        'assets/images/products/placeholder.png'
//        ,true,100,29.99,1, NOW());
//
//        INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
//        unit_price, category_id, date_created)
//        VALUES ('BOOK-TECH-1004', 'The Go Programming Language: A to Z', 'Learn Go',
//        'assets/images/products/placeholder.png'
//        ,true,100,24.99,1, NOW());