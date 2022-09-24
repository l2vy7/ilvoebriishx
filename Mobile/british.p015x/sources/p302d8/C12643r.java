package p302d8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p304e8.C12691c;

/* renamed from: d8.r */
/* compiled from: Maps.kt */
final class C12643r implements Map, Serializable {

    /* renamed from: b */
    public static final C12643r f55289b = new C12643r();

    private C12643r() {
    }

    private final Object readResolve() {
        return f55289b;
    }

    /* renamed from: b */
    public boolean mo47608b(Void voidR) {
        C12691c.m53984c(voidR, "value");
        return false;
    }

    /* renamed from: c */
    public Void mo47609c(Object obj) {
        return null;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo47608b((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set<Map.Entry> mo47613d() {
        return C12644s.f55290b;
    }

    /* renamed from: e */
    public Set<Object> mo47614e() {
        return C12644s.f55290b;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo47613d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public int mo47617f() {
        return 0;
    }

    /* renamed from: g */
    public Collection mo47618g() {
        return C12642q.f55288b;
    }

    public final /* bridge */ Object get(Object obj) {
        return mo47609c(obj);
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo47614e();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo47617f();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo47618g();
    }
}
