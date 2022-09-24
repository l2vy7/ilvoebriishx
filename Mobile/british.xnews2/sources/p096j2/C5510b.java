package p096j2;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: j2.b */
/* compiled from: RuntimeCompat */
final class C5510b {

    /* renamed from: j2.b$a */
    /* compiled from: RuntimeCompat */
    class C5511a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f23929a;

        C5511a(Pattern pattern) {
            this.f23929a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f23929a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m24566a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m24567b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m24567b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C5511a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
