package p302d8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p304e8.C12689a;
import p304e8.C12691c;

/* renamed from: d8.s */
/* compiled from: Sets.kt */
public final class C12644s implements Set, Serializable {

    /* renamed from: b */
    public static final C12644s f55290b = new C12644s();

    private C12644s() {
    }

    private final Object readResolve() {
        return f55290b;
    }

    /* renamed from: a */
    public boolean mo47629a(Void voidR) {
        C12691c.m53984c(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int mo47632c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo47629a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C12691c.m53984c(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C12641p.f55287b;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo47632c();
    }

    public Object[] toArray() {
        return C12689a.m53980a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12689a.m53981b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
