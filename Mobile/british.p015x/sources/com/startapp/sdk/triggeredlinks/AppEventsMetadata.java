package com.startapp.sdk.triggeredlinks;

import com.startapp.C5010hb;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class AppEventsMetadata implements Serializable {
    private static final long serialVersionUID = -5670027899854165615L;
    @C5010hb(type = HashMap.class)
    private Map<String, String> active;
    @C5010hb(type = HashMap.class)
    private Map<String, String> inactive;
    @C5010hb(type = HashMap.class)
    private Map<String, String> launch;
    @C5010hb(type = HashMap.class, value = PeriodicAppEventMetadata.class)
    private Map<String, PeriodicAppEventMetadata> periodic;

    /* renamed from: a */
    public Map<String, String> mo46494a() {
        return this.active;
    }

    /* renamed from: b */
    public Map<String, String> mo46495b() {
        return this.inactive;
    }

    /* renamed from: c */
    public Map<String, String> mo46496c() {
        return this.launch;
    }

    /* renamed from: d */
    public Map<String, PeriodicAppEventMetadata> mo46497d() {
        return this.periodic;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppEventsMetadata appEventsMetadata = (AppEventsMetadata) obj;
        Map<String, String> map = this.launch;
        if (map == null ? appEventsMetadata.launch != null : !map.equals(appEventsMetadata.launch)) {
            return false;
        }
        Map<String, String> map2 = this.active;
        if (map2 == null ? appEventsMetadata.active != null : !map2.equals(appEventsMetadata.active)) {
            return false;
        }
        Map<String, String> map3 = this.inactive;
        if (map3 == null ? appEventsMetadata.inactive != null : !map3.equals(appEventsMetadata.inactive)) {
            return false;
        }
        Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
        Map<String, PeriodicAppEventMetadata> map5 = appEventsMetadata.periodic;
        if (map4 != null) {
            return map4.equals(map5);
        }
        if (map5 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Map<String, String> map = this.launch;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.active;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.inactive;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
        if (map4 != null) {
            i = map4.hashCode();
        }
        return hashCode3 + i;
    }
}
