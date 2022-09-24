package p185z3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p005a4.C0078c;
import p021c4.C2657a;
import p067d4.C5190a;
import p154t3.C6150m;
import p170w3.C6315a;

/* renamed from: z3.a */
/* compiled from: AlarmManagerScheduler */
public class C6446a implements C6468q {

    /* renamed from: a */
    private final Context f26490a;

    /* renamed from: b */
    private final C0078c f26491b;

    /* renamed from: c */
    private AlarmManager f26492c;

    /* renamed from: d */
    private final C6452e f26493d;

    /* renamed from: e */
    private final C2657a f26494e;

    public C6446a(Context context, C0078c cVar, C2657a aVar, C6452e eVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, eVar);
    }

    /* renamed from: a */
    public void mo24267a(C6150m mVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.mo23503b());
        builder.appendQueryParameter("priority", String.valueOf(C5190a.m23550a(mVar.mo23505d())));
        if (mVar.mo23504c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.mo23504c(), 0));
        }
        Intent intent = new Intent(this.f26490a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (mo24268b(intent)) {
            C6315a.m27820a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long B0 = this.f26491b.mo219B0(mVar);
        long g = this.f26493d.mo24286g(mVar.mo23505d(), B0, i);
        C6315a.m27821b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(g), Long.valueOf(B0), Integer.valueOf(i));
        this.f26492c.set(3, this.f26494e.mo9336a() + g, PendingIntent.getBroadcast(this.f26490a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo24268b(Intent intent) {
        return PendingIntent.getBroadcast(this.f26490a, 0, intent, 536870912) != null;
    }

    C6446a(Context context, C0078c cVar, AlarmManager alarmManager, C2657a aVar, C6452e eVar) {
        this.f26490a = context;
        this.f26491b = cVar;
        this.f26492c = alarmManager;
        this.f26494e = aVar;
        this.f26493d = eVar;
    }
}
