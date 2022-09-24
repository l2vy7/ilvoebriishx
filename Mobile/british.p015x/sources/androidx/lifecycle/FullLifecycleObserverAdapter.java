package androidx.lifecycle;

import androidx.lifecycle.C0769d;

class FullLifecycleObserverAdapter implements C0773e {

    /* renamed from: a */
    private final C0767b f3795a;

    /* renamed from: b */
    private final C0773e f3796b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0758a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.d$b[] r0 = androidx.lifecycle.C0769d.C0771b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3797a = r0
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3797a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3797a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3797a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3797a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3797a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3797a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C0769d.C0771b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0758a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C0767b bVar, C0773e eVar) {
        this.f3795a = bVar;
        this.f3796b = eVar;
    }

    /* renamed from: c */
    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
        switch (C0758a.f3797a[bVar.ordinal()]) {
            case 1:
                this.f3795a.mo3978b(gVar);
                break;
            case 2:
                this.f3795a.mo3982g(gVar);
                break;
            case 3:
                this.f3795a.mo3977a(gVar);
                break;
            case 4:
                this.f3795a.mo3979d(gVar);
                break;
            case 5:
                this.f3795a.mo3980e(gVar);
                break;
            case 6:
                this.f3795a.mo3981f(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0773e eVar = this.f3796b;
        if (eVar != null) {
            eVar.mo660c(gVar, bVar);
        }
    }
}
