package com.chanchal.futures.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "tbl_client", schema = "static")
@Getter
@Setter
public class ClientBO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String code;
    private String clientType;
    private Boolean isActive;
    private Boolean isBroker;
    private Boolean isClient;
    private Boolean hasAccounts;
    private String country;
    @CreationTimestamp
    private Timestamp dtCreated;
    private Timestamp dtUpdated;
    private String updateComment;
}
