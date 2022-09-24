package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1419b;
import androidx.work.C1479j;
import androidx.work.C1483m;
import androidx.work.C1501w;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p089i0.C5420a;
import p128p1.C5889f;
import p128p1.C5891h;
import p128p1.C5892i;
import p140r1.C5977b;
import p167w1.C6278n;
import p167w1.C6283p;
import p167w1.C6287q;
import p172x1.C6360f;

public class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    private static final String f6445e = C1483m.m7773f("ForceStopRunnable");

    /* renamed from: f */
    private static final long f6446f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    private final Context f6447b;

    /* renamed from: c */
    private final C5892i f6448c;

    /* renamed from: d */
    private int f6449d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f6450a = C1483m.m7773f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C1483m.m7771c().mo7016g(f6450a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.m7708g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C5892i iVar) {
        this.f6447b = context.getApplicationContext();
        this.f6448c = iVar;
    }

    /* renamed from: c */
    static Intent m7706c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m7707d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m7706c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    static void m7708g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = m7707d(context, C5420a.m24369c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f6446f;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, d);
        } else {
            alarmManager.set(0, currentTimeMillis, d);
        }
    }

    /* renamed from: a */
    public boolean mo6972a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? C5977b.m26347i(this.f6447b, this.f6448c) : false;
        WorkDatabase w = this.f6448c.mo22867w();
        C6287q j = w.mo6924j();
        C6278n i2 = w.mo6923i();
        w.beginTransaction();
        try {
            List<C6283p> j2 = j.mo23993j();
            boolean z = j2 != null && !j2.isEmpty();
            if (z) {
                for (C6283p next : j2) {
                    j.mo23985b(C1501w.C1502a.ENQUEUED, next.f25941a);
                    j.mo23986c(next.f25941a, -1);
                }
            }
            i2.mo23967c();
            w.setTransactionSuccessful();
            if (z || i) {
                return true;
            }
            return false;
        } finally {
            w.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo6973b() {
        boolean a = mo6972a();
        if (mo6976h()) {
            C1483m.m7771c().mo7013a(f6445e, "Rescheduling Workers.", new Throwable[0]);
            this.f6448c.mo22853A();
            this.f6448c.mo22864t().mo24187c(false);
        } else if (mo6974e()) {
            C1483m.m7771c().mo7013a(f6445e, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f6448c.mo22853A();
        } else if (a) {
            C1483m.m7771c().mo7013a(f6445e, "Found unfinished work, scheduling it.", new Throwable[0]);
            C5889f.m25975b(this.f6448c.mo22863q(), this.f6448c.mo22867w(), this.f6448c.mo22866v());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean mo6974e() {
        int i = 536870912;
        try {
            if (C5420a.m24369c()) {
                i = 570425344;
            }
            PendingIntent d = m7707d(this.f6447b, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f6447b.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i2)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                m7708g(this.f6447b);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            C1483m.m7771c().mo7017h(f6445e, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo6975f() {
        C1419b q = this.f6448c.mo22863q();
        if (TextUtils.isEmpty(q.mo6855c())) {
            C1483m.m7771c().mo7013a(f6445e, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = C6360f.m28003b(this.f6447b, q);
        C1483m.m7771c().mo7013a(f6445e, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b)}), new Throwable[0]);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo6976h() {
        return this.f6448c.mo22864t().mo24186a();
    }

    /* renamed from: i */
    public void mo6977i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo6975f()) {
                this.f6448c.mo22869z();
                return;
            }
            while (true) {
                C5891h.m25994e(this.f6447b);
                C1483m.m7771c().mo7013a(f6445e, "Performing cleanup operations.", new Throwable[0]);
                mo6973b();
                break;
            }
            this.f6448c.mo22869z();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
            int i = this.f6449d + 1;
            this.f6449d = i;
            if (i >= 3) {
                C1483m c = C1483m.m7771c();
                String str = f6445e;
                c.mo7014b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                C1479j d = this.f6448c.mo22863q().mo6856d();
                if (d != null) {
                    C1483m.m7771c().mo7013a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d.mo7010a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                C1483m.m7771c().mo7013a(f6445e, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)}), e);
                mo6977i(((long) this.f6449d) * 300);
            }
        } catch (Throwable th) {
            this.f6448c.mo22869z();
            throw th;
        }
    }
}
