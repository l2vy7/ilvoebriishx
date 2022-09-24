package p168w1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import java.util.ArrayList;
import java.util.List;
import p086h1.C5372c;
import p091i1.C5444f;

/* renamed from: w1.l */
/* compiled from: WorkNameDao_Impl */
public final class C6275l implements C6274k {

    /* renamed from: a */
    private final C1199i f25927a;

    /* renamed from: b */
    private final C1177b<C6273j> f25928b;

    /* renamed from: w1.l$a */
    /* compiled from: WorkNameDao_Impl */
    class C6276a extends C1177b<C6273j> {
        C6276a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6273j jVar) {
            String str = jVar.f25925a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            String str2 = jVar.f25926b;
            if (str2 == null) {
                fVar.mo5953j0(2);
            } else {
                fVar.mo5952i(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C6275l(C1199i iVar) {
        this.f25927a = iVar;
        this.f25928b = new C6276a(iVar);
    }

    /* renamed from: a */
    public void mo23962a(C6273j jVar) {
        this.f25927a.assertNotSuspendingTransaction();
        this.f25927a.beginTransaction();
        try {
            this.f25928b.insert(jVar);
            this.f25927a.setTransactionSuccessful();
        } finally {
            this.f25927a.endTransaction();
        }
    }

    /* renamed from: b */
    public List<String> mo23963b(String str) {
        C1208l e = C1208l.m6621e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25927a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25927a, e, false, (CancellationSignal) null);
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
}
