package p115m4;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: m4.s */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10781s {

    /* renamed from: a */
    private final Context f49517a;

    /* renamed from: b */
    private final String f49518b;

    /* renamed from: c */
    private final C10776p0 f49519c = new C10776p0(this, (C10774o0) null);

    protected C10781s(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        this.f49517a = ((Context) C4604n.m20098k(context)).getApplicationContext();
        this.f49518b = C4604n.m20094g(str);
    }

    @RecentlyNullable
    /* renamed from: a */
    public abstract C10775p mo36782a(@RecentlyNonNull String str);

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo42958b() {
        return this.f49518b;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public final Context mo42959c() {
        return this.f49517a;
    }

    /* renamed from: d */
    public abstract boolean mo36783d();

    @RecentlyNonNull
    /* renamed from: e */
    public final IBinder mo42960e() {
        return this.f49519c;
    }
}
