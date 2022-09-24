package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class il0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: b */
    private final Context f33294b;

    /* renamed from: c */
    private final SharedPreferences f33295c;

    /* renamed from: d */
    private final zzg f33296d;

    /* renamed from: e */
    private final km0 f33297e;

    /* renamed from: f */
    private String f33298f = "-1";

    /* renamed from: g */
    private int f33299g = -1;

    il0(Context context, zzg zzg, km0 km0) {
        this.f33295c = PreferenceManager.getDefaultSharedPreferences(context);
        this.f33296d = zzg;
        this.f33294b = context;
        this.f33297e = km0;
    }

    /* renamed from: b */
    private final void m33242b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37184q0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37166o0)).booleanValue()) {
            this.f33296d.zzD(z);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue() && z && (context = this.f33294b) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37121j0)).booleanValue()) {
            this.f33297e.mo18500y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32644a() {
        this.f33295c.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f33295c, "IABTCF_PurposeConsents");
        onSharedPreferenceChanged(this.f33295c, "gad_has_consent_for_cookies");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            java.lang.String r1 = "-1"
            java.lang.String r2 = r9.getString(r0, r1)
            java.lang.String r3 = "gad_has_consent_for_cookies"
            r4 = -1
            int r9 = r9.getInt(r3, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r5 = r10.hashCode()
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L_0x002b
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0033
            r10 = 1
            goto L_0x0034
        L_0x002b:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0033
            r10 = 0
            goto L_0x0034
        L_0x0033:
            r10 = -1
        L_0x0034:
            if (r10 == 0) goto L_0x0057
            if (r10 == r7) goto L_0x0039
            return
        L_0x0039:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.p00.f37184q0
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r10 = r0.mo18570b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x006a
            if (r9 == r4) goto L_0x006a
            int r10 = r8.f33299g
            if (r10 == r9) goto L_0x006a
            r8.f33299g = r9
            r8.m33242b(r2, r9)
            return
        L_0x0057:
            boolean r10 = r2.equals(r1)
            if (r10 != 0) goto L_0x006a
            java.lang.String r10 = r8.f33298f
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L_0x006a
            r8.f33298f = r2
            r8.m33242b(r2, r9)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.il0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
