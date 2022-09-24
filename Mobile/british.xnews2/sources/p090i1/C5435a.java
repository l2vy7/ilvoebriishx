package p090i1;

/* renamed from: i1.a */
/* compiled from: SimpleSQLiteQuery */
public final class C5435a implements C5443e {

    /* renamed from: b */
    private final String f23790b;

    /* renamed from: c */
    private final Object[] f23791c;

    public C5435a(String str, Object[] objArr) {
        this.f23790b = str;
        this.f23791c = objArr;
    }

    /* renamed from: a */
    private static void m24391a(C5442d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.mo5953j0(i);
        } else if (obj instanceof byte[]) {
            dVar.mo5946S(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.mo5944A(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.mo5944A(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.mo5945N(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.mo5945N(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.mo5945N(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.mo5945N(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.mo5952i(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.mo5945N(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    /* renamed from: b */
    public static void m24392b(C5442d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m24391a(dVar, i, obj);
            }
        }
    }

    /* renamed from: c */
    public void mo5947c(C5442d dVar) {
        m24392b(dVar, this.f23791c);
    }

    /* renamed from: d */
    public String mo5949d() {
        return this.f23790b;
    }

    public C5435a(String str) {
        this(str, (Object[]) null);
    }
}
