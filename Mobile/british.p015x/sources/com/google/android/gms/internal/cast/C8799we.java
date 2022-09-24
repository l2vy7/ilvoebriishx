package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.cast.we */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8799we {

    /* renamed from: e */
    private static final C8799we f44181e = new C8799we(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f44182a;

    /* renamed from: b */
    private int[] f44183b;

    /* renamed from: c */
    private Object[] f44184c;

    /* renamed from: d */
    private int f44185d;

    private C8799we() {
        this(0, new int[8], new Object[8], true);
    }

    private C8799we(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f44185d = -1;
        this.f44182a = 0;
        this.f44183b = iArr;
        this.f44184c = objArr;
    }

    /* renamed from: a */
    public static C8799we m41395a() {
        return f44181e;
    }

    /* renamed from: b */
    static C8799we m41396b(C8799we weVar, C8799we weVar2) {
        int i = weVar.f44182a;
        int i2 = weVar2.f44182a;
        int[] copyOf = Arrays.copyOf(weVar.f44183b, 0);
        System.arraycopy(weVar2.f44183b, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(weVar.f44184c, 0);
        System.arraycopy(weVar2.f44184c, 0, copyOf2, 0, 0);
        return new C8799we(0, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public final int mo36763c() {
        int i = this.f44185d;
        if (i != -1) {
            return i;
        }
        this.f44185d = 0;
        return 0;
    }

    /* renamed from: d */
    public final int mo36764d() {
        int i = this.f44185d;
        if (i != -1) {
            return i;
        }
        this.f44185d = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo36765e(StringBuilder sb, int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8799we)) {
            return false;
        }
        C8799we weVar = (C8799we) obj;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}
