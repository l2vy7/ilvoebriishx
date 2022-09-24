package com.startapp.sdk.adsbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C12420x0;
import com.startapp.C5004d4;
import com.startapp.C5011i;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.sdk.adsbase.b */
/* compiled from: Sta */
public abstract class C12261b {

    /* renamed from: a */
    public final Context f54532a;

    /* renamed from: b */
    public final C5041Ad f54533b;

    /* renamed from: c */
    public final AdPreferences f54534c;

    /* renamed from: d */
    public AdEventListener f54535d;

    /* renamed from: e */
    public AdPreferences.Placement f54536e;

    /* renamed from: f */
    public String f54537f = null;

    /* renamed from: com.startapp.sdk.adsbase.b$a */
    /* compiled from: Sta */
    public class C12262a implements Runnable {
        public C12262a() {
        }

        public void run() {
            C12261b bVar = C12261b.this;
            try {
                new Handler(Looper.getMainLooper()).post(new C12420x0(bVar, bVar.mo46156b()));
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    public C12261b(Context context, C5041Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        this.f54532a = context;
        this.f54533b = ad;
        this.f54534c = adPreferences;
        this.f54535d = adEventListener;
        this.f54536e = placement;
    }

    /* renamed from: a */
    public AdEventListener mo46154a() {
        AdEventListener adEventListener = this.f54535d;
        this.f54535d = null;
        return adEventListener;
    }

    /* renamed from: a */
    public abstract boolean mo45700a(Object obj);

    /* renamed from: b */
    public boolean mo46156b() {
        try {
            return mo45700a(mo45704e());
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return false;
        }
    }

    /* renamed from: c */
    public void mo46157c() {
        try {
            ComponentLocator.m23305a(this.f54532a).mo21229p().execute(new C12262a());
            return;
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        C5004d4.m22887a(th);
    }

    /* renamed from: d */
    public GetAdRequest mo45237d() {
        GetAdRequest a = mo46155a(new GetAdRequest());
        if (a != null) {
            a.mo45515f(this.f54532a);
        }
        return a;
    }

    /* renamed from: e */
    public abstract Object mo45704e();

    /* renamed from: a */
    public void mo45316a(boolean z) {
        mo45701b(z);
        if (!z) {
            this.f54533b.setErrorMessage(this.f54537f);
            C5011i.m22894a(this.f54532a, mo46154a(), this.f54533b, false);
        }
    }

    /* renamed from: b */
    public void mo45701b(boolean z) {
        this.f54533b.setState(z ? C5041Ad.AdState.READY : C5041Ad.AdState.UN_INITIALIZED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r0.equals(r6.second) == false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ all -> 0x0078 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.sdk.adsbase.model.GetAdRequest mo46155a(com.startapp.sdk.adsbase.model.GetAdRequest r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f54532a
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
            com.startapp.sdk.adsbase.remoteconfig.SimpleTokenConfig r1 = r1.mo21165G()
            boolean r1 = r1.mo46418a(r0)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
            boolean r2 = r2.mo21172N()
            com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
            boolean r3 = r3.mo21180V()
            java.lang.Class<com.startapp.sdk.adsbase.SimpleTokenUtils> r4 = com.startapp.sdk.adsbase.SimpleTokenUtils.class
            monitor-enter(r4)
            android.util.Pair r5 = new android.util.Pair     // Catch:{ all -> 0x00fe }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.T1     // Catch:{ all -> 0x00fe }
            java.lang.String r7 = ""
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00fe }
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x007c
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f22251h     // Catch:{ all -> 0x0078 }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r9 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.UNDEFINED     // Catch:{ all -> 0x0078 }
            if (r1 != r9) goto L_0x006b
            boolean r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f22249f     // Catch:{ all -> 0x0078 }
            boolean r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.f22250g     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            android.util.Pair r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.m23081b((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0040
        L_0x003c:
            android.util.Pair r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.m23078a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
        L_0x0040:
            if (r3 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            boolean r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f22250g     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            com.startapp.sdk.adsbase.SimpleTokenUtils.f22250g = r1     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x004f
            goto L_0x0069
        L_0x004f:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            com.startapp.sdk.adsbase.e r0 = r0.mo21217d()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "shared_prefs_simple_token"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = r6.second     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007c
        L_0x0069:
            r5 = r6
            goto L_0x007c
        L_0x006b:
            if (r1 != r6) goto L_0x0072
            android.util.Pair r0 = com.startapp.sdk.adsbase.SimpleTokenUtils.m23078a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x0072:
            android.util.Pair r0 = com.startapp.sdk.adsbase.SimpleTokenUtils.m23081b((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            r5 = r0
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00fe }
        L_0x007c:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x00fe }
            java.lang.Object r1 = r5.first     // Catch:{ all -> 0x00fe }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r1 = (com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType) r1     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fe }
            java.lang.Object r2 = r5.second     // Catch:{ all -> 0x00fe }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)
            android.content.Context r1 = r10.f54532a     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r10.f54534c     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r3 = r10.f54536e     // Catch:{ all -> 0x00ee }
            r11.mo46028a(r1, r2, r3, r0)     // Catch:{ all -> 0x00ee }
            android.content.Context r1 = r10.f54532a     // Catch:{ all -> 0x00ee }
            r11.mo46277g(r1)     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.mo20883M()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ae
            android.content.Context r1 = r10.f54532a     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r10.f54536e     // Catch:{ all -> 0x00ee }
            boolean r1 = com.startapp.sdk.adsbase.C5055a.m23158a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ae
            r11.f54622s0 = r8     // Catch:{ all -> 0x00ee }
        L_0x00ae:
            android.content.Context r0 = r10.f54532a     // Catch:{ all -> 0x00b6 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r10.f54534c     // Catch:{ all -> 0x00b6 }
            r11.mo46692a(r0, r1)     // Catch:{ all -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x00ba:
            android.content.Context r0 = r10.f54532a     // Catch:{ all -> 0x00e9 }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r0)     // Catch:{ all -> 0x00e9 }
            com.startapp.c6 r0 = r0.mo21228o()     // Catch:{ all -> 0x00e9 }
            double r0 = r0.mo45201b()     // Catch:{ all -> 0x00e9 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00ed
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "%d"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r5
            long r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00e9 }
            r4[r7] = r0     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = java.lang.String.format(r2, r3, r4)     // Catch:{ all -> 0x00e9 }
            r11.f54607O0 = r0     // Catch:{ all -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x00ed:
            return r11
        L_0x00ee:
            r11 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r11)
            java.lang.Object r11 = r0.first
            java.lang.String r11 = (java.lang.String) r11
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r11 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.m23088a(r11)
            com.startapp.sdk.adsbase.SimpleTokenUtils.f22251h = r11
            r11 = 0
            return r11
        L_0x00fe:
            r11 = move-exception
            monitor-exit(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C12261b.mo46155a(com.startapp.sdk.adsbase.model.GetAdRequest):com.startapp.sdk.adsbase.model.GetAdRequest");
    }
}
