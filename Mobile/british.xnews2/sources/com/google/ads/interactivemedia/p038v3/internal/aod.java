package com.google.ads.interactivemedia.p038v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aod */
/* compiled from: IMASDK */
public abstract class aod<T> {

    /* renamed from: a */
    private final int f15467a;

    /* renamed from: b */
    private final String f15468b;

    /* renamed from: c */
    private final T f15469c;

    /* synthetic */ aod(int i, String str, Object obj) {
        this.f15467a = i;
        this.f15468b = str;
        this.f15469c = obj;
        anx.m14426a().mo14151a(this);
    }

    /* renamed from: g */
    public static aod<Boolean> m14444g(int i, String str, Boolean bool) {
        return new any(i, str, bool);
    }

    /* renamed from: i */
    public static void m14445i(String str, float f) {
        new aob(str, Float.valueOf(f));
    }

    /* renamed from: j */
    public static void m14446j(String str, int i) {
        new anz(str, Integer.valueOf(i));
    }

    /* renamed from: k */
    public static aod<Long> m14447k(String str, long j) {
        return new aoa(str, Long.valueOf(j));
    }

    /* renamed from: l */
    public static aod<String> m14448l(String str, String str2) {
        return new aoc(str, str2);
    }

    /* renamed from: a */
    public abstract T mo14143a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo14144b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo14145c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public final String mo14147d() {
        return this.f15468b;
    }

    /* renamed from: e */
    public final T mo14148e() {
        return this.f15469c;
    }

    /* renamed from: f */
    public final T mo14149f() {
        return anx.m14427b().mo14156b(this);
    }

    /* renamed from: h */
    public final int mo14150h() {
        return this.f15467a;
    }
}
