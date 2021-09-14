package com.ctrend.assignment.model;


import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class UiResultTable implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private Long id;
    @Column
    private String Code;
    @Column
    private String Status;
    @Column
    private String test_type;
    @Column
    private String planned_input;
    @Column
    private String expected_output;
    @Column
    private String actual_output;
    @Column
    private String test_result;
    @Column
    private String Massage;
    @Column
    private LocalDateTime createdTime;
    @ManyToOne
    @JoinColumn(name = "ui_table_id")
    private UiTable uiTable;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public String getPlanned_input() {
        return planned_input;
    }

    public void setPlanned_input(String planned_input) {
        this.planned_input = planned_input;
    }

    public String getExpected_output() {
        return expected_output;
    }

    public void setExpected_output(String expected_output) {
        this.expected_output = expected_output;
    }

    public String getActual_output() {
        return actual_output;
    }

    public void setActual_output(String actual_output) {
        this.actual_output = actual_output;
    }

    public String getTest_result() {
        return test_result;
    }

    public void setTest_result(String test_result) {
        this.test_result = test_result;
    }

    public String getMassage() {
        return Massage;
    }

    public void setMassage(String massage) {
        Massage = massage;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public UiTable getUiTable() {
        return uiTable;
    }

    public void setUiTable(UiTable uiTable) {
        this.uiTable = uiTable;
    }
}
