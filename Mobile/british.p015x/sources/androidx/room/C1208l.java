package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p091i1.C5442d;
import p091i1.C5443e;

/* renamed from: androidx.room.l */
/* compiled from: RoomSQLiteQuery */
public class C1208l implements C5443e, C5442d {

    /* renamed from: j */
    static final TreeMap<Integer, C1208l> f5510j = new TreeMap<>();

    /* renamed from: b */
    private volatile String f5511b;

    /* renamed from: c */
    final long[] f5512c;

    /* renamed from: d */
    final double[] f5513d;

    /* renamed from: e */
    final String[] f5514e;

    /* renamed from: f */
    final byte[][] f5515f;

    /* renamed from: g */
    private final int[] f5516g;

    /* renamed from: h */
    final int f5517h;

    /* renamed from: i */
    int f5518i;

    private C1208l(int i) {
        this.f5517h = i;
        int i2 = i + 1;
        this.f5516g = new int[i2];
        this.f5512c = new long[i2];
        this.f5513d = new double[i2];
        this.f5514e = new String[i2];
        this.f5515f = new byte[i2][];
    }

    /* renamed from: e */
    public static C1208l m6621e(String str, int i) {
        TreeMap<Integer, C1208l> treeMap = f5510j;
        synchronized (treeMap) {
            Map.Entry<Integer, C1208l> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1208l value = ceilingEntry.getValue();
                value.mo5950f(str, i);
                return value;
            }
            C1208l lVar = new C1208l(i);
            lVar.mo5950f(str, i);
            return lVar;
        }
    }

    /* renamed from: g */
    private static void m6622g() {
        TreeMap<Integer, C1208l> treeMap = f5510j;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    public void mo5944A(int i, double d) {
        this.f5516g[i] = 3;
        this.f5513d[i] = d;
    }

    /* renamed from: N */
    public void mo5945N(int i, long j) {
        this.f5516g[i] = 2;
        this.f5512c[i] = j;
    }

    /* renamed from: S */
    public void mo5946S(int i, byte[] bArr) {
        this.f5516g[i] = 5;
        this.f5515f[i] = bArr;
    }

    /* renamed from: c */
    public void mo5947c(C5442d dVar) {
        for (int i = 1; i <= this.f5518i; i++) {
            int i2 = this.f5516g[i];
            if (i2 == 1) {
                dVar.mo5953j0(i);
            } else if (i2 == 2) {
                dVar.mo5945N(i, this.f5512c[i]);
            } else if (i2 == 3) {
                dVar.mo5944A(i, this.f5513d[i]);
            } else if (i2 == 4) {
                dVar.mo5952i(i, this.f5514e[i]);
            } else if (i2 == 5) {
                dVar.mo5946S(i, this.f5515f[i]);
            }
        }
    }

    public void close() {
    }

    /* renamed from: d */
    public String mo5949d() {
        return this.f5511b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5950f(String str, int i) {
        this.f5511b = str;
        this.f5518i = i;
    }

    /* renamed from: h */
    public void mo5951h() {
        TreeMap<Integer, C1208l> treeMap = f5510j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5517h), this);
            m6622g();
        }
    }

    /* renamed from: i */
    public void mo5952i(int i, String str) {
        this.f5516g[i] = 4;
        this.f5514e[i] = str;
    }

    /* renamed from: j0 */
    public void mo5953j0(int i) {
        this.f5516g[i] = 1;
    }
}
