package com.ctrend.assignment.model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name="suite")
public class Suite implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column
    int id ;

    @Column
    private String  suite_code;

    @Column
    private String suite_name;

    @OneToMany(mappedBy = "suite")
    private List<AppMaster> appMasterList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuite_code() {
        return suite_code;
    }

    public void setSuite_code(String suite_code) {
        this.suite_code = suite_code;
    }

    public String getSuite_name() {
        return suite_name;
    }

    public void setSuite_name(String suite_name) {
        this.suite_name = suite_name;
    }

    public List<AppMaster> getAppMasterList() {
        return appMasterList;
    }

    public void setAppMasterList(List<AppMaster> appMasterList) {
        this.appMasterList = appMasterList;
    }
}
