package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.startapp.n8 */
/* compiled from: Sta */
public class C12076n8 extends C12372u8 {

    /* renamed from: a */
    public final C11882e4 f53328a;

    /* renamed from: b */
    public final String f53329b;

    public C12076n8(C11882e4 e4Var, String str) {
        this.f53328a = e4Var;
        this.f53329b = str;
    }

    /* renamed from: a */
    public boolean mo45522a(Object obj) {
        if (!(obj instanceof C12045m4)) {
            return false;
        }
        C11882e4 e4Var = this.f53328a;
        C5004d4 d4Var = ((C12045m4) obj).f53264h0;
        if (e4Var != d4Var.f22123a) {
            return false;
        }
        String str = this.f53329b;
        if (str == null || str.equals(d4Var.f22126d)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12076n8.class != obj.getClass()) {
            return false;
        }
        C12076n8 n8Var = (C12076n8) obj;
        if (!C5015nb.m22922a(this.f53328a, n8Var.f53328a) || !C5015nb.m22922a(this.f53329b, n8Var.f53329b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.f53328a, this.f53329b};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
