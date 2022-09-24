package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.C3642m;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import java.util.Locale;

/* renamed from: com.facebook.internal.r */
/* compiled from: ImageRequest */
public class C3548r {

    /* renamed from: a */
    private Context f13252a;

    /* renamed from: b */
    private Uri f13253b;

    /* renamed from: c */
    private C3551c f13254c;

    /* renamed from: d */
    private boolean f13255d;

    /* renamed from: e */
    private Object f13256e;

    /* renamed from: com.facebook.internal.r$b */
    /* compiled from: ImageRequest */
    public static class C3550b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f13257a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f13258b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C3551c f13259c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f13260d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Object f13261e;

        public C3550b(Context context, Uri uri) {
            C3489g0.m11687i(uri, "imageUri");
            this.f13257a = context;
            this.f13258b = uri;
        }

        /* renamed from: f */
        public C3548r mo12065f() {
            return new C3548r(this);
        }

        /* renamed from: g */
        public C3550b mo12066g(boolean z) {
            this.f13260d = z;
            return this;
        }

        /* renamed from: h */
        public C3550b mo12067h(C3551c cVar) {
            this.f13259c = cVar;
            return this;
        }

        /* renamed from: i */
        public C3550b mo12068i(Object obj) {
            this.f13261e = obj;
            return this;
        }
    }

    /* renamed from: com.facebook.internal.r$c */
    /* compiled from: ImageRequest */
    public interface C3551c {
        /* renamed from: a */
        void mo12069a(C3552s sVar);
    }

    /* renamed from: e */
    public static Uri m11852e(String str, int i, int i2, String str2) {
        C3489g0.m11688j(str, DataKeys.USER_ID);
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Uri.Builder path = Uri.parse(C3473c0.m11576c()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[]{C3642m.m12290p(), str}));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        if (!C3481f0.m11604O(str2)) {
            path.appendQueryParameter("access_token", str2);
        }
        return path.build();
    }

    /* renamed from: a */
    public C3551c mo12060a() {
        return this.f13254c;
    }

    /* renamed from: b */
    public Object mo12061b() {
        return this.f13256e;
    }

    /* renamed from: c */
    public Context mo12062c() {
        return this.f13252a;
    }

    /* renamed from: d */
    public Uri mo12063d() {
        return this.f13253b;
    }

    /* renamed from: f */
    public boolean mo12064f() {
        return this.f13255d;
    }

    private C3548r(C3550b bVar) {
        this.f13252a = bVar.f13257a;
        this.f13253b = bVar.f13258b;
        this.f13254c = bVar.f13259c;
        this.f13255d = bVar.f13260d;
        this.f13256e = bVar.f13261e == null ? new Object() : bVar.f13261e;
    }
}
