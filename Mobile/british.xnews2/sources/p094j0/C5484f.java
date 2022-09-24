package p094j0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;
import p104l0.C5648h;

/* renamed from: j0.f */
/* compiled from: FontsContractCompat */
public class C5484f {

    /* renamed from: j0.f$a */
    /* compiled from: FontsContractCompat */
    public static class C5485a {

        /* renamed from: a */
        private final int f23874a;

        /* renamed from: b */
        private final C5486b[] f23875b;

        @Deprecated
        public C5485a(int i, C5486b[] bVarArr) {
            this.f23874a = i;
            this.f23875b = bVarArr;
        }

        /* renamed from: a */
        static C5485a m24511a(int i, C5486b[] bVarArr) {
            return new C5485a(i, bVarArr);
        }

        /* renamed from: b */
        public C5486b[] mo21954b() {
            return this.f23875b;
        }

        /* renamed from: c */
        public int mo21955c() {
            return this.f23874a;
        }
    }

    /* renamed from: j0.f$b */
    /* compiled from: FontsContractCompat */
    public static class C5486b {

        /* renamed from: a */
        private final Uri f23876a;

        /* renamed from: b */
        private final int f23877b;

        /* renamed from: c */
        private final int f23878c;

        /* renamed from: d */
        private final boolean f23879d;

        /* renamed from: e */
        private final int f23880e;

        @Deprecated
        public C5486b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f23876a = (Uri) C5648h.m24964c(uri);
            this.f23877b = i;
            this.f23878c = i2;
            this.f23879d = z;
            this.f23880e = i3;
        }

        /* renamed from: a */
        static C5486b m24514a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C5486b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo21956b() {
            return this.f23880e;
        }

        /* renamed from: c */
        public int mo21957c() {
            return this.f23877b;
        }

        /* renamed from: d */
        public Uri mo21958d() {
            return this.f23876a;
        }

        /* renamed from: e */
        public int mo21959e() {
            return this.f23878c;
        }

        /* renamed from: f */
        public boolean mo21960f() {
            return this.f23879d;
        }
    }

    /* renamed from: j0.f$c */
    /* compiled from: FontsContractCompat */
    public static class C5487c {
        /* renamed from: a */
        public void mo9262a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo9263b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m24510a(Context context, C5477d dVar, int i, boolean z, int i2, Handler handler, C5487c cVar) {
        C5471a aVar = new C5471a(cVar, handler);
        if (z) {
            return C5478e.m24504e(context, dVar, aVar, i, i2);
        }
        return C5478e.m24503d(context, dVar, i, (Executor) null, aVar);
    }
}
