package p134q;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.content.C0600b;
import java.util.ArrayList;
import p001a0.C0022f;
import p134q.C5908a;

/* renamed from: q.d */
/* compiled from: CustomTabsIntent */
public final class C5918d {

    /* renamed from: a */
    public final Intent f24786a;

    /* renamed from: b */
    public final Bundle f24787b;

    C5918d(Intent intent, Bundle bundle) {
        this.f24786a = intent;
        this.f24787b = bundle;
    }

    /* renamed from: a */
    public void mo22908a(Context context, Uri uri) {
        this.f24786a.setData(uri);
        C0600b.m3300l(context, this.f24786a, this.f24787b);
    }

    /* renamed from: q.d$a */
    /* compiled from: CustomTabsIntent */
    public static final class C5919a {

        /* renamed from: a */
        private final Intent f24788a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C5908a.C5909a f24789b = new C5908a.C5909a();

        /* renamed from: c */
        private ArrayList<Bundle> f24790c;

        /* renamed from: d */
        private Bundle f24791d;

        /* renamed from: e */
        private ArrayList<Bundle> f24792e;

        /* renamed from: f */
        private SparseArray<Bundle> f24793f;

        /* renamed from: g */
        private Bundle f24794g;

        /* renamed from: h */
        private int f24795h = 0;

        /* renamed from: i */
        private boolean f24796i = true;

        public C5919a() {
        }

        /* renamed from: d */
        private void m26093d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0022f.m52b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f24788a.putExtras(bundle);
        }

        /* renamed from: a */
        public C5918d mo22909a() {
            if (!this.f24788a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m26093d((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f24790c;
            if (arrayList != null) {
                this.f24788a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f24792e;
            if (arrayList2 != null) {
                this.f24788a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f24788a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f24796i);
            this.f24788a.putExtras(this.f24789b.mo22899a().mo22898a());
            Bundle bundle = this.f24794g;
            if (bundle != null) {
                this.f24788a.putExtras(bundle);
            }
            if (this.f24793f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f24793f);
                this.f24788a.putExtras(bundle2);
            }
            this.f24788a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f24795h);
            return new C5918d(this.f24788a, this.f24791d);
        }

        /* renamed from: b */
        public C5919a mo22910b(C5908a aVar) {
            this.f24794g = aVar.mo22898a();
            return this;
        }

        /* renamed from: c */
        public C5919a mo22911c(C5922f fVar) {
            this.f24788a.setPackage(fVar.mo22916b().getPackageName());
            m26093d(fVar.mo22915a(), fVar.mo22917c());
            return this;
        }

        public C5919a(C5922f fVar) {
            if (fVar != null) {
                mo22911c(fVar);
            }
        }
    }
}
