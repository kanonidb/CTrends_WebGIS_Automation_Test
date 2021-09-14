package com.ctrend.assignment.model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "ui_group")
public class UiGroup implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    private int id ;
    @Column
    private String ui_group_code;
    @Column
    private  String  ui_group_name;

    @ManyToOne
    @JoinColumn(name = "operator_group_id")
    private OperatorGroup operatorGroup;

    @OneToMany(mappedBy = "uiGroup")
    private List<UiTable> uiTableList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUi_group_code() {
        return ui_group_code;
    }

    public void setUi_group_code(String ui_group_code) {
        this.ui_group_code = ui_group_code;
    }

    public String getUi_group_name() {
        return ui_group_name;
    }

    public void setUi_group_name(String ui_group_name) {
        this.ui_group_name = ui_group_name;
    }

    public OperatorGroup getOperatorGroup() {
        return operatorGroup;
    }

    public void setOperatorGroup(OperatorGroup operatorGroup) {
        this.operatorGroup = operatorGroup;
    }

    public List<UiTable> getUiTableList() {
        return uiTableList;
    }

    public void setUiTableList(List<UiTable> uiTableList) {
        this.uiTableList = uiTableList;
    }
}
