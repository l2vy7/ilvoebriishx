package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;
import com.google.android.gms.internal.vision.C9643v2.C9644a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.v2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9643v2<MessageType extends C9643v2<MessageType, BuilderType>, BuilderType extends C9644a<MessageType, BuilderType>> extends C9687z0<MessageType, BuilderType> {
    private static Map<Object, C9643v2<?, ?>> zzyb = new ConcurrentHashMap();
    protected C9580n5 zzxz = C9580n5.m44487i();
    private int zzya = -1;

    /* renamed from: com.google.android.gms.internal.vision.v2$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static abstract class C9644a<MessageType extends C9643v2<MessageType, BuilderType>, BuilderType extends C9644a<MessageType, BuilderType>> extends C9481c1<MessageType, BuilderType> {

        /* renamed from: b */
        private final MessageType f45906b;

        /* renamed from: c */
        protected MessageType f45907c;

        /* renamed from: d */
        protected boolean f45908d = false;

        protected C9644a(MessageType messagetype) {
            this.f45906b = messagetype;
            this.f45907c = (C9643v2) messagetype.mo38236j(C9648e.f45916d, (Object) null, (Object) null);
        }

        /* renamed from: m */
        private static void m44641m(MessageType messagetype, MessageType messagetype2) {
            C9628t4.m44591b().mo38581c(messagetype).mo38446e(messagetype, messagetype2);
        }

        /* renamed from: n */
        private final BuilderType m44642n(byte[] bArr, int i, int i2, C9511f2 f2Var) throws C9513f3 {
            if (this.f45908d) {
                mo38615o();
                this.f45908d = false;
            }
            try {
                C9628t4.m44591b().mo38581c(this.f45907c).mo38449h(this.f45907c, bArr, 0, i2, new C9527h1(f2Var));
                return this;
            } catch (C9513f3 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C9513f3.m44255a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C9644a aVar = (C9644a) this.f45906b.mo38236j(C9648e.f45917e, (Object) null, (Object) null);
            aVar.mo38262i((C9643v2) mo38390t());
            return aVar;
        }

        /* renamed from: d */
        public final /* synthetic */ C9522g4 mo38425d() {
            return this.f45906b;
        }

        /* renamed from: k */
        public final /* synthetic */ C9481c1 mo38263k(byte[] bArr, int i, int i2, C9511f2 f2Var) throws C9513f3 {
            return m44642n(bArr, 0, i2, f2Var);
        }

        /* renamed from: l */
        public final BuilderType mo38262i(MessageType messagetype) {
            if (this.f45908d) {
                mo38615o();
                this.f45908d = false;
            }
            m44641m(this.f45907c, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo38615o() {
            MessageType messagetype = (C9643v2) this.f45907c.mo38236j(C9648e.f45916d, (Object) null, (Object) null);
            m44641m(messagetype, this.f45907c);
            this.f45907c = messagetype;
        }

        /* renamed from: p */
        public MessageType mo38390t() {
            if (this.f45908d) {
                return this.f45907c;
            }
            MessageType messagetype = this.f45907c;
            C9628t4.m44591b().mo38581c(messagetype).mo38443b(messagetype);
            this.f45908d = true;
            return this.f45907c;
        }

        /* renamed from: s */
        public final MessageType mo38389A() {
            MessageType messagetype = (C9643v2) mo38390t();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new C9564l5(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v2$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    protected static class C9645b<T extends C9643v2<T, ?>> extends C9501e1<T> {

        /* renamed from: b */
        private final T f45909b;

        public C9645b(T t) {
            this.f45909b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v2$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    static final class C9646c implements C9569m2<C9646c> {

        /* renamed from: b */
        final int f45910b;

        /* renamed from: c */
        final C9488c6 f45911c;

        /* renamed from: d */
        final boolean f45912d;

        /* renamed from: Q */
        public final boolean mo38494Q() {
            return this.f45912d;
        }

        /* renamed from: X */
        public final boolean mo38495X() {
            return false;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f45910b - ((C9646c) obj).f45910b;
        }

        /* renamed from: e */
        public final int mo38496e() {
            return this.f45910b;
        }

        /* renamed from: e0 */
        public final C9488c6 mo38497e0() {
            return this.f45911c;
        }

        /* renamed from: h */
        public final C9514f4 mo38498h(C9514f4 f4Var, C9522g4 g4Var) {
            return ((C9644a) f4Var).mo38262i((C9643v2) g4Var);
        }

        /* renamed from: i0 */
        public final C9555k4 mo38499i0(C9555k4 k4Var, C9555k4 k4Var2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: m0 */
        public final C9548j6 mo38500m0() {
            return this.f45911c.mo38310d();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v2$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static abstract class C9647d<MessageType extends C9647d<MessageType, BuilderType>, BuilderType> extends C9643v2<MessageType, BuilderType> implements C9538i4 {
        protected C9553k2<C9646c> zzyg = C9553k2.m44424q();

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public final C9553k2<C9646c> mo38619s() {
            if (this.zzyg.mo38470b()) {
                this.zzyg = (C9553k2) this.zzyg.clone();
            }
            return this.zzyg;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.vision.v2$e */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9648e {

        /* renamed from: a */
        public static final int f45913a = 1;

        /* renamed from: b */
        public static final int f45914b = 2;

        /* renamed from: c */
        public static final int f45915c = 3;

        /* renamed from: d */
        public static final int f45916d = 4;

        /* renamed from: e */
        public static final int f45917e = 5;

        /* renamed from: f */
        public static final int f45918f = 6;

        /* renamed from: g */
        public static final int f45919g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f45920h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: a */
        public static int[] m44660a() {
            return (int[]) f45920h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v2$f */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static class C9649f<ContainingType extends C9522g4, Type> extends C9520g2<ContainingType, Type> {

        /* renamed from: a */
        final C9522g4 f45921a;

        /* renamed from: b */
        final C9646c f45922b;
    }

    /* renamed from: k */
    protected static Object m44625k(C9522g4 g4Var, String str, Object[] objArr) {
        return new C9636u4(g4Var, str, objArr);
    }

    /* renamed from: l */
    static Object m44626l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: m */
    protected static <T extends C9643v2<?, ?>> void m44627m(Class<T> cls, T t) {
        zzyb.put(cls, t);
    }

    /* renamed from: n */
    protected static final <T extends C9643v2<T, ?>> boolean m44628n(T t, boolean z) {
        byte byteValue = ((Byte) t.mo38236j(C9648e.f45913a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C9628t4.m44591b().mo38581c(t).mo38445d(t);
        if (z) {
            t.mo38236j(C9648e.f45914b, d ? t : null, (Object) null);
        }
        return d;
    }

    /* renamed from: o */
    static <T extends C9643v2<?, ?>> T m44629o(Class<T> cls) {
        T t = (C9643v2) zzyb.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C9643v2) zzyb.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C9643v2) ((C9643v2) C9652v5.m44696r(cls)).mo38236j(C9648e.f45918f, (Object) null, (Object) null);
            if (t != null) {
                zzyb.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.a3, com.google.android.gms.internal.vision.x2] */
    /* renamed from: q */
    protected static C9465a3 m44630q() {
        return C9673x2.m44801q();
    }

    /* renamed from: r */
    protected static <E> C9485c3<E> m44631r() {
        return C9620s4.m44576j();
    }

    /* renamed from: a */
    public final /* synthetic */ C9514f4 mo38401a() {
        return (C9644a) mo38236j(C9648e.f45917e, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final int mo38402b() {
        if (this.zzya == -1) {
            this.zzya = C9628t4.m44591b().mo38581c(this).mo38448g(this);
        }
        return this.zzya;
    }

    /* renamed from: c */
    public final /* synthetic */ C9514f4 mo38403c() {
        C9644a aVar = (C9644a) mo38236j(C9648e.f45917e, (Object) null, (Object) null);
        aVar.mo38262i(this);
        return aVar;
    }

    /* renamed from: d */
    public final /* synthetic */ C9522g4 mo38425d() {
        return (C9643v2) mo38236j(C9648e.f45918f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C9628t4.m44591b().mo38581c(this).mo38442a(this, (C9643v2) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo38608f(int i) {
        this.zzya = i;
    }

    /* renamed from: g */
    public final void mo38404g(C9482c2 c2Var) throws IOException {
        C9628t4.m44591b().mo38581c(this).mo38450i(this, C9502e2.m44188O(c2Var));
    }

    public int hashCode() {
        int i = this.zzte;
        if (i != 0) {
            return i;
        }
        int f = C9628t4.m44591b().mo38581c(this).mo38447f(this);
        this.zzte = f;
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo38610i() {
        return this.zzya;
    }

    public final boolean isInitialized() {
        return m44628n(this, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Object mo38236j(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final <MessageType extends C9643v2<MessageType, BuilderType>, BuilderType extends C9644a<MessageType, BuilderType>> BuilderType mo38611p() {
        return (C9644a) mo38236j(C9648e.f45917e, (Object) null, (Object) null);
    }

    public String toString() {
        return C9530h4.m44289a(this, super.toString());
    }
}
