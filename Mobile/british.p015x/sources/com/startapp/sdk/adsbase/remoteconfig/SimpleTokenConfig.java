package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.C5001b2;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;

/* compiled from: Sta */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    /* renamed from: a */
    public boolean mo46418a(Context context) {
        ComponentLocator a = ComponentLocator.m23305a(context);
        C5069e d = a.mo21217d();
        C5001b2 f = a.mo21219f();
        if (d.getBoolean("userDisabledSimpleToken", false) || !this.enabled || !f.mo20655c()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
