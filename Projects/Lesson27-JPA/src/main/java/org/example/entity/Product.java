package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NamedQuery(name = "Product.findByName", query = "select p from Product p where name=:name")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    Long id;

    @Column(name = "product_name", nullable = false, unique = true)
    String name;

    @Column(name = "product_price", nullable = false)
    BigDecimal price;

    String description;

    @Builder.Default
    LocalDateTime createdDate = LocalDateTime.now();

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "type", column = @Column(name = "product_type", unique = true)),
            @AttributeOverride(name = "size", column = @Column(name = "product_size", length = 25))
    })
    ProductDetails productDetails;

    @ElementCollection
    List<Branch> branches;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", productDetails=" + productDetails +
                ", branches=" + branches +
                '}';
    }
}
