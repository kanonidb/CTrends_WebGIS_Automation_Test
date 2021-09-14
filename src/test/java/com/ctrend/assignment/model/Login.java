package com.ctrend.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Login implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    int id ;
}
