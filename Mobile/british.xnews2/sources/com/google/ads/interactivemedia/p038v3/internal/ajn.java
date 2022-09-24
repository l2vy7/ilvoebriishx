package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajn */
/* compiled from: IMASDK */
public final class ajn implements aiz, akp {

    /* renamed from: a */
    public static final aub<String, Integer> f15070a = m13867n();

    /* renamed from: b */
    public static final atz<Long> f15071b = atz.m14810l(6100000L, 3900000L, 2300000L, 1300000L, 600000L);

    /* renamed from: c */
    public static final atz<Long> f15072c = atz.m14810l(230000L, 159000L, 142000L, 127000L, 112000L);

    /* renamed from: d */
    public static final atz<Long> f15073d = atz.m14810l(2200000L, 1300000L, 940000L, 760000L, 520000L);

    /* renamed from: e */
    public static final atz<Long> f15074e = atz.m14810l(4400000L, 2300000L, 1500000L, 1100000L, 660000L);

    /* renamed from: f */
    public static final atz<Long> f15075f = atz.m14810l(13000000L, 9100000L, 6300000L, 4000000L, 2000000L);

    /* renamed from: g */
    private static ajn f15076g;

    /* renamed from: h */
    private final aue<Integer, Long> f15077h;

    /* renamed from: i */
    private final aix f15078i;

    /* renamed from: j */
    private final ama f15079j;

    /* renamed from: k */
    private final aks f15080k;

    /* renamed from: l */
    private final boolean f15081l;

    /* renamed from: m */
    private int f15082m;

    /* renamed from: n */
    private long f15083n;

    /* renamed from: o */
    private long f15084o;

    /* renamed from: p */
    private int f15085p;

    /* renamed from: q */
    private long f15086q;

    /* renamed from: r */
    private long f15087r;

    /* renamed from: s */
    private long f15088s;

    /* renamed from: t */
    private long f15089t;

    @Deprecated
    public ajn() {
        aue.m14836a();
        aks aks = aks.f15177a;
        throw null;
    }

    /* renamed from: d */
    public static synchronized ajn m13862d(Context context) {
        ajn ajn;
        synchronized (ajn.class) {
            if (f15076g == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                atz<Integer> b = f15070a.mo14538b(amm.m14214ad(context));
                if (b.isEmpty()) {
                    b = atz.m14810l(2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(6);
                hashMap.put(0, 1000000L);
                atz<Long> atz = f15071b;
                hashMap.put(2, atz.get(b.get(0).intValue()));
                hashMap.put(3, f15072c.get(b.get(1).intValue()));
                hashMap.put(4, f15073d.get(b.get(2).intValue()));
                hashMap.put(5, f15074e.get(b.get(3).intValue()));
                hashMap.put(9, f15075f.get(b.get(4).intValue()));
                hashMap.put(7, atz.get(b.get(0).intValue()));
                f15076g = ajq.m13887a(applicationContext, hashMap, 2000, aks.f15177a, true);
            }
            ajn = f15076g;
        }
        return ajn;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13823e(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f15085p     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r8.f15081l     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            monitor-exit(r8)
            return
        L_0x000c:
            if (r0 != r9) goto L_0x0010
            monitor-exit(r8)
            return
        L_0x0010:
            r8.f15085p = r9     // Catch:{ all -> 0x004e }
            r0 = 1
            if (r9 == r0) goto L_0x004c
            if (r9 == 0) goto L_0x004c
            r0 = 8
            if (r9 != r0) goto L_0x001c
            goto L_0x004c
        L_0x001c:
            long r0 = r8.m13865l(r9)     // Catch:{ all -> 0x004e }
            r8.f15088s = r0     // Catch:{ all -> 0x004e }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x004e }
            int r9 = r8.f15082m     // Catch:{ all -> 0x004e }
            if (r9 <= 0) goto L_0x0031
            long r2 = r8.f15083n     // Catch:{ all -> 0x004e }
            long r2 = r0 - r2
            int r9 = (int) r2     // Catch:{ all -> 0x004e }
            r3 = r9
            goto L_0x0033
        L_0x0031:
            r9 = 0
            r3 = 0
        L_0x0033:
            long r4 = r8.f15084o     // Catch:{ all -> 0x004e }
            long r6 = r8.f15088s     // Catch:{ all -> 0x004e }
            r2 = r8
            r2.m13864k(r3, r4, r6)     // Catch:{ all -> 0x004e }
            r8.f15083n = r0     // Catch:{ all -> 0x004e }
            r0 = 0
            r8.f15084o = r0     // Catch:{ all -> 0x004e }
            r8.f15087r = r0     // Catch:{ all -> 0x004e }
            r8.f15086q = r0     // Catch:{ all -> 0x004e }
            com.google.ads.interactivemedia.v3.internal.ama r9 = r8.f15079j     // Catch:{ all -> 0x004e }
            r9.mo13980a()     // Catch:{ all -> 0x004e }
            monitor-exit(r8)
            return
        L_0x004c:
            monitor-exit(r8)
            return
        L_0x004e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.ajn.mo13823e(int):void");
    }

    /* renamed from: k */
    private final void m13864k(int i, long j, long j2) {
        int i2;
        if (i != 0) {
            i2 = i;
        } else if (j != 0 || j2 != this.f15089t) {
            i2 = 0;
        } else {
            return;
        }
        this.f15089t = j2;
        this.f15078i.mo13791c(i2, j, j2);
    }

    /* renamed from: l */
    private final long m13865l(int i) {
        Long l = this.f15077h.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f15077h.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: m */
    private static boolean m13866m(ajk ajk, boolean z) {
        return z && !ajk.mo13812b(8);
    }

    /* renamed from: n */
    private static aub<String, Integer> m13867n() {
        aua a = aub.m14829a();
        a.mo14537c("AD", 1, 2, 0, 0, 2);
        a.mo14537c("AE", 1, 4, 4, 4, 2);
        a.mo14537c("AF", 4, 4, 4, 4, 2);
        a.mo14537c("AG", 4, 2, 1, 4, 2);
        a.mo14537c("AI", 1, 2, 2, 2, 2);
        a.mo14537c("AL", 1, 1, 1, 1, 2);
        a.mo14537c("AM", 2, 2, 1, 3, 2);
        a.mo14537c("AO", 3, 4, 3, 1, 2);
        a.mo14537c("AR", 2, 4, 2, 1, 2);
        a.mo14537c("AS", 2, 2, 3, 3, 2);
        a.mo14537c("AT", 0, 2, 0, 0, 0);
        a.mo14537c("AU", 0, 2, 0, 1, 1);
        a.mo14537c("AW", 1, 2, 0, 4, 2);
        a.mo14537c("AX", 0, 2, 2, 2, 2);
        a.mo14537c("AZ", 3, 3, 3, 4, 2);
        a.mo14537c("BA", 1, 1, 0, 1, 2);
        a.mo14537c("BB", 0, 2, 0, 0, 2);
        a.mo14537c("BD", 2, 0, 3, 3, 2);
        a.mo14537c("BE", 0, 0, 2, 3, 2);
        a.mo14537c("BF", 4, 4, 4, 2, 2);
        a.mo14537c("BG", 0, 1, 0, 0, 2);
        a.mo14537c("BH", 1, 0, 2, 4, 3);
        a.mo14537c("BI", 4, 4, 4, 4, 2);
        a.mo14537c("BJ", 4, 4, 4, 4, 2);
        a.mo14537c("BL", 1, 2, 2, 2, 2);
        a.mo14537c("BM", 0, 2, 0, 0, 2);
        a.mo14537c("BN", 3, 2, 1, 0, 2);
        a.mo14537c("BO", 1, 2, 4, 2, 2);
        a.mo14537c("BQ", 1, 2, 1, 3, 2);
        a.mo14537c("BR", 2, 4, 2, 2, 3);
        a.mo14537c("BS", 2, 2, 1, 3, 2);
        a.mo14537c("BT", 3, 0, 3, 2, 2);
        a.mo14537c("BW", 3, 4, 1, 1, 2);
        a.mo14537c("BY", 1, 1, 1, 2, 2);
        a.mo14537c("BZ", 2, 2, 2, 2, 2);
        a.mo14537c("CA", 0, 3, 1, 2, 4);
        a.mo14537c("CD", 4, 3, 2, 1, 2);
        a.mo14537c("CF", 4, 2, 3, 2, 2);
        a.mo14537c("CG", 3, 4, 2, 2, 2);
        a.mo14537c("CH", 0, 0, 0, 0, 2);
        a.mo14537c("CI", 3, 3, 3, 3, 2);
        a.mo14537c("CK", 2, 2, 3, 0, 2);
        a.mo14537c("CL", 1, 1, 2, 2, 2);
        a.mo14537c("CM", 3, 4, 3, 3, 2);
        a.mo14537c("CN", 2, 2, 2, 1, 4);
        a.mo14537c("CO", 2, 3, 4, 2, 2);
        a.mo14537c("CR", 2, 3, 4, 4, 2);
        a.mo14537c("CU", 4, 4, 2, 2, 2);
        a.mo14537c("CV", 2, 3, 1, 0, 2);
        a.mo14537c("CW", 1, 2, 0, 0, 2);
        a.mo14537c("CY", 1, 1, 0, 0, 2);
        a.mo14537c("CZ", 0, 1, 0, 0, 1);
        a.mo14537c("DE", 0, 0, 1, 1, 0);
        a.mo14537c("DJ", 4, 0, 4, 4, 2);
        a.mo14537c("DK", 0, 0, 1, 0, 0);
        a.mo14537c("DM", 1, 2, 2, 2, 2);
        a.mo14537c("DO", 3, 4, 4, 4, 2);
        a.mo14537c("DZ", 3, 3, 4, 4, 2);
        a.mo14537c("EC", 2, 4, 3, 2, 2);
        a.mo14537c("EE", 0, 1, 0, 0, 2);
        a.mo14537c("EG", 3, 4, 3, 3, 2);
        a.mo14537c("EH", 2, 2, 2, 2, 2);
        a.mo14537c("ER", 4, 2, 2, 2, 2);
        a.mo14537c("ES", 0, 1, 1, 1, 2);
        a.mo14537c("ET", 4, 4, 4, 1, 2);
        a.mo14537c("FI", 0, 0, 0, 0, 0);
        a.mo14537c("FJ", 3, 0, 2, 2, 2);
        a.mo14537c("FK", 4, 2, 2, 2, 2);
        a.mo14537c("FM", 3, 2, 4, 4, 2);
        a.mo14537c("FO", 1, 2, 0, 1, 2);
        a.mo14537c("FR", 1, 1, 2, 0, 1);
        a.mo14537c("GA", 3, 4, 1, 1, 2);
        a.mo14537c("GB", 0, 0, 1, 1, 1);
        a.mo14537c("GD", 1, 2, 2, 2, 2);
        a.mo14537c("GE", 1, 1, 1, 3, 2);
        a.mo14537c("GF", 2, 2, 2, 3, 2);
        a.mo14537c("GG", 1, 2, 0, 0, 2);
        a.mo14537c("GH", 3, 1, 3, 2, 2);
        a.mo14537c("GI", 0, 2, 2, 0, 2);
        a.mo14537c("GL", 1, 2, 0, 0, 2);
        a.mo14537c("GM", 4, 3, 2, 4, 2);
        a.mo14537c("GN", 3, 3, 4, 2, 2);
        a.mo14537c("GP", 2, 1, 2, 3, 2);
        a.mo14537c("GQ", 4, 2, 2, 4, 2);
        a.mo14537c("GR", 1, 2, 0, 1, 2);
        a.mo14537c("GT", 3, 2, 2, 1, 2);
        a.mo14537c("GU", 1, 2, 3, 4, 2);
        a.mo14537c("GW", 4, 4, 4, 4, 2);
        a.mo14537c("GY", 3, 3, 3, 4, 2);
        a.mo14537c("HK", 0, 1, 2, 3, 2);
        a.mo14537c("HN", 3, 1, 3, 3, 2);
        a.mo14537c("HR", 1, 1, 0, 0, 3);
        a.mo14537c("HT", 4, 4, 4, 4, 2);
        a.mo14537c("HU", 0, 0, 0, 0, 1);
        a.mo14537c("ID", 3, 2, 3, 3, 2);
        a.mo14537c("IE", 0, 0, 1, 1, 3);
        a.mo14537c("IL", 1, 0, 2, 3, 4);
        a.mo14537c("IM", 0, 2, 0, 1, 2);
        a.mo14537c("IN", 2, 1, 3, 3, 2);
        a.mo14537c("IO", 4, 2, 2, 4, 2);
        a.mo14537c("IQ", 3, 3, 4, 4, 2);
        a.mo14537c("IR", 3, 2, 3, 2, 2);
        a.mo14537c(IronSourceConstants.INTERSTITIAL_EVENT_TYPE, 0, 2, 0, 0, 2);
        a.mo14537c("IT", 0, 4, 1, 1, 2);
        a.mo14537c("JE", 2, 2, 1, 2, 2);
        a.mo14537c("JM", 3, 3, 4, 4, 2);
        a.mo14537c("JO", 2, 2, 1, 1, 2);
        a.mo14537c("JP", 0, 0, 0, 0, 3);
        a.mo14537c("KE", 3, 4, 2, 2, 2);
        a.mo14537c(ExpandedProductParsedResult.KILOGRAM, 2, 0, 1, 1, 2);
        a.mo14537c("KH", 1, 0, 4, 3, 2);
        a.mo14537c("KI", 4, 2, 4, 3, 2);
        a.mo14537c("KM", 4, 3, 3, 3, 2);
        a.mo14537c("KN", 1, 2, 2, 2, 2);
        a.mo14537c("KP", 4, 2, 2, 2, 2);
        a.mo14537c("KR", 0, 0, 1, 3, 1);
        a.mo14537c("KW", 1, 3, 0, 0, 0);
        a.mo14537c("KY", 1, 2, 0, 2, 2);
        a.mo14537c("KZ", 2, 2, 2, 3, 2);
        a.mo14537c("LA", 2, 2, 1, 1, 2);
        a.mo14537c(ExpandedProductParsedResult.POUND, 3, 2, 0, 0, 2);
        a.mo14537c("LC", 1, 2, 0, 1, 2);
        a.mo14537c("LI", 0, 2, 2, 2, 2);
        a.mo14537c("LK", 2, 0, 2, 3, 2);
        a.mo14537c("LR", 3, 4, 4, 3, 2);
        a.mo14537c("LS", 3, 3, 2, 3, 2);
        a.mo14537c("LT", 0, 0, 0, 0, 2);
        a.mo14537c("LU", 1, 0, 1, 1, 2);
        a.mo14537c("LV", 0, 0, 0, 0, 2);
        a.mo14537c("LY", 4, 2, 4, 4, 2);
        a.mo14537c(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 3, 2, 2, 1, 2);
        a.mo14537c("MC", 0, 2, 0, 0, 2);
        a.mo14537c("MD", 1, 2, 0, 0, 2);
        a.mo14537c("ME", 1, 2, 0, 1, 2);
        a.mo14537c("MF", 1, 2, 1, 1, 2);
        a.mo14537c("MG", 3, 4, 2, 2, 2);
        a.mo14537c("MH", 4, 2, 2, 4, 2);
        a.mo14537c("MK", 1, 1, 0, 0, 2);
        a.mo14537c("ML", 4, 4, 2, 2, 2);
        a.mo14537c("MM", 2, 3, 3, 3, 2);
        a.mo14537c("MN", 2, 4, 1, 2, 2);
        a.mo14537c("MO", 0, 2, 4, 4, 2);
        a.mo14537c("MP", 0, 2, 2, 2, 2);
        a.mo14537c("MQ", 2, 2, 2, 3, 2);
        a.mo14537c("MR", 3, 0, 4, 3, 2);
        a.mo14537c("MS", 1, 2, 2, 2, 2);
        a.mo14537c("MT", 0, 2, 0, 0, 2);
        a.mo14537c("MU", 3, 1, 1, 2, 2);
        a.mo14537c("MV", 4, 3, 3, 4, 2);
        a.mo14537c("MW", 4, 2, 1, 0, 2);
        a.mo14537c("MX", 2, 4, 3, 4, 2);
        a.mo14537c("MY", 1, 0, 3, 2, 2);
        a.mo14537c("MZ", 3, 3, 2, 1, 2);
        a.mo14537c("NA", 4, 3, 3, 2, 2);
        a.mo14537c("NC", 2, 0, 3, 4, 2);
        a.mo14537c("NE", 4, 4, 4, 4, 2);
        a.mo14537c("NF", 2, 2, 2, 2, 2);
        a.mo14537c("NG", 3, 3, 2, 2, 2);
        a.mo14537c("NI", 2, 1, 4, 4, 2);
        a.mo14537c("NL", 0, 2, 3, 2, 0);
        a.mo14537c("NO", 0, 1, 2, 0, 0);
        a.mo14537c("NP", 2, 0, 4, 2, 2);
        a.mo14537c("NR", 3, 2, 2, 1, 2);
        a.mo14537c("NU", 4, 2, 2, 2, 2);
        a.mo14537c("NZ", 0, 2, 1, 2, 4);
        a.mo14537c("OM", 2, 2, 1, 3, 2);
        a.mo14537c("PA", 1, 3, 3, 3, 2);
        a.mo14537c("PE", 2, 3, 4, 4, 2);
        a.mo14537c("PF", 2, 2, 2, 1, 2);
        a.mo14537c(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 4, 3, 2, 2);
        a.mo14537c("PH", 2, 1, 3, 3, 4);
        a.mo14537c("PK", 3, 2, 3, 3, 2);
        a.mo14537c("PL", 1, 0, 1, 2, 3);
        a.mo14537c("PM", 0, 2, 2, 2, 2);
        a.mo14537c("PR", 2, 1, 2, 2, 4);
        a.mo14537c("PS", 3, 3, 2, 2, 2);
        a.mo14537c("PT", 0, 1, 1, 0, 2);
        a.mo14537c("PW", 1, 2, 4, 0, 2);
        a.mo14537c("PY", 2, 0, 3, 2, 2);
        a.mo14537c("QA", 2, 3, 1, 2, 3);
        a.mo14537c("RE", 1, 0, 2, 2, 2);
        a.mo14537c("RO", 0, 1, 0, 1, 1);
        a.mo14537c("RS", 1, 2, 0, 0, 2);
        a.mo14537c("RU", 0, 1, 0, 1, 2);
        a.mo14537c("RW", 3, 3, 4, 1, 2);
        a.mo14537c("SA", 2, 2, 2, 1, 2);
        a.mo14537c("SB", 4, 2, 3, 2, 2);
        a.mo14537c("SC", 4, 1, 1, 3, 2);
        a.mo14537c("SD", 4, 4, 4, 4, 2);
        a.mo14537c("SE", 0, 0, 0, 0, 0);
        a.mo14537c("SG", 1, 0, 1, 2, 3);
        a.mo14537c("SH", 4, 2, 2, 2, 2);
        a.mo14537c("SI", 0, 0, 0, 0, 2);
        a.mo14537c("SJ", 2, 2, 2, 2, 2);
        a.mo14537c("SK", 0, 1, 0, 0, 2);
        a.mo14537c("SL", 4, 3, 4, 0, 2);
        a.mo14537c("SM", 0, 2, 2, 2, 2);
        a.mo14537c("SN", 4, 4, 4, 4, 2);
        a.mo14537c("SO", 3, 3, 3, 4, 2);
        a.mo14537c("SR", 3, 2, 2, 2, 2);
        a.mo14537c("SS", 4, 4, 3, 3, 2);
        a.mo14537c("ST", 2, 2, 1, 2, 2);
        a.mo14537c("SV", 2, 1, 4, 3, 2);
        a.mo14537c("SX", 2, 2, 1, 0, 2);
        a.mo14537c("SY", 4, 3, 3, 2, 2);
        a.mo14537c("SZ", 4, 3, 2, 4, 2);
        a.mo14537c("TC", 2, 2, 2, 0, 2);
        a.mo14537c("TD", 4, 3, 4, 4, 2);
        a.mo14537c("TG", 3, 2, 2, 4, 2);
        a.mo14537c("TH", 0, 3, 2, 3, 2);
        a.mo14537c("TJ", 4, 4, 4, 4, 2);
        a.mo14537c("TL", 4, 0, 4, 4, 2);
        a.mo14537c("TM", 4, 2, 4, 3, 2);
        a.mo14537c("TN", 2, 2, 1, 2, 2);
        a.mo14537c("TO", 3, 2, 4, 3, 2);
        a.mo14537c("TR", 1, 2, 0, 1, 2);
        a.mo14537c("TT", 1, 4, 0, 1, 2);
        a.mo14537c("TV", 3, 2, 2, 4, 2);
        a.mo14537c("TW", 0, 0, 0, 0, 1);
        a.mo14537c("TZ", 3, 3, 3, 2, 2);
        a.mo14537c("UA", 0, 3, 1, 1, 2);
        a.mo14537c("UG", 3, 2, 3, 3, 2);
        a.mo14537c("US", 1, 1, 2, 2, 4);
        a.mo14537c("UY", 2, 1, 1, 1, 2);
        a.mo14537c("UZ", 2, 1, 3, 4, 2);
        a.mo14537c("VC", 1, 2, 2, 2, 2);
        a.mo14537c("VE", 4, 4, 4, 4, 2);
        a.mo14537c("VG", 2, 2, 1, 1, 2);
        a.mo14537c("VI", 1, 2, 1, 2, 2);
        a.mo14537c("VN", 0, 1, 3, 4, 2);
        a.mo14537c("VU", 4, 0, 3, 1, 2);
        a.mo14537c("WF", 4, 2, 2, 2, 2);
        a.mo14537c("WS", 3, 1, 3, 1, 2);
        a.mo14537c("XK", 0, 1, 1, 1, 2);
        a.mo14537c("YE", 4, 4, 4, 3, 2);
        a.mo14537c("YT", 4, 2, 2, 3, 2);
        a.mo14537c("ZA", 3, 3, 2, 1, 2);
        a.mo14537c("ZM", 3, 2, 3, 3, 2);
        a.mo14537c("ZW", 3, 2, 4, 3, 2);
        return a.mo14535a();
    }

    /* renamed from: a */
    public final synchronized long mo13793a() {
        return this.f15088s;
    }

    /* renamed from: b */
    public final void mo13794b(Handler handler, aiy aiy) {
        this.f15078i.mo13789a(handler, aiy);
    }

    /* renamed from: c */
    public final void mo13795c(aiy aiy) {
        this.f15078i.mo13790b(aiy);
    }

    /* renamed from: f */
    public final synchronized void mo13824f(ajk ajk, boolean z, int i) {
        if (m13866m(ajk, z)) {
            this.f15084o += (long) i;
        }
    }

    /* renamed from: g */
    public final synchronized void mo13825g(ajk ajk, boolean z) {
        if (m13866m(ajk, z)) {
            aup.m14887r(this.f15082m > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.f15083n);
            this.f15086q += (long) i;
            long j = this.f15087r;
            long j2 = this.f15084o;
            this.f15087r = j + j2;
            if (i > 0) {
                this.f15079j.mo13981b((int) Math.sqrt((double) j2), (((float) j2) * 8000.0f) / ((float) i));
                if (this.f15086q >= SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS || this.f15087r >= 524288) {
                    this.f15088s = (long) this.f15079j.mo13982c();
                }
                m13864k(i, this.f15084o, this.f15088s);
                this.f15083n = elapsedRealtime;
                this.f15084o = 0;
            }
            this.f15082m--;
        }
    }

    /* renamed from: h */
    public final void mo13826h() {
    }

    /* renamed from: i */
    public final synchronized void mo13827i(ajk ajk, boolean z) {
        if (m13866m(ajk, z)) {
            if (this.f15082m == 0) {
                this.f15083n = SystemClock.elapsedRealtime();
            }
            this.f15082m++;
        }
    }

    /* synthetic */ ajn(Context context, Map map, int i, aks aks, boolean z) {
        this.f15077h = aue.m14838c(map);
        this.f15078i = new aix();
        this.f15079j = new ama(2000);
        this.f15080k = aks;
        this.f15081l = true;
        if (context != null) {
            alu a = alu.m14054a(context);
            int c = a.mo13918c();
            this.f15085p = c;
            this.f15088s = m13865l(c);
            a.mo13917b(new ajm(this));
            return;
        }
        this.f15085p = 0;
        this.f15088s = m13865l(0);
    }
}
