package p301d8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: d8.p */
/* compiled from: Collections.kt */
public final class C12641p implements ListIterator {

    /* renamed from: b */
    public static final C12641p f55287b = new C12641p();

    private C12641p() {
    }

    /* renamed from: a */
    public Void next() {
        throw new NoSuchElementException();
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
