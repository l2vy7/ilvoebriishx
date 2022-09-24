package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gm */
/* compiled from: IMASDK */
public abstract class C4020gm implements C4019gl {

    /* renamed from: a */
    protected static volatile C4037hc f17306a;

    /* renamed from: b */
    protected MotionEvent f17307b;

    /* renamed from: c */
    protected final LinkedList<MotionEvent> f17308c = new LinkedList<>();

    /* renamed from: d */
    protected long f17309d = 0;

    /* renamed from: e */
    protected long f17310e = 0;

    /* renamed from: f */
    protected long f17311f = 0;

    /* renamed from: g */
    protected long f17312g = 0;

    /* renamed from: h */
    protected long f17313h = 0;

    /* renamed from: i */
    protected long f17314i = 0;

    /* renamed from: j */
    protected long f17315j = 0;

    /* renamed from: k */
    protected double f17316k;

    /* renamed from: l */
    protected float f17317l;

    /* renamed from: m */
    protected float f17318m;

    /* renamed from: n */
    protected float f17319n;

    /* renamed from: o */
    protected float f17320o;

    /* renamed from: p */
    protected boolean f17321p = false;

    /* renamed from: q */
    protected DisplayMetrics f17322q;

    /* renamed from: r */
    private double f17323r;

    /* renamed from: s */
    private double f17324s;

    /* renamed from: t */
    private boolean f17325t = false;

    protected C4020gm(Context context) {
        try {
            if (aok.f15496l.mo14149f().booleanValue()) {
                C4001fu.m17209a();
            } else {
                C4038hd.m17315a(f17306a);
            }
            this.f17322q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2 A[SYNTHETIC, Splitter:B:46:0x00b2] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m17243j(android.content.Context r19, java.lang.String r20, int r21, byte[] r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            r0 = r22
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L_0x001b
            int r5 = r0.length
            if (r5 <= 0) goto L_0x001b
            com.google.ads.interactivemedia.v3.internal.bka r5 = com.google.ads.interactivemedia.p038v3.internal.bka.m16275a()     // Catch:{ bkt -> 0x001b, NullPointerException -> 0x0016 }
            com.google.ads.interactivemedia.v3.internal.f r0 = com.google.ads.interactivemedia.p038v3.internal.C3980f.m17087f(r0, r5)     // Catch:{ bkt -> 0x001b, NullPointerException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r0 = java.lang.Integer.toString(r3)
            return r0
        L_0x001b:
            r0 = r4
        L_0x001c:
            long r5 = java.lang.System.currentTimeMillis()
            com.google.ads.interactivemedia.v3.internal.aod<java.lang.Boolean> r7 = com.google.ads.interactivemedia.p038v3.internal.aok.f15488d
            java.lang.Object r7 = r7.mo14149f()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            if (r7 == 0) goto L_0x004f
            com.google.ads.interactivemedia.v3.internal.hc r9 = f17306a
            if (r9 == 0) goto L_0x003a
            com.google.ads.interactivemedia.v3.internal.hc r9 = f17306a
            com.google.ads.interactivemedia.v3.internal.gk r9 = r9.mo15900h()
            goto L_0x003b
        L_0x003a:
            r9 = r4
        L_0x003b:
            com.google.ads.interactivemedia.v3.internal.aod<java.lang.Boolean> r10 = com.google.ads.interactivemedia.p038v3.internal.aok.f15496l
            java.lang.Object r10 = r10.mo14149f()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r8 == r10) goto L_0x004c
            java.lang.String r10 = "te"
            goto L_0x0051
        L_0x004c:
            java.lang.String r10 = "be"
            goto L_0x0051
        L_0x004f:
            r9 = r4
            r10 = r9
        L_0x0051:
            r14 = 2
            if (r2 != r3) goto L_0x005f
            com.google.ads.interactivemedia.v3.internal.k r4 = r18.mo15872h(r19)     // Catch:{ Exception -> 0x005d }
            r1.f17325t = r8     // Catch:{ Exception -> 0x005d }
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0076
        L_0x005d:
            r0 = move-exception
            goto L_0x0084
        L_0x005f:
            if (r2 != r14) goto L_0x006b
            com.google.ads.interactivemedia.v3.internal.k r0 = r18.mo15873i(r19)     // Catch:{ Exception -> 0x005d }
            r4 = 1008(0x3f0, float:1.413E-42)
            r4 = r0
            r0 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0076
        L_0x006b:
            r11 = r19
            com.google.ads.interactivemedia.v3.internal.k r0 = r1.mo15868d(r11, r0)     // Catch:{ Exception -> 0x005d }
            r4 = 1000(0x3e8, float:1.401E-42)
            r4 = r0
            r0 = 1000(0x3e8, float:1.401E-42)
        L_0x0076:
            if (r7 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005d }
            long r11 = r11 - r5
            r9.mo15864e(r0, r11, r10)     // Catch:{ Exception -> 0x005d }
        L_0x0082:
            r8 = 2
            goto L_0x00ac
        L_0x0084:
            r17 = r0
            if (r7 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            if (r2 != r3) goto L_0x0091
            r0 = 1003(0x3eb, float:1.406E-42)
            r12 = 1003(0x3eb, float:1.406E-42)
            goto L_0x009d
        L_0x0091:
            if (r2 != r14) goto L_0x0098
            r0 = 1009(0x3f1, float:1.414E-42)
            r12 = 1009(0x3f1, float:1.414E-42)
            goto L_0x009d
        L_0x0098:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r12 = 1001(0x3e9, float:1.403E-42)
        L_0x009d:
            r13 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r5 = r15 - r5
            r11 = r9
            r8 = 2
            r14 = r5
            r16 = r10
            r11.mo15863a(r12, r13, r14, r16, r17)
        L_0x00ac:
            long r5 = java.lang.System.currentTimeMillis()
            if (r4 == 0) goto L_0x00e4
            com.google.ads.interactivemedia.v3.internal.bkl r0 = r4.mo15385ae()     // Catch:{ Exception -> 0x00ea }
            com.google.ads.interactivemedia.v3.internal.u r0 = (com.google.ads.interactivemedia.p038v3.internal.C4385u) r0     // Catch:{ Exception -> 0x00ea }
            int r0 = r0.mo15392al()     // Catch:{ Exception -> 0x00ea }
            if (r0 != 0) goto L_0x00bf
            goto L_0x00e4
        L_0x00bf:
            com.google.ads.interactivemedia.v3.internal.bkl r0 = r4.mo15385ae()     // Catch:{ Exception -> 0x00ea }
            com.google.ads.interactivemedia.v3.internal.u r0 = (com.google.ads.interactivemedia.p038v3.internal.C4385u) r0     // Catch:{ Exception -> 0x00ea }
            r4 = r20
            java.lang.String r0 = com.google.ads.interactivemedia.p038v3.internal.C4001fu.m17210b(r0, r4)     // Catch:{ Exception -> 0x00ea }
            if (r7 == 0) goto L_0x0115
            if (r9 == 0) goto L_0x0115
            if (r2 != r3) goto L_0x00d4
            r4 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00db
        L_0x00d4:
            if (r2 != r8) goto L_0x00d9
            r4 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00db
        L_0x00d9:
            r4 = 1004(0x3ec, float:1.407E-42)
        L_0x00db:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ea }
            long r11 = r11 - r5
            r9.mo15864e(r4, r11, r10)     // Catch:{ Exception -> 0x00ea }
            goto L_0x0115
        L_0x00e4:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x00ea }
            goto L_0x0115
        L_0x00ea:
            r0 = move-exception
            r17 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x0115
            if (r9 == 0) goto L_0x0115
            if (r2 != r3) goto L_0x00fd
            r2 = 1007(0x3ef, float:1.411E-42)
            r12 = 1007(0x3ef, float:1.411E-42)
            goto L_0x0108
        L_0x00fd:
            if (r2 != r8) goto L_0x0104
            r2 = 1011(0x3f3, float:1.417E-42)
            r12 = 1011(0x3f3, float:1.417E-42)
            goto L_0x0108
        L_0x0104:
            r2 = 1005(0x3ed, float:1.408E-42)
            r12 = 1005(0x3ed, float:1.408E-42)
        L_0x0108:
            r13 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r14 = r2 - r5
            r11 = r9
            r16 = r10
            r11.mo15863a(r12, r13, r14, r16, r17)
        L_0x0115:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4020gm.m17243j(android.content.Context, java.lang.String, int, byte[]):java.lang.String");
    }

    /* renamed from: a */
    public final String mo15865a(Context context) {
        if (!C4040hf.m17336d()) {
            return m17243j(context, (String) null, 1, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: b */
    public final void mo15866b(MotionEvent motionEvent) {
        Long l;
        if (this.f17325t) {
            this.f17313h = 0;
            this.f17309d = 0;
            this.f17310e = 0;
            this.f17311f = 0;
            this.f17312g = 0;
            this.f17314i = 0;
            this.f17315j = 0;
            if (this.f17308c.size() > 0) {
                Iterator it = this.f17308c.iterator();
                while (it.hasNext()) {
                    ((MotionEvent) it.next()).recycle();
                }
                this.f17308c.clear();
            } else {
                MotionEvent motionEvent2 = this.f17307b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
            }
            this.f17307b = null;
            this.f17325t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17316k = 0.0d;
            this.f17323r = (double) motionEvent.getRawX();
            this.f17324s = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = this.f17323r;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.f17324s;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.f17316k += Math.sqrt((d2 * d2) + (d4 * d4));
            this.f17323r = rawX;
            this.f17324s = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f17317l = motionEvent.getX();
            this.f17318m = motionEvent.getY();
            this.f17319n = motionEvent.getRawX();
            this.f17320o = motionEvent.getRawY();
            this.f17309d++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f17307b = obtain;
            this.f17308c.add(obtain);
            if (this.f17308c.size() > 6) {
                this.f17308c.remove().recycle();
            }
            this.f17311f++;
            this.f17313h = mo15870f(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f17310e += (long) (motionEvent.getHistorySize() + 1);
            try {
                C4039he e = mo15869e(motionEvent);
                Long l2 = e.f17379d;
                if (!(l2 == null || e.f17382g == null)) {
                    this.f17314i += l2.longValue() + e.f17382g.longValue();
                }
                if (!(this.f17322q == null || (l = e.f17380e) == null || e.f17383h == null)) {
                    this.f17315j += l.longValue() + e.f17383h.longValue();
                }
            } catch (C4029gv unused) {
            }
        } else if (action2 == 3) {
            this.f17312g++;
        }
        this.f17321p = true;
    }

    /* renamed from: c */
    public final String mo15867c(Context context, String str) {
        return m17243j(context, str, 3, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C4115k mo15868d(Context context, C3980f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C4039he mo15869e(MotionEvent motionEvent) throws C4029gv;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo15870f(StackTraceElement[] stackTraceElementArr) throws C4029gv;

    /* renamed from: g */
    public final String mo15871g(Context context, byte[] bArr) {
        if (!C4040hf.m17336d()) {
            return m17243j(context, (String) null, 1, bArr);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C4115k mo15872h(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C4115k mo15873i(Context context);
}
