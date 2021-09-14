package com.ctrend.assignment.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name="ui_define_administrative_area_on_map")
public class Ui_define_administrative_area_on_map implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    private int id ;
    @Column
    private  int seq;
    @Column
    private String  region_type;
    @Column
    private String  region_level;
    @Column
    private String  btn_select_route;
    @Column
    private String  country_name ;
    @Column
    private  String  search_text;
    @Column
    private String  submit_button ;
    @Column
    private String  test_type;
    @Column
    private String  expected_output;
    @Column
    private String  actual_output;
    @Column
    private  String  test_result;

    @ManyToOne
    @JoinColumn(name = "ui_table_id")
    private UiTable uiTable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getRegion_type() {
        return region_type;
    }

    public void setRegion_type(String region_type) {
        this.region_type = region_type;
    }

    public String getRegion_level() {
        return region_level;
    }

    public void setRegion_level(String region_level) {
        this.region_level = region_level;
    }

    public String getBtn_select_route() {
        return btn_select_route;
    }

    public void setBtn_select_route(String btn_select_route) {
        this.btn_select_route = btn_select_route;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getSearch_text() {
        return search_text;
    }

    public void setSearch_text(String search_text) {
        this.search_text = search_text;
    }

    public String getSubmit_button() {
        return submit_button;
    }

    public void setSubmit_button(String submit_button) {
        this.submit_button = submit_button;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
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

    public UiTable getUiTable() {
        return uiTable;
    }

    public void setUiTable(UiTable uiTable) {
        this.uiTable = uiTable;
    }
}
