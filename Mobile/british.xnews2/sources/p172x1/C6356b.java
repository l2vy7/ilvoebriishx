package p172x1;

import android.text.TextUtils;
import androidx.work.C1423c;
import androidx.work.C1427e;
import androidx.work.C1483m;
import androidx.work.C1488p;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p128p1.C5885c;
import p128p1.C5888e;
import p128p1.C5889f;
import p128p1.C5890g;
import p128p1.C5892i;
import p167w1.C6283p;

/* renamed from: x1.b */
/* compiled from: EnqueueRunnable */
public class C6356b implements Runnable {

    /* renamed from: d */
    private static final String f26209d = C1483m.m7773f("EnqueueRunnable");

    /* renamed from: b */
    private final C5890g f26210b;

    /* renamed from: c */
    private final C5885c f26211c = new C5885c();

    public C6356b(C5890g gVar) {
        this.f26210b = gVar;
    }

    /* renamed from: b */
    private static boolean m27985b(C5890g gVar) {
        boolean c = m27986c(gVar.mo22849i(), gVar.mo22848h(), (String[]) C5890g.m25978n(gVar).toArray(new String[0]), gVar.mo22846f(), gVar.mo22844d());
        gVar.mo22852m();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1 A[LOOP:7: B:120:0x01db->B:122:0x01e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0159  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m27986c(p128p1.C5892i r19, java.util.List<? extends androidx.work.C1504y> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.C1430g r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.mo22867w()
            r7 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            w1.q r8 = r6.mo6924j()
            w1.p r8 = r8.mo23997n(r15)
            if (r8 != 0) goto L_0x0045
            androidx.work.m r0 = androidx.work.C1483m.m7771c()
            java.lang.String r1 = f26209d
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo7014b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.w$a r8 = r8.f25942b
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.SUCCEEDED
            if (r8 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.FAILED
            if (r8 != r15) goto L_0x0055
            r14 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.CANCELLED
            if (r8 != r15) goto L_0x005a
            r13 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r8 = android.text.TextUtils.isEmpty(r22)
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x014e
            w1.q r10 = r6.mo6924j()
            java.util.List r10 = r10.mo23987d(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x014e
            androidx.work.g r11 = androidx.work.C1430g.APPEND
            if (r3 == r11) goto L_0x00ca
            androidx.work.g r11 = androidx.work.C1430g.APPEND_OR_REPLACE
            if (r3 != r11) goto L_0x0085
            goto L_0x00ca
        L_0x0085:
            androidx.work.g r11 = androidx.work.C1430g.KEEP
            if (r3 != r11) goto L_0x00a5
            java.util.Iterator r3 = r10.iterator()
        L_0x008d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r3.next()
            w1.p$b r11 = (p167w1.C6283p.C6285b) r11
            androidx.work.w$a r11 = r11.f25960b
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.ENQUEUED
            if (r11 == r15) goto L_0x00a3
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.RUNNING
            if (r11 != r15) goto L_0x008d
        L_0x00a3:
            r11 = 0
            return r11
        L_0x00a5:
            r11 = 0
            x1.a r3 = p172x1.C6352a.m27975c(r2, r0, r11)
            r3.run()
            w1.q r3 = r6.mo6924j()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00c7
            java.lang.Object r15 = r10.next()
            w1.p$b r15 = (p167w1.C6283p.C6285b) r15
            java.lang.String r15 = r15.f25959a
            r3.mo23984a(r15)
            goto L_0x00b5
        L_0x00c7:
            r3 = 1
            goto L_0x014f
        L_0x00ca:
            r11 = 0
            w1.b r9 = r6.mo6919b()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d8:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0113
            java.lang.Object r16 = r10.next()
            r7 = r16
            w1.p$b r7 = (p167w1.C6283p.C6285b) r7
            java.lang.String r11 = r7.f25959a
            boolean r11 = r9.mo23947c(r11)
            if (r11 != 0) goto L_0x010c
            androidx.work.w$a r11 = r7.f25960b
            r17 = r9
            androidx.work.w$a r9 = androidx.work.C1501w.C1502a.SUCCEEDED
            if (r11 != r9) goto L_0x00f8
            r9 = 1
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            r9 = r9 & r12
            androidx.work.w$a r12 = androidx.work.C1501w.C1502a.FAILED
            if (r11 != r12) goto L_0x0100
            r14 = 1
            goto L_0x0105
        L_0x0100:
            androidx.work.w$a r12 = androidx.work.C1501w.C1502a.CANCELLED
            if (r11 != r12) goto L_0x0105
            r13 = 1
        L_0x0105:
            java.lang.String r7 = r7.f25959a
            r15.add(r7)
            r12 = r9
            goto L_0x010e
        L_0x010c:
            r17 = r9
        L_0x010e:
            r9 = r17
            r7 = 1
            r11 = 0
            goto L_0x00d8
        L_0x0113:
            androidx.work.g r7 = androidx.work.C1430g.APPEND_OR_REPLACE
            if (r3 != r7) goto L_0x0140
            if (r13 != 0) goto L_0x011b
            if (r14 == 0) goto L_0x0140
        L_0x011b:
            w1.q r3 = r6.mo6924j()
            java.util.List r7 = r3.mo23987d(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0127:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0139
            java.lang.Object r9 = r7.next()
            w1.p$b r9 = (p167w1.C6283p.C6285b) r9
            java.lang.String r9 = r9.f25959a
            r3.mo23984a(r9)
            goto L_0x0127
        L_0x0139:
            java.util.List r15 = java.util.Collections.emptyList()
            r3 = 0
            r13 = 0
            goto L_0x0141
        L_0x0140:
            r3 = r14
        L_0x0141:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r1.length
            if (r7 <= 0) goto L_0x014c
            r9 = 1
            goto L_0x014d
        L_0x014c:
            r9 = 0
        L_0x014d:
            r14 = r3
        L_0x014e:
            r3 = 0
        L_0x014f:
            java.util.Iterator r7 = r20.iterator()
        L_0x0153:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0210
            java.lang.Object r10 = r7.next()
            androidx.work.y r10 = (androidx.work.C1504y) r10
            w1.p r11 = r10.mo7051c()
            if (r9 == 0) goto L_0x017a
            if (r12 != 0) goto L_0x017a
            if (r14 == 0) goto L_0x016e
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.FAILED
            r11.f25942b = r15
            goto L_0x0182
        L_0x016e:
            if (r13 == 0) goto L_0x0175
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.CANCELLED
            r11.f25942b = r15
            goto L_0x0182
        L_0x0175:
            androidx.work.w$a r15 = androidx.work.C1501w.C1502a.BLOCKED
            r11.f25942b = r15
            goto L_0x0182
        L_0x017a:
            boolean r15 = r11.mo23972d()
            if (r15 != 0) goto L_0x0185
            r11.f25954n = r4
        L_0x0182:
            r17 = r4
            goto L_0x018b
        L_0x0185:
            r17 = r4
            r4 = 0
            r11.f25954n = r4
        L_0x018b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0199
            r5 = 25
            if (r4 > r5) goto L_0x0199
            m27988g(r11)
            goto L_0x01a8
        L_0x0199:
            r5 = 22
            if (r4 > r5) goto L_0x01a8
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = m27989h(r0, r4)
            if (r4 == 0) goto L_0x01a8
            m27988g(r11)
        L_0x01a8:
            androidx.work.w$a r4 = r11.f25942b
            androidx.work.w$a r5 = androidx.work.C1501w.C1502a.ENQUEUED
            if (r4 != r5) goto L_0x01af
            r3 = 1
        L_0x01af:
            w1.q r4 = r6.mo6924j()
            r4.mo23992i(r11)
            if (r9 == 0) goto L_0x01d3
            int r4 = r1.length
            r5 = 0
        L_0x01ba:
            if (r5 >= r4) goto L_0x01d3
            r11 = r1[r5]
            w1.a r15 = new w1.a
            java.lang.String r0 = r10.mo7049a()
            r15.<init>(r0, r11)
            w1.b r0 = r6.mo6919b()
            r0.mo23948d(r15)
            int r5 = r5 + 1
            r0 = r19
            goto L_0x01ba
        L_0x01d3:
            java.util.Set r0 = r10.mo7050b()
            java.util.Iterator r0 = r0.iterator()
        L_0x01db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01f8
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            w1.t r5 = r6.mo6925k()
            w1.s r11 = new w1.s
            java.lang.String r15 = r10.mo7049a()
            r11.<init>(r4, r15)
            r5.mo24008b(r11)
            goto L_0x01db
        L_0x01f8:
            if (r8 == 0) goto L_0x020a
            w1.k r0 = r6.mo6922h()
            w1.j r4 = new w1.j
            java.lang.String r5 = r10.mo7049a()
            r4.<init>(r2, r5)
            r0.mo23962a(r4)
        L_0x020a:
            r0 = r19
            r4 = r17
            goto L_0x0153
        L_0x0210:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p172x1.C6356b.m27986c(p1.i, java.util.List, java.lang.String[], java.lang.String, androidx.work.g):boolean");
    }

    /* renamed from: e */
    private static boolean m27987e(C5890g gVar) {
        List<C5890g> g = gVar.mo22847g();
        boolean z = false;
        if (g != null) {
            boolean z2 = false;
            for (C5890g next : g) {
                if (!next.mo22851l()) {
                    z2 |= m27987e(next);
                } else {
                    C1483m.m7771c().mo7017h(f26209d, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.mo22845e())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m27985b(gVar) | z;
    }

    /* renamed from: g */
    private static void m27988g(C6283p pVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        C1423c cVar = pVar.f25950j;
        String str = pVar.f25943c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (cVar.mo6875f() || cVar.mo6879i()) {
            C1427e.C1428a aVar = new C1427e.C1428a();
            aVar.mo6908c(pVar.f25945e).mo6911f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f25943c = cls.getName();
            pVar.f25945e = aVar.mo6906a();
        }
    }

    /* renamed from: h */
    private static boolean m27989h(C5892i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (C5888e eVar : iVar.mo22866v()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo24180a() {
        WorkDatabase w = this.f26210b.mo22849i().mo22867w();
        w.beginTransaction();
        try {
            boolean e = m27987e(this.f26210b);
            w.setTransactionSuccessful();
            return e;
        } finally {
            w.endTransaction();
        }
    }

    /* renamed from: d */
    public C1488p mo24181d() {
        return this.f26211c;
    }

    /* renamed from: f */
    public void mo24182f() {
        C5892i i = this.f26210b.mo22849i();
        C5889f.m25975b(i.mo22863q(), i.mo22867w(), i.mo22866v());
    }

    public void run() {
        try {
            if (!this.f26210b.mo22850j()) {
                if (mo24180a()) {
                    C6358d.m27998a(this.f26210b.mo22849i().mo22862p(), RescheduleReceiver.class, true);
                    mo24182f();
                }
                this.f26211c.mo22830a(C1488p.f6501a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f26210b}));
        } catch (Throwable th) {
            this.f26211c.mo22830a(new C1488p.C1490b.C1491a(th));
        }
    }
}
