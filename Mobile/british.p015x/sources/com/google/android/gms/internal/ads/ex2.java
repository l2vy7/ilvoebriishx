package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ex2 {

    /* renamed from: a */
    private final Context f31517a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f31518b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f31519c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f31520d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f31521e = "";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f31522f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f31523g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f31524h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f31525i = "";

    /* renamed from: j */
    private boolean f31526j = false;

    /* renamed from: k */
    private boolean f31527k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f31528l = 2;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f31529m = 2;

    private ex2(Context context, int i) {
        this.f31517a = context;
    }

    /* renamed from: p */
    public static ex2 m31961p(Context context, int i, int i2, zzbfd zzbfd) {
        ex2 ex2 = gx2.m32732b() ? new ex2(context, 7) : null;
        if (ex2 == null) {
            return null;
        }
        ex2.mo31677h();
        ex2.mo31679q(i2);
        String str = zzbfd.f42955q;
        if (!TextUtils.isEmpty(str)) {
            if (Pattern.matches((String) C8311wv.m39277c().mo18570b(p00.f37240w6), str)) {
                ex2.mo31675f(zzbfd.f42955q);
            }
        }
        return ex2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.ex2 mo31672c(com.google.android.gms.internal.ads.zzbew r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.f42939f     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.fa1 r3 = (com.google.android.gms.internal.ads.fa1) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.zzh()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.f31521e = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.zzf()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.f31522f = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex2.mo31672c(com.google.android.gms.internal.ads.zzbew):com.google.android.gms.internal.ads.ex2");
    }

    /* renamed from: d */
    public final synchronized ex2 mo31673d(tr2 tr2) {
        if (!TextUtils.isEmpty(tr2.f39519b.f35215b)) {
            this.f31521e = tr2.f39519b.f35215b;
        }
        Iterator<ir2> it = tr2.f39518a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ir2 next = it.next();
            if (!TextUtils.isEmpty(next.f33462Y)) {
                this.f31522f = next.f33462Y;
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized ex2 mo31674e(String str) {
        this.f31523g = str;
        return this;
    }

    /* renamed from: f */
    public final synchronized ex2 mo31675f(String str) {
        this.f31525i = str;
        return this;
    }

    /* renamed from: g */
    public final synchronized ex2 mo31676g(boolean z) {
        this.f31519c = z;
        return this;
    }

    /* renamed from: h */
    public final synchronized ex2 mo31677h() {
        zzt.zzp();
        this.f31520d = com.google.android.gms.ads.internal.util.zzt.zzC(this.f31517a);
        Resources resources = this.f31517a.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.f31529m = i;
        this.f31518b = zzt.zzA().currentTimeMillis();
        this.f31527k = true;
        return this;
    }

    /* renamed from: i */
    public final synchronized fx2 mo31678i() {
        if (this.f31526j) {
            return null;
        }
        this.f31526j = true;
        if (!this.f31527k) {
            mo31677h();
        }
        return new fx2(this);
    }

    /* renamed from: q */
    public final synchronized ex2 mo31679q(int i) {
        this.f31528l = i;
        return this;
    }
}
