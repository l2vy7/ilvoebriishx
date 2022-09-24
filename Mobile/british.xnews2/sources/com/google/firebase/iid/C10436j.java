package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.C0600b;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p149t.C6077a;

/* renamed from: com.google.firebase.iid.j */
final class C10436j {

    /* renamed from: a */
    private final SharedPreferences f48883a;

    /* renamed from: b */
    private final Context f48884b;

    /* renamed from: c */
    private final C10437j0 f48885c;

    /* renamed from: d */
    private final Map<String, C10439k0> f48886d;

    public C10436j(Context context) {
        this(context, new C10437j0());
    }

    /* renamed from: a */
    private final synchronized boolean m48066a() {
        return this.f48883a.getAll().isEmpty();
    }

    /* renamed from: b */
    private static String m48067b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: g */
    static String m48068g(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final synchronized void mo41888c(String str, String str2, String str3, String str4, String str5) {
        String b = C10438k.m48094b(str4, str5, System.currentTimeMillis());
        if (b != null) {
            SharedPreferences.Editor edit = this.f48883a.edit();
            edit.putString(m48067b(str, str2, str3), b);
            edit.commit();
        }
    }

    /* renamed from: d */
    public final synchronized String mo41889d() {
        return this.f48883a.getString("topic_operaion_queue", "");
    }

    /* renamed from: e */
    public final synchronized void mo41890e() {
        this.f48886d.clear();
        C10437j0.m48080e(this.f48884b);
        this.f48883a.edit().clear().commit();
    }

    /* renamed from: f */
    public final synchronized C10438k mo41891f(String str, String str2, String str3) {
        return C10438k.m48095c(this.f48883a.getString(m48067b(str, str2, str3), (String) null));
    }

    /* renamed from: h */
    public final synchronized void mo41892h(String str) {
        this.f48883a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: i */
    public final synchronized C10439k0 mo41893i(String str) {
        C10439k0 k0Var;
        C10439k0 k0Var2 = this.f48886d.get(str);
        if (k0Var2 != null) {
            return k0Var2;
        }
        try {
            k0Var = this.f48885c.mo41895k(this.f48884b, str);
        } catch (C10418a unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.m47991a().mo41869y();
            k0Var = this.f48885c.mo41896m(this.f48884b, str);
        }
        this.f48886d.put(str, k0Var);
        return k0Var;
    }

    /* renamed from: j */
    public final synchronized void mo41894j(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f48883a.edit();
        for (String next : this.f48883a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }

    private C10436j(Context context, C10437j0 j0Var) {
        this.f48886d = new C6077a();
        this.f48884b = context;
        this.f48883a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f48885c = j0Var;
        File file = new File(C0600b.m3298j(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m48066a()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo41890e();
                    FirebaseInstanceId.m47991a().mo41869y();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }
}
