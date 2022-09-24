package com.startapp.networkTest.results;

import com.startapp.C12385v4;

/* compiled from: Sta */
public class BaseResult implements Cloneable {
    public String GUID = "";
    public String ProjectId = "";
    public String Version = C12385v4.f54877i;

    public BaseResult(String str, String str2) {
        this.ProjectId = str;
        this.GUID = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
