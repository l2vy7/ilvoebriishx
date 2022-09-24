package p081g2;

import p064d2.C5154a;
import p064d2.C5156c;

/* renamed from: g2.j */
/* compiled from: DiskCacheStrategy */
public abstract class C5292j {

    /* renamed from: a */
    public static final C5292j f23391a = new C5293a();

    /* renamed from: b */
    public static final C5292j f23392b = new C5294b();

    /* renamed from: c */
    public static final C5292j f23393c = new C5295c();

    /* renamed from: d */
    public static final C5292j f23394d = new C5296d();

    /* renamed from: e */
    public static final C5292j f23395e = new C5297e();

    /* renamed from: g2.j$a */
    /* compiled from: DiskCacheStrategy */
    class C5293a extends C5292j {
        C5293a() {
        }

        /* renamed from: a */
        public boolean mo21549a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo21550b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo21551c(C5154a aVar) {
            return aVar == C5154a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo21552d(boolean z, C5154a aVar, C5156c cVar) {
            return (aVar == C5154a.RESOURCE_DISK_CACHE || aVar == C5154a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: g2.j$b */
    /* compiled from: DiskCacheStrategy */
    class C5294b extends C5292j {
        C5294b() {
        }

        /* renamed from: a */
        public boolean mo21549a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo21550b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo21551c(C5154a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo21552d(boolean z, C5154a aVar, C5156c cVar) {
            return false;
        }
    }

    /* renamed from: g2.j$c */
    /* compiled from: DiskCacheStrategy */
    class C5295c extends C5292j {
        C5295c() {
        }

        /* renamed from: a */
        public boolean mo21549a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo21550b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo21551c(C5154a aVar) {
            return (aVar == C5154a.DATA_DISK_CACHE || aVar == C5154a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo21552d(boolean z, C5154a aVar, C5156c cVar) {
            return false;
        }
    }

    /* renamed from: g2.j$d */
    /* compiled from: DiskCacheStrategy */
    class C5296d extends C5292j {
        C5296d() {
        }

        /* renamed from: a */
        public boolean mo21549a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo21550b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo21551c(C5154a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo21552d(boolean z, C5154a aVar, C5156c cVar) {
            return (aVar == C5154a.RESOURCE_DISK_CACHE || aVar == C5154a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: g2.j$e */
    /* compiled from: DiskCacheStrategy */
    class C5297e extends C5292j {
        C5297e() {
        }

        /* renamed from: a */
        public boolean mo21549a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo21550b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo21551c(C5154a aVar) {
            return aVar == C5154a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo21552d(boolean z, C5154a aVar, C5156c cVar) {
            return ((z && aVar == C5154a.DATA_DISK_CACHE) || aVar == C5154a.LOCAL) && cVar == C5156c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo21549a();

    /* renamed from: b */
    public abstract boolean mo21550b();

    /* renamed from: c */
    public abstract boolean mo21551c(C5154a aVar);

    /* renamed from: d */
    public abstract boolean mo21552d(boolean z, C5154a aVar, C5156c cVar);
}
