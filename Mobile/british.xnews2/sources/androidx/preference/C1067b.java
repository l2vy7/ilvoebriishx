package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: androidx.preference.b */
/* compiled from: PreferenceManager */
public class C1067b {

    /* renamed from: androidx.preference.b$a */
    /* compiled from: PreferenceManager */
    public interface C1068a {
        /* renamed from: a */
        void mo4964a(PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.b$b */
    /* compiled from: PreferenceManager */
    public interface C1069b {
        /* renamed from: a */
        boolean mo4965a(Preference preference);
    }

    /* renamed from: a */
    public static SharedPreferences m5461a(Context context) {
        return context.getSharedPreferences(m5463c(context), m5462b());
    }

    /* renamed from: b */
    private static int m5462b() {
        return 0;
    }

    /* renamed from: c */
    private static String m5463c(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SharedPreferences.Editor mo4957d() {
        throw null;
    }

    /* renamed from: e */
    public C1068a mo4958e() {
        throw null;
    }

    /* renamed from: f */
    public C1069b mo4959f() {
        throw null;
    }

    /* renamed from: g */
    public C1066a mo4960g() {
        throw null;
    }

    /* renamed from: h */
    public SharedPreferences mo4961h() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo4962i() {
        throw null;
    }

    /* renamed from: j */
    public void mo4963j(Preference preference) {
        throw null;
    }
}
