package p195c7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p189a7.C6502b;
import p189a7.C6503c;
import p189a7.C6504d;
import p189a7.C6505e;
import p189a7.C6506f;
import p189a7.C6507g;

/* renamed from: c7.e */
/* compiled from: JsonValueObjectEncoderContext */
final class C6539e implements C6505e, C6507g {

    /* renamed from: a */
    private C6539e f27187a = null;

    /* renamed from: b */
    private boolean f27188b = true;

    /* renamed from: c */
    private final JsonWriter f27189c;

    /* renamed from: d */
    private final Map<Class<?>, C6504d<?>> f27190d;

    /* renamed from: e */
    private final Map<Class<?>, C6506f<?>> f27191e;

    /* renamed from: f */
    private final C6504d<Object> f27192f;

    /* renamed from: g */
    private final boolean f27193g;

    C6539e(Writer writer, Map<Class<?>, C6504d<?>> map, Map<Class<?>, C6506f<?>> map2, C6504d<Object> dVar, boolean z) {
        this.f27189c = new JsonWriter(writer);
        this.f27190d = map;
        this.f27191e = map2;
        this.f27192f = dVar;
        this.f27193g = z;
    }

    /* renamed from: l */
    private boolean m28345l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: o */
    private C6539e m28346o(String str, Object obj) throws IOException, C6502b {
        m28348q();
        this.f27189c.name(str);
        if (obj != null) {
            return mo24366f(obj, false);
        }
        this.f27189c.nullValue();
        return this;
    }

    /* renamed from: p */
    private C6539e m28347p(String str, Object obj) throws IOException, C6502b {
        if (obj == null) {
            return this;
        }
        m28348q();
        this.f27189c.name(str);
        return mo24366f(obj, false);
    }

    /* renamed from: q */
    private void m28348q() throws IOException {
        if (this.f27188b) {
            C6539e eVar = this.f27187a;
            if (eVar != null) {
                eVar.m28348q();
                this.f27187a.f27188b = false;
                this.f27187a = null;
                this.f27189c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public C6505e mo24332a(C6503c cVar, Object obj) throws IOException {
        return mo24369i(cVar.mo24328a(), obj);
    }

    /* renamed from: d */
    public C6505e mo24333d(C6503c cVar, long j) throws IOException {
        return mo24368h(cVar.mo24328a(), j);
    }

    /* renamed from: e */
    public C6539e mo24365e(long j) throws IOException {
        m28348q();
        this.f27189c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6539e mo24366f(Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z && m28345l(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new C6502b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f27189c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f27189c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo24371k((byte[]) obj);
            }
            this.f27189c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f27189c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo24365e(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f27189c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f27189c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number f : (Number[]) obj) {
                    mo24366f(f, false);
                }
            } else {
                for (Object f2 : (Object[]) obj) {
                    mo24366f(f2, false);
                }
            }
            this.f27189c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f27189c.beginArray();
            for (Object f3 : (Collection) obj) {
                mo24366f(f3, false);
            }
            this.f27189c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f27189c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo24369i((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C6502b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f27189c.endObject();
            return this;
        } else {
            C6504d dVar = this.f27190d.get(obj.getClass());
            if (dVar != null) {
                return mo24373n(dVar, obj, z);
            }
            C6506f fVar = this.f27191e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo24334a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo24373n(this.f27192f, obj, z);
            } else {
                mo24335b(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: g */
    public C6539e mo24335b(String str) throws IOException {
        m28348q();
        this.f27189c.value(str);
        return this;
    }

    /* renamed from: h */
    public C6539e mo24368h(String str, long j) throws IOException {
        m28348q();
        this.f27189c.name(str);
        return mo24365e(j);
    }

    /* renamed from: i */
    public C6539e mo24369i(String str, Object obj) throws IOException {
        if (this.f27193g) {
            return m28347p(str, obj);
        }
        return m28346o(str, obj);
    }

    /* renamed from: j */
    public C6539e mo24336c(boolean z) throws IOException {
        m28348q();
        this.f27189c.value(z);
        return this;
    }

    /* renamed from: k */
    public C6539e mo24371k(byte[] bArr) throws IOException {
        m28348q();
        if (bArr == null) {
            this.f27189c.nullValue();
        } else {
            this.f27189c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo24372m() throws IOException {
        m28348q();
        this.f27189c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C6539e mo24373n(C6504d<Object> dVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f27189c.beginObject();
        }
        dVar.mo23179a(obj, this);
        if (!z) {
            this.f27189c.endObject();
        }
        return this;
    }
}
