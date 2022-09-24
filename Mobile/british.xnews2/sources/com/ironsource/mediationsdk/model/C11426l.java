package com.ironsource.mediationsdk.model;

/* renamed from: com.ironsource.mediationsdk.model.l */
public final class C11426l {

    /* renamed from: a */
    public boolean f51399a;

    /* renamed from: b */
    public boolean f51400b;

    /* renamed from: c */
    public boolean f51401c;

    /* renamed from: d */
    public C11428m f51402d;

    /* renamed from: e */
    public int f51403e;

    /* renamed from: f */
    public int f51404f;

    /* renamed from: com.ironsource.mediationsdk.model.l$a */
    public static class C11427a {

        /* renamed from: a */
        public boolean f51405a = true;

        /* renamed from: b */
        private boolean f51406b = false;

        /* renamed from: c */
        private boolean f51407c = false;

        /* renamed from: d */
        private C11428m f51408d = null;

        /* renamed from: e */
        private int f51409e = 0;

        /* renamed from: f */
        private int f51410f = 0;

        /* renamed from: a */
        public final C11427a mo44438a(boolean z, int i) {
            this.f51407c = z;
            this.f51410f = i;
            return this;
        }

        /* renamed from: a */
        public final C11427a mo44439a(boolean z, C11428m mVar, int i) {
            this.f51406b = z;
            if (mVar == null) {
                mVar = C11428m.PER_DAY;
            }
            this.f51408d = mVar;
            this.f51409e = i;
            return this;
        }

        /* renamed from: a */
        public final C11426l mo44440a() {
            return new C11426l(this.f51405a, this.f51406b, this.f51407c, this.f51408d, this.f51409e, this.f51410f, (byte) 0);
        }
    }

    private C11426l(boolean z, boolean z2, boolean z3, C11428m mVar, int i, int i2) {
        this.f51399a = z;
        this.f51400b = z2;
        this.f51401c = z3;
        this.f51402d = mVar;
        this.f51403e = i;
        this.f51404f = i2;
    }

    /* synthetic */ C11426l(boolean z, boolean z2, boolean z3, C11428m mVar, int i, int i2, byte b) {
        this(z, z2, z3, mVar, i, i2);
    }
}
