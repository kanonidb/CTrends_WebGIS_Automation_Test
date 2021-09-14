package com.ctrend.assignment.model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name="ui_table")
public class UiTable implements java.io.Serializable{

    public UiTable() {
    }

    public UiTable(int id, String ui_code, String ui_name, UiGroup uiGroup, List<Ui_define_administrative_area_on_map> ui_define_administrative_area_on_maps, List<UiResultTable> uiResultTableList) {
        this.id = id;
        this.ui_code = ui_code;
        this.ui_name = ui_name;
        this.uiGroup = uiGroup;
        this.ui_define_administrative_area_on_maps = ui_define_administrative_area_on_maps;
        this.uiResultTableList = uiResultTableList;
    }
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    private int id ;

    @Column
    private String ui_code;
    @Column
    private String  ui_name;

    @ManyToOne
    @JoinColumn(name = "ui_group_id")
    private UiGroup uiGroup;

    @OneToMany(mappedBy = "uiTable")
    private List<Ui_define_administrative_area_on_map> ui_define_administrative_area_on_maps;

    @OneToMany(mappedBy = "uiTable")
    private List<UiResultTable> uiResultTableList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUi_code() {
        return ui_code;
    }

    public void setUi_code(String ui_code) {
        this.ui_code = ui_code;
    }

    public String getUi_name() {
        return ui_name;
    }

    public void setUi_name(String ui_name) {
        this.ui_name = ui_name;
    }

    public UiGroup getUiGroup() {
        return uiGroup;
    }

    public void setUiGroup(UiGroup uiGroup) {
        this.uiGroup = uiGroup;
    }

    public List<Ui_define_administrative_area_on_map> getUi_define_administrative_area_on_maps() {
        return ui_define_administrative_area_on_maps;
    }

    public void setUi_define_administrative_area_on_maps(List<Ui_define_administrative_area_on_map> ui_define_administrative_area_on_maps) {
        this.ui_define_administrative_area_on_maps = ui_define_administrative_area_on_maps;
    }

    public List<UiResultTable> getUiResultTableList() {
        return uiResultTableList;
    }

    public void setUiResultTableList(List<UiResultTable> uiResultTableList) {
        this.uiResultTableList = uiResultTableList;
    }

}
