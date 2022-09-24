package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.b */
/* compiled from: AbstractIterator */
public abstract class C4681b<T> extends C10388e1<T> {

    /* renamed from: b */
    private C4683b f21371b = C4683b.NOT_READY;
    @NullableDecl

    /* renamed from: c */
    private T f21372c;

    /* renamed from: com.google.common.collect.b$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C4682a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21373a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.b$b[] r0 = com.google.common.collect.C4681b.C4683b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21373a = r0
                com.google.common.collect.b$b r1 = com.google.common.collect.C4681b.C4683b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21373a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.b$b r1 = com.google.common.collect.C4681b.C4683b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4681b.C4682a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.b$b */
    /* compiled from: AbstractIterator */
    private enum C4683b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C4681b() {
    }

    /* renamed from: c */
    private boolean m21664c() {
        this.f21371b = C4683b.FAILED;
        this.f21372c = mo19468a();
        if (this.f21371b == C4683b.DONE) {
            return false;
        }
        this.f21371b = C4683b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo19468a();

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo19469b() {
        this.f21371b = C4683b.DONE;
        return null;
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        C6073k.m26693p(this.f21371b != C4683b.FAILED);
        int i = C4682a.f21373a[this.f21371b.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m21664c();
        }
        return true;
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f21371b = C4683b.NOT_READY;
            T t = this.f21372c;
            this.f21372c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
