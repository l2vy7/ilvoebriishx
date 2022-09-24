package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class om0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: b */
    private final String f36534b;

    /* renamed from: c */
    final /* synthetic */ pm0 f36535c;

    public om0(pm0 pm0, String str) {
        this.f36535c = pm0;
        this.f36534b = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f36535c) {
            for (nm0 nm0 : this.f36535c.f37713b) {
                nm0.f36044a.mo34154b(nm0.f36045b, sharedPreferences, this.f36534b, str);
            }
        }
    }
}
