package p083g3;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C3642m;
import java.util.UUID;

/* renamed from: g3.i */
/* compiled from: SessionInfo */
class C5351i {

    /* renamed from: a */
    private Long f23561a;

    /* renamed from: b */
    private Long f23562b;

    /* renamed from: c */
    private int f23563c;

    /* renamed from: d */
    private Long f23564d;

    /* renamed from: e */
    private C5353k f23565e;

    /* renamed from: f */
    private UUID f23566f;

    public C5351i(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    /* renamed from: a */
    public static void m24083a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C5353k.m24099a();
    }

    /* renamed from: h */
    public static C5351i m24084h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C5351i iVar = new C5351i(Long.valueOf(j), Long.valueOf(j2));
        iVar.f23563c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        iVar.f23565e = C5353k.m24100b();
        iVar.f23564d = Long.valueOf(System.currentTimeMillis());
        iVar.f23566f = UUID.fromString(string);
        return iVar;
    }

    /* renamed from: b */
    public long mo21650b() {
        Long l = this.f23564d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: c */
    public int mo21651c() {
        return this.f23563c;
    }

    /* renamed from: d */
    public UUID mo21652d() {
        return this.f23566f;
    }

    /* renamed from: e */
    public Long mo21653e() {
        return this.f23562b;
    }

    /* renamed from: f */
    public long mo21654f() {
        Long l;
        if (this.f23561a == null || (l = this.f23562b) == null) {
            return 0;
        }
        return l.longValue() - this.f23561a.longValue();
    }

    /* renamed from: g */
    public C5353k mo21655g() {
        return this.f23565e;
    }

    /* renamed from: i */
    public void mo21656i() {
        this.f23563c++;
    }

    /* renamed from: j */
    public void mo21657j(Long l) {
        this.f23562b = l;
    }

    /* renamed from: k */
    public void mo21658k() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C3642m.m12279e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f23561a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f23562b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f23563c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f23566f.toString());
        edit.apply();
        C5353k kVar = this.f23565e;
        if (kVar != null) {
            kVar.mo21659c();
        }
    }

    public C5351i(Long l, Long l2, UUID uuid) {
        this.f23561a = l;
        this.f23562b = l2;
        this.f23566f = uuid;
    }
}
