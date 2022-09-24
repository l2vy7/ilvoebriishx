package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.o8 */
/* compiled from: Sta */
public class C12110o8 extends C12372u8 {

    /* renamed from: a */
    public final List<C11882e4> f53963a;

    public C12110o8(List<C11882e4> list) {
        this.f53963a = list;
    }

    /* renamed from: a */
    public boolean mo45522a(Object obj) {
        if (obj instanceof C12045m4) {
            return this.f53963a.contains(((C12045m4) obj).f53264h0.f22123a);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12110o8.class != obj.getClass()) {
            return false;
        }
        return C5015nb.m22922a(this.f53963a, ((C12110o8) obj).f53963a);
    }

    public int hashCode() {
        Object[] objArr = {this.f53963a};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
