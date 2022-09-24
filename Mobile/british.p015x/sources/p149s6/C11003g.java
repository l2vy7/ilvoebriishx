package p149s6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: s6.g */
/* compiled from: Joiner */
public class C11003g {

    /* renamed from: a */
    private final String f49951a;

    private C11003g(String str) {
        this.f49951a = (String) C6073k.m26688k(str);
    }

    /* renamed from: e */
    public static C11003g m49350e(String str) {
        return new C11003g(str);
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public <A extends Appendable> A mo43292a(A a, Iterator<?> it) throws IOException {
        C6073k.m26688k(a);
        if (it.hasNext()) {
            a.append(mo43296f(it.next()));
            while (it.hasNext()) {
                a.append(this.f49951a);
                a.append(mo43296f(it.next()));
            }
        }
        return a;
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public final StringBuilder mo43293b(StringBuilder sb, Iterator<?> it) {
        try {
            mo43292a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final String mo43294c(Iterable<?> iterable) {
        return mo43295d(iterable.iterator());
    }

    /* renamed from: d */
    public final String mo43295d(Iterator<?> it) {
        return mo43293b(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public CharSequence mo43296f(Object obj) {
        C6073k.m26688k(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
