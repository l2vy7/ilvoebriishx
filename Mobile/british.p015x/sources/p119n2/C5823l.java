package p119n2;

import android.os.Build;
import p065d2.C5160g;

/* renamed from: n2.l */
/* compiled from: DownsampleStrategy */
public abstract class C5823l {

    /* renamed from: a */
    public static final C5823l f24540a = new C5824a();

    /* renamed from: b */
    public static final C5823l f24541b = new C5825b();

    /* renamed from: c */
    public static final C5823l f24542c = new C5828e();

    /* renamed from: d */
    public static final C5823l f24543d = new C5826c();

    /* renamed from: e */
    public static final C5823l f24544e;

    /* renamed from: f */
    public static final C5823l f24545f = new C5829f();

    /* renamed from: g */
    public static final C5823l f24546g;

    /* renamed from: h */
    public static final C5160g<C5823l> f24547h;

    /* renamed from: i */
    static final boolean f24548i = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: n2.l$a */
    /* compiled from: DownsampleStrategy */
    private static class C5824a extends C5823l {
        C5824a() {
        }

        /* renamed from: a */
        public C5830g mo22722a(int i, int i2, int i3, int i4) {
            return C5830g.QUALITY;
        }

        /* renamed from: b */
        public float mo22723b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: n2.l$b */
    /* compiled from: DownsampleStrategy */
    private static class C5825b extends C5823l {
        C5825b() {
        }

        /* renamed from: a */
        public C5830g mo22722a(int i, int i2, int i3, int i4) {
            return C5830g.MEMORY;
        }

        /* renamed from: b */
        public float mo22723b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: n2.l$c */
    /* compiled from: DownsampleStrategy */
    private static class C5826c extends C5823l {
        C5826c() {
        }

        /* renamed from: a */
        public C5830g mo22722a(int i, int i2, int i3, int i4) {
            if (mo22723b(i, i2, i3, i4) == 1.0f) {
                return C5830g.QUALITY;
            }
            return C5823l.f24542c.mo22722a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo22723b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C5823l.f24542c.mo22723b(i, i2, i3, i4));
        }
    }

    /* renamed from: n2.l$d */
    /* compiled from: DownsampleStrategy */
    private static class C5827d extends C5823l {
        C5827d() {
        }

        /* renamed from: a */
        public C5830g mo22722a(int i, int i2, int i3, int i4) {
            return C5830g.QUALITY;
        }

        /* renamed from: b */
        public float mo22723b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: n2.l$e */
    /* compiled from: DownsampleStrategy */
    private static class C5828e extends C5823l {
        C5828e() {
        }

        /* renamed from: a */
        public C5830g mo22722a(int i, int i2, int i3, int i4) {
            if (C5823l.f24548i) {
                return C5830g.QUALITY;
            }
            return C5830g.MEMORY;
        }

        /* renamed from: b */
        public float mo22723b(int i, int i2, int i3, int i4) {
            if (C5823l.f24548i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: n2.l$f */
    /* compiled from: DownsampleStrategy */
    private static class C5829f extends C5823l {
        C5829f() {
        }

        /* renamed from: a */
        public C5830g mo22722a(int i, int i2, int i3, int i4) {
            return C5830g.QUALITY;
        }

        /* renamed from: b */
        public float mo22723b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: n2.l$g */
    /* compiled from: DownsampleStrategy */
    public enum C5830g {
        MEMORY,
        QUALITY
    }

    static {
        C5827d dVar = new C5827d();
        f24544e = dVar;
        f24546g = dVar;
        f24547h = C5160g.m23475f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract C5830g mo22722a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo22723b(int i, int i2, int i3, int i4);
}
