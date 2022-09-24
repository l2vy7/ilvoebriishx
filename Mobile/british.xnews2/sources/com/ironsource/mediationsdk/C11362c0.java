package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.environment.C4984k;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C11232E;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C11493i;
import com.ironsource.mediationsdk.utils.C11495k;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p055c.C4947b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.mediationsdk.c0 */
final class C11362c0 implements C4984k {

    /* renamed from: B */
    private static C11362c0 f51005B;

    /* renamed from: A */
    private C11367d f51006A = new C11363a();

    /* renamed from: a */
    C11305ac f51007a;

    /* renamed from: b */
    private final String f51008b = "appKey";

    /* renamed from: c */
    private final String f51009c = C11362c0.class.getSimpleName();

    /* renamed from: d */
    int f51010d;

    /* renamed from: e */
    int f51011e;

    /* renamed from: f */
    int f51012f;

    /* renamed from: g */
    int f51013g;

    /* renamed from: h */
    int f51014h;

    /* renamed from: i */
    boolean f51015i;

    /* renamed from: j */
    boolean f51016j = false;

    /* renamed from: k */
    private HandlerThread f51017k = null;

    /* renamed from: l */
    Handler f51018l;

    /* renamed from: m */
    private boolean f51019m = false;

    /* renamed from: n */
    private AtomicBoolean f51020n;

    /* renamed from: o */
    private NetworkStateReceiver f51021o;

    /* renamed from: p */
    CountDownTimer f51022p;

    /* renamed from: q */
    List<C11493i> f51023q = new ArrayList();

    /* renamed from: r */
    String f51024r;

    /* renamed from: s */
    String f51025s;

    /* renamed from: t */
    C11495k f51026t;

    /* renamed from: u */
    private C11366c f51027u = C11366c.NOT_INIT;

    /* renamed from: v */
    String f51028v;

    /* renamed from: w */
    SegmentListener f51029w;

    /* renamed from: x */
    boolean f51030x;

    /* renamed from: y */
    long f51031y;

    /* renamed from: z */
    C4947b f51032z;

    /* renamed from: com.ironsource.mediationsdk.c0$a */
    class C11363a extends C11367d {
        C11363a() {
            super();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:116:0x033d, code lost:
            if (r0.f51011e == r0.f51014h) goto L_0x033f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x02f0 A[Catch:{ Exception -> 0x0387 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052 A[Catch:{ Exception -> 0x0387 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0059 A[Catch:{ Exception -> 0x0387 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd A[Catch:{ Exception -> 0x0387 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2 A[Catch:{ Exception -> 0x0387 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0111 A[Catch:{ Exception -> 0x0387 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C11232E.m50103a()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.i0 r1 = com.ironsource.mediationsdk.C11394i0.m50972a()     // Catch:{ Exception -> 0x0387 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.i0$a r3 = new com.ironsource.mediationsdk.i0$a     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x0387 }
            L_0x001a:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51024r     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.c r2 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0387 }
                r2.<init>()     // Catch:{ Exception -> 0x0387 }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0045
                int r7 = r1.length()     // Catch:{ Exception -> 0x0387 }
                if (r7 <= 0) goto L_0x003a
                int r7 = r1.length()     // Catch:{ Exception -> 0x0387 }
                r8 = 64
                if (r7 > r8) goto L_0x003a
                r7 = 1
                goto L_0x003b
            L_0x003a:
                r7 = 0
            L_0x003b:
                if (r7 != 0) goto L_0x004c
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x0387 }
            L_0x0041:
                r2.mo44541a(r1)     // Catch:{ Exception -> 0x0387 }
                goto L_0x004c
            L_0x0045:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x0387 }
                goto L_0x0041
            L_0x004c:
                boolean r1 = r2.mo44542a()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x0059
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "userGenerated"
                r1.f51028v = r2     // Catch:{ Exception -> 0x0387 }
                goto L_0x00a6
            L_0x0059:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = com.ironsource.mediationsdk.C11232E.m50104a((android.content.Context) r2)     // Catch:{ Exception -> 0x0387 }
                r1.f51024r = r2     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51024r     // Catch:{ Exception -> 0x0387 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x007a
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "GAID"
            L_0x0077:
                r1.f51028v = r2     // Catch:{ Exception -> 0x0387 }
                goto L_0x009f
            L_0x007a:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = com.ironsource.environment.C4979h.m22833y(r2)     // Catch:{ Exception -> 0x0387 }
                r1.f51024r = r2     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51024r     // Catch:{ Exception -> 0x0387 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x0099
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "UUID"
                goto L_0x0077
            L_0x0099:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = ""
                r1.f51024r = r2     // Catch:{ Exception -> 0x0387 }
            L_0x009f:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51024r     // Catch:{ Exception -> 0x0387 }
                r0.mo43779s(r1, r4)     // Catch:{ Exception -> 0x0387 }
            L_0x00a6:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C11445e.m51160a()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.c0 r4 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r4 = r4.f51028v     // Catch:{ Exception -> 0x0387 }
                r1.mo44497a(r2, r4)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51024r     // Catch:{ Exception -> 0x0387 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x00c8
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C11445e.m51160a()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r2 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = r2.f51024r     // Catch:{ Exception -> 0x0387 }
                r1.mo44497a(r5, r2)     // Catch:{ Exception -> 0x0387 }
            L_0x00c8:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51025s     // Catch:{ Exception -> 0x0387 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x00df
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C11445e.m51160a()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.c0 r4 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r4 = r4.f51025s     // Catch:{ Exception -> 0x0387 }
                r1.mo44497a(r2, r4)     // Catch:{ Exception -> 0x0387 }
            L_0x00df:
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.c.b r2 = r1.f51032z     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51024r     // Catch:{ Exception -> 0x0387 }
                r2.mo20550a((java.lang.String) r1)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0387 }
                r2.<init>()     // Catch:{ Exception -> 0x0387 }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x0387 }
                r1.f51031y = r4     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r4 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.lang.String r4 = r4.f51024r     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.E$a r5 = r11.f51043d     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r2 = r0.mo43774k(r2, r4, r5)     // Catch:{ Exception -> 0x0387 }
                r1.f51026t = r2     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r2 = r1.f51026t     // Catch:{ Exception -> 0x0387 }
                if (r2 == 0) goto L_0x02f0
                android.os.Handler r1 = r1.f51018l     // Catch:{ Exception -> 0x0387 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r1 = r1.f51026t     // Catch:{ Exception -> 0x0387 }
                boolean r1 = r1.mo44559a()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x02c9
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0$c r2 = com.ironsource.mediationsdk.C11362c0.C11366c.INITIATED     // Catch:{ Exception -> 0x0387 }
                r1.mo44216b((com.ironsource.mediationsdk.C11362c0.C11366c) r2)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                boolean r2 = r0.mo43745H()     // Catch:{ Exception -> 0x0387 }
                r1.mo44217b((boolean) r2)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.g r1 = com.ironsource.environment.C4978g.f22048a     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r1 = r1.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r1 = r1.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.f.a r1 = r1.f51381e     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.a r1 = r1.mo44989f()     // Catch:{ Exception -> 0x0387 }
                boolean r1 = r1.f51531c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.C4978g.m22778a(r1)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.c.b r2 = r1.f51032z     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r1 = r1.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r1 = r1.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.f.a r1 = r1.f51381e     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.b r1 = r1.mo44992i()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r1 = r1.f51352a     // Catch:{ Exception -> 0x0387 }
                r2.mo20552b(r1)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.c.b r2 = r1.f51032z     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r1 = r1.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r1 = r1.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.f.a r1 = r1.f51381e     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.o r1 = r1.mo44986c()     // Catch:{ Exception -> 0x0387 }
                org.json.JSONObject r1 = r1.f51746b     // Catch:{ Exception -> 0x0387 }
                r2.mo20551a((org.json.JSONObject) r1)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.c.b r1 = r1.f51032z     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0387 }
                boolean r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSession(r2)     // Catch:{ Exception -> 0x0387 }
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0387 }
                r1.mo20549a((java.lang.Boolean) r2)     // Catch:{ Exception -> 0x0387 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0387 }
                r1.<init>()     // Catch:{ Exception -> 0x0387 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r4 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                long r4 = r4.f51031y     // Catch:{ Exception -> 0x0387 }
                long r1 = r1 - r4
                boolean r4 = r0.mo43745H()     // Catch:{ Exception -> 0x0387 }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0387 }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x01a3 }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.f50378F     // Catch:{ Exception -> 0x01a3 }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x01a3 }
                goto L_0x01a7
            L_0x01a3:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0387 }
            L_0x01a7:
                com.ironsource.mediationsdk.adunit.a.a r0 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ Exception -> 0x0387 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.a.h r1 = com.ironsource.mediationsdk.p275a.C11296h.m50466e()     // Catch:{ Exception -> 0x0387 }
                r1.mo43979b((com.ironsource.mediationsdk.adunit.p276a.C11308a) r0)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.ac r1 = new com.ironsource.mediationsdk.ac     // Catch:{ Exception -> 0x0387 }
                r1.<init>()     // Catch:{ Exception -> 0x0387 }
                r0.f51007a = r1     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.ac r0 = r0.f51007a     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.ac$a r1 = new com.ironsource.mediationsdk.ac$a     // Catch:{ Exception -> 0x0387 }
                r1.<init>()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.lifecycle.a r2 = new com.ironsource.lifecycle.a     // Catch:{ Exception -> 0x0387 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0387 }
                r0.f50752a = r2     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r0 = r0.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r0 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.f.a r0 = r0.f51381e     // Catch:{ Exception -> 0x0387 }
                boolean r0 = r0.mo44987d()     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x01f1
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x01f1
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x0387 }
            L_0x01f1:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r0 = r0.f51026t     // Catch:{ Exception -> 0x0387 }
                org.json.JSONObject r1 = r0.f51669d     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x0247
                com.ironsource.mediationsdk.model.h r1 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x01fe
                goto L_0x0247
            L_0x01fe:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0387 }
                r3.<init>()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r1 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.p r1 = r1.f51377a     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.n r1 = r0.f51660a     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x021a
                java.util.ArrayList<java.lang.String> r1 = r1.f51415a     // Catch:{ Exception -> 0x0387 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0387 }
                if (r1 <= 0) goto L_0x021a
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0387 }
                r3.add(r1)     // Catch:{ Exception -> 0x0387 }
            L_0x021a:
                com.ironsource.mediationsdk.model.h r1 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.i r1 = r1.f51378b     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x0231
                com.ironsource.mediationsdk.model.n r1 = r0.f51660a     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x0231
                java.util.ArrayList<java.lang.String> r1 = r1.f51418d     // Catch:{ Exception -> 0x0387 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0387 }
                if (r1 <= 0) goto L_0x0231
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0387 }
                r3.add(r1)     // Catch:{ Exception -> 0x0387 }
            L_0x0231:
                com.ironsource.mediationsdk.model.h r1 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.j r1 = r1.f51379c     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x023c
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x0387 }
                r3.add(r1)     // Catch:{ Exception -> 0x0387 }
            L_0x023c:
                com.ironsource.mediationsdk.model.h r0 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.f r0 = r0.f51380d     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x0247
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0387 }
                r3.add(r0)     // Catch:{ Exception -> 0x0387 }
            L_0x0247:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f51023q     // Catch:{ Exception -> 0x0387 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0387 }
            L_0x024f:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x0267
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C11493i) r1     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r2 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                boolean r4 = r2.f51015i     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r2 = r2.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r2 = r2.f51666c     // Catch:{ Exception -> 0x0387 }
                r1.mo43756a(r3, r4, r2)     // Catch:{ Exception -> 0x0387 }
                goto L_0x024f
            L_0x0267:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r0.f51029w     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x028a
                com.ironsource.mediationsdk.utils.k r0 = r0.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r0 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.f.a r0 = r0.f51381e     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.q r0 = r0.mo44985b()     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x028a
                java.lang.String r1 = r0.f51436a     // Catch:{ Exception -> 0x0387 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x028a
                com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.f51029w     // Catch:{ Exception -> 0x0387 }
                java.lang.String r0 = r0.f51436a     // Catch:{ Exception -> 0x0387 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x0387 }
            L_0x028a:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.k r0 = r0.f51026t     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.model.h r0 = r0.f51666c     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.f.a r0 = r0.f51381e     // Catch:{ Exception -> 0x0387 }
                com.ironsource.sdk.g.d r0 = r0.mo44988e()     // Catch:{ Exception -> 0x0387 }
                boolean r1 = r0.mo45007b()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x038b
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.e r2 = com.ironsource.environment.C4970e.m22762a()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0387 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0387 }
                java.util.HashSet r4 = r0.mo45001a()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r5 = r0.mo45008c()     // Catch:{ Exception -> 0x0387 }
                java.lang.String r6 = r0.mo45011d()     // Catch:{ Exception -> 0x0387 }
                boolean r7 = r0.mo45012e()     // Catch:{ Exception -> 0x0387 }
                int r9 = r0.mo45013f()     // Catch:{ Exception -> 0x0387 }
                boolean r10 = r0.mo45014g()     // Catch:{ Exception -> 0x0387 }
                r2.mo20585a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0387 }
                goto L_0x038b
            L_0x02c9:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                boolean r1 = r0.f51016j     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x0386
                com.ironsource.mediationsdk.c0$c r1 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ Exception -> 0x0387 }
                r0.mo44216b((com.ironsource.mediationsdk.C11362c0.C11366c) r1)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                r0.f51016j = r6     // Catch:{ Exception -> 0x0387 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f51023q     // Catch:{ Exception -> 0x0387 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0387 }
            L_0x02de:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x038b
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C11493i) r1     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.mo43754a(r2)     // Catch:{ Exception -> 0x0387 }
                goto L_0x02de
            L_0x02f0:
                int r0 = r1.f51011e     // Catch:{ Exception -> 0x0387 }
                r2 = 3
                if (r0 != r2) goto L_0x030d
                r1.f51030x = r6     // Catch:{ Exception -> 0x0387 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r1.f51023q     // Catch:{ Exception -> 0x0387 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0387 }
            L_0x02fd:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x030d
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C11493i) r1     // Catch:{ Exception -> 0x0387 }
                r1.mo43765f()     // Catch:{ Exception -> 0x0387 }
                goto L_0x02fd
            L_0x030d:
                boolean r0 = r11.f51041b     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x0333
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                int r1 = r0.f51011e     // Catch:{ Exception -> 0x0387 }
                int r2 = r0.f51012f     // Catch:{ Exception -> 0x0387 }
                if (r1 >= r2) goto L_0x0333
                r0.f51015i = r6     // Catch:{ Exception -> 0x0387 }
                android.os.Handler r1 = r0.f51018l     // Catch:{ Exception -> 0x0387 }
                int r0 = r0.f51010d     // Catch:{ Exception -> 0x0387 }
                int r0 = r0 * 1000
                long r2 = (long) r0     // Catch:{ Exception -> 0x0387 }
                r1.postDelayed(r11, r2)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                int r1 = r0.f51011e     // Catch:{ Exception -> 0x0387 }
                int r2 = r0.f51013g     // Catch:{ Exception -> 0x0387 }
                if (r1 >= r2) goto L_0x0333
                int r1 = r0.f51010d     // Catch:{ Exception -> 0x0387 }
                int r1 = r1 * 2
                r0.f51010d = r1     // Catch:{ Exception -> 0x0387 }
            L_0x0333:
                boolean r0 = r11.f51041b     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x033f
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                int r1 = r0.f51011e     // Catch:{ Exception -> 0x0387 }
                int r0 = r0.f51014h     // Catch:{ Exception -> 0x0387 }
                if (r1 != r0) goto L_0x037f
            L_0x033f:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                boolean r1 = r0.f51016j     // Catch:{ Exception -> 0x0387 }
                if (r1 != 0) goto L_0x037f
                r0.f51016j = r6     // Catch:{ Exception -> 0x0387 }
                java.lang.String r0 = r11.f51042c     // Catch:{ Exception -> 0x0387 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0387 }
                if (r0 == 0) goto L_0x0353
                java.lang.String r0 = "noServerResponse"
                r11.f51042c = r0     // Catch:{ Exception -> 0x0387 }
            L_0x0353:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f51023q     // Catch:{ Exception -> 0x0387 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0387 }
            L_0x035b:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0387 }
                if (r1 == 0) goto L_0x036d
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C11493i) r1     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = r11.f51042c     // Catch:{ Exception -> 0x0387 }
                r1.mo43754a(r2)     // Catch:{ Exception -> 0x0387 }
                goto L_0x035b
            L_0x036d:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.c0$c r1 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ Exception -> 0x0387 }
                r0.mo44216b((com.ironsource.mediationsdk.C11362c0.C11366c) r1)     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x0387 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0387 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x0387 }
            L_0x037f:
                com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.this     // Catch:{ Exception -> 0x0387 }
                int r1 = r0.f51011e     // Catch:{ Exception -> 0x0387 }
                int r1 = r1 + r6
                r0.f51011e = r1     // Catch:{ Exception -> 0x0387 }
            L_0x0386:
                return
            L_0x0387:
                r0 = move-exception
                r0.printStackTrace()
            L_0x038b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11362c0.C11363a.run():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.c0$b */
    class C11364b implements Runnable {

        /* renamed from: com.ironsource.mediationsdk.c0$b$a */
        class C11365a extends CountDownTimer {
            C11365a(long j, long j2) {
                super(60000, 15000);
            }

            public final void onFinish() {
                C11362c0 c0Var = C11362c0.this;
                if (!c0Var.f51016j) {
                    c0Var.f51016j = true;
                    for (C11493i a : c0Var.f51023q) {
                        a.mo43754a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                    }
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                }
            }

            public final void onTick(long j) {
                if (j <= 45000) {
                    C11362c0 c0Var = C11362c0.this;
                    c0Var.f51030x = true;
                    for (C11493i f : c0Var.f51023q) {
                        f.mo43765f();
                    }
                }
            }
        }

        C11364b() {
        }

        public final void run() {
            C11362c0.this.f51022p = new C11365a(60000, 15000).start();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.c0$c */
    enum C11366c {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* renamed from: com.ironsource.mediationsdk.c0$d */
    abstract class C11367d implements Runnable {

        /* renamed from: b */
        boolean f51041b = true;

        /* renamed from: c */
        String f51042c;

        /* renamed from: d */
        protected C11232E.C11233a f51043d = new C11368a();

        /* renamed from: com.ironsource.mediationsdk.c0$d$a */
        class C11368a implements C11232E.C11233a {
            C11368a() {
            }

            /* renamed from: a */
            public final void mo43782a(String str) {
                C11367d dVar = C11367d.this;
                dVar.f51041b = false;
                dVar.f51042c = str;
            }
        }

        C11367d() {
        }
    }

    private C11362c0() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.f51017k = handlerThread;
        handlerThread.start();
        this.f51018l = new Handler(this.f51017k.getLooper());
        this.f51010d = 1;
        this.f51011e = 0;
        this.f51012f = 62;
        this.f51013g = 12;
        this.f51014h = 5;
        this.f51020n = new AtomicBoolean(true);
        this.f51015i = false;
        this.f51030x = false;
        this.f51032z = new C4947b();
    }

    /* renamed from: a */
    public static synchronized C11362c0 m50779a() {
        C11362c0 c0Var;
        synchronized (C11362c0.class) {
            if (f51005B == null) {
                f51005B = new C11362c0();
            }
            c0Var = f51005B;
        }
        return c0Var;
    }

    /* renamed from: a */
    public final synchronized void mo44213a(Context context, String str, String str2) {
        Handler handler;
        Runnable bVar;
        try {
            AtomicBoolean atomicBoolean = this.f51020n;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f51009c + ": Multiple calls to init are not allowed", 2);
                return;
            }
            mo44216b(C11366c.INIT_IN_PROGRESS);
            this.f51024r = str2;
            this.f51025s = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                handler = this.f51018l;
                bVar = this.f51006A;
            } else {
                this.f51019m = true;
                if (this.f51021o == null) {
                    this.f51021o = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.f51021o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                handler = new Handler(Looper.getMainLooper());
                bVar = new C11364b();
            }
            handler.post(bVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public final void mo44214a(C11493i iVar) {
        if (iVar != null) {
            this.f51023q.add(iVar);
        }
    }

    /* renamed from: a */
    public final void mo20593a(boolean z) {
        if (this.f51019m && z) {
            CountDownTimer countDownTimer = this.f51022p;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f51019m = false;
            this.f51015i = true;
            this.f51018l.post(this.f51006A);
        }
    }

    /* renamed from: b */
    public final synchronized C11366c mo44215b() {
        return this.f51027u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo44216b(C11366c cVar) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setInitStatus(old status: " + this.f51027u + ", new status: " + cVar + ")", 0);
        this.f51027u = cVar;
    }

    /* renamed from: b */
    public final void mo44217b(boolean z) {
        Map<String, String> map;
        if (z && TextUtils.isEmpty(C11232E.m50103a().f50425o) && (map = this.f51026t.f51666c.f51381e.mo44990g().f51365a) != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    C11232E.m50103a().mo43763d(next);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo44218c() {
        return this.f51030x;
    }
}
