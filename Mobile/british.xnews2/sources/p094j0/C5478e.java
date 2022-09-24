package p094j0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p016c0.C2622d;
import p094j0.C5484f;
import p104l0.C5641a;
import p149t.C6083e;
import p149t.C6090g;

/* renamed from: j0.e */
/* compiled from: FontRequestWorker */
class C5478e {

    /* renamed from: a */
    static final C6083e<String, Typeface> f23858a = new C6083e<>(16);

    /* renamed from: b */
    private static final ExecutorService f23859b = C5488g.m24522a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f23860c = new Object();

    /* renamed from: d */
    static final C6090g<String, ArrayList<C5641a<C5483e>>> f23861d = new C6090g<>();

    /* renamed from: j0.e$a */
    /* compiled from: FontRequestWorker */
    class C5479a implements Callable<C5483e> {

        /* renamed from: a */
        final /* synthetic */ String f23862a;

        /* renamed from: b */
        final /* synthetic */ Context f23863b;

        /* renamed from: c */
        final /* synthetic */ C5477d f23864c;

        /* renamed from: d */
        final /* synthetic */ int f23865d;

        C5479a(String str, Context context, C5477d dVar, int i) {
            this.f23862a = str;
            this.f23863b = context;
            this.f23864c = dVar;
            this.f23865d = i;
        }

        /* renamed from: b */
        public C5483e call() {
            return C5478e.m24502c(this.f23862a, this.f23863b, this.f23864c, this.f23865d);
        }
    }

    /* renamed from: j0.e$b */
    /* compiled from: FontRequestWorker */
    class C5480b implements C5641a<C5483e> {

        /* renamed from: a */
        final /* synthetic */ C5471a f23866a;

        C5480b(C5471a aVar) {
            this.f23866a = aVar;
        }

        /* renamed from: a */
        public void accept(C5483e eVar) {
            this.f23866a.mo21934b(eVar);
        }
    }

    /* renamed from: j0.e$c */
    /* compiled from: FontRequestWorker */
    class C5481c implements Callable<C5483e> {

        /* renamed from: a */
        final /* synthetic */ String f23867a;

        /* renamed from: b */
        final /* synthetic */ Context f23868b;

        /* renamed from: c */
        final /* synthetic */ C5477d f23869c;

        /* renamed from: d */
        final /* synthetic */ int f23870d;

        C5481c(String str, Context context, C5477d dVar, int i) {
            this.f23867a = str;
            this.f23868b = context;
            this.f23869c = dVar;
            this.f23870d = i;
        }

        /* renamed from: b */
        public C5483e call() {
            return C5478e.m24502c(this.f23867a, this.f23868b, this.f23869c, this.f23870d);
        }
    }

    /* renamed from: j0.e$d */
    /* compiled from: FontRequestWorker */
    class C5482d implements C5641a<C5483e> {

        /* renamed from: a */
        final /* synthetic */ String f23871a;

        C5482d(String str) {
            this.f23871a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((p104l0.C5641a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(p094j0.C5478e.C5483e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p094j0.C5478e.f23860c
                monitor-enter(r0)
                t.g<java.lang.String, java.util.ArrayList<l0.a<j0.e$e>>> r1 = p094j0.C5478e.f23861d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f23871a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f23871a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                l0.a r1 = (p104l0.C5641a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                goto L_0x002f
            L_0x002e:
                throw r5
            L_0x002f:
                goto L_0x002e
            */
            throw new UnsupportedOperationException("Method not decompiled: p094j0.C5478e.C5482d.accept(j0.e$e):void");
        }
    }

    /* renamed from: a */
    private static String m24500a(C5477d dVar, int i) {
        return dVar.mo21941d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m24501b(C5484f.C5485a aVar) {
        int i = 1;
        if (aVar.mo21955c() == 0) {
            C5484f.C5486b[] b = aVar.mo21954b();
            if (!(b == null || b.length == 0)) {
                int length = b.length;
                i = 0;
                int i2 = 0;
                while (i2 < length) {
                    int b2 = b[i2].mo21956b();
                    if (b2 == 0) {
                        i2++;
                    } else if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
            return i;
        } else if (aVar.mo21955c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    static C5483e m24502c(String str, Context context, C5477d dVar, int i) {
        C6083e<String, Typeface> eVar = f23858a;
        Typeface c = eVar.mo23310c(str);
        if (c != null) {
            return new C5483e(c);
        }
        try {
            C5484f.C5485a d = C5475c.m24489d(context, dVar, (CancellationSignal) null);
            int b = m24501b(d);
            if (b != 0) {
                return new C5483e(b);
            }
            Typeface b2 = C2622d.m9141b(context, (CancellationSignal) null, d.mo21954b(), i);
            if (b2 == null) {
                return new C5483e(-3);
            }
            eVar.mo23311d(str, b2);
            return new C5483e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C5483e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new p094j0.C5478e.C5481c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f23859b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        p094j0.C5488g.m24523b(r8, r9, new p094j0.C5478e.C5482d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m24503d(android.content.Context r5, p094j0.C5477d r6, int r7, java.util.concurrent.Executor r8, p094j0.C5471a r9) {
        /*
            java.lang.String r0 = m24500a(r6, r7)
            t.e<java.lang.String, android.graphics.Typeface> r1 = f23858a
            java.lang.Object r1 = r1.mo23310c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            j0.e$e r5 = new j0.e$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo21934b(r5)
            return r1
        L_0x0017:
            j0.e$b r1 = new j0.e$b
            r1.<init>(r9)
            java.lang.Object r9 = f23860c
            monitor-enter(r9)
            t.g<java.lang.String, java.util.ArrayList<l0.a<j0.e$e>>> r2 = f23861d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            j0.e$c r9 = new j0.e$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f23859b
        L_0x0044:
            j0.e$d r5 = new j0.e$d
            r5.<init>(r0)
            p094j0.C5488g.m24523b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p094j0.C5478e.m24503d(android.content.Context, j0.d, int, java.util.concurrent.Executor, j0.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m24504e(Context context, C5477d dVar, C5471a aVar, int i, int i2) {
        String a = m24500a(dVar, i);
        Typeface c = f23858a.mo23310c(a);
        if (c != null) {
            aVar.mo21934b(new C5483e(c));
            return c;
        } else if (i2 == -1) {
            C5483e c2 = m24502c(a, context, dVar, i);
            aVar.mo21934b(c2);
            return c2.f23872a;
        } else {
            try {
                C5483e eVar = (C5483e) C5488g.m24524c(f23859b, new C5479a(a, context, dVar, i), i2);
                aVar.mo21934b(eVar);
                return eVar.f23872a;
            } catch (InterruptedException unused) {
                aVar.mo21934b(new C5483e(-3));
                return null;
            }
        }
    }

    /* renamed from: j0.e$e */
    /* compiled from: FontRequestWorker */
    static final class C5483e {

        /* renamed from: a */
        final Typeface f23872a;

        /* renamed from: b */
        final int f23873b;

        C5483e(int i) {
            this.f23872a = null;
            this.f23873b = i;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo21953a() {
            return this.f23873b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C5483e(Typeface typeface) {
            this.f23872a = typeface;
            this.f23873b = 0;
        }
    }
}
