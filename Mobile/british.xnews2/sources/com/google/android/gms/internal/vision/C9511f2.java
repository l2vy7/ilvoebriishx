package com.google.android.gms.internal.vision;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.gms.internal.vision.C9643v2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.f2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C9511f2 {

    /* renamed from: b */
    private static volatile C9511f2 f45633b;

    /* renamed from: c */
    private static volatile C9511f2 f45634c;

    /* renamed from: d */
    private static final C9511f2 f45635d = new C9511f2(true);

    /* renamed from: a */
    private final Map<C9512a, C9643v2.C9649f<?, ?>> f45636a;

    /* renamed from: com.google.android.gms.internal.vision.f2$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static final class C9512a {

        /* renamed from: a */
        private final Object f45637a;

        /* renamed from: b */
        private final int f45638b;

        C9512a(Object obj, int i) {
            this.f45637a = obj;
            this.f45638b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C9512a)) {
                return false;
            }
            C9512a aVar = (C9512a) obj;
            if (this.f45637a == aVar.f45637a && this.f45638b == aVar.f45638b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f45637a) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.f45638b;
        }
    }

    C9511f2() {
        this.f45636a = new HashMap();
    }

    /* renamed from: b */
    public static C9511f2 m44252b() {
        C9511f2 f2Var = f45633b;
        if (f2Var == null) {
            synchronized (C9511f2.class) {
                f2Var = f45633b;
                if (f2Var == null) {
                    f2Var = f45635d;
                    f45633b = f2Var;
                }
            }
        }
        return f2Var;
    }

    /* renamed from: c */
    public static C9511f2 m44253c() {
        Class<C9511f2> cls = C9511f2.class;
        C9511f2 f2Var = f45634c;
        if (f2Var != null) {
            return f2Var;
        }
        synchronized (cls) {
            C9511f2 f2Var2 = f45634c;
            if (f2Var2 != null) {
                return f2Var2;
            }
            C9511f2 a = C9634u2.m44598a(cls);
            f45634c = a;
            return a;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends C9522g4> C9643v2.C9649f<ContainingType, ?> mo38386a(ContainingType containingtype, int i) {
        return this.f45636a.get(new C9512a(containingtype, i));
    }

    private C9511f2(boolean z) {
        this.f45636a = Collections.emptyMap();
    }
}
