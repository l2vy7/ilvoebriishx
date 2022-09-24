package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p006a5.C6492o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xi0 {

    /* renamed from: A */
    private int f41171A;

    /* renamed from: B */
    private final String f41172B;

    /* renamed from: C */
    private boolean f41173C;

    /* renamed from: a */
    private int f41174a;

    /* renamed from: b */
    private boolean f41175b;

    /* renamed from: c */
    private boolean f41176c;

    /* renamed from: d */
    private int f41177d;

    /* renamed from: e */
    private int f41178e;

    /* renamed from: f */
    private int f41179f;

    /* renamed from: g */
    private String f41180g;

    /* renamed from: h */
    private int f41181h;

    /* renamed from: i */
    private int f41182i;

    /* renamed from: j */
    private int f41183j;

    /* renamed from: k */
    private boolean f41184k;

    /* renamed from: l */
    private int f41185l;

    /* renamed from: m */
    private double f41186m;

    /* renamed from: n */
    private boolean f41187n;

    /* renamed from: o */
    private String f41188o;

    /* renamed from: p */
    private String f41189p;

    /* renamed from: q */
    private final boolean f41190q;

    /* renamed from: r */
    private final boolean f41191r;

    /* renamed from: s */
    private final String f41192s;

    /* renamed from: t */
    private final boolean f41193t;

    /* renamed from: u */
    private final boolean f41194u;

    /* renamed from: v */
    private final boolean f41195v;

    /* renamed from: w */
    private final String f41196w;

    /* renamed from: x */
    private final String f41197x;

    /* renamed from: y */
    private float f41198y;

    /* renamed from: z */
    private int f41199z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xi0(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.m39476c(r7)
            r6.m39478e(r7)
            r6.m39477d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = m39475b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r6.f41190q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = m39475b(r0, r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r6.f41191r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f41192s = r2
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            boolean r2 = com.google.android.gms.internal.ads.vn0.m38854m()
            r6.f41193t = r2
            boolean r2 = p006a5.C6487i.m28264b(r7)
            r6.f41194u = r2
            boolean r2 = p006a5.C6487i.m28265c(r7)
            r6.f41195v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f41196w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = m39475b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L_0x0060
        L_0x005e:
            r0 = r2
            goto L_0x0091
        L_0x0060:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L_0x0065
            goto L_0x005e
        L_0x0065:
            c5.b r3 = p192c5.C6520c.m28321a(r7)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r5 = r0.packageName     // Catch:{ NameNotFoundException -> 0x005e }
            android.content.pm.PackageInfo r3 = r3.mo24355f(r5, r4)     // Catch:{ NameNotFoundException -> 0x005e }
            if (r3 == 0) goto L_0x005e
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4.length()     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x005e }
            r5.<init>(r4)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r3)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r1)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r0)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r0 = r5.toString()     // Catch:{ NameNotFoundException -> 0x005e }
        L_0x0091:
            r6.f41197x = r0
            c5.b r0 = p192c5.C6520c.m28321a(r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.mo24355f(r3, r4)     // Catch:{ Exception -> 0x00c2 }
            if (r0 == 0) goto L_0x00c3
            int r3 = r0.versionCode     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00c2 }
            r5.append(r3)     // Catch:{ Exception -> 0x00c2 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c2 }
            r5.append(r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00c3
        L_0x00c2:
        L_0x00c3:
            r6.f41172B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto L_0x00cc
            return
        L_0x00cc:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto L_0x00d3
            return
        L_0x00d3:
            float r0 = r7.density
            r6.f41198y = r0
            int r0 = r7.widthPixels
            r6.f41199z = r0
            int r7 = r7.heightPixels
            r6.f41171A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi0.<init>(android.content.Context):void");
    }

    /* renamed from: b */
    private static ResolveInfo m39475b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } catch (Throwable th) {
            zzt.zzo().mo18592s(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: c */
    private final void m39476c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f41174a = audioManager.getMode();
                this.f41175b = audioManager.isMusicActive();
                this.f41176c = audioManager.isSpeakerphoneOn();
                this.f41177d = audioManager.getStreamVolume(3);
                this.f41178e = audioManager.getRingerMode();
                this.f41179f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzt.zzo().mo18592s(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f41174a = -2;
        this.f41175b = false;
        this.f41176c = false;
        this.f41177d = 0;
        this.f41178e = 2;
        this.f41179f = 0;
    }

    /* renamed from: d */
    private final void m39477d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(IronSourceConstants.EVENTS_STATUS, -1);
            this.f41186m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f41187n = z;
            return;
        }
        this.f41186m = -1.0d;
        this.f41187n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    @android.annotation.TargetApi(16)
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39478e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f41180g = r2
            boolean r2 = p006a5.C6492o.m28290m()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.p00.f37145l6
            com.google.android.gms.internal.ads.n00 r4 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r2 = r4.mo18570b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = 0
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.f41182i = r2
            int r0 = r0.getPhoneType()
            r5.f41183j = r0
            r0 = -2
            r5.f41181h = r0
            r5.f41184k = r3
            r0 = -1
            r5.f41185l = r0
            com.google.android.gms.ads.internal.zzt.zzp()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzt.zzF(r6, r2)
            if (r6 == 0) goto L_0x006f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0067
            int r0 = r6.getType()
            r5.f41181h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f41185l = r6
            goto L_0x0069
        L_0x0067:
            r5.f41181h = r0
        L_0x0069:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f41184k = r6
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi0.m39478e(android.content.Context):void");
    }

    /* renamed from: a */
    public final yi0 mo35758a() {
        return new yi0(this.f41174a, this.f41190q, this.f41191r, this.f41180g, this.f41192s, this.f41193t, this.f41194u, this.f41195v, this.f41175b, this.f41176c, this.f41196w, this.f41197x, this.f41172B, this.f41177d, this.f41181h, this.f41182i, this.f41183j, this.f41178e, this.f41179f, this.f41198y, this.f41199z, this.f41171A, this.f41186m, this.f41187n, this.f41184k, this.f41185l, this.f41188o, this.f41173C, this.f41189p);
    }

    public xi0(Context context, yi0 yi0) {
        m39476c(context);
        m39478e(context);
        m39477d(context);
        this.f41188o = Build.FINGERPRINT;
        this.f41189p = Build.DEVICE;
        boolean z = false;
        if (C6492o.m28279b() && o10.m20748g(context)) {
            z = true;
        }
        this.f41173C = z;
        this.f41190q = yi0.f41876a;
        this.f41191r = yi0.f41877b;
        this.f41192s = yi0.f41879d;
        this.f41193t = yi0.f41880e;
        this.f41194u = yi0.f41881f;
        this.f41195v = yi0.f41882g;
        this.f41196w = yi0.f41883h;
        this.f41197x = yi0.f41884i;
        this.f41172B = yi0.f41885j;
        this.f41198y = yi0.f41888m;
        this.f41199z = yi0.f41889n;
        this.f41171A = yi0.f41890o;
    }
}
