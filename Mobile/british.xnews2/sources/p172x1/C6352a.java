package p172x1;

import androidx.work.C1488p;
import androidx.work.C1501w;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p128p1.C5885c;
import p128p1.C5888e;
import p128p1.C5889f;
import p128p1.C5892i;
import p167w1.C6261b;
import p167w1.C6287q;

/* renamed from: x1.a */
/* compiled from: CancelWorkRunnable */
public abstract class C6352a implements Runnable {

    /* renamed from: b */
    private final C5885c f26201b = new C5885c();

    /* renamed from: x1.a$a */
    /* compiled from: CancelWorkRunnable */
    class C6353a extends C6352a {

        /* renamed from: c */
        final /* synthetic */ C5892i f26202c;

        /* renamed from: d */
        final /* synthetic */ UUID f26203d;

        C6353a(C5892i iVar, UUID uuid) {
            this.f26202c = iVar;
            this.f26203d = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo24178h() {
            WorkDatabase w = this.f26202c.mo22867w();
            w.beginTransaction();
            try {
                mo24175a(this.f26202c, this.f26203d.toString());
                w.setTransactionSuccessful();
                w.endTransaction();
                mo24177g(this.f26202c);
            } catch (Throwable th) {
                w.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: x1.a$b */
    /* compiled from: CancelWorkRunnable */
    class C6354b extends C6352a {

        /* renamed from: c */
        final /* synthetic */ C5892i f26204c;

        /* renamed from: d */
        final /* synthetic */ String f26205d;

        C6354b(C5892i iVar, String str) {
            this.f26204c = iVar;
            this.f26205d = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo24178h() {
            WorkDatabase w = this.f26204c.mo22867w();
            w.beginTransaction();
            try {
                for (String a : w.mo6924j().mo24000q(this.f26205d)) {
                    mo24175a(this.f26204c, a);
                }
                w.setTransactionSuccessful();
                w.endTransaction();
                mo24177g(this.f26204c);
            } catch (Throwable th) {
                w.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: x1.a$c */
    /* compiled from: CancelWorkRunnable */
    class C6355c extends C6352a {

        /* renamed from: c */
        final /* synthetic */ C5892i f26206c;

        /* renamed from: d */
        final /* synthetic */ String f26207d;

        /* renamed from: e */
        final /* synthetic */ boolean f26208e;

        C6355c(C5892i iVar, String str, boolean z) {
            this.f26206c = iVar;
            this.f26207d = str;
            this.f26208e = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo24178h() {
            WorkDatabase w = this.f26206c.mo22867w();
            w.beginTransaction();
            try {
                for (String a : w.mo6924j().mo23995l(this.f26207d)) {
                    mo24175a(this.f26206c, a);
                }
                w.setTransactionSuccessful();
                w.endTransaction();
                if (this.f26208e) {
                    mo24177g(this.f26206c);
                }
            } catch (Throwable th) {
                w.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static C6352a m27974b(UUID uuid, C5892i iVar) {
        return new C6353a(iVar, uuid);
    }

    /* renamed from: c */
    public static C6352a m27975c(String str, C5892i iVar, boolean z) {
        return new C6355c(iVar, str, z);
    }

    /* renamed from: d */
    public static C6352a m27976d(String str, C5892i iVar) {
        return new C6354b(iVar, str);
    }

    /* renamed from: f */
    private void m27977f(WorkDatabase workDatabase, String str) {
        C6287q j = workDatabase.mo6924j();
        C6261b b = workDatabase.mo6919b();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C1501w.C1502a m = j.mo23996m(str2);
            if (!(m == C1501w.C1502a.SUCCEEDED || m == C1501w.C1502a.FAILED)) {
                j.mo23985b(C1501w.C1502a.CANCELLED, str2);
            }
            linkedList.addAll(b.mo23945a(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24175a(C5892i iVar, String str) {
        m27977f(iVar.mo22867w(), str);
        iVar.mo22865u().mo22840l(str);
        for (C5888e e : iVar.mo22866v()) {
            e.mo6954e(str);
        }
    }

    /* renamed from: e */
    public C1488p mo24176e() {
        return this.f26201b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24177g(C5892i iVar) {
        C5889f.m25975b(iVar.mo22863q(), iVar.mo22867w(), iVar.mo22866v());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo24178h();

    public void run() {
        try {
            mo24178h();
            this.f26201b.mo22830a(C1488p.f6501a);
        } catch (Throwable th) {
            this.f26201b.mo22830a(new C1488p.C1490b.C1491a(th));
        }
    }
}
