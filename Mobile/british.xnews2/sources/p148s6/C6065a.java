package p148s6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: s6.a */
/* compiled from: AbstractIterator */
abstract class C6065a<T> implements Iterator<T> {

    /* renamed from: b */
    private C6067b f25250b = C6067b.NOT_READY;
    @NullableDecl

    /* renamed from: c */
    private T f25251c;

    /* renamed from: s6.a$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C6066a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25252a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                s6.a$b[] r0 = p148s6.C6065a.C6067b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25252a = r0
                s6.a$b r1 = p148s6.C6065a.C6067b.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25252a     // Catch:{ NoSuchFieldError -> 0x001d }
                s6.a$b r1 = p148s6.C6065a.C6067b.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148s6.C6065a.C6066a.<clinit>():void");
        }
    }

    /* renamed from: s6.a$b */
    /* compiled from: AbstractIterator */
    private enum C6067b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C6065a() {
    }

    /* renamed from: c */
    private boolean m26671c() {
        this.f25250b = C6067b.FAILED;
        this.f25251c = mo23253a();
        if (this.f25250b == C6067b.DONE) {
            return false;
        }
        this.f25250b = C6067b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo23253a();

    /* access modifiers changed from: protected */
    @NullableDecl
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo23254b() {
        this.f25250b = C6067b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C6073k.m26693p(this.f25250b != C6067b.FAILED);
        int i = C6066a.f25252a[this.f25250b.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return m26671c();
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.f25250b = C6067b.NOT_READY;
            T t = this.f25251c;
            this.f25251c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
