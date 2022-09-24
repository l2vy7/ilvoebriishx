package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.x6 */
/* compiled from: Sta */
public class C12429x6 {

    /* renamed from: a */
    public String f55127a;

    /* renamed from: b */
    public String f55128b;

    /* renamed from: c */
    public Set<String> f55129c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12429x6.class != obj.getClass()) {
            return false;
        }
        return this.f55127a.equals(((C12429x6) obj).f55127a);
    }

    public int hashCode() {
        Object[] objArr = {this.f55127a};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("NameValueObject [name=");
        a.append(this.f55127a);
        a.append(", value=");
        a.append(this.f55128b);
        a.append(", valueSet=");
        a.append(this.f55129c);
        a.append("]");
        return a.toString();
    }
}
