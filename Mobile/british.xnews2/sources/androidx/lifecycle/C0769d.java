package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.d */
/* compiled from: Lifecycle */
public abstract class C0769d {

    /* renamed from: a */
    AtomicReference<Object> f3832a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.d$a */
    /* compiled from: Lifecycle */
    static /* synthetic */ class C0770a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3833a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3834b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        static {
            /*
                androidx.lifecycle.d$b[] r0 = androidx.lifecycle.C0769d.C0771b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3834b = r0
                r1 = 1
                androidx.lifecycle.d$b r2 = androidx.lifecycle.C0769d.C0771b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3834b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$b r3 = androidx.lifecycle.C0769d.C0771b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3834b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$b r4 = androidx.lifecycle.C0769d.C0771b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3834b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.d$b r5 = androidx.lifecycle.C0769d.C0771b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f3834b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.d$b r6 = androidx.lifecycle.C0769d.C0771b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f3834b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.d$b r6 = androidx.lifecycle.C0769d.C0771b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f3834b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.d$b r6 = androidx.lifecycle.C0769d.C0771b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                androidx.lifecycle.d$c[] r5 = androidx.lifecycle.C0769d.C0772c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3833a = r5
                androidx.lifecycle.d$c r6 = androidx.lifecycle.C0769d.C0772c.CREATED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f3833a     // Catch:{ NoSuchFieldError -> 0x006f }
                androidx.lifecycle.d$c r5 = androidx.lifecycle.C0769d.C0772c.STARTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f3833a     // Catch:{ NoSuchFieldError -> 0x0079 }
                androidx.lifecycle.d$c r1 = androidx.lifecycle.C0769d.C0772c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f3833a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.lifecycle.d$c r1 = androidx.lifecycle.C0769d.C0772c.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f3833a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.d$c r1 = androidx.lifecycle.C0769d.C0772c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0769d.C0770a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.d$b */
    /* compiled from: Lifecycle */
    public enum C0771b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: a */
        public static C0771b m4269a(C0772c cVar) {
            int i = C0770a.f3833a[cVar.ordinal()];
            if (i == 1) {
                return ON_DESTROY;
            }
            if (i == 2) {
                return ON_STOP;
            }
            if (i != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        /* renamed from: i */
        public static C0771b m4270i(C0772c cVar) {
            int i = C0770a.f3833a[cVar.ordinal()];
            if (i == 1) {
                return ON_START;
            }
            if (i == 2) {
                return ON_RESUME;
            }
            if (i != 5) {
                return null;
            }
            return ON_CREATE;
        }

        /* renamed from: d */
        public C0772c mo3987d() {
            switch (C0770a.f3834b[ordinal()]) {
                case 1:
                case 2:
                    return C0772c.CREATED;
                case 3:
                case 4:
                    return C0772c.STARTED;
                case 5:
                    return C0772c.RESUMED;
                case 6:
                    return C0772c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.d$c */
    /* compiled from: Lifecycle */
    public enum C0772c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo3988a(C0772c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo3984a(C0774f fVar);

    /* renamed from: b */
    public abstract C0772c mo3985b();

    /* renamed from: c */
    public abstract void mo3986c(C0774f fVar);
}
