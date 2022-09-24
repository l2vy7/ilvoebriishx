package p311h9;

import java.util.List;
import java.util.NoSuchElementException;
import p308g8.C12716c;
import p308g8.C12722f;

/* renamed from: h9.k */
/* compiled from: BasicListHeaderIterator */
public class C12772k implements C12722f {

    /* renamed from: b */
    protected final List f55451b;

    /* renamed from: c */
    protected int f55452c;

    /* renamed from: d */
    protected int f55453d;

    /* renamed from: e */
    protected String f55454e;

    public C12772k(List list, String str) {
        if (list != null) {
            this.f55451b = list;
            this.f55454e = str;
            this.f55452c = mo47884b(-1);
            this.f55453d = -1;
            return;
        }
        throw new IllegalArgumentException("Header list must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47883a(int i) {
        if (this.f55454e == null) {
            return true;
        }
        return this.f55454e.equalsIgnoreCase(((C12716c) this.f55451b.get(i)).getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47884b(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.f55451b.size() - 1;
        boolean z = false;
        while (!z && i < size) {
            i++;
            z = mo47883a(i);
        }
        if (z) {
            return i;
        }
        return -1;
    }

    public boolean hasNext() {
        return this.f55452c >= 0;
    }

    /* renamed from: j */
    public C12716c mo47775j() throws NoSuchElementException {
        int i = this.f55452c;
        if (i >= 0) {
            this.f55453d = i;
            this.f55452c = mo47884b(i);
            return (C12716c) this.f55451b.get(i);
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final Object next() throws NoSuchElementException {
        return mo47775j();
    }

    public void remove() throws UnsupportedOperationException {
        int i = this.f55453d;
        if (i >= 0) {
            this.f55451b.remove(i);
            this.f55453d = -1;
            this.f55452c--;
            return;
        }
        throw new IllegalStateException("No header to remove.");
    }
}
