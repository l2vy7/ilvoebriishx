package p243q4;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C4604n;
import java.util.Locale;

/* renamed from: q4.b */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C10922b {
    @RecentlyNonNull

    /* renamed from: a */
    protected final String f49800a;

    /* renamed from: b */
    private final boolean f49801b;

    /* renamed from: c */
    private boolean f49802c;

    /* renamed from: d */
    private String f49803d;

    public C10922b(@RecentlyNonNull String str) {
        C4604n.m20095h(str, "The log tag cannot be null or empty.");
        this.f49800a = str;
        this.f49801b = str.length() <= 23;
        this.f49802c = false;
    }

    /* renamed from: a */
    public void mo43190a(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (mo43198i()) {
            Log.d(this.f49800a, mo43199j(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo43191b(@RecentlyNonNull Throwable th, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (mo43198i()) {
            Log.d(this.f49800a, mo43199j(str, objArr), th);
        }
    }

    /* renamed from: c */
    public void mo43192c(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.e(this.f49800a, mo43199j(str, objArr));
    }

    /* renamed from: d */
    public void mo43193d(@RecentlyNonNull Throwable th, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.e(this.f49800a, mo43199j(str, objArr), th);
    }

    /* renamed from: e */
    public void mo43194e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.i(this.f49800a, mo43199j(str, objArr));
    }

    /* renamed from: f */
    public void mo43195f(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.w(this.f49800a, mo43199j(str, objArr));
    }

    /* renamed from: g */
    public void mo43196g(@RecentlyNonNull Throwable th, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.w(this.f49800a, mo43199j(str, objArr), th);
    }

    /* renamed from: h */
    public final void mo43197h(@RecentlyNonNull String str) {
        String str2 = null;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            str2 = String.format("[%s] ", new Object[]{null});
        }
        this.f49803d = str2;
    }

    /* renamed from: i */
    public final boolean mo43198i() {
        return this.f49802c || (this.f49801b && Log.isLoggable(this.f49800a, 3));
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: j */
    public final String mo43199j(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.f49803d)) {
            return str;
        }
        String valueOf = String.valueOf(this.f49803d);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
