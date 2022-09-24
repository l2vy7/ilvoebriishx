package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = -4588601967418450964L;
    private boolean infiniteLastRetry = true;
    @C5010hb(type = ArrayList.class, value = Integer.class)
    private List<Integer> intervals = Arrays.asList(new Integer[]{10, 30, 60, 300});

    /* renamed from: a */
    public List<Integer> mo46170a() {
        return this.intervals;
    }

    /* renamed from: b */
    public boolean mo46171b() {
        return this.infiniteLastRetry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailuresHandler failuresHandler = (FailuresHandler) obj;
        if (this.infiniteLastRetry != failuresHandler.infiniteLastRetry || !C5015nb.m22922a(this.intervals, failuresHandler.intervals)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.intervals, Boolean.valueOf(this.infiniteLastRetry)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
