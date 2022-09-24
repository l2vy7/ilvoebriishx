package p087h2;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p004a3.C0066k;

/* renamed from: h2.n */
/* compiled from: SizeConfigStrategy */
public class C5401n implements C5399l {

    /* renamed from: d */
    private static final Bitmap.Config[] f23701d;

    /* renamed from: e */
    private static final Bitmap.Config[] f23702e;

    /* renamed from: f */
    private static final Bitmap.Config[] f23703f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f23704g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f23705h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C5404c f23706a = new C5404c();

    /* renamed from: b */
    private final C5390h<C5403b, Bitmap> f23707b = new C5390h<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f23708c = new HashMap();

    /* renamed from: h2.n$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C5402a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23709a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23709a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23709a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23709a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23709a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p087h2.C5401n.C5402a.<clinit>():void");
        }
    }

    /* renamed from: h2.n$b */
    /* compiled from: SizeConfigStrategy */
    static final class C5403b implements C5400m {

        /* renamed from: a */
        private final C5404c f23710a;

        /* renamed from: b */
        int f23711b;

        /* renamed from: c */
        private Bitmap.Config f23712c;

        public C5403b(C5404c cVar) {
            this.f23710a = cVar;
        }

        /* renamed from: a */
        public void mo21815a() {
            this.f23710a.mo21824c(this);
        }

        /* renamed from: b */
        public void mo21851b(int i, Bitmap.Config config) {
            this.f23711b = i;
            this.f23712c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5403b)) {
                return false;
            }
            C5403b bVar = (C5403b) obj;
            if (this.f23711b != bVar.f23711b || !C0066k.m251c(this.f23712c, bVar.f23712c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f23711b * 31;
            Bitmap.Config config = this.f23712c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C5401n.m24307i(this.f23711b, this.f23712c);
        }
    }

    /* renamed from: h2.n$c */
    /* compiled from: SizeConfigStrategy */
    static class C5404c extends C5386d<C5403b> {
        C5404c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C5403b mo21820a() {
            return new C5403b(this);
        }

        /* renamed from: e */
        public C5403b mo21856e(int i, Bitmap.Config config) {
            C5403b bVar = (C5403b) mo21823b();
            bVar.mo21851b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f23701d = configArr;
        f23702e = configArr;
    }

    /* renamed from: g */
    private void m24305g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = m24309k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo21813f(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    private C5403b m24306h(int i, Bitmap.Config config) {
        C5403b e = this.f23706a.mo21856e(i, config);
        Bitmap.Config[] j = m24308j(config);
        int length = j.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = j[i2];
            Integer ceilingKey = m24309k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f23706a.mo21824c(e);
                return this.f23706a.mo21856e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: i */
    static String m24307i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: j */
    private static Bitmap.Config[] m24308j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f23702e;
        }
        int i = C5402a.f23709a[config.ordinal()];
        if (i == 1) {
            return f23701d;
        }
        if (i == 2) {
            return f23703f;
        }
        if (i == 3) {
            return f23704g;
        }
        if (i == 4) {
            return f23705h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: k */
    private NavigableMap<Integer, Integer> m24309k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f23708c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f23708c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public Bitmap mo21808a() {
        Bitmap f = this.f23707b.mo21834f();
        if (f != null) {
            m24305g(Integer.valueOf(C0066k.m255g(f)), f);
        }
        return f;
    }

    /* renamed from: b */
    public String mo21809b(int i, int i2, Bitmap.Config config) {
        return m24307i(C0066k.m254f(i, i2, config), config);
    }

    /* renamed from: c */
    public void mo21810c(Bitmap bitmap) {
        C5403b e = this.f23706a.mo21856e(C0066k.m255g(bitmap), bitmap.getConfig());
        this.f23707b.mo21833d(e, bitmap);
        NavigableMap<Integer, Integer> k = m24309k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e.f23711b));
        Integer valueOf = Integer.valueOf(e.f23711b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: d */
    public Bitmap mo21811d(int i, int i2, Bitmap.Config config) {
        C5403b h = m24306h(C0066k.m254f(i, i2, config), config);
        Bitmap a = this.f23707b.mo21832a(h);
        if (a != null) {
            m24305g(Integer.valueOf(h.f23711b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public int mo21812e(Bitmap bitmap) {
        return C0066k.m255g(bitmap);
    }

    /* renamed from: f */
    public String mo21813f(Bitmap bitmap) {
        return m24307i(C0066k.m255g(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f23707b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f23708c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f23708c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
