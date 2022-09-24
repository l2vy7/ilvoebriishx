package p101k2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k2.j */
/* compiled from: LazyHeaders */
public final class C5586j implements C5583h {

    /* renamed from: c */
    private final Map<String, List<C5585i>> f24108c;

    /* renamed from: d */
    private volatile Map<String, String> f24109d;

    /* renamed from: k2.j$a */
    /* compiled from: LazyHeaders */
    public static final class C5587a {

        /* renamed from: d */
        private static final String f24110d;

        /* renamed from: e */
        private static final Map<String, List<C5585i>> f24111e;

        /* renamed from: a */
        private boolean f24112a = true;

        /* renamed from: b */
        private Map<String, List<C5585i>> f24113b = f24111e;

        /* renamed from: c */
        private boolean f24114c = true;

        static {
            String b = m24832b();
            f24110d = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(RtspHeaders.USER_AGENT, Collections.singletonList(new C5588b(b)));
            }
            f24111e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m24832b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C5586j mo22151a() {
            this.f24112a = true;
            return new C5586j(this.f24113b);
        }
    }

    /* renamed from: k2.j$b */
    /* compiled from: LazyHeaders */
    static final class C5588b implements C5585i {

        /* renamed from: a */
        private final String f24115a;

        C5588b(String str) {
            this.f24115a = str;
        }

        /* renamed from: a */
        public String mo22147a() {
            return this.f24115a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5588b) {
                return this.f24115a.equals(((C5588b) obj).f24115a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24115a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f24115a + '\'' + '}';
        }
    }

    C5586j(Map<String, List<C5585i>> map) {
        this.f24108c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m24829b(List<C5585i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo22147a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m24830c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f24108c.entrySet()) {
            String b = m24829b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo22146a() {
        if (this.f24109d == null) {
            synchronized (this) {
                if (this.f24109d == null) {
                    this.f24109d = Collections.unmodifiableMap(m24830c());
                }
            }
        }
        return this.f24109d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5586j) {
            return this.f24108c.equals(((C5586j) obj).f24108c);
        }
        return false;
    }

    public int hashCode() {
        return this.f24108c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f24108c + '}';
    }
}
