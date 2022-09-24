package com.startapp;

import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.adsbase.C12261b;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.s0 */
/* compiled from: Sta */
public abstract class C12173s0 extends C12261b {

    /* renamed from: g */
    public int f54124g = 0;

    /* renamed from: h */
    public Set<String> f54125h = new HashSet();

    public C12173s0(Context context, C5041Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement);
    }

    /* renamed from: a */
    public abstract void mo45236a(C5041Ad ad);

    /* renamed from: a */
    public boolean mo45700a(Object obj) {
        int i;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z = false;
        if (obj == null) {
            this.f54537f = "Empty Response";
            return false;
        } else if (!getAdResponse.mo46100b()) {
            this.f54537f = getAdResponse.mo46099a();
            return false;
        } else {
            JsonAd jsonAd = (JsonAd) this.f54533b;
            List<AdDetails> a = C11839d0.m52129a(this.f54532a, getAdResponse.mo46279d(), this.f54124g, this.f54125h, true);
            jsonAd.mo46102a(a);
            jsonAd.setAdInfoOverride(getAdResponse.mo46278c());
            if (getAdResponse.mo46279d() != null && getAdResponse.mo46279d().size() > 0) {
                z = true;
            }
            if (!z) {
                this.f54537f = "Empty Response";
            } else if (((ArrayList) a).size() == 0 && (i = this.f54124g) == 0) {
                this.f54124g = i + 1;
                return mo46156b();
            }
            return z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7 A[SYNTHETIC, Splitter:B:42:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo45704e() {
        /*
            r13 = this;
            java.lang.String r0 = "GET"
            com.startapp.sdk.adsbase.model.GetAdRequest r1 = r13.mo45237d()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set<java.lang.String> r3 = r13.f54125h
            int r3 = r3.size()
            if (r3 != 0) goto L_0x001d
            java.util.Set<java.lang.String> r3 = r13.f54125h
            android.content.Context r4 = r13.f54532a
            java.lang.String r4 = r4.getPackageName()
            r3.add(r4)
        L_0x001d:
            int r3 = r13.f54124g
            r4 = 0
            if (r3 <= 0) goto L_0x0024
            r1.f54598F0 = r4
        L_0x0024:
            java.util.Set<java.lang.String> r5 = r13.f54125h
            r1.f54594B0 = r5
            if (r3 != 0) goto L_0x002b
            r4 = 1
        L_0x002b:
            r1.f54598F0 = r4
            android.content.Context r3 = r13.f54532a
            com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r3)
            com.startapp.u3 r3 = r3.mo21224k()
            com.startapp.sdk.adsbase.AdsConstants$AdApiType r4 = com.startapp.sdk.adsbase.AdsConstants.AdApiType.JSON
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r5 = r13.f54536e
            java.lang.String r4 = com.startapp.sdk.adsbase.AdsConstants.m53135a(r4, r5)
            r3.getClass()
            java.lang.Class<com.startapp.sdk.adsbase.model.GetAdResponse> r5 = com.startapp.sdk.adsbase.model.GetAdResponse.class
            java.util.Map r6 = r3.mo46649a()     // Catch:{ all -> 0x00a0 }
            com.startapp.w6 r7 = new com.startapp.w6     // Catch:{ SDKException -> 0x009b }
            r7.<init>()     // Catch:{ SDKException -> 0x009b }
            r1.mo45384a(r7)     // Catch:{ SDKException -> 0x009b }
            java.lang.String r1 = r7.toString()     // Catch:{ SDKException -> 0x009b }
            java.lang.String r1 = com.startapp.C12359u3.m53528a(r4, r1)     // Catch:{ SDKException -> 0x009b }
            com.startapp.lb r4 = r3.f54809b     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = r4.f53254a     // Catch:{ all -> 0x00a0 }
            com.startapp.v3 r7 = r3.mo46650b()     // Catch:{ all -> 0x00a0 }
            boolean r7 = r7.f54873a     // Catch:{ all -> 0x00a0 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a0 }
            long r10 = com.startapp.C5015nb.m22900a()     // Catch:{ all -> 0x00a0 }
            com.startapp.a7 r3 = r3.f54811d     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0074
            com.startapp.h7 r12 = new com.startapp.h7     // Catch:{ all -> 0x00a0 }
            r12.<init>(r3)     // Catch:{ all -> 0x00a0 }
            goto L_0x0075
        L_0x0074:
            r12 = r2
        L_0x0075:
            com.startapp.i7$a r3 = com.startapp.C11963i7.m52453a(r1, r6, r4, r7)     // Catch:{ SDKException -> 0x0089 }
            if (r12 == 0) goto L_0x007e
            r12.mo45406a(r0, r1, r2)     // Catch:{ SDKException -> 0x0089 }
        L_0x007e:
            r3.f53102d = r8     // Catch:{ SDKException -> 0x0089 }
            r3.f53103e = r10     // Catch:{ SDKException -> 0x0089 }
            long r6 = com.startapp.C5015nb.m22900a()     // Catch:{ SDKException -> 0x0089 }
            r3.f53104f = r6     // Catch:{ SDKException -> 0x0089 }
            goto L_0x00a5
        L_0x0089:
            r3 = move-exception
            if (r12 == 0) goto L_0x008f
            r12.mo45406a(r0, r1, r3)     // Catch:{ all -> 0x00a0 }
        L_0x008f:
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0096 }
            r13.f54537f = r0     // Catch:{ all -> 0x0096 }
            goto L_0x00a4
        L_0x0096:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x009b:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x00a4:
            r3 = r2
        L_0x00a5:
            if (r3 == 0) goto L_0x00b2
            java.lang.String r0 = r3.f53099a     // Catch:{ all -> 0x00ae }
            java.lang.Object r2 = com.startapp.C5015nb.m22902a((java.lang.String) r0, r5)     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12173s0.mo45704e():java.lang.Object");
    }

    /* renamed from: a */
    public void mo45316a(boolean z) {
        super.mo45316a(z);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f54533b.hashCode());
        intent.putExtra("adResult", z);
        C5116u5.m23368a(this.f54532a).mo21244a(intent);
        if (z) {
            mo45236a((C5041Ad) (JsonAd) this.f54533b);
            C5011i.m22895b(this.f54532a, mo46154a(), this.f54533b, false);
        }
    }
}
