package p168w1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import androidx.room.C1211o;
import java.util.ArrayList;
import java.util.List;
import p086h1.C5371b;
import p086h1.C5372c;
import p091i1.C5444f;

/* renamed from: w1.i */
/* compiled from: SystemIdInfoDao_Impl */
public final class C6270i implements C6269h {

    /* renamed from: a */
    private final C1199i f25920a;

    /* renamed from: b */
    private final C1177b<C6268g> f25921b;

    /* renamed from: c */
    private final C1211o f25922c;

    /* renamed from: w1.i$a */
    /* compiled from: SystemIdInfoDao_Impl */
    class C6271a extends C1177b<C6268g> {
        C6271a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6268g gVar) {
            String str = gVar.f25918a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            fVar.mo5945N(2, (long) gVar.f25919b);
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* renamed from: w1.i$b */
    /* compiled from: SystemIdInfoDao_Impl */
    class C6272b extends C1211o {
        C6272b(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C6270i(C1199i iVar) {
        this.f25920a = iVar;
        this.f25921b = new C6271a(iVar);
        this.f25922c = new C6272b(iVar);
    }

    /* renamed from: a */
    public List<String> mo23957a() {
        C1208l e = C1208l.m6621e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f25920a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25920a, e, false, (CancellationSignal) null);
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
    public void mo23958b(C6268g gVar) {
        this.f25920a.assertNotSuspendingTransaction();
        this.f25920a.beginTransaction();
        try {
            this.f25921b.insert(gVar);
            this.f25920a.setTransactionSuccessful();
        } finally {
            this.f25920a.endTransaction();
        }
    }

    /* renamed from: c */
    public C6268g mo23959c(String str) {
        C1208l e = C1208l.m6621e("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25920a.assertNotSuspendingTransaction();
        C6268g gVar = null;
        Cursor b = C5372c.m24191b(this.f25920a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "work_spec_id");
            int c2 = C5371b.m24189c(b, "system_id");
            if (b.moveToFirst()) {
                gVar = new C6268g(b.getString(c), b.getInt(c2));
            }
            return gVar;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: d */
    public void mo23960d(String str) {
        this.f25920a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25922c.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f25920a.beginTransaction();
        try {
            acquire.mo21908I();
            this.f25920a.setTransactionSuccessful();
        } finally {
            this.f25920a.endTransaction();
            this.f25922c.release(acquire);
        }
    }
}
