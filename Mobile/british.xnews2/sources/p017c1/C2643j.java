package p017c1;

import android.os.Build;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: c1.j */
/* compiled from: MediaRouterParams */
public class C2643j {

    /* renamed from: a */
    final int f10397a;

    /* renamed from: b */
    final boolean f10398b;

    /* renamed from: c */
    final boolean f10399c;

    /* renamed from: d */
    final Bundle f10400d;

    C2643j(C2644a aVar) {
        this.f10397a = aVar.f10401a;
        this.f10398b = aVar.f10402b;
        this.f10399c = aVar.f10403c;
        Bundle bundle = aVar.f10404d;
        this.f10400d = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    /* renamed from: a */
    public int mo9297a() {
        return this.f10397a;
    }

    /* renamed from: b */
    public Bundle mo9298b() {
        return this.f10400d;
    }

    /* renamed from: c */
    public boolean mo9299c() {
        return this.f10398b;
    }

    /* renamed from: d */
    public boolean mo9300d() {
        return this.f10399c;
    }

    /* renamed from: c1.j$a */
    /* compiled from: MediaRouterParams */
    public static final class C2644a {

        /* renamed from: a */
        int f10401a = 1;

        /* renamed from: b */
        boolean f10402b;

        /* renamed from: c */
        boolean f10403c;

        /* renamed from: d */
        Bundle f10404d;

        public C2644a() {
        }

        /* renamed from: a */
        public C2643j mo9301a() {
            return new C2643j(this);
        }

        /* renamed from: b */
        public C2644a mo9302b(int i) {
            this.f10401a = i;
            return this;
        }

        /* renamed from: c */
        public C2644a mo9303c(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f10402b = z;
            }
            return this;
        }

        /* renamed from: d */
        public C2644a mo9304d(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f10403c = z;
            }
            return this;
        }

        public C2644a(C2643j jVar) {
            Objects.requireNonNull(jVar, "params should not be null!");
            this.f10401a = jVar.f10397a;
            this.f10402b = jVar.f10398b;
            this.f10403c = jVar.f10399c;
            this.f10404d = jVar.f10400d == null ? null : new Bundle(jVar.f10400d);
        }
    }
}
