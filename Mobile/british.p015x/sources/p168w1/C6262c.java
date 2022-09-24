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

/* renamed from: w1.c */
/* compiled from: DependencyDao_Impl */
public final class C6262c implements C6261b {

    /* renamed from: a */
    private final C1199i f25910a;

    /* renamed from: b */
    private final C1177b<C6260a> f25911b;

    /* renamed from: w1.c$a */
    /* compiled from: DependencyDao_Impl */
    class C6263a extends C1177b<C6260a> {
        C6263a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6260a aVar) {
            String str = aVar.f25908a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            String str2 = aVar.f25909b;
            if (str2 == null) {
                fVar.mo5953j0(2);
            } else {
                fVar.mo5952i(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public C6262c(C1199i iVar) {
        this.f25910a = iVar;
        this.f25911b = new C6263a(iVar);
    }

    /* renamed from: a */
    public List<String> mo23945a(String str) {
        C1208l e = C1208l.m6621e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25910a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25910a, e, false, (CancellationSignal) null);
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
    public boolean mo23946b(String str) {
        boolean z = true;
        C1208l e = C1208l.m6621e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25910a.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor b = C5372c.m24191b(this.f25910a, e, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: c */
    public boolean mo23947c(String str) {
        boolean z = true;
        C1208l e = C1208l.m6621e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25910a.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor b = C5372c.m24191b(this.f25910a, e, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: d */
    public void mo23948d(C6260a aVar) {
        this.f25910a.assertNotSuspendingTransaction();
        this.f25910a.beginTransaction();
        try {
            this.f25911b.insert(aVar);
            this.f25910a.setTransactionSuccessful();
        } finally {
            this.f25910a.endTransaction();
        }
    }
}
