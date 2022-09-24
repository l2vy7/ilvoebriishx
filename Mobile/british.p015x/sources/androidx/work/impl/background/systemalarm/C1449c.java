package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C1483m;
import androidx.work.impl.background.systemalarm.C1451e;
import java.util.ArrayList;
import java.util.List;
import p146s1.C6015c;
import p146s1.C6016d;
import p168w1.C6283p;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: ConstraintsCommandHandler */
class C1449c {

    /* renamed from: e */
    private static final String f6379e = C1483m.m7773f("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f6380a;

    /* renamed from: b */
    private final int f6381b;

    /* renamed from: c */
    private final C1451e f6382c;

    /* renamed from: d */
    private final C6016d f6383d;

    C1449c(Context context, int i, C1451e eVar) {
        this.f6380a = context;
        this.f6381b = i;
        this.f6382c = eVar;
        this.f6383d = new C6016d(context, eVar.mo6943f(), (C6015c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6935a() {
        List<C6283p> g = this.f6382c.mo6944g().mo22867w().mo6924j().mo23990g();
        ConstraintProxy.m7634a(this.f6380a, g);
        this.f6383d.mo23146d(g);
        ArrayList<C6283p> arrayList = new ArrayList<>(g.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C6283p next : g) {
            String str = next.f25941a;
            if (currentTimeMillis >= next.mo23969a() && (!next.mo23970b() || this.f6383d.mo23145c(str))) {
                arrayList.add(next);
            }
        }
        for (C6283p pVar : arrayList) {
            String str2 = pVar.f25941a;
            Intent b = C1448b.m7643b(this.f6380a, str2);
            C1483m.m7771c().mo7013a(f6379e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C1451e eVar = this.f6382c;
            eVar.mo6947k(new C1451e.C1453b(eVar, b, this.f6381b));
        }
        this.f6383d.mo23147e();
    }
}
