package poli.edu.co.shop.percistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
@Getter
@Setter
@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="delivery_id")
    private Long DeliveryID;
    private int date;
    @Enumerated
    private Type type;
    @Enumerated
    private Company company;


    @JsonManagedReference
    @OneToMany (mappedBy = "delivery", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Order> order;





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(DeliveryID, delivery.DeliveryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DeliveryID);
    }
}
