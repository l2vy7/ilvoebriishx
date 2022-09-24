package androidx.mediarouter.media;

import android.content.Context;
import android.os.Build;
import androidx.mediarouter.media.C1029y;
import java.lang.ref.WeakReference;

/* renamed from: androidx.mediarouter.media.f0 */
/* compiled from: RemoteControlClientCompat */
abstract class C0956f0 {

    /* renamed from: a */
    protected final Context f4433a;

    /* renamed from: b */
    protected final Object f4434b;

    /* renamed from: c */
    protected C0961d f4435c;

    /* renamed from: androidx.mediarouter.media.f0$a */
    /* compiled from: RemoteControlClientCompat */
    static class C0957a extends C0956f0 {

        /* renamed from: d */
        private final Object f4436d;

        /* renamed from: e */
        private final Object f4437e;

        /* renamed from: f */
        private final Object f4438f;

        /* renamed from: g */
        private boolean f4439g;

        /* renamed from: androidx.mediarouter.media.f0$a$a */
        /* compiled from: RemoteControlClientCompat */
        private static final class C0958a implements C1029y.C1036g {

            /* renamed from: b */
            private final WeakReference<C0957a> f4440b;

            public C0958a(C0957a aVar) {
                this.f4440b = new WeakReference<>(aVar);
            }

            /* renamed from: c */
            public void mo4535c(Object obj, int i) {
                C0961d dVar;
                C0957a aVar = (C0957a) this.f4440b.get();
                if (aVar != null && (dVar = aVar.f4435c) != null) {
                    dVar.mo4538b(i);
                }
            }

            /* renamed from: j */
            public void mo4536j(Object obj, int i) {
                C0961d dVar;
                C0957a aVar = (C0957a) this.f4440b.get();
                if (aVar != null && (dVar = aVar.f4435c) != null) {
                    dVar.mo4537a(i);
                }
            }
        }

        public C0957a(Context context, Object obj) {
            super(context, obj);
            Object g = C1029y.m5308g(context);
            this.f4436d = g;
            Object d = C1029y.m5305d(g, "", false);
            this.f4437e = d;
            this.f4438f = C1029y.m5306e(g, d);
        }

        /* renamed from: c */
        public void mo4533c(C0960c cVar) {
            C1029y.C1035f.m5339e(this.f4438f, cVar.f4441a);
            C1029y.C1035f.m5342h(this.f4438f, cVar.f4442b);
            C1029y.C1035f.m5341g(this.f4438f, cVar.f4443c);
            C1029y.C1035f.m5336b(this.f4438f, cVar.f4444d);
            C1029y.C1035f.m5337c(this.f4438f, cVar.f4445e);
            if (!this.f4439g) {
                this.f4439g = true;
                C1029y.C1035f.m5340f(this.f4438f, C1029y.m5307f(new C0958a(this)));
                C1029y.C1035f.m5338d(this.f4438f, this.f4434b);
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.f0$b */
    /* compiled from: RemoteControlClientCompat */
    static class C0959b extends C0956f0 {
        public C0959b(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* renamed from: androidx.mediarouter.media.f0$c */
    /* compiled from: RemoteControlClientCompat */
    public static final class C0960c {

        /* renamed from: a */
        public int f4441a;

        /* renamed from: b */
        public int f4442b;

        /* renamed from: c */
        public int f4443c = 0;

        /* renamed from: d */
        public int f4444d = 3;

        /* renamed from: e */
        public int f4445e = 1;

        /* renamed from: f */
        public String f4446f;
    }

    /* renamed from: androidx.mediarouter.media.f0$d */
    /* compiled from: RemoteControlClientCompat */
    public interface C0961d {
        /* renamed from: a */
        void mo4537a(int i);

        /* renamed from: b */
        void mo4538b(int i);
    }

    protected C0956f0(Context context, Object obj) {
        this.f4433a = context;
        this.f4434b = obj;
    }

    /* renamed from: b */
    public static C0956f0 m4905b(Context context, Object obj) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0957a(context, obj);
        }
        return new C0959b(context, obj);
    }

    /* renamed from: a */
    public Object mo4532a() {
        return this.f4434b;
    }

    /* renamed from: c */
    public void mo4533c(C0960c cVar) {
    }

    /* renamed from: d */
    public void mo4534d(C0961d dVar) {
        this.f4435c = dVar;
    }
}
