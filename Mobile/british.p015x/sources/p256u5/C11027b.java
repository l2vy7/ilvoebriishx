package p256u5;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: u5.b */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C11027b {

    /* renamed from: b */
    public static final C11027b f49992b = new C11027b((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final EnumMap f49993a;

    public C11027b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(C11026a.class);
        this.f49993a = enumMap;
        enumMap.put(C11026a.AD_STORAGE, bool);
        enumMap.put(C11026a.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static C11027b m49401a(Bundle bundle) {
        if (bundle == null) {
            return f49992b;
        }
        EnumMap enumMap = new EnumMap(C11026a.class);
        for (C11026a aVar : C11026a.values()) {
            enumMap.put(aVar, m49406m(bundle.getString(aVar.f49991b)));
        }
        return new C11027b(enumMap);
    }

    /* renamed from: b */
    public static C11027b m49402b(String str) {
        EnumMap enumMap = new EnumMap(C11026a.class);
        if (str != null) {
            int i = 0;
            while (true) {
                C11026a[] aVarArr = C11026a.f49989e;
                int length = aVarArr.length;
                if (i >= 2) {
                    break;
                }
                C11026a aVar = aVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(aVar, bool);
                }
                i++;
            }
        }
        return new C11027b(enumMap);
    }

    /* renamed from: g */
    public static String m49403g(Bundle bundle) {
        String string;
        for (C11026a aVar : C11026a.values()) {
            if (bundle.containsKey(aVar.f49991b) && (string = bundle.getString(aVar.f49991b)) != null && m49406m(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m49404j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: l */
    static final int m49405l(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: m */
    private static Boolean m49406m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C11027b mo43331c(C11027b bVar) {
        EnumMap enumMap = new EnumMap(C11026a.class);
        for (C11026a aVar : C11026a.values()) {
            Boolean bool = (Boolean) this.f49993a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f49993a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(aVar, bool);
        }
        return new C11027b(enumMap);
    }

    /* renamed from: d */
    public final C11027b mo43332d(C11027b bVar) {
        EnumMap enumMap = new EnumMap(C11026a.class);
        for (C11026a aVar : C11026a.values()) {
            Boolean bool = (Boolean) this.f49993a.get(aVar);
            if (bool == null) {
                bool = (Boolean) bVar.f49993a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new C11027b(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo43333e() {
        return (Boolean) this.f49993a.get(C11026a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11027b)) {
            return false;
        }
        C11027b bVar = (C11027b) obj;
        for (C11026a aVar : C11026a.values()) {
            if (m49405l((Boolean) this.f49993a.get(aVar)) != m49405l((Boolean) bVar.f49993a.get(aVar))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo43335f() {
        return (Boolean) this.f49993a.get(C11026a.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo43336h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        C11026a[] aVarArr = C11026a.f49989e;
        int length = aVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f49993a.get(aVarArr[i]);
            if (bool == null) {
                c = '-';
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean l : this.f49993a.values()) {
            i = (i * 31) + m49405l(l);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo43338i(C11026a aVar) {
        Boolean bool = (Boolean) this.f49993a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo43339k(C11027b bVar) {
        for (C11026a aVar : (C11026a[]) this.f49993a.keySet().toArray(new C11026a[0])) {
            Boolean bool = (Boolean) this.f49993a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f49993a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        C11026a[] values = C11026a.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C11026a aVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(aVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f49993a.get(aVar);
            if (this.f49993a.containsKey(aVar) || bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public C11027b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C11026a.class);
        this.f49993a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
