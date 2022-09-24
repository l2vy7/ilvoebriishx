package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.ky1;
import com.google.android.gms.internal.ads.ly1;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.p00;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C0114k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzba {

    /* renamed from: a */
    private final Object f27845a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private String f27846b = "";
    @GuardedBy("lock")

    /* renamed from: c */
    private String f27847c = "";
    @GuardedBy("lock")

    /* renamed from: d */
    private boolean f27848d = false;
    @GuardedBy("lock")

    /* renamed from: e */
    private boolean f27849e = false;

    /* renamed from: f */
    protected String f27850f = "";

    /* renamed from: g */
    private ly1 f27851g;

    /* renamed from: c */
    protected static final String m28816c(Context context, String str, String str2) {
        String str3;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put(RtspHeaders.USER_AGENT, zzt.zzp().zzd(context, str2));
        mb3<String> zzb = new zzbs(context).zzb(0, str, hashMap, (byte[]) null);
        try {
            return zzb.get((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37169o3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Timeout while retrieving a response from: ".concat(valueOf);
            } else {
                str3 = new String("Timeout while retrieving a response from: ");
            }
            co0.zzh(str3, e);
            zzb.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str4 = "Interrupted while retrieving a response from: ".concat(valueOf2);
            } else {
                str4 = new String("Interrupted while retrieving a response from: ");
            }
            co0.zzh(str4, e2);
            zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str5 = "Error retrieving a response from: ".concat(valueOf3);
            } else {
                str5 = new String("Error retrieving a response from: ");
            }
            co0.zzh(str5, e3);
            return null;
        }
    }

    /* renamed from: d */
    private final Uri m28817d(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f27845a) {
            if (TextUtils.isEmpty(this.f27846b)) {
                zzt.zzp();
                try {
                    str5 = new String(C0114k.m412d(context.openFileInput("debug_signals_id.txt"), true), C6540C.UTF8_NAME);
                } catch (IOException unused) {
                    co0.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.f27846b = str5;
                if (TextUtils.isEmpty(str5)) {
                    zzt.zzp();
                    this.f27846b = UUID.randomUUID().toString();
                    zzt.zzp();
                    String str6 = this.f27846b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes(C6540C.UTF8_NAME));
                        openFileOutput.close();
                    } catch (Exception e) {
                        co0.zzh("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f27846b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28521a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            co0.zzi("Can not create dialog without Activity Context");
        } else {
            zzt.zza.post(new zzaz(this, context, str, z, z2));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28522b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.h00<java.lang.String> r0 = com.google.android.gms.internal.ads.p00.f37142l3
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.m28817d(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = m28816c(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.co0.zze(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            r3.f27850f = r6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.p00.f36958P6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ JSONException -> 0x0083 }
            java.lang.Object r6 = r1.mo18570b(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0083 }
            r1 = 1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f27850f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f27850f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            r3.zzf(r6)     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.nn0 r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.ads.internal.util.zzg r2 = r2.mo18583h()     // Catch:{ JSONException -> 0x0083 }
            if (r1 == r6) goto L_0x0076
            java.lang.String r5 = ""
        L_0x0076:
            r2.zzy(r5)     // Catch:{ JSONException -> 0x0083 }
        L_0x0079:
            java.lang.Object r5 = r3.f27845a
            monitor-enter(r5)
            r3.f27847c = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x0080:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r4
        L_0x0083:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.co0.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzba.mo28522b(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final ly1 zza() {
        return this.f27851g;
    }

    public final String zzb() {
        String str;
        synchronized (this.f27845a) {
            str = this.f27847c;
        }
        return str;
    }

    public final void zzc(Context context) {
        ly1 ly1;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue() && (ly1 = this.f27851g) != null) {
            ly1.mo33427g(new zzax(this, context), ky1.DEBUG_MENU);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        zzt.zzp();
        zzt.zzY(context, m28817d(context, (String) C8311wv.m39277c().mo18570b(p00.f37133k3), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m28817d(context, (String) C8311wv.m39277c().mo18570b(p00.f37160n3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzt.zzp();
        zzt.zzO(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.f27845a) {
            this.f27849e = z;
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue()) {
                zzt.zzo().mo18583h().zzz(z);
                ly1 ly1 = this.f27851g;
                if (ly1 != null) {
                    ly1.mo33429i(z);
                }
            }
        }
    }

    public final void zzg(ly1 ly1) {
        this.f27851g = ly1;
    }

    public final void zzh(boolean z) {
        synchronized (this.f27845a) {
            this.f27848d = z;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String c = m28816c(context, m28817d(context, (String) C8311wv.m39277c().mo18570b(p00.f37151m3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(c)) {
            co0.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(new JSONObject(c.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue()) {
                zzg h = zzt.zzo().mo18583h();
                if (true != equals) {
                    str = "";
                }
                h.zzy(str);
            }
            return equals;
        } catch (JSONException e) {
            co0.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.f27845a) {
            z = this.f27849e;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.f27845a) {
            z = this.f27848d;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        co0.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
