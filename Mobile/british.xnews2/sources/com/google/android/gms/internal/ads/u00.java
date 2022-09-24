package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u00 {

    /* renamed from: a */
    final BlockingQueue<e10> f20905a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    final LinkedHashMap<String, String> f20906b = new LinkedHashMap<>();

    /* renamed from: c */
    final Map<String, a10> f20907c = new HashMap();

    /* renamed from: d */
    String f20908d;

    /* renamed from: e */
    Context f20909e;

    /* renamed from: f */
    String f20910f;

    /* renamed from: g */
    private final HashSet<String> f20911g = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h */
    private AtomicBoolean f20912h;

    /* renamed from: i */
    private File f20913i;

    /* renamed from: c */
    public static /* synthetic */ void m21067c(u00 u00) {
        while (true) {
            try {
                e10 take = u00.f20905a.take();
                d10 a = take.mo18240a();
                if (!TextUtils.isEmpty(a.mo31063b())) {
                    u00.m21068g(u00.mo18866b(u00.f20906b, take.mo18241b()), a);
                }
            } catch (InterruptedException e) {
                co0.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC, Splitter:B:38:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2 A[SYNTHETIC, Splitter:B:44:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21068g(java.util.Map<java.lang.String, java.lang.String> r5, com.google.android.gms.internal.ads.d10 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f20908d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.mo31063b()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.mo31063b()
            r1.append(r5)
        L_0x0055:
            java.lang.String r5 = r6.mo31062a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.mo31062a()
            r1.append(r5)
        L_0x006b:
            java.lang.String r5 = r1.toString()
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f20912h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c1
            java.io.File r6 = r4.f20913i
            if (r6 == 0) goto L_0x00bb
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x009f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x009f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
            return
        L_0x0092:
            r5 = move-exception
            com.google.android.gms.internal.ads.co0.zzk(r0, r5)
            return
        L_0x0097:
            r5 = move-exception
            r1 = r2
            goto L_0x00b0
        L_0x009a:
            r5 = move-exception
            r1 = r2
            goto L_0x00a0
        L_0x009d:
            r5 = move-exception
            goto L_0x00b0
        L_0x009f:
            r5 = move-exception
        L_0x00a0:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.co0.zzk(r6, r5)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x00af
            r1.close()     // Catch:{ IOException -> 0x00ab }
            return
        L_0x00ab:
            r5 = move-exception
            com.google.android.gms.internal.ads.co0.zzk(r0, r5)
        L_0x00af:
            return
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r6 = move-exception
            com.google.android.gms.internal.ads.co0.zzk(r0, r6)
        L_0x00ba:
            throw r5
        L_0x00bb:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.co0.zzj(r5)
            return
        L_0x00c1:
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r6 = r4.f20909e
            java.lang.String r0 = r4.f20910f
            com.google.android.gms.ads.internal.util.zzt.zzO(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u00.m21068g(java.util.Map, com.google.android.gms.internal.ads.d10):void");
    }

    /* renamed from: a */
    public final a10 mo18865a(String str) {
        a10 a10 = this.f20907c.get(str);
        return a10 != null ? a10 : a10.f29490a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<String, String> mo18866b(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo18865a(str).mo30285a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void mo18867d(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f20909e = context;
        this.f20910f = str;
        this.f20908d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20912h = atomicBoolean;
        atomicBoolean.set(a20.f29502c.mo34648e().booleanValue());
        if (this.f20912h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f20913i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f20906b.put((String) next.getKey(), (String) next.getValue());
        }
        po0.f37722a.execute(new t00(this));
        Map<String, a10> map2 = this.f20907c;
        a10 a10 = a10.f29491b;
        map2.put("action", a10);
        this.f20907c.put("ad_format", a10);
        this.f20907c.put("e", a10.f29492c);
    }

    /* renamed from: e */
    public final void mo18868e(String str) {
        if (!this.f20911g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f20910f);
            linkedHashMap.put("ue", str);
            m21068g(mo18866b(this.f20906b, linkedHashMap), (d10) null);
        }
    }

    /* renamed from: f */
    public final boolean mo18869f(e10 e10) {
        return this.f20905a.offer(e10);
    }
}
