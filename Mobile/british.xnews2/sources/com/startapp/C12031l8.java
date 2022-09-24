package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.startapp.l8 */
/* compiled from: Sta */
public class C12031l8 extends C12372u8 {

    /* renamed from: a */
    public final int f53251a;

    public C12031l8(int i) {
        this.f53251a = i;
    }

    /* renamed from: a */
    public boolean mo45522a(Object obj) {
        if (!(obj instanceof C12403w0)) {
            return false;
        }
        int i = ((C12403w0) obj).f54988Z;
        if ((this.f53251a & i) == i) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12031l8.class == obj.getClass() && this.f53251a == ((C12031l8) obj).f53251a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f53251a)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
