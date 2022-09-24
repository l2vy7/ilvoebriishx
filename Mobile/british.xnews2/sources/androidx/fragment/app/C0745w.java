package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.w */
/* compiled from: LogWriter */
final class C0745w extends Writer {

    /* renamed from: b */
    private final String f3761b;

    /* renamed from: c */
    private StringBuilder f3762c = new StringBuilder(128);

    C0745w(String str) {
        this.f3761b = str;
    }

    /* renamed from: c */
    private void m4185c() {
        if (this.f3762c.length() > 0) {
            Log.d(this.f3761b, this.f3762c.toString());
            StringBuilder sb = this.f3762c;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4185c();
    }

    public void flush() {
        m4185c();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4185c();
            } else {
                this.f3762c.append(c);
            }
        }
    }
}
