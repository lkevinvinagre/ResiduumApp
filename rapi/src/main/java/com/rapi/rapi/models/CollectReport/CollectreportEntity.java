package com.rapi.rapi.models.CollectReport;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rapi.rapi.models.CollectRequest.CollectrequestEntity;
import com.rapi.rapi.models.Colletedwaste.ColletedwasteEntity;
import com.rapi.rapi.models.Cooperative.CooperativeEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "collectreport")
public class CollectreportEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collectreport_id")
    private long id;

    @Column(name = "collectreport_status", length = 30)
    private String status;

    @Column(name = "collectreport_executiondate")
    private Date executiondate;

    @OneToOne
    @JoinColumn(name = "collectreport_request")
    private CollectrequestEntity request;

    @OneToOne
    @JoinColumn(name = "collectreport_destiny")
    private CooperativeEntity destiny;

    @OneToMany
    private List<ColletedwasteEntity> wastes;

}
