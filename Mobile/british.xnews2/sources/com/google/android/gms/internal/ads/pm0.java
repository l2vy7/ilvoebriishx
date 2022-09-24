package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pm0 {

    /* renamed from: a */
    private final Map<String, om0> f37712a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<nm0> f37713b = new ArrayList();

    /* renamed from: c */
    private final Context f37714c;

    /* renamed from: d */
    private final ml0 f37715d;

    pm0(Context context, ml0 ml0) {
        this.f37714c = context;
        this.f37715d = ml0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo34154b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f37715d.mo33556e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo34155c(String str) {
        SharedPreferences sharedPreferences;
        if (!this.f37712a.containsKey(str)) {
            if ("__default__".equals(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f37714c);
            } else {
                sharedPreferences = this.f37714c.getSharedPreferences(str, 0);
            }
            om0 om0 = new om0(this, str);
            this.f37712a.put(str, om0);
            sharedPreferences.registerOnSharedPreferenceChangeListener(om0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo34156d(nm0 nm0) {
        this.f37713b.add(nm0);
    }
}
