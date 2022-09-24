package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.zzg;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class on0 {

    /* renamed from: a */
    long f36539a = -1;

    /* renamed from: b */
    long f36540b = -1;
    @GuardedBy("lock")

    /* renamed from: c */
    int f36541c = -1;

    /* renamed from: d */
    int f36542d = -1;

    /* renamed from: e */
    long f36543e = 0;

    /* renamed from: f */
    private final Object f36544f = new Object();

    /* renamed from: g */
    final String f36545g;

    /* renamed from: h */
    private final zzg f36546h;
    @GuardedBy("lock")

    /* renamed from: i */
    int f36547i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    int f36548j = 0;

    public on0(String str, zzg zzg) {
        this.f36545g = str;
        this.f36546h = zzg;
    }

    /* renamed from: g */
    private final void m35763g() {
        if (k20.f34124a.mo34648e().booleanValue()) {
            synchronized (this.f36544f) {
                this.f36541c--;
                this.f36542d--;
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo33947a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f36544f) {
            bundle = new Bundle();
            if (this.f36546h.zzL()) {
                str2 = "";
            } else {
                str2 = this.f36545g;
            }
            bundle.putString("session_id", str2);
            bundle.putLong("basets", this.f36540b);
            bundle.putLong("currts", this.f36539a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f36541c);
            bundle.putInt("preqs_in_session", this.f36542d);
            bundle.putLong("time_in_session", this.f36543e);
            bundle.putInt("pclick", this.f36547i);
            bundle.putInt("pimp", this.f36548j);
            Context a = ij0.m33229a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            boolean z = false;
            if (identifier == 0) {
                co0.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        co0.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    co0.zzj("Fail to fetch AdActivity theme");
                    co0.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo33948b() {
        synchronized (this.f36544f) {
            this.f36547i++;
        }
    }

    /* renamed from: c */
    public final void mo33949c() {
        synchronized (this.f36544f) {
            this.f36548j++;
        }
    }

    /* renamed from: d */
    public final void mo33950d() {
        m35763g();
    }

    /* renamed from: e */
    public final void mo33951e() {
        m35763g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33952f(com.google.android.gms.internal.ads.zzbfd r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f36544f
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzg r1 = r10.f36546h     // Catch:{ all -> 0x0074 }
            long r1 = r1.zzc()     // Catch:{ all -> 0x0074 }
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ all -> 0x0074 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0074 }
            long r5 = r10.f36540b     // Catch:{ all -> 0x0074 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.h00<java.lang.Long> r5 = com.google.android.gms.internal.ads.p00.f36888H0     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.ads.n00 r6 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x0074 }
            java.lang.Object r5 = r6.mo18570b(r5)     // Catch:{ all -> 0x0074 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0074 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0074 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f36542d = r1     // Catch:{ all -> 0x0074 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.ads.internal.util.zzg r1 = r10.f36546h     // Catch:{ all -> 0x0074 }
            int r1 = r1.zzb()     // Catch:{ all -> 0x0074 }
            r10.f36542d = r1     // Catch:{ all -> 0x0074 }
        L_0x003b:
            r10.f36540b = r12     // Catch:{ all -> 0x0074 }
            r10.f36539a = r12     // Catch:{ all -> 0x0074 }
            goto L_0x0042
        L_0x0040:
            r10.f36539a = r12     // Catch:{ all -> 0x0074 }
        L_0x0042:
            android.os.Bundle r11 = r11.f42942d     // Catch:{ all -> 0x0074 }
            r12 = 1
            if (r11 == 0) goto L_0x0053
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0074 }
            if (r11 == r12) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0053:
            int r11 = r10.f36541c     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f36541c = r11     // Catch:{ all -> 0x0074 }
            int r11 = r10.f36542d     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f36542d = r11     // Catch:{ all -> 0x0074 }
            if (r11 != 0) goto L_0x0069
            r11 = 0
            r10.f36543e = r11     // Catch:{ all -> 0x0074 }
            com.google.android.gms.ads.internal.util.zzg r11 = r10.f36546h     // Catch:{ all -> 0x0074 }
            r11.zzB(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x0069:
            com.google.android.gms.ads.internal.util.zzg r11 = r10.f36546h     // Catch:{ all -> 0x0074 }
            long r11 = r11.zzd()     // Catch:{ all -> 0x0074 }
            long r3 = r3 - r11
            r10.f36543e = r3     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.on0.mo33952f(com.google.android.gms.internal.ads.zzbfd, long):void");
    }
}
