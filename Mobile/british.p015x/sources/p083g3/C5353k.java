package p083g3;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C3642m;

/* renamed from: g3.k */
/* compiled from: SourceApplicationInfo */
class C5353k {

    /* renamed from: a */
    private String f23569a;

    /* renamed from: b */
    private boolean f23570b;

    private C5353k(String str, boolean z) {
        this.f23569a = str;
        this.f23570b = z;
    }

    /* renamed from: a */
    public static void m24099a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: b */
    public static C5353k m24100b() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C5353k(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: c */
    public void mo21659c() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f23569a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f23570b);
        edit.apply();
    }

    public String toString() {
        String str = this.f23570b ? "Applink" : "Unclassified";
        if (this.f23569a == null) {
            return str;
        }
        return str + "(" + this.f23569a + ")";
    }
}
