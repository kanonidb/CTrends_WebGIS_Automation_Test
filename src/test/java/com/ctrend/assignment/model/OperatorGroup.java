package com.ctrend.assignment.model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "operator_group")
public class OperatorGroup implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    int id ;
    @Column
    private String operator_group_code;
    @Column
    private String  operator_group_name;

    @ManyToOne
    @JoinColumn(name = "app_master_id")
    private AppMaster appMaster;

    @OneToMany(mappedBy = "operatorGroup")
    private List<UiGroup> uiGroupList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperator_group_code() {
        return operator_group_code;
    }

    public void setOperator_group_code(String operator_group_code) {
        this.operator_group_code = operator_group_code;
    }

    public String getOperator_group_name() {
        return operator_group_name;
    }

    public void setOperator_group_name(String operator_group_name) {
        this.operator_group_name = operator_group_name;
    }

    public AppMaster getAppMaster() {
        return appMaster;
    }

    public void setAppMaster(AppMaster appMaster) {
        this.appMaster = appMaster;
    }

    public List<UiGroup> getUiGroupList() {
        return uiGroupList;
    }

    public void setUiGroupList(List<UiGroup> uiGroupList) {
        this.uiGroupList = uiGroupList;
    }
}
