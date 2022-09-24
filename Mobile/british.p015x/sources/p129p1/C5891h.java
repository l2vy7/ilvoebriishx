package p129p1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1483m;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: p1.h */
/* compiled from: WorkDatabasePathHelper */
public class C5891h {

    /* renamed from: a */
    private static final String f24683a = C1483m.m7773f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f24684b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m25990a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return m25991b(context);
        }
        return m25992c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m25991b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    private static File m25992c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m25993d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m25994e(Context context) {
        String str;
        File b = m25991b(context);
        if (Build.VERSION.SDK_INT >= 23 && b.exists()) {
            C1483m.m7771c().mo7013a(f24683a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = m25995f(context);
            for (File next : f.keySet()) {
                File file = f.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        C1483m.m7771c().mo7017h(f24683a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    C1483m.m7771c().mo7013a(f24683a, str, new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m25995f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b = m25991b(context);
            File a = m25990a(context);
            hashMap.put(b, a);
            for (String str : f24684b) {
                hashMap.put(new File(b.getPath() + str), new File(a.getPath() + str));
            }
        }
        return hashMap;
    }
}
