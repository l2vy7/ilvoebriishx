package com.ironsource.mediationsdk.adunit.adapter.utility;

import java.util.Map;

public class AdData {

    /* renamed from: a */
    private final String f50761a;

    /* renamed from: b */
    private final Map<String, Object> f50762b;

    public AdData(String str, Map<String, Object> map) {
        this.f50761a = str;
        this.f50762b = map;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.f50762b.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.f50762b;
    }

    public Integer getInt(String str) {
        return (Integer) this.f50762b.get(str);
    }

    public String getServerData() {
        return this.f50761a;
    }

    public String getString(String str) {
        return (String) this.f50762b.get(str);
    }
}
