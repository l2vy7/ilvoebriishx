package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zg2 implements zi2<ah2> {

    /* renamed from: a */
    private final nb3 f42465a;

    /* renamed from: b */
    private final bs2 f42466b;

    /* renamed from: c */
    private final PackageInfo f42467c;

    /* renamed from: d */
    private final zzg f42468d;

    public zg2(nb3 nb3, bs2 bs2, PackageInfo packageInfo, zzg zzg) {
        this.f42465a = nb3;
        this.f42466b = bs2;
        this.f42467c = packageInfo;
        this.f42468d = zzg;
    }

    /* renamed from: a */
    public static /* synthetic */ ah2 m40340a(zg2 zg2) {
        ArrayList<String> arrayList = zg2.f42466b.f30090g;
        if (arrayList == null) {
            return wg2.f40783a;
        }
        return arrayList.isEmpty() ? xg2.f41158a : new vg2(zg2, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r9 == 3) goto L_0x0107;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo36057b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            java.util.ArrayList<java.lang.String> r9 = r9.f30091h
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f30092i
            int r9 = r9.f42993b
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L_0x004f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f30092i
            int r9 = r9.f43000i
            if (r9 == r6) goto L_0x0043
            if (r9 == r5) goto L_0x0041
            if (r9 == r1) goto L_0x003f
            r7 = 4
            if (r9 == r7) goto L_0x003c
            r9 = r4
            goto L_0x0044
        L_0x003c:
            java.lang.String r9 = "square"
            goto L_0x0044
        L_0x003f:
            r9 = r2
            goto L_0x0044
        L_0x0041:
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x004f:
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f30092i
            int r9 = r9.f42995d
            if (r9 == 0) goto L_0x005f
            if (r9 == r6) goto L_0x005d
            if (r9 == r5) goto L_0x0060
            r0 = r4
            goto L_0x0060
        L_0x005d:
            r0 = r2
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x006b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x006b:
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f30092i
            boolean r9 = r9.f42996e
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f30092i
            boolean r9 = r9.f42999h
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.f42467c
            if (r9 != 0) goto L_0x0087
            r9 = 0
            goto L_0x0089
        L_0x0087:
            int r9 = r9.versionCode
        L_0x0089:
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f42468d
            int r0 = r0.zza()
            if (r9 <= r0) goto L_0x009b
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f42468d
            r0.zzq()
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f42468d
            r0.zzt(r9)
        L_0x009b:
            com.google.android.gms.ads.internal.util.zzg r9 = r8.f42468d
            org.json.JSONObject r9 = r9.zzn()
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.bs2 r2 = r8.f42466b
            java.lang.String r2 = r2.f30089f
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto L_0x00b2
            java.lang.String r0 = r9.toString()
        L_0x00b2:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        L_0x00bd:
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            int r9 = r9.f30094k
            if (r9 <= r6) goto L_0x00c8
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00c8:
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.zzbtz r9 = r9.f30085b
            if (r9 == 0) goto L_0x0119
            java.lang.String r0 = r9.f21083d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x010d
            int r0 = r9.f21081b
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00e5
            int r9 = r9.f21084e
            if (r9 == r5) goto L_0x0106
            if (r9 == r1) goto L_0x0107
            goto L_0x0106
        L_0x00e5:
            int r9 = r9.f21082c
            if (r9 == r6) goto L_0x0106
            if (r9 == r5) goto L_0x0107
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 52
            r0.<init>(r1)
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.internal.ads.co0.zzg(r9)
        L_0x0106:
            r2 = r3
        L_0x0107:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0114
        L_0x010d:
            java.lang.String r9 = r9.f21083d
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0114:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0119:
            com.google.android.gms.internal.ads.bs2 r9 = r8.f42466b
            com.google.android.gms.internal.ads.i50 r9 = r9.mo30795a()
            if (r9 == 0) goto L_0x0126
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zg2.mo36057b(java.util.ArrayList, android.os.Bundle):void");
    }

    public final mb3<ah2> zzb() {
        return this.f42465a.mo33675b(new yg2(this));
    }
}
