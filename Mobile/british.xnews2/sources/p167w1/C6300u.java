package p167w1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import java.util.ArrayList;
import java.util.List;
import p085h1.C5372c;
import p090i1.C5444f;

/* renamed from: w1.u */
/* compiled from: WorkTagDao_Impl */
public final class C6300u implements C6299t {

    /* renamed from: a */
    private final C1199i f25988a;

    /* renamed from: b */
    private final C1177b<C6298s> f25989b;

    /* renamed from: w1.u$a */
    /* compiled from: WorkTagDao_Impl */
    class C6301a extends C1177b<C6298s> {
        C6301a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6298s sVar) {
            String str = sVar.f25986a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            String str2 = sVar.f25987b;
            if (str2 == null) {
                fVar.mo5953j0(2);
            } else {
                fVar.mo5952i(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C6300u(C1199i iVar) {
        this.f25988a = iVar;
        this.f25989b = new C6301a(iVar);
    }

    /* renamed from: a */
    public List<String> mo24007a(String str) {
        C1208l e = C1208l.m6621e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25988a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25988a, e, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: b */
    public void mo24008b(C6298s sVar) {
        this.f25988a.assertNotSuspendingTransaction();
        this.f25988a.beginTransaction();
        try {
            this.f25989b.insert(sVar);
            this.f25988a.setTransactionSuccessful();
        } finally {
            this.f25988a.endTransaction();
        }
    }
}
