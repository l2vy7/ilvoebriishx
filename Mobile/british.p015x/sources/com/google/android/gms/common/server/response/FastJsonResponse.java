package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p006a5.C6481c;
import p006a5.C6489l;
import p006a5.C6490m;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class FastJsonResponse {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7458a<I, O> {
        /* renamed from: x */
        I mo30196x(O o);
    }

    /* renamed from: g */
    protected static final <O, I> I m30119g(Field<I, O> field, Object obj) {
        return field.f29431l != null ? field.mo30211L0(obj) : obj;
    }

    /* renamed from: h */
    private static final void m30120h(StringBuilder sb, Field field, Object obj) {
        int i = field.f29422c;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.f29428i;
            C4604n.m20098k(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C6489l.m28275b((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo29036a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo29037b(Field field) {
        String str = field.f29426g;
        if (field.f29428i == null) {
            return mo30206d(str);
        }
        C4604n.m20103p(mo30206d(str) == null, "Concrete field shouldn't be value object: %s", field.f29426g);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo30206d(String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo29038e(Field field) {
        if (field.f29424e != 11) {
            return mo30207f(field.f29426g);
        }
        if (field.f29425f) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo30207f(String str);

    public String toString() {
        Map<String, Field<?, ?>> a = mo29036a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo29038e(field)) {
                Object g = m30119g(field, mo29037b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (g != null) {
                    switch (field.f29424e) {
                        case 8:
                            sb.append("\"");
                            sb.append(C6481c.m28246a((byte[]) g));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C6481c.m28247b((byte[]) g));
                            sb.append("\"");
                            break;
                        case 10:
                            C6490m.m28276a(sb, (HashMap) g);
                            break;
                        default:
                            if (!field.f29423d) {
                                m30120h(sb, field, g);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) g;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m30120h(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C7459a CREATOR = new C7459a();

        /* renamed from: b */
        private final int f29421b;

        /* renamed from: c */
        protected final int f29422c;

        /* renamed from: d */
        protected final boolean f29423d;

        /* renamed from: e */
        protected final int f29424e;

        /* renamed from: f */
        protected final boolean f29425f;

        /* renamed from: g */
        protected final String f29426g;

        /* renamed from: h */
        protected final int f29427h;

        /* renamed from: i */
        protected final Class<? extends FastJsonResponse> f29428i;

        /* renamed from: j */
        protected final String f29429j;

        /* renamed from: k */
        private zan f29430k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C7458a<I, O> f29431l;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f29421b = i;
            this.f29422c = i2;
            this.f29423d = z;
            this.f29424e = i3;
            this.f29425f = z2;
            this.f29426g = str;
            this.f29427h = i4;
            if (str2 == null) {
                this.f29428i = null;
                this.f29429j = null;
            } else {
                this.f29428i = SafeParcelResponse.class;
                this.f29429j = str2;
            }
            if (zaa == null) {
                this.f29431l = null;
            } else {
                this.f29431l = zaa.mo30203D0();
            }
        }

        /* renamed from: C0 */
        public static Field<byte[], byte[]> m30126C0(String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class<? extends FastJsonResponse>) null, (C7458a) null);
        }

        /* renamed from: D0 */
        public static <T extends FastJsonResponse> Field<T, T> m30127D0(String str, int i, Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (C7458a) null);
        }

        /* renamed from: E0 */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m30128E0(String str, int i, Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (C7458a) null);
        }

        /* renamed from: F0 */
        public static Field<Integer, Integer> m30129F0(String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class<? extends FastJsonResponse>) null, (C7458a) null);
        }

        /* renamed from: G0 */
        public static Field<String, String> m30130G0(String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class<? extends FastJsonResponse>) null, (C7458a) null);
        }

        /* renamed from: H0 */
        public static Field<ArrayList<String>, ArrayList<String>> m30131H0(String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class<? extends FastJsonResponse>) null, (C7458a) null);
        }

        /* renamed from: I0 */
        public int mo30209I0() {
            return this.f29427h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J0 */
        public final zaa mo30210J0() {
            C7458a<I, O> aVar = this.f29431l;
            if (aVar == null) {
                return null;
            }
            return zaa.m30117C0(aVar);
        }

        /* renamed from: L0 */
        public final I mo30211L0(O o) {
            C4604n.m20098k(this.f29431l);
            return this.f29431l.mo30196x(o);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M0 */
        public final String mo30212M0() {
            String str = this.f29429j;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: N0 */
        public final Map<String, Field<?, ?>> mo30213N0() {
            C4604n.m20098k(this.f29429j);
            C4604n.m20098k(this.f29430k);
            return (Map) C4604n.m20098k(this.f29430k.mo30236D0(this.f29429j));
        }

        /* renamed from: O0 */
        public final void mo30214O0(zan zan) {
            this.f29430k = zan;
        }

        /* renamed from: P0 */
        public final boolean mo30215P0() {
            return this.f29431l != null;
        }

        public final String toString() {
            C7408m.C7409a a = C7408m.m30030c(this).mo30140a("versionCode", Integer.valueOf(this.f29421b)).mo30140a("typeIn", Integer.valueOf(this.f29422c)).mo30140a("typeInArray", Boolean.valueOf(this.f29423d)).mo30140a("typeOut", Integer.valueOf(this.f29424e)).mo30140a("typeOutArray", Boolean.valueOf(this.f29425f)).mo30140a("outputFieldName", this.f29426g).mo30140a("safeParcelFieldId", Integer.valueOf(this.f29427h)).mo30140a("concreteTypeName", mo30212M0());
            Class<? extends FastJsonResponse> cls = this.f29428i;
            if (cls != null) {
                a.mo30140a("concreteType.class", cls.getCanonicalName());
            }
            C7458a<I, O> aVar = this.f29431l;
            if (aVar != null) {
                a.mo30140a("converterName", aVar.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49527m(parcel, 1, this.f29421b);
            C11058b.m49527m(parcel, 2, this.f29422c);
            C11058b.m49517c(parcel, 3, this.f29423d);
            C11058b.m49527m(parcel, 4, this.f29424e);
            C11058b.m49517c(parcel, 5, this.f29425f);
            C11058b.m49537w(parcel, 6, this.f29426g, false);
            C11058b.m49527m(parcel, 7, mo30209I0());
            C11058b.m49537w(parcel, 8, mo30212M0(), false);
            C11058b.m49535u(parcel, 9, mo30210J0(), i, false);
            C11058b.m49516b(parcel, a);
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, C7458a<I, O> aVar) {
            this.f29421b = 1;
            this.f29422c = i;
            this.f29423d = z;
            this.f29424e = i2;
            this.f29425f = z2;
            this.f29426g = str;
            this.f29427h = i3;
            this.f29428i = cls;
            if (cls == null) {
                this.f29429j = null;
            } else {
                this.f29429j = cls.getCanonicalName();
            }
            this.f29431l = aVar;
        }
    }
}
