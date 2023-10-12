package poli.edu.co.shop.percistence.entity;

import jakarta.persistence.Table;

@Table (name = "type")
public enum Type {

    ORDEN,DELIVERED,DISTRIBUTION
}
