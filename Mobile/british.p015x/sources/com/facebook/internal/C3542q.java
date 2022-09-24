package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.C3505i0;
import com.facebook.internal.C3548r;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.q */
/* compiled from: ImageDownloader */
public class C3542q {

    /* renamed from: a */
    private static Handler f13233a;

    /* renamed from: b */
    private static C3505i0 f13234b = new C3505i0(8);

    /* renamed from: c */
    private static C3505i0 f13235c = new C3505i0(2);

    /* renamed from: d */
    private static final Map<C3547e, C3546d> f13236d = new HashMap();

    /* renamed from: com.facebook.internal.q$a */
    /* compiled from: ImageDownloader */
    static class C3543a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3548r f13237b;

        /* renamed from: c */
        final /* synthetic */ Exception f13238c;

        /* renamed from: d */
        final /* synthetic */ boolean f13239d;

        /* renamed from: e */
        final /* synthetic */ Bitmap f13240e;

        /* renamed from: f */
        final /* synthetic */ C3548r.C3551c f13241f;

        C3543a(C3548r rVar, Exception exc, boolean z, Bitmap bitmap, C3548r.C3551c cVar) {
            this.f13237b = rVar;
            this.f13238c = exc;
            this.f13239d = z;
            this.f13240e = bitmap;
            this.f13241f = cVar;
        }

        public void run() {
            this.f13241f.mo12069a(new C3552s(this.f13237b, this.f13238c, this.f13239d, this.f13240e));
        }
    }

    /* renamed from: com.facebook.internal.q$b */
    /* compiled from: ImageDownloader */
    private static class C3544b implements Runnable {

        /* renamed from: b */
        private Context f13242b;

        /* renamed from: c */
        private C3547e f13243c;

        /* renamed from: d */
        private boolean f13244d;

        C3544b(Context context, C3547e eVar, boolean z) {
            this.f13242b = context;
            this.f13243c = eVar;
            this.f13244d = z;
        }

        public void run() {
            C3542q.m11850k(this.f13243c, this.f13242b, this.f13244d);
        }
    }

    /* renamed from: com.facebook.internal.q$c */
    /* compiled from: ImageDownloader */
    private static class C3545c implements Runnable {

        /* renamed from: b */
        private Context f13245b;

        /* renamed from: c */
        private C3547e f13246c;

        C3545c(Context context, C3547e eVar) {
            this.f13245b = context;
            this.f13246c = eVar;
        }

        public void run() {
            C3542q.m11843d(this.f13246c, this.f13245b);
        }
    }

    /* renamed from: com.facebook.internal.q$d */
    /* compiled from: ImageDownloader */
    private static class C3546d {

        /* renamed from: a */
        C3505i0.C3507b f13247a;

        /* renamed from: b */
        C3548r f13248b;

        /* renamed from: c */
        boolean f13249c;

        private C3546d() {
        }

        /* synthetic */ C3546d(C3543a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.q$e */
    /* compiled from: ImageDownloader */
    private static class C3547e {

        /* renamed from: a */
        Uri f13250a;

        /* renamed from: b */
        Object f13251b;

        C3547e(Uri uri, Object obj) {
            this.f13250a = uri;
            this.f13251b = obj;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3547e)) {
                return false;
            }
            C3547e eVar = (C3547e) obj;
            if (eVar.f13250a == this.f13250a && eVar.f13251b == this.f13251b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((1073 + this.f13250a.hashCode()) * 37) + this.f13251b.hashCode();
        }
    }

    /* renamed from: c */
    public static boolean m11842c(C3548r rVar) {
        boolean z;
        C3547e eVar = new C3547e(rVar.mo12063d(), rVar.mo12061b());
        Map<C3547e, C3546d> map = f13236d;
        synchronized (map) {
            C3546d dVar = map.get(eVar);
            z = true;
            if (dVar == null) {
                z = false;
            } else if (dVar.f13247a.cancel()) {
                map.remove(eVar);
            } else {
                dVar.f13249c = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.IOException} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
        r10 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11843d(com.facebook.internal.C3542q.C3547e r9, android.content.Context r10) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00b1, all -> 0x00a8 }
            android.net.Uri r4 = r9.f13250a     // Catch:{ IOException -> 0x00b1, all -> 0x00a8 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00b1, all -> 0x00a8 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00b1, all -> 0x00a8 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x00b1, all -> 0x00a8 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00b1, all -> 0x00a8 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x008c
            r10 = 301(0x12d, float:4.22E-43)
            if (r4 == r10) goto L_0x0059
            r10 = 302(0x12e, float:4.23E-43)
            if (r4 == r10) goto L_0x0059
            java.io.InputStream r10 = r3.getErrorStream()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r4.<init>()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r10 == 0) goto L_0x0049
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r5.<init>(r10)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r6 = 128(0x80, float:1.794E-43)
            char[] r7 = new char[r6]     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
        L_0x003b:
            int r8 = r5.read(r7, r1, r6)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r8 <= 0) goto L_0x0045
            r4.append(r7, r1, r8)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x003b
        L_0x0045:
            com.facebook.internal.C3481f0.m11630h(r5)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = "Unexpected error while downloading an image."
            r4.append(r5)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
        L_0x004e:
            com.facebook.j r5 = new com.facebook.j     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r5.<init>((java.lang.String) r4)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r4 = r0
            goto L_0x0095
        L_0x0059:
            java.lang.String r10 = "location"
            java.lang.String r10 = r3.getHeaderField(r10)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            boolean r2 = com.facebook.internal.C3481f0.m11604O(r10)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            if (r2 != 0) goto L_0x0084
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            android.net.Uri r2 = r9.f13250a     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            com.facebook.internal.C3479e0.m11587a(r2, r10)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            com.facebook.internal.q$d r2 = m11851l(r9)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            if (r2 == 0) goto L_0x0084
            boolean r4 = r2.f13249c     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            if (r4 != 0) goto L_0x0084
            com.facebook.internal.r r2 = r2.f13248b     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            com.facebook.internal.q$e r4 = new com.facebook.internal.q$e     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            java.lang.Object r5 = r9.f13251b     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            r4.<init>(r10, r5)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
            m11845f(r2, r4, r1)     // Catch:{ IOException -> 0x0088, all -> 0x00a3 }
        L_0x0084:
            r4 = r0
            r5 = r4
            r2 = 0
            goto L_0x0096
        L_0x0088:
            r4 = move-exception
            r10 = r0
            r2 = 0
            goto L_0x00b4
        L_0x008c:
            java.io.InputStream r10 = com.facebook.internal.C3553t.m11874c(r10, r3)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r5 = r0
        L_0x0095:
            r0 = r10
        L_0x0096:
            com.facebook.internal.C3481f0.m11630h(r0)
            com.facebook.internal.C3481f0.m11642n(r3)
            r0 = r4
            goto L_0x00bb
        L_0x009e:
            r9 = move-exception
            r0 = r10
            goto L_0x00aa
        L_0x00a1:
            r4 = move-exception
            goto L_0x00b4
        L_0x00a3:
            r9 = move-exception
            goto L_0x00aa
        L_0x00a5:
            r4 = move-exception
            r10 = r0
            goto L_0x00b4
        L_0x00a8:
            r9 = move-exception
            r3 = r0
        L_0x00aa:
            com.facebook.internal.C3481f0.m11630h(r0)
            com.facebook.internal.C3481f0.m11642n(r3)
            throw r9
        L_0x00b1:
            r4 = move-exception
            r10 = r0
            r3 = r10
        L_0x00b4:
            com.facebook.internal.C3481f0.m11630h(r10)
            com.facebook.internal.C3481f0.m11642n(r3)
            r5 = r4
        L_0x00bb:
            if (r2 == 0) goto L_0x00c0
            m11849j(r9, r5, r0, r1)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3542q.m11843d(com.facebook.internal.q$e, android.content.Context):void");
    }

    /* renamed from: e */
    public static void m11844e(C3548r rVar) {
        if (rVar != null) {
            C3547e eVar = new C3547e(rVar.mo12063d(), rVar.mo12061b());
            Map<C3547e, C3546d> map = f13236d;
            synchronized (map) {
                C3546d dVar = map.get(eVar);
                if (dVar != null) {
                    dVar.f13248b = rVar;
                    dVar.f13249c = false;
                    dVar.f13247a.mo11983a();
                } else {
                    m11845f(rVar, eVar, rVar.mo12064f());
                }
            }
        }
    }

    /* renamed from: f */
    private static void m11845f(C3548r rVar, C3547e eVar, boolean z) {
        m11847h(rVar, eVar, f13235c, new C3544b(rVar.mo12062c(), eVar, z));
    }

    /* renamed from: g */
    private static void m11846g(C3548r rVar, C3547e eVar) {
        m11847h(rVar, eVar, f13234b, new C3545c(rVar.mo12062c(), eVar));
    }

    /* renamed from: h */
    private static void m11847h(C3548r rVar, C3547e eVar, C3505i0 i0Var, Runnable runnable) {
        Map<C3547e, C3546d> map = f13236d;
        synchronized (map) {
            C3546d dVar = new C3546d((C3543a) null);
            dVar.f13248b = rVar;
            map.put(eVar, dVar);
            dVar.f13247a = i0Var.mo11980e(runnable);
        }
    }

    /* renamed from: i */
    private static synchronized Handler m11848i() {
        Handler handler;
        synchronized (C3542q.class) {
            if (f13233a == null) {
                f13233a = new Handler(Looper.getMainLooper());
            }
            handler = f13233a;
        }
        return handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = r7.f13248b;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11849j(com.facebook.internal.C3542q.C3547e r7, java.lang.Exception r8, android.graphics.Bitmap r9, boolean r10) {
        /*
            com.facebook.internal.q$d r7 = m11851l(r7)
            if (r7 == 0) goto L_0x0022
            boolean r0 = r7.f13249c
            if (r0 != 0) goto L_0x0022
            com.facebook.internal.r r2 = r7.f13248b
            com.facebook.internal.r$c r6 = r2.mo12060a()
            if (r6 == 0) goto L_0x0022
            android.os.Handler r7 = m11848i()
            com.facebook.internal.q$a r0 = new com.facebook.internal.q$a
            r1 = r0
            r3 = r8
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.post(r0)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3542q.m11849j(com.facebook.internal.q$e, java.lang.Exception, android.graphics.Bitmap, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m11850k(C3547e eVar, Context context, boolean z) {
        InputStream inputStream;
        Uri c;
        boolean z2 = false;
        if (!z || (c = C3479e0.m11589c(eVar.f13250a)) == null) {
            inputStream = null;
        } else {
            inputStream = C3553t.m11873b(c, context);
            if (inputStream != null) {
                z2 = true;
            }
        }
        if (!z2) {
            inputStream = C3553t.m11873b(eVar.f13250a, context);
        }
        if (inputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            C3481f0.m11630h(inputStream);
            m11849j(eVar, (Exception) null, decodeStream, z2);
            return;
        }
        C3546d l = m11851l(eVar);
        if (l != null && !l.f13249c) {
            m11846g(l.f13248b, eVar);
        }
    }

    /* renamed from: l */
    private static C3546d m11851l(C3547e eVar) {
        C3546d remove;
        Map<C3547e, C3546d> map = f13236d;
        synchronized (map) {
            remove = map.remove(eVar);
        }
        return remove;
    }
}
