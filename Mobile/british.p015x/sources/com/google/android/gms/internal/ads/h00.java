package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class h00<T> {

    /* renamed from: a */
    private final int f32546a;

    /* renamed from: b */
    private final String f32547b;

    /* renamed from: c */
    private final T f32548c;

    /* synthetic */ h00(int i, String str, Object obj, g00 g00) {
        this.f32546a = i;
        this.f32547b = str;
        this.f32548c = obj;
        C8311wv.m39275a().mo32515d(this);
    }

    /* renamed from: f */
    public static h00<Float> m32761f(int i, String str, float f) {
        return new d00(1, str, Float.valueOf(f));
    }

    /* renamed from: g */
    public static h00<Integer> m32762g(int i, String str, int i2) {
        return new b00(1, str, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static h00<Long> m32763h(int i, String str, long j) {
        return new c00(1, str, Long.valueOf(j));
    }

    /* renamed from: i */
    public static h00<Boolean> m32764i(int i, String str, Boolean bool) {
        return new a00(i, str, bool);
    }

    /* renamed from: j */
    public static h00<String> m32765j(int i, String str, String str2) {
        return new e00(1, str, str2);
    }

    /* renamed from: k */
    public static h00<String> m32766k(int i, String str) {
        h00<String> j = m32765j(1, "gads:sdk_core_constants:experiment_id", (String) null);
        C8311wv.m39275a().mo32514c(j);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30274a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract T mo30275b(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo30276c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo30277d(SharedPreferences.Editor editor, T t);

    /* renamed from: e */
    public final int mo32310e() {
        return this.f32546a;
    }

    /* renamed from: l */
    public final T mo32311l() {
        return this.f32548c;
    }

    /* renamed from: m */
    public final String mo32312m() {
        return this.f32547b;
    }
}
