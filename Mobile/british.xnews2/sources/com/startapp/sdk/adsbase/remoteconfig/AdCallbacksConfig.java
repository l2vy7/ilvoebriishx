package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: Sta */
public class AdCallbacksConfig implements Serializable {
    private static final long serialVersionUID = -4207400392050812703L;
    private boolean logNotSubscribed = false;
    @C5010hb(type = HashSet.class)
    private Set<String> names;

    /* renamed from: a */
    public boolean mo46282a(String str) {
        Set<String> set = this.names;
        if (set == null) {
            return false;
        }
        for (String equals : set) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdCallbacksConfig adCallbacksConfig = (AdCallbacksConfig) obj;
        if (this.logNotSubscribed != adCallbacksConfig.logNotSubscribed || !C5015nb.m22922a(this.names, adCallbacksConfig.names)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.names, Boolean.valueOf(this.logNotSubscribed)});
    }

    /* renamed from: a */
    public boolean mo46281a() {
        return this.logNotSubscribed;
    }
}
