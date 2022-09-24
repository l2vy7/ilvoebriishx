package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetaData {

    /* renamed from: a */
    private String f51318a;

    /* renamed from: b */
    private List<String> f51319b;

    /* renamed from: c */
    private List<MetaDataValueTypes> f51320c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f51318a = str;
        this.f51319b = list;
        this.f51320c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f51320c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f51318a = str;
        this.f51319b = list;
        this.f51320c = list2;
    }

    public String getMetaDataKey() {
        return this.f51318a;
    }

    public List<String> getMetaDataValue() {
        return this.f51319b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f51320c;
    }
}
