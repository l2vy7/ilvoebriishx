package p167w1;

import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1211o;
import androidx.work.C1427e;
import p090i1.C5444f;

/* renamed from: w1.o */
/* compiled from: WorkProgressDao_Impl */
public final class C6279o implements C6278n {

    /* renamed from: a */
    private final C1199i f25932a;

    /* renamed from: b */
    private final C1177b<C6277m> f25933b;

    /* renamed from: c */
    private final C1211o f25934c;

    /* renamed from: d */
    private final C1211o f25935d;

    /* renamed from: w1.o$a */
    /* compiled from: WorkProgressDao_Impl */
    class C6280a extends C1177b<C6277m> {
        C6280a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6277m mVar) {
            String str = mVar.f25930a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            byte[] l = C1427e.m7579l(mVar.f25931b);
            if (l == null) {
                fVar.mo5953j0(2);
            } else {
                fVar.mo5946S(2, l);
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* renamed from: w1.o$b */
    /* compiled from: WorkProgressDao_Impl */
    class C6281b extends C1211o {
        C6281b(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: w1.o$c */
    /* compiled from: WorkProgressDao_Impl */
    class C6282c extends C1211o {
        C6282c(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C6279o(C1199i iVar) {
        this.f25932a = iVar;
        this.f25933b = new C6280a(iVar);
        this.f25934c = new C6281b(iVar);
        this.f25935d = new C6282c(iVar);
    }

    /* renamed from: a */
    public void mo23965a(String str) {
        this.f25932a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25934c.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f25932a.beginTransaction();
        try {
            acquire.mo21908I();
            this.f25932a.setTransactionSuccessful();
        } finally {
            this.f25932a.endTransaction();
            this.f25934c.release(acquire);
        }
    }

    /* renamed from: b */
    public void mo23966b(C6277m mVar) {
        this.f25932a.assertNotSuspendingTransaction();
        this.f25932a.beginTransaction();
        try {
            this.f25933b.insert(mVar);
            this.f25932a.setTransactionSuccessful();
        } finally {
            this.f25932a.endTransaction();
        }
    }

    /* renamed from: c */
    public void mo23967c() {
        this.f25932a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25935d.acquire();
        this.f25932a.beginTransaction();
        try {
            acquire.mo21908I();
            this.f25932a.setTransactionSuccessful();
        } finally {
            this.f25932a.endTransaction();
            this.f25935d.release(acquire);
        }
    }
}
