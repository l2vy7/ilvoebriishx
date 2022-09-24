package p114m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import com.google.android.datatransport.cct.C4562a;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C4639n0;
import com.google.android.gms.internal.cast.C4643r4;
import com.google.android.gms.internal.cast.C4646v8;
import com.google.android.gms.internal.cast.C8497e;
import com.google.android.gms.internal.cast.C8652n7;
import com.google.android.gms.internal.cast.C8669o8;
import com.google.android.gms.internal.cast.C8794w9;
import com.google.android.gms.internal.cast.C8827yb;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p142r3.C6000f;
import p153t3.C6156r;
import p192c5.C6520c;
import p243q4.C10921a0;
import p243q4.C10922b;

/* renamed from: m4.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C5758b {

    /* renamed from: l */
    private static final C10922b f24407l = new C10922b("CastContext");

    /* renamed from: m */
    private static final Object f24408m = new Object();

    /* renamed from: n */
    private static C5758b f24409n;

    /* renamed from: a */
    private final Context f24410a;

    /* renamed from: b */
    private final C10754f1 f24411b;

    /* renamed from: c */
    private final C10777q f24412c;

    /* renamed from: d */
    private final C10741a1 f24413d;

    /* renamed from: e */
    private final C10755g f24414e;

    /* renamed from: f */
    private final C10749e f24415f;

    /* renamed from: g */
    private final CastOptions f24416g;

    /* renamed from: h */
    private final C8497e f24417h;

    /* renamed from: i */
    private final List<C10781s> f24418i;

    /* renamed from: j */
    private C8827yb f24419j;

    /* renamed from: k */
    private C10744c f24420k;

    private C5758b(Context context, CastOptions castOptions, List<C10781s> list, C8497e eVar) throws C10767k0 {
        Context applicationContext = context.getApplicationContext();
        this.f24410a = applicationContext;
        this.f24416g = castOptions;
        this.f24417h = eVar;
        this.f24418i = list;
        m25468n();
        try {
            C10754f1 a = C8794w9.m41375a(applicationContext, castOptions, eVar, m25467m());
            this.f24411b = a;
            try {
                this.f24413d = new C10741a1(a.zzg());
                try {
                    C10777q qVar = new C10777q(a.zzf(), applicationContext);
                    this.f24412c = qVar;
                    this.f24415f = new C10749e(qVar);
                    this.f24414e = new C10755g(castOptions, qVar, new C10921a0(applicationContext));
                    new C10921a0(applicationContext).mo43187g(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new C10783t(this));
                    new C10921a0(applicationContext).mo43189i(new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}).addOnSuccessListener(new C10778q0(this));
                } catch (RemoteException e) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e);
                }
            } catch (RemoteException e2) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e2);
            }
        } catch (RemoteException e3) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e3);
        }
    }

    @RecentlyNullable
    /* renamed from: d */
    public static C5758b m25463d() {
        C4604n.m20093f("Must be called from the main thread.");
        return f24409n;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static C5758b m25464e(@RecentlyNonNull Context context) throws IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        if (f24409n == null) {
            synchronized (f24408m) {
                if (f24409n == null) {
                    C10752f l = m25466l(context.getApplicationContext());
                    CastOptions castOptions = l.getCastOptions(context.getApplicationContext());
                    try {
                        f24409n = new C5758b(context, castOptions, l.getAdditionalSessionProviders(context.getApplicationContext()), new C8497e(C1003s.m5133h(context), castOptions));
                    } catch (C10767k0 e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f24409n;
    }

    @RecentlyNullable
    /* renamed from: f */
    public static C5758b m25465f(@RecentlyNonNull Context context) throws IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        try {
            return m25464e(context);
        } catch (RuntimeException e) {
            f24407l.mo43192c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    /* renamed from: l */
    private static C10752f m25466l(Context context) throws IllegalStateException {
        try {
            Bundle bundle = C6520c.m28321a(context).mo24352c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f24407l.mo43192c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (C10752f) Class.forName(string).asSubclass(C10752f.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    /* renamed from: m */
    private final Map<String, IBinder> m25467m() {
        HashMap hashMap = new HashMap();
        C8827yb ybVar = this.f24419j;
        if (ybVar != null) {
            hashMap.put(ybVar.mo42958b(), this.f24419j.mo42960e());
        }
        List<C10781s> list = this.f24418i;
        if (list != null) {
            for (C10781s next : list) {
                C4604n.m20099l(next, "Additional SessionProvider must not be null.");
                String h = C4604n.m20095h(next.mo42958b(), "Category for SessionProvider must not be null or empty string.");
                C4604n.m20089b(!hashMap.containsKey(h), String.format("SessionProvider for category %s already added", new Object[]{h}));
                hashMap.put(h, next.mo42960e());
            }
        }
        return hashMap;
    }

    @RequiresNonNull({"castOptions", "mediaRouter", "appContext"})
    /* renamed from: n */
    private final void m25468n() {
        this.f24419j = !TextUtils.isEmpty(this.f24416g.mo29422F0()) ? new C8827yb(this.f24410a, this.f24416g, this.f24417h) : null;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public CastOptions mo22533a() throws IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24416g;
    }

    @RecentlyNullable
    /* renamed from: b */
    public C1001r mo22534b() throws IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        try {
            return C1001r.m5118d(this.f24411b.zze());
        } catch (RemoteException e) {
            f24407l.mo43191b(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", C10754f1.class.getSimpleName());
            return null;
        }
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C10777q mo22535c() throws IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24412c;
    }

    /* renamed from: g */
    public final boolean mo22536g() {
        C4604n.m20093f("Must be called from the main thread.");
        try {
            return this.f24411b.zzi();
        } catch (RemoteException e) {
            f24407l.mo43191b(e, "Unable to call %s on %s.", "hasActivityInRecents", C10754f1.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: h */
    public final C10741a1 mo22537h() {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24413d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo22538i(C4639n0 n0Var, SharedPreferences sharedPreferences, Bundle bundle) {
        C4604n.m20098k(this.f24412c);
        String packageName = this.f24410a.getPackageName();
        new C4643r4(sharedPreferences, n0Var, bundle, packageName).mo19120a(this.f24412c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo22539j(Bundle bundle) {
        this.f24420k = new C10744c(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo22540k(Bundle bundle) {
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (!z) {
            if (z2) {
                z2 = true;
            } else {
                return;
            }
        }
        String packageName = this.f24410a.getPackageName();
        String format = String.format(Locale.ROOT, "%s.%s", new Object[]{this.f24410a.getPackageName(), "client_cast_analytics_data"});
        C6156r.m27012f(this.f24410a);
        C6000f<C8669o8> a = C6156r.m27010c().mo23540g(C4562a.f19820g).mo23101a("CAST_SENDER_SDK", C8669o8.class, C10782s0.f49520a);
        long j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
        SharedPreferences sharedPreferences = this.f24410a.getApplicationContext().getSharedPreferences(format, 0);
        C4639n0 a2 = C4639n0.m21336a(sharedPreferences, a, j);
        if (z) {
            new C10921a0(this.f24410a).mo43188h(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}).addOnSuccessListener(new C10780r0(this, a2, sharedPreferences));
        }
        if (z2) {
            C4604n.m20098k(sharedPreferences);
            C4604n.m20098k(a2);
            C4646v8.m21377a(sharedPreferences, a2, packageName);
            C4646v8.m21378b(C8652n7.CAST_CONTEXT);
        }
    }
}
