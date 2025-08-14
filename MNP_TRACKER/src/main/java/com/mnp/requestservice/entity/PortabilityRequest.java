package com.mnp.requestservice.entity;

public class PortabilityRequest {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriber_id")
    private Long subscriberId;

    @Column(name = "msisdn", unique = true)
    private String msisdn;
    @Column(name = "imsi")
    private String imsi;

    @Column(name = "name")
    private String name;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "id_number")
    private String idNumber;

    // store provider id (FK to network_provider)
    @ManyToOne
    @JoinColumn(name = "current_provider")
   // private NetworkProvider currentProvider;

    @Column(name = "service_type")
    private String serviceType;
}
