package com.startapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.Map;

/* renamed from: com.startapp.p8 */
/* compiled from: Sta */
public class C12129p8 extends C12372u8 {

    /* renamed from: a */
    public final String f54009a;

    /* renamed from: b */
    public final Map<String, String> f54010b;

    public C12129p8(String str, Map<String, String> map) {
        this.f54009a = str;
        this.f54010b = map;
    }

    /* renamed from: a */
    public boolean mo45522a(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.first != this) {
            return false;
        }
        Object obj2 = pair.second;
        if (!(obj2 instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) obj2;
        if (!this.f54009a.equals(intent.getAction())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        for (Map.Entry next : this.f54010b.entrySet()) {
            if (!((String) next.getValue()).equals(String.valueOf(extras.get((String) next.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
