package p140r1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C1418a;
import androidx.work.C1423c;
import androidx.work.C1425d;
import androidx.work.C1483m;
import androidx.work.C1485n;
import androidx.work.impl.background.systemjob.SystemJobService;
import p089i0.C5420a;
import p167w1.C6283p;

/* renamed from: r1.a */
/* compiled from: SystemJobInfoConverter */
class C5975a {

    /* renamed from: b */
    private static final String f24922b = C1483m.m7773f("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f24923a;

    /* renamed from: r1.a$a */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C5976a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.n[] r0 = androidx.work.C1485n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24924a = r0
                androidx.work.n r1 = androidx.work.C1485n.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24924a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.n r1 = androidx.work.C1485n.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.n r1 = androidx.work.C1485n.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.n r1 = androidx.work.C1485n.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f24924a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.n r1 = androidx.work.C1485n.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p140r1.C5975a.C5976a.<clinit>():void");
        }
    }

    C5975a(Context context) {
        this.f24923a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m26338b(C1425d.C1426a aVar) {
        return new JobInfo.TriggerContentUri(aVar.mo6895a(), aVar.mo6896b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m26339c(C1485n nVar) {
        int i = C5976a.f24924a[nVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        C1483m.m7771c().mo7013a(f24922b, String.format("API version too low. Cannot convert network type value %s", new Object[]{nVar}), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    static void m26340d(JobInfo.Builder builder, C1485n nVar) {
        if (Build.VERSION.SDK_INT < 30 || nVar != C1485n.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m26339c(nVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo mo23035a(C6283p pVar, int i) {
        C1423c cVar = pVar.f25950j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f25941a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.mo23972d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f24923a).setRequiresCharging(cVar.mo6876g()).setRequiresDeviceIdle(cVar.mo6877h()).setExtras(persistableBundle);
        m26340d(extras, cVar.mo6870b());
        boolean z = false;
        if (!cVar.mo6877h()) {
            extras.setBackoffCriteria(pVar.f25953m, pVar.f25952l == C1418a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.mo23969a() - System.currentTimeMillis(), 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f25957q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && cVar.mo6873e()) {
            for (C1425d.C1426a b : cVar.mo6869a().mo6891b()) {
                extras.addTriggerContentUri(m26338b(b));
            }
            extras.setTriggerContentUpdateDelay(cVar.mo6871c());
            extras.setTriggerContentMaxDelay(cVar.mo6872d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.mo6875f());
            extras.setRequiresStorageNotLow(cVar.mo6879i());
        }
        if (pVar.f25951k > 0) {
            z = true;
        }
        if (C5420a.m24369c() && pVar.f25957q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
