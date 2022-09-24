package p118n2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: n2.r */
/* compiled from: HardwareConfigState */
public final class C5839r {

    /* renamed from: f */
    private static final File f24570f = new File("/proc/self/fd");

    /* renamed from: g */
    private static volatile C5839r f24571g;

    /* renamed from: a */
    private final boolean f24572a = m25798d();

    /* renamed from: b */
    private final int f24573b;

    /* renamed from: c */
    private final int f24574c;

    /* renamed from: d */
    private int f24575d;

    /* renamed from: e */
    private boolean f24576e = true;

    C5839r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24573b = 20000;
            this.f24574c = 0;
            return;
        }
        this.f24573b = 700;
        this.f24574c = 128;
    }

    /* renamed from: a */
    public static C5839r m25796a() {
        if (f24571g == null) {
            synchronized (C5839r.class) {
                if (f24571g == null) {
                    f24571g = new C5839r();
                }
            }
        }
        return f24571g;
    }

    /* renamed from: b */
    private synchronized boolean m25797b() {
        boolean z = true;
        int i = this.f24575d + 1;
        this.f24575d = i;
        if (i >= 50) {
            this.f24575d = 0;
            int length = f24570f.list().length;
            if (length >= this.f24573b) {
                z = false;
            }
            this.f24576e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f24573b);
            }
        }
        return this.f24576e;
    }

    /* renamed from: d */
    private static boolean m25798d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = str.substring(0, 7);
        substring.hashCode();
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 0;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 1;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (Build.VERSION.SDK_INT != 26) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public boolean mo22733c(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (!z || !this.f24572a || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.f24574c) || i2 < i3 || !m25797b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: e */
    public boolean mo22734e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c = mo22733c(i, i2, z, z2);
        if (c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c;
    }
}
