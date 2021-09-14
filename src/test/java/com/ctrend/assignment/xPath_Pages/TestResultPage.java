package com.ctrend.assignment.xPath_Pages;

import com.ctrend.assignment.BaseClass;
import com.ctrend.assignment.model.UiResultTable;

public class TestResultPage extends BaseClass {


    public void save(String massege, String code, String status) {
        UiResultTable testResult = new UiResultTable();
        testResult.setCode(code);
        testResult.setStatus(status);
        testResult.setMassage(massege);
        testResult.getCreatedTime();
    }
}
