package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.xa */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C8327xa implements C8291wa {

    /* renamed from: u */
    protected static volatile C8400zb f41097u;

    /* renamed from: b */
    protected MotionEvent f41098b;

    /* renamed from: c */
    protected final LinkedList<MotionEvent> f41099c = new LinkedList<>();

    /* renamed from: d */
    protected long f41100d = 0;

    /* renamed from: e */
    protected long f41101e = 0;

    /* renamed from: f */
    protected long f41102f = 0;

    /* renamed from: g */
    protected long f41103g = 0;

    /* renamed from: h */
    protected long f41104h = 0;

    /* renamed from: i */
    protected long f41105i = 0;

    /* renamed from: j */
    protected long f41106j = 0;

    /* renamed from: k */
    protected double f41107k;

    /* renamed from: l */
    private double f41108l;

    /* renamed from: m */
    private double f41109m;

    /* renamed from: n */
    protected float f41110n;

    /* renamed from: o */
    protected float f41111o;

    /* renamed from: p */
    protected float f41112p;

    /* renamed from: q */
    protected float f41113q;

    /* renamed from: r */
    private boolean f41114r = false;

    /* renamed from: s */
    protected boolean f41115s = false;

    /* renamed from: t */
    protected DisplayMetrics f41116t;

    protected C8327xa(Context context) {
        try {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37017X1)).booleanValue()) {
                C8007o9.m35600d();
            } else {
                C7498ac.m30279a(f41097u);
            }
            this.f41116t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private final void m39409f() {
        this.f41104h = 0;
        this.f41100d = 0;
        this.f41101e = 0;
        this.f41102f = 0;
        this.f41103g = 0;
        this.f41105i = 0;
        this.f41106j = 0;
        if (this.f41099c.size() > 0) {
            Iterator it = this.f41099c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f41099c.clear();
        } else {
            MotionEvent motionEvent = this.f41098b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f41098b = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC, Splitter:B:47:0x00bc] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m39410g(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.p00.f36929M1
            com.google.android.gms.internal.ads.n00 r8 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r7 = r8.mo18570b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zb r10 = f41097u
            if (r10 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zb r10 = f41097u
            com.google.android.gms.internal.ads.va r10 = r10.mo36031d()
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.p00.f37017X1
            com.google.android.gms.internal.ads.n00 r12 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r11 = r12.mo18570b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r8 == r11) goto L_0x0043
            java.lang.String r11 = "te"
            goto L_0x0048
        L_0x0043:
            java.lang.String r11 = "be"
            goto L_0x0048
        L_0x0046:
            r10 = r9
            r11 = r10
        L_0x0048:
            r15 = 2
            r14 = 3
            if (r2 != r14) goto L_0x005f
            com.google.android.gms.internal.ads.d8 r9 = r1.mo35739b(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r1.f41114r = r8     // Catch:{ Exception -> 0x0057 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r13 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            r18 = r0
            r8 = 3
            goto L_0x0091
        L_0x005c:
            r0 = move-exception
            r8 = 3
            goto L_0x008f
        L_0x005f:
            if (r2 != r15) goto L_0x006b
            com.google.android.gms.internal.ads.d8 r0 = r1.mo35741d(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r3 = 1008(0x3f0, float:1.413E-42)
            r9 = r0
            r13 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0074
        L_0x006b:
            com.google.android.gms.internal.ads.d8 r0 = r1.mo35740c(r0, r9)     // Catch:{ Exception -> 0x005c }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9 = r0
            r13 = 1000(0x3e8, float:1.401E-42)
        L_0x0074:
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005c }
            long r3 = r3 - r5
            r0 = -1
            r18 = 0
            r12 = r10
            r8 = 3
            r14 = r0
            r15 = r3
            r17 = r11
            r12.mo35394c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r8 = 3
        L_0x008d:
            r3 = 2
            goto L_0x00b6
        L_0x008f:
            r18 = r0
        L_0x0091:
            if (r7 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            if (r2 != r8) goto L_0x009d
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r13 = 1003(0x3eb, float:1.406E-42)
            goto L_0x00aa
        L_0x009d:
            r3 = 2
            if (r2 != r3) goto L_0x00a5
            r0 = 1009(0x3f1, float:1.414E-42)
            r13 = 1009(0x3f1, float:1.414E-42)
            goto L_0x00aa
        L_0x00a5:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r13 = 1001(0x3e9, float:1.403E-42)
        L_0x00aa:
            r14 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r5
            r12 = r10
            r17 = r11
            r12.mo35394c(r13, r14, r15, r17, r18)
        L_0x00b6:
            long r4 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00fd
            com.google.android.gms.internal.ads.kp3 r0 = r9.mo32424p()     // Catch:{ Exception -> 0x0103 }
            com.google.android.gms.internal.ads.u8 r0 = (com.google.android.gms.internal.ads.C8218u8) r0     // Catch:{ Exception -> 0x0103 }
            int r0 = r0.mo33137a()     // Catch:{ Exception -> 0x0103 }
            if (r0 != 0) goto L_0x00c9
            goto L_0x00fd
        L_0x00c9:
            com.google.android.gms.internal.ads.kp3 r0 = r9.mo32424p()     // Catch:{ Exception -> 0x0103 }
            com.google.android.gms.internal.ads.u8 r0 = (com.google.android.gms.internal.ads.C8218u8) r0     // Catch:{ Exception -> 0x0103 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.C8007o9.m35597a(r0, r6)     // Catch:{ Exception -> 0x0103 }
            if (r7 == 0) goto L_0x012e
            if (r10 == 0) goto L_0x012e
            if (r2 != r8) goto L_0x00e0
            r6 = 1006(0x3ee, float:1.41E-42)
            r13 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00eb
        L_0x00e0:
            if (r2 != r3) goto L_0x00e7
            r6 = 1010(0x3f2, float:1.415E-42)
            r13 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00eb
        L_0x00e7:
            r6 = 1004(0x3ec, float:1.407E-42)
            r13 = 1004(0x3ec, float:1.407E-42)
        L_0x00eb:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0103 }
            long r16 = r14 - r4
            r14 = -1
            r18 = 0
            r12 = r10
            r15 = r16
            r17 = r11
            r12.mo35394c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x0103 }
            goto L_0x012e
        L_0x00fd:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0103 }
            goto L_0x012e
        L_0x0103:
            r0 = move-exception
            r18 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x012e
            if (r10 == 0) goto L_0x012e
            if (r2 != r8) goto L_0x0116
            r2 = 1007(0x3ef, float:1.411E-42)
            r13 = 1007(0x3ef, float:1.411E-42)
            goto L_0x0121
        L_0x0116:
            if (r2 != r3) goto L_0x011d
            r2 = 1011(0x3f3, float:1.417E-42)
            r13 = 1011(0x3f3, float:1.417E-42)
            goto L_0x0121
        L_0x011d:
            r2 = 1005(0x3ed, float:1.408E-42)
            r13 = 1005(0x3ed, float:1.408E-42)
        L_0x0121:
            r14 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r15 = r2 - r4
            r12 = r10
            r17 = r11
            r12.mo35394c(r13, r14, r15, r17, r18)
        L_0x012e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8327xa.m39410g(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo35738a(StackTraceElement[] stackTraceElementArr) throws C8116rb;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C7600d8 mo35739b(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C7600d8 mo35740c(Context context, C8288w7 w7Var);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C7600d8 mo35741d(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C7534bc mo35742e(MotionEvent motionEvent) throws C8116rb;

    public final String zze(Context context, String str, View view) {
        return m39410g(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        return m39410g(context, str, 3, view, activity, (byte[]) null);
    }

    public final String zzg(Context context) {
        if (!C7569cc.m30948f()) {
            return m39410g(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public final String zzh(Context context, View view, Activity activity) {
        return m39410g(context, (String) null, 2, view, (Activity) null, (byte[]) null);
    }

    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.f41114r) {
            m39409f();
            this.f41114r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f41107k = 0.0d;
            this.f41108l = (double) motionEvent.getRawX();
            this.f41109m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = this.f41108l;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.f41109m;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.f41107k += Math.sqrt((d2 * d2) + (d4 * d4));
            this.f41108l = rawX;
            this.f41109m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f41110n = motionEvent.getX();
            this.f41111o = motionEvent.getY();
            this.f41112p = motionEvent.getRawX();
            this.f41113q = motionEvent.getRawY();
            this.f41100d++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f41098b = obtain;
            this.f41099c.add(obtain);
            if (this.f41099c.size() > 6) {
                this.f41099c.remove().recycle();
            }
            this.f41102f++;
            this.f41104h = mo35738a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f41101e += (long) (motionEvent.getHistorySize() + 1);
            try {
                C7534bc e = mo35742e(motionEvent);
                Long l2 = e.f29956e;
                if (!(l2 == null || e.f29959h == null)) {
                    this.f41105i += l2.longValue() + e.f29959h.longValue();
                }
                if (!(this.f41116t == null || (l = e.f29957f) == null || e.f29960i == null)) {
                    this.f41106j += l.longValue() + e.f29960i.longValue();
                }
            } catch (C8116rb unused) {
            }
        } else if (action2 == 3) {
            this.f41103g++;
        }
        this.f41115s = true;
    }

    public final synchronized void zzl(int i, int i2, int i3) {
        synchronized (this) {
            if (this.f41098b != null) {
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36913K1)).booleanValue()) {
                    m39409f();
                } else {
                    this.f41098b.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f41116t;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f41098b = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f41098b = null;
            }
            this.f41115s = false;
        }
    }
}
