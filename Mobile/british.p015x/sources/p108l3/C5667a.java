package p108l3;

import android.os.Build;
import com.facebook.internal.C3481f0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l3.a */
/* compiled from: InstrumentData */
public final class C5667a {

    /* renamed from: a */
    private String f24246a;

    /* renamed from: b */
    private String f24247b;

    /* renamed from: c */
    private String f24248c;

    /* renamed from: d */
    private String f24249d;

    /* renamed from: e */
    private Long f24250e;

    /* renamed from: f */
    private String f24251f;

    /* renamed from: l3.a$a */
    /* compiled from: InstrumentData */
    static /* synthetic */ class C5668a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24252a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                l3.a$b[] r0 = p108l3.C5667a.C5669b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24252a = r0
                l3.a$b r1 = p108l3.C5667a.C5669b.CrashReport     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24252a     // Catch:{ NoSuchFieldError -> 0x001d }
                l3.a$b r1 = p108l3.C5667a.C5669b.CrashShield     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24252a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l3.a$b r1 = p108l3.C5667a.C5669b.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p108l3.C5667a.C5668a.<clinit>():void");
        }
    }

    /* renamed from: l3.a$b */
    /* compiled from: InstrumentData */
    public enum C5669b {
        CrashReport,
        CrashShield,
        ThreadCheck;

        public String toString() {
            int i = C5668a.f24252a[ordinal()];
            if (i == 1) {
                return "CrashReport";
            }
            if (i != 2) {
                return i != 3 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    public C5667a(Throwable th, C5669b bVar) {
        this.f24247b = C3481f0.m11652s();
        this.f24248c = C5673c.m25027b(th);
        this.f24249d = C5673c.m25029d(th);
        this.f24250e = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f24251f = bVar.toString();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("crash_log_");
        stringBuffer.append(this.f24250e.toString());
        stringBuffer.append(".json");
        this.f24246a = stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo22346a() {
        C5673c.m25026a(this.f24246a);
    }

    /* renamed from: b */
    public int mo22347b(C5667a aVar) {
        Long l = this.f24250e;
        if (l == null) {
            return -1;
        }
        Long l2 = aVar.f24250e;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: c */
    public JSONObject mo22348c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f24247b;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f24250e;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f24248c;
            if (str2 != null) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
            }
            String str3 = this.f24249d;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            String str4 = this.f24251f;
            if (str4 != null) {
                jSONObject.put(SessionDescription.ATTR_TYPE, str4);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo22349d() {
        return (this.f24249d == null || this.f24250e == null) ? false : true;
    }

    /* renamed from: e */
    public void mo22350e() {
        if (mo22349d()) {
            C5673c.m25034i(this.f24246a, toString());
        }
    }

    public String toString() {
        JSONObject c = mo22348c();
        if (c == null) {
            return null;
        }
        return c.toString();
    }

    public C5667a(File file) {
        String name = file.getName();
        this.f24246a = name;
        JSONObject g = C5673c.m25032g(name, true);
        if (g != null) {
            this.f24247b = g.optString("app_version", (String) null);
            this.f24248c = g.optString(IronSourceConstants.EVENTS_ERROR_REASON, (String) null);
            this.f24249d = g.optString("callstack", (String) null);
            this.f24250e = Long.valueOf(g.optLong("timestamp", 0));
            this.f24251f = g.optString(SessionDescription.ATTR_TYPE, (String) null);
        }
    }
}
