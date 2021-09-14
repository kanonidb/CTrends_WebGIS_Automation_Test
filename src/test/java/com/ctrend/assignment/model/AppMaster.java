package com.ctrend.assignment.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "app_master")
public class AppMaster implements Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    int id;

    @Column
    private String app_code;
    @Column
    private String app_name;

    @ManyToOne
    @JoinColumn(name = "suite_id")
    private Suite suite;

    @OneToMany(mappedBy = "appMaster")
    private List<OperatorGroup> operatorGroupList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApp_code() {
        return app_code;
    }

    public void setApp_code(String app_code) {
        this.app_code = app_code;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public List<OperatorGroup> getOperatorGroupList() {
        return operatorGroupList;
    }

    public void setOperatorGroupList(List<OperatorGroup> operatorGroupList) {
        this.operatorGroupList = operatorGroupList;
    }
}
