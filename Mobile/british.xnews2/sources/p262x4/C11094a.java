package p262x4;

import android.util.Log;
import com.google.android.gms.common.internal.C7392h;
import java.util.Locale;

/* renamed from: x4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C11094a {

    /* renamed from: a */
    private final String f50051a;

    /* renamed from: b */
    private final String f50052b;

    /* renamed from: c */
    private final C7392h f50053c;

    /* renamed from: d */
    private final int f50054d;

    public C11094a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f50052b = str2;
        this.f50051a = str;
        this.f50053c = new C7392h(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f50051a, i)) {
            i++;
        }
        this.f50054d = i;
    }

    /* renamed from: a */
    public void mo43374a(String str, Object... objArr) {
        if (mo43377d(3)) {
            Log.d(this.f50051a, mo43376c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo43375b(String str, Object... objArr) {
        Log.e(this.f50051a, mo43376c(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo43376c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f50052b.concat(str);
    }

    /* renamed from: d */
    public boolean mo43377d(int i) {
        return this.f50054d <= i;
    }
}
