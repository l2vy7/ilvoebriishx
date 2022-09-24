package p148s6;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: s6.h */
/* compiled from: Objects */
public final class C6069h extends C11002e {
    /* renamed from: a */
    public static boolean m26674a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m26675b(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
