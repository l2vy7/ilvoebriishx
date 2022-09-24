package com.startapp;

import android.util.Pair;
import com.ironsource.sdk.p289c.C11539d;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Map;

/* renamed from: com.startapp.m4 */
/* compiled from: Sta */
public class C12045m4 extends C12403w0 {

    /* renamed from: h0 */
    public final C5004d4 f53264h0;

    /* renamed from: i0 */
    public String f53265i0;

    /* renamed from: j0 */
    public String f53266j0;

    /* renamed from: k0 */
    public String f53267k0;

    /* renamed from: l0 */
    public String f53268l0;

    /* renamed from: m0 */
    public String f53269m0;

    /* renamed from: n0 */
    public String f53270n0;

    /* renamed from: o0 */
    public String f53271o0;

    /* renamed from: p0 */
    public Map<String, String> f53272p0;

    public C12045m4(C5004d4 d4Var) {
        super(8);
        this.f53264h0 = d4Var;
    }

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        super.mo45384a(g8Var);
        C5004d4 d4Var = this.f53264h0;
        Long l = d4Var.f22130h;
        String l2 = l != null ? l.toString() : C11760a.m51982a();
        g8Var.mo45382a(C11760a.f52513b, (Object) l2, true, true);
        g8Var.mo45382a(C11760a.f52514c, (Object) C11760a.m51983a(l2), true, true);
        g8Var.mo45382a("category", (Object) d4Var.f22123a.f52899a, true, true);
        g8Var.mo45382a("value", (Object) d4Var.f22126d, false, true);
        g8Var.mo45382a(C11539d.f51879a, (Object) d4Var.f22129g, false, true);
        g8Var.mo45382a("appActivity", (Object) d4Var.f22131i, false, true);
        g8Var.mo45382a("details", (Object) d4Var.f22127e, false, true);
        g8Var.mo45382a("details_json", d4Var.f22128f, false, true);
        g8Var.mo45382a("isService", (Object) Boolean.valueOf(d4Var.f22132j), false, true);
        g8Var.mo45382a(AdUnitActivity.EXTRA_ORIENTATION, (Object) this.f53265i0, false, true);
        g8Var.mo45382a("usedRam", (Object) this.f53266j0, false, true);
        g8Var.mo45382a("freeRam", (Object) this.f53267k0, false, true);
        g8Var.mo45382a("sessionTime", (Object) null, false, true);
        g8Var.mo45382a("cellScanRes", (Object) this.f53268l0, false, true);
        g8Var.mo45382a("sens", (Object) this.f53269m0, false, true);
        g8Var.mo45382a("bt", (Object) this.f53270n0, false, true);
        g8Var.mo45382a("packagingType", (Object) this.f53271o0, false, true);
        Pair<String, String> a = SimpleTokenUtils.m23077a();
        Pair<String, String> b = SimpleTokenUtils.m23080b();
        g8Var.mo45382a((String) a.first, a.second, false, true);
        g8Var.mo45382a((String) b.first, b.second, false, true);
        Map<String, String> map = this.f53272p0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                g8Var.mo45382a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        g8Var.mo45382a("rcd", (Object) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[Catch:{ all -> 0x0064 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45533b(android.content.Context r9, com.startapp.sdk.adsbase.model.AdPreferences r10) {
        /*
            r8 = this;
            super.mo45533b(r9, r10)
            android.content.res.Resources r10 = r9.getResources()
            r0 = 1
            if (r10 == 0) goto L_0x001d
            android.content.res.Configuration r10 = r10.getConfiguration()
            if (r10 == 0) goto L_0x001d
            int r10 = r10.orientation
            r1 = 2
            if (r10 != r1) goto L_0x0018
            java.lang.String r10 = "landscape"
            goto L_0x001f
        L_0x0018:
            if (r10 != r0) goto L_0x001d
            java.lang.String r10 = "portrait"
            goto L_0x001f
        L_0x001d:
            java.lang.String r10 = "undefined"
        L_0x001f:
            r8.f53265i0 = r10
            r10 = 0
            java.lang.String[] r1 = new java.lang.String[]{r10, r10}
            r2 = 0
            java.lang.String r3 = "activity"
            java.lang.Object r9 = r9.getSystemService(r3)     // Catch:{ all -> 0x0064 }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0079
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x0064 }
            r3.<init>()     // Catch:{ all -> 0x0064 }
            r9.getMemoryInfo(r3)     // Catch:{ all -> 0x0064 }
            long r4 = r3.availMem     // Catch:{ all -> 0x0064 }
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 / r6
            java.lang.String r9 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0064 }
            r1[r2] = r9     // Catch:{ all -> 0x0064 }
            int r9 = com.startapp.C12437y.f55146a     // Catch:{ all -> 0x0064 }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0064 }
            r4 = 16
            if (r9 < r4) goto L_0x0053
            long r9 = r3.totalMem     // Catch:{ all -> 0x0064 }
            java.lang.Long r10 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0064 }
        L_0x0053:
            if (r10 == 0) goto L_0x0079
            long r9 = r10.longValue()     // Catch:{ all -> 0x0064 }
            long r3 = r3.availMem     // Catch:{ all -> 0x0064 }
            long r9 = r9 - r3
            long r9 = r9 / r6
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x0064 }
            r1[r0] = r9     // Catch:{ all -> 0x0064 }
            goto L_0x0079
        L_0x0064:
            r9 = move-exception
            java.lang.Class<java.lang.SecurityException> r10 = java.lang.SecurityException.class
            boolean r10 = com.startapp.C5015nb.m22923a((java.lang.Throwable) r9, (java.lang.Class<? extends java.lang.Throwable>) r10)
            if (r10 != 0) goto L_0x0079
            java.lang.Class<android.os.RemoteException> r10 = android.os.RemoteException.class
            boolean r10 = com.startapp.C5015nb.m22923a((java.lang.Throwable) r9, (java.lang.Class<? extends java.lang.Throwable>) r10)
            if (r10 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r9)
        L_0x0079:
            r9 = r1[r2]
            r8.f53267k0 = r9
            r9 = r1[r0]
            r8.f53266j0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12045m4.mo45533b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public String toString() {
        return this.f53264h0.toString();
    }
}
