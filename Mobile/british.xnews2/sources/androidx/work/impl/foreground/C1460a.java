package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1431h;
import androidx.work.C1483m;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p128p1.C5884b;
import p128p1.C5892i;
import p145s1.C6015c;
import p145s1.C6016d;
import p167w1.C6283p;
import p177y1.C6400a;

/* renamed from: androidx.work.impl.foreground.a */
/* compiled from: SystemForegroundDispatcher */
public class C1460a implements C6015c, C5884b {

    /* renamed from: l */
    static final String f6431l = C1483m.m7773f("SystemFgDispatcher");

    /* renamed from: b */
    private Context f6432b;

    /* renamed from: c */
    private C5892i f6433c;

    /* renamed from: d */
    private final C6400a f6434d;

    /* renamed from: e */
    final Object f6435e = new Object();

    /* renamed from: f */
    String f6436f;

    /* renamed from: g */
    final Map<String, C1431h> f6437g;

    /* renamed from: h */
    final Map<String, C6283p> f6438h;

    /* renamed from: i */
    final Set<C6283p> f6439i;

    /* renamed from: j */
    final C6016d f6440j;

    /* renamed from: k */
    private C1462b f6441k;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* compiled from: SystemForegroundDispatcher */
    class C1461a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ WorkDatabase f6442b;

        /* renamed from: c */
        final /* synthetic */ String f6443c;

        C1461a(WorkDatabase workDatabase, String str) {
            this.f6442b = workDatabase;
            this.f6443c = str;
        }

        public void run() {
            C6283p n = this.f6442b.mo6924j().mo23997n(this.f6443c);
            if (n != null && n.mo23970b()) {
                synchronized (C1460a.this.f6435e) {
                    C1460a.this.f6438h.put(this.f6443c, n);
                    C1460a.this.f6439i.add(n);
                    C1460a aVar = C1460a.this;
                    aVar.f6440j.mo23146d(aVar.f6439i);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    /* compiled from: SystemForegroundDispatcher */
    interface C1462b {
        /* renamed from: d */
        void mo6960d(int i, int i2, Notification notification);

        /* renamed from: e */
        void mo6961e(int i, Notification notification);

        /* renamed from: f */
        void mo6962f(int i);

        void stop();
    }

    C1460a(Context context) {
        this.f6432b = context;
        C5892i s = C5892i.m25998s(context);
        this.f6433c = s;
        C6400a x = s.mo22868x();
        this.f6434d = x;
        this.f6436f = null;
        this.f6437g = new LinkedHashMap();
        this.f6439i = new HashSet();
        this.f6438h = new HashMap();
        this.f6440j = new C6016d(this.f6432b, x, this);
        this.f6433c.mo22865u().mo22833c(this);
    }

    /* renamed from: a */
    public static Intent m7690a(Context context, String str, C1431h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.mo6914c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.mo6912a());
        intent.putExtra("KEY_NOTIFICATION", hVar.mo6913b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m7691c(Context context, String str, C1431h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.mo6914c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.mo6912a());
        intent.putExtra("KEY_NOTIFICATION", hVar.mo6913b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: e */
    public static Intent m7692e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: g */
    private void m7693g(Intent intent) {
        C1483m.m7771c().mo7015d(f6431l, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f6433c.mo22859m(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: h */
    private void m7694h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C1483m.m7771c().mo7013a(f6431l, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f6441k != null) {
            this.f6437g.put(stringExtra, new C1431h(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f6436f)) {
                this.f6436f = stringExtra;
                this.f6441k.mo6960d(intExtra, intExtra2, notification);
                return;
            }
            this.f6441k.mo6961e(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, C1431h> value : this.f6437g.entrySet()) {
                    i |= ((C1431h) value.getValue()).mo6912a();
                }
                C1431h hVar = this.f6437g.get(this.f6436f);
                if (hVar != null) {
                    this.f6441k.mo6960d(hVar.mo6914c(), i, hVar.mo6913b());
                }
            }
        }
    }

    /* renamed from: i */
    private void m7695i(Intent intent) {
        C1483m.m7771c().mo7015d(f6431l, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f6434d.mo24233b(new C1461a(this.f6433c.mo22867w(), stringExtra));
    }

    /* renamed from: b */
    public void mo6937b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                C1483m.m7771c().mo7013a(f6431l, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f6433c.mo22857E(next);
            }
        }
    }

    /* renamed from: d */
    public void mo6932d(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f6435e) {
            C6283p remove = this.f6438h.remove(str);
            if (remove != null ? this.f6439i.remove(remove) : false) {
                this.f6440j.mo23146d(this.f6439i);
            }
        }
        C1431h remove2 = this.f6437g.remove(str);
        if (str.equals(this.f6436f) && this.f6437g.size() > 0) {
            Iterator it = this.f6437g.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f6436f = (String) entry.getKey();
            if (this.f6441k != null) {
                C1431h hVar = (C1431h) entry.getValue();
                this.f6441k.mo6960d(hVar.mo6914c(), hVar.mo6912a(), hVar.mo6913b());
                this.f6441k.mo6962f(hVar.mo6914c());
            }
        }
        C1462b bVar = this.f6441k;
        if (remove2 != null && bVar != null) {
            C1483m.m7771c().mo7013a(f6431l, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.mo6914c()), str, Integer.valueOf(remove2.mo6912a())}), new Throwable[0]);
            bVar.mo6962f(remove2.mo6914c());
        }
    }

    /* renamed from: f */
    public void mo6939f(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6967j(Intent intent) {
        C1483m.m7771c().mo7015d(f6431l, "Stopping foreground service", new Throwable[0]);
        C1462b bVar = this.f6441k;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6968k() {
        this.f6441k = null;
        synchronized (this.f6435e) {
            this.f6440j.mo23147e();
        }
        this.f6433c.mo22865u().mo22837i(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6969l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m7695i(intent);
            m7694h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m7694h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m7693g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            mo6967j(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6970m(C1462b bVar) {
        if (this.f6441k != null) {
            C1483m.m7771c().mo7014b(f6431l, "A callback already exists.", new Throwable[0]);
        } else {
            this.f6441k = bVar;
        }
    }
}
