package p091i2;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: i2.i */
/* compiled from: MemorySizeCalculator */
public final class C5460i {

    /* renamed from: a */
    private final int f23816a;

    /* renamed from: b */
    private final int f23817b;

    /* renamed from: c */
    private final Context f23818c;

    /* renamed from: d */
    private final int f23819d;

    /* renamed from: i2.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C5461a {

        /* renamed from: i */
        static final int f23820i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f23821a;

        /* renamed from: b */
        ActivityManager f23822b;

        /* renamed from: c */
        C5463c f23823c;

        /* renamed from: d */
        float f23824d = 2.0f;

        /* renamed from: e */
        float f23825e = ((float) f23820i);

        /* renamed from: f */
        float f23826f = 0.4f;

        /* renamed from: g */
        float f23827g = 0.33f;

        /* renamed from: h */
        int f23828h = 4194304;

        public C5461a(Context context) {
            this.f23821a = context;
            this.f23822b = (ActivityManager) context.getSystemService("activity");
            this.f23823c = new C5462b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C5460i.m24460e(this.f23822b)) {
                this.f23825e = 0.0f;
            }
        }

        /* renamed from: a */
        public C5460i mo21927a() {
            return new C5460i(this);
        }
    }

    /* renamed from: i2.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C5462b implements C5463c {

        /* renamed from: a */
        private final DisplayMetrics f23829a;

        C5462b(DisplayMetrics displayMetrics) {
            this.f23829a = displayMetrics;
        }

        /* renamed from: a */
        public int mo21928a() {
            return this.f23829a.heightPixels;
        }

        /* renamed from: b */
        public int mo21929b() {
            return this.f23829a.widthPixels;
        }
    }

    /* renamed from: i2.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C5463c {
        /* renamed from: a */
        int mo21928a();

        /* renamed from: b */
        int mo21929b();
    }

    C5460i(C5461a aVar) {
        int i;
        this.f23818c = aVar.f23821a;
        if (m24460e(aVar.f23822b)) {
            i = aVar.f23828h / 2;
        } else {
            i = aVar.f23828h;
        }
        this.f23819d = i;
        int c = m24459c(aVar.f23822b, aVar.f23826f, aVar.f23827g);
        float b = (float) (aVar.f23823c.mo21929b() * aVar.f23823c.mo21928a() * 4);
        int round = Math.round(aVar.f23825e * b);
        int round2 = Math.round(b * aVar.f23824d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f23817b = round2;
            this.f23816a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f23825e;
            float f3 = aVar.f23824d;
            float f4 = f / (f2 + f3);
            this.f23817b = Math.round(f3 * f4);
            this.f23816a = Math.round(f4 * aVar.f23825e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m24461f(this.f23817b));
            sb.append(", pool size: ");
            sb.append(m24461f(this.f23816a));
            sb.append(", byte array size: ");
            sb.append(m24461f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(m24461f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f23822b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m24460e(aVar.f23822b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m24459c(ActivityManager activityManager, float f, float f2) {
        boolean e = m24460e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    static boolean m24460e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m24461f(int i) {
        return Formatter.formatFileSize(this.f23818c, (long) i);
    }

    /* renamed from: a */
    public int mo21924a() {
        return this.f23819d;
    }

    /* renamed from: b */
    public int mo21925b() {
        return this.f23816a;
    }

    /* renamed from: d */
    public int mo21926d() {
        return this.f23817b;
    }
}
