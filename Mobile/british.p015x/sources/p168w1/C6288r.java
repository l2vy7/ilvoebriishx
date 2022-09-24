package p168w1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import androidx.room.C1211o;
import androidx.work.C1423c;
import androidx.work.C1427e;
import androidx.work.C1501w;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p086h1.C5371b;
import p086h1.C5372c;
import p086h1.C5375f;
import p091i1.C5444f;
import p150t.C6077a;
import p168w1.C6283p;

/* renamed from: w1.r */
/* compiled from: WorkSpecDao_Impl */
public final class C6288r implements C6287q {

    /* renamed from: a */
    private final C1199i f25967a;

    /* renamed from: b */
    private final C1177b<C6283p> f25968b;

    /* renamed from: c */
    private final C1211o f25969c;

    /* renamed from: d */
    private final C1211o f25970d;

    /* renamed from: e */
    private final C1211o f25971e;

    /* renamed from: f */
    private final C1211o f25972f;

    /* renamed from: g */
    private final C1211o f25973g;

    /* renamed from: h */
    private final C1211o f25974h;

    /* renamed from: i */
    private final C1211o f25975i;

    /* renamed from: j */
    private final C1211o f25976j;

    /* renamed from: w1.r$a */
    /* compiled from: WorkSpecDao_Impl */
    class C6289a extends C1177b<C6283p> {
        C6289a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6283p pVar) {
            String str = pVar.f25941a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            fVar.mo5945N(2, (long) C6302v.m27688j(pVar.f25942b));
            String str2 = pVar.f25943c;
            if (str2 == null) {
                fVar.mo5953j0(3);
            } else {
                fVar.mo5952i(3, str2);
            }
            String str3 = pVar.f25944d;
            if (str3 == null) {
                fVar.mo5953j0(4);
            } else {
                fVar.mo5952i(4, str3);
            }
            byte[] l = C1427e.m7579l(pVar.f25945e);
            if (l == null) {
                fVar.mo5953j0(5);
            } else {
                fVar.mo5946S(5, l);
            }
            byte[] l2 = C1427e.m7579l(pVar.f25946f);
            if (l2 == null) {
                fVar.mo5953j0(6);
            } else {
                fVar.mo5946S(6, l2);
            }
            fVar.mo5945N(7, pVar.f25947g);
            fVar.mo5945N(8, pVar.f25948h);
            fVar.mo5945N(9, pVar.f25949i);
            fVar.mo5945N(10, (long) pVar.f25951k);
            fVar.mo5945N(11, (long) C6302v.m27679a(pVar.f25952l));
            fVar.mo5945N(12, pVar.f25953m);
            fVar.mo5945N(13, pVar.f25954n);
            fVar.mo5945N(14, pVar.f25955o);
            fVar.mo5945N(15, pVar.f25956p);
            fVar.mo5945N(16, pVar.f25957q ? 1 : 0);
            fVar.mo5945N(17, (long) C6302v.m27687i(pVar.f25958r));
            C1423c cVar = pVar.f25950j;
            if (cVar != null) {
                fVar.mo5945N(18, (long) C6302v.m27686h(cVar.mo6870b()));
                fVar.mo5945N(19, cVar.mo6876g() ? 1 : 0);
                fVar.mo5945N(20, cVar.mo6877h() ? 1 : 0);
                fVar.mo5945N(21, cVar.mo6875f() ? 1 : 0);
                fVar.mo5945N(22, cVar.mo6879i() ? 1 : 0);
                fVar.mo5945N(23, cVar.mo6871c());
                fVar.mo5945N(24, cVar.mo6872d());
                byte[] c = C6302v.m27681c(cVar.mo6869a());
                if (c == null) {
                    fVar.mo5953j0(25);
                } else {
                    fVar.mo5946S(25, c);
                }
            } else {
                fVar.mo5953j0(18);
                fVar.mo5953j0(19);
                fVar.mo5953j0(20);
                fVar.mo5953j0(21);
                fVar.mo5953j0(22);
                fVar.mo5953j0(23);
                fVar.mo5953j0(24);
                fVar.mo5953j0(25);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: w1.r$b */
    /* compiled from: WorkSpecDao_Impl */
    class C6290b extends C1211o {
        C6290b(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: w1.r$c */
    /* compiled from: WorkSpecDao_Impl */
    class C6291c extends C1211o {
        C6291c(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: w1.r$d */
    /* compiled from: WorkSpecDao_Impl */
    class C6292d extends C1211o {
        C6292d(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: w1.r$e */
    /* compiled from: WorkSpecDao_Impl */
    class C6293e extends C1211o {
        C6293e(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: w1.r$f */
    /* compiled from: WorkSpecDao_Impl */
    class C6294f extends C1211o {
        C6294f(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: w1.r$g */
    /* compiled from: WorkSpecDao_Impl */
    class C6295g extends C1211o {
        C6295g(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: w1.r$h */
    /* compiled from: WorkSpecDao_Impl */
    class C6296h extends C1211o {
        C6296h(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: w1.r$i */
    /* compiled from: WorkSpecDao_Impl */
    class C6297i extends C1211o {
        C6297i(C1199i iVar) {
            super(iVar);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C6288r(C1199i iVar) {
        this.f25967a = iVar;
        this.f25968b = new C6289a(iVar);
        this.f25969c = new C6290b(iVar);
        this.f25970d = new C6291c(iVar);
        this.f25971e = new C6292d(iVar);
        this.f25972f = new C6293e(iVar);
        this.f25973g = new C6294f(iVar);
        this.f25974h = new C6295g(iVar);
        this.f25975i = new C6296h(iVar);
        this.f25976j = new C6297i(iVar);
    }

    /* renamed from: w */
    private void m27649w(C6077a<String, ArrayList<C1427e>> aVar) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C6077a aVar2 = new C6077a((int) C1199i.MAX_BIND_PARAMETER_CNT);
                int size = aVar.size();
                int i2 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        aVar2.put(aVar.mo23390j(i2), aVar.mo23391o(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            m27649w(aVar2);
                            aVar2 = new C6077a((int) C1199i.MAX_BIND_PARAMETER_CNT);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    m27649w(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b = C5375f.m24197b();
            b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C5375f.m24196a(b, size2);
            b.append(")");
            C1208l e = C1208l.m6621e(b.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    e.mo5953j0(i3);
                } else {
                    e.mo5952i(i3, next);
                }
                i3++;
            }
            Cursor b2 = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
            try {
                int b3 = C5371b.m24188b(b2, "work_spec_id");
                if (b3 != -1) {
                    while (b2.moveToNext()) {
                        if (!b2.isNull(b3) && (arrayList = aVar.get(b2.getString(b3))) != null) {
                            arrayList.add(C1427e.m7578g(b2.getBlob(0)));
                        }
                    }
                    b2.close();
                }
            } finally {
                b2.close();
            }
        }
    }

    /* renamed from: x */
    private void m27650x(C6077a<String, ArrayList<String>> aVar) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C6077a aVar2 = new C6077a((int) C1199i.MAX_BIND_PARAMETER_CNT);
                int size = aVar.size();
                int i2 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        aVar2.put(aVar.mo23390j(i2), aVar.mo23391o(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            m27650x(aVar2);
                            aVar2 = new C6077a((int) C1199i.MAX_BIND_PARAMETER_CNT);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    m27650x(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b = C5375f.m24197b();
            b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C5375f.m24196a(b, size2);
            b.append(")");
            C1208l e = C1208l.m6621e(b.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    e.mo5953j0(i3);
                } else {
                    e.mo5952i(i3, next);
                }
                i3++;
            }
            Cursor b2 = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
            try {
                int b3 = C5371b.m24188b(b2, "work_spec_id");
                if (b3 != -1) {
                    while (b2.moveToNext()) {
                        if (!b2.isNull(b3) && (arrayList = aVar.get(b2.getString(b3))) != null) {
                            arrayList.add(b2.getString(0));
                        }
                    }
                    b2.close();
                }
            } finally {
                b2.close();
            }
        }
    }

    /* renamed from: a */
    public void mo23984a(String str) {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25969c.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f25967a.beginTransaction();
        try {
            acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
        } finally {
            this.f25967a.endTransaction();
            this.f25969c.release(acquire);
        }
    }

    /* renamed from: b */
    public int mo23985b(C1501w.C1502a aVar, String... strArr) {
        this.f25967a.assertNotSuspendingTransaction();
        StringBuilder b = C5375f.m24197b();
        b.append("UPDATE workspec SET state=");
        b.append("?");
        b.append(" WHERE id IN (");
        C5375f.m24196a(b, strArr.length);
        b.append(")");
        C5444f compileStatement = this.f25967a.compileStatement(b.toString());
        compileStatement.mo5945N(1, (long) C6302v.m27688j(aVar));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.mo5953j0(i);
            } else {
                compileStatement.mo5952i(i, str);
            }
            i++;
        }
        this.f25967a.beginTransaction();
        try {
            int I = compileStatement.mo21908I();
            this.f25967a.setTransactionSuccessful();
            return I;
        } finally {
            this.f25967a.endTransaction();
        }
    }

    /* renamed from: c */
    public int mo23986c(String str, long j) {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25974h.acquire();
        acquire.mo5945N(1, j);
        if (str == null) {
            acquire.mo5953j0(2);
        } else {
            acquire.mo5952i(2, str);
        }
        this.f25967a.beginTransaction();
        try {
            int I = acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
            return I;
        } finally {
            this.f25967a.endTransaction();
            this.f25974h.release(acquire);
        }
    }

    /* renamed from: d */
    public List<C6283p.C6285b> mo23987d(String str) {
        C1208l e = C1208l.m6621e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c2 = C5371b.m24189c(b, "state");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                C6283p.C6285b bVar = new C6283p.C6285b();
                bVar.f25959a = b.getString(c);
                bVar.f25960b = C6302v.m27685g(b.getInt(c2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: e */
    public List<C6283p> mo23988e(long j) {
        C1208l lVar;
        C1208l e = C1208l.m6621e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        e.mo5945N(1, j);
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "required_network_type");
            int c2 = C5371b.m24189c(b, "requires_charging");
            int c3 = C5371b.m24189c(b, "requires_device_idle");
            int c4 = C5371b.m24189c(b, "requires_battery_not_low");
            int c5 = C5371b.m24189c(b, "requires_storage_not_low");
            int c6 = C5371b.m24189c(b, "trigger_content_update_delay");
            int c7 = C5371b.m24189c(b, "trigger_max_content_delay");
            int c8 = C5371b.m24189c(b, "content_uri_triggers");
            int c9 = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c10 = C5371b.m24189c(b, "state");
            int c11 = C5371b.m24189c(b, "worker_class_name");
            int c12 = C5371b.m24189c(b, "input_merger_class_name");
            int c13 = C5371b.m24189c(b, "input");
            int c14 = C5371b.m24189c(b, "output");
            lVar = e;
            try {
                int c15 = C5371b.m24189c(b, "initial_delay");
                int c16 = C5371b.m24189c(b, "interval_duration");
                int c17 = C5371b.m24189c(b, "flex_duration");
                int c18 = C5371b.m24189c(b, "run_attempt_count");
                int c19 = C5371b.m24189c(b, "backoff_policy");
                int c20 = C5371b.m24189c(b, "backoff_delay_duration");
                int c21 = C5371b.m24189c(b, "period_start_time");
                int c22 = C5371b.m24189c(b, "minimum_retention_duration");
                int c23 = C5371b.m24189c(b, "schedule_requested_at");
                int c24 = C5371b.m24189c(b, "run_in_foreground");
                int c25 = C5371b.m24189c(b, "out_of_quota_policy");
                int i = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    int i2 = c9;
                    String string2 = b.getString(c11);
                    int i3 = c11;
                    C1423c cVar = new C1423c();
                    int i4 = c;
                    cVar.mo6881k(C6302v.m27683e(b.getInt(c)));
                    cVar.mo6883m(b.getInt(c2) != 0);
                    cVar.mo6884n(b.getInt(c3) != 0);
                    cVar.mo6882l(b.getInt(c4) != 0);
                    cVar.mo6885o(b.getInt(c5) != 0);
                    int i5 = c2;
                    int i6 = c3;
                    cVar.mo6886p(b.getLong(c6));
                    cVar.mo6887q(b.getLong(c7));
                    cVar.mo6880j(C6302v.m27680b(b.getBlob(c8)));
                    C6283p pVar = new C6283p(string, string2);
                    pVar.f25942b = C6302v.m27685g(b.getInt(c10));
                    pVar.f25944d = b.getString(c12);
                    pVar.f25945e = C1427e.m7578g(b.getBlob(c13));
                    int i7 = i;
                    pVar.f25946f = C1427e.m7578g(b.getBlob(i7));
                    int i8 = c15;
                    int i9 = i5;
                    i = i7;
                    pVar.f25947g = b.getLong(i8);
                    int i10 = c12;
                    int i11 = c16;
                    pVar.f25948h = b.getLong(i11);
                    int i12 = i8;
                    int i13 = c4;
                    int i14 = c17;
                    pVar.f25949i = b.getLong(i14);
                    int i15 = c18;
                    pVar.f25951k = b.getInt(i15);
                    int i16 = c19;
                    int i17 = i11;
                    pVar.f25952l = C6302v.m27682d(b.getInt(i16));
                    c17 = i14;
                    int i18 = i13;
                    int i19 = c20;
                    pVar.f25953m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = c21;
                    pVar.f25954n = b.getLong(i22);
                    int i23 = i19;
                    c21 = i22;
                    int i24 = c22;
                    pVar.f25955o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = c23;
                    pVar.f25956p = b.getLong(i26);
                    int i27 = c24;
                    pVar.f25957q = b.getInt(i27) != 0;
                    int i28 = c25;
                    int i29 = i26;
                    pVar.f25958r = C6302v.m27684f(b.getInt(i28));
                    pVar.f25950j = cVar;
                    arrayList.add(pVar);
                    c2 = i9;
                    c25 = i28;
                    c12 = i10;
                    c15 = i12;
                    c16 = i17;
                    c18 = i25;
                    c23 = i29;
                    c9 = i2;
                    c11 = i3;
                    c = i4;
                    c24 = i27;
                    c22 = i24;
                    c3 = i6;
                    int i30 = i21;
                    c20 = i23;
                    c4 = i18;
                    c19 = i30;
                }
                b.close();
                lVar.mo5951h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                lVar.mo5951h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = e;
            b.close();
            lVar.mo5951h();
            throw th;
        }
    }

    /* renamed from: f */
    public List<C6283p> mo23989f(int i) {
        C1208l lVar;
        C1208l e = C1208l.m6621e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e.mo5945N(1, (long) i);
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "required_network_type");
            int c2 = C5371b.m24189c(b, "requires_charging");
            int c3 = C5371b.m24189c(b, "requires_device_idle");
            int c4 = C5371b.m24189c(b, "requires_battery_not_low");
            int c5 = C5371b.m24189c(b, "requires_storage_not_low");
            int c6 = C5371b.m24189c(b, "trigger_content_update_delay");
            int c7 = C5371b.m24189c(b, "trigger_max_content_delay");
            int c8 = C5371b.m24189c(b, "content_uri_triggers");
            int c9 = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c10 = C5371b.m24189c(b, "state");
            int c11 = C5371b.m24189c(b, "worker_class_name");
            int c12 = C5371b.m24189c(b, "input_merger_class_name");
            int c13 = C5371b.m24189c(b, "input");
            int c14 = C5371b.m24189c(b, "output");
            lVar = e;
            try {
                int c15 = C5371b.m24189c(b, "initial_delay");
                int c16 = C5371b.m24189c(b, "interval_duration");
                int c17 = C5371b.m24189c(b, "flex_duration");
                int c18 = C5371b.m24189c(b, "run_attempt_count");
                int c19 = C5371b.m24189c(b, "backoff_policy");
                int c20 = C5371b.m24189c(b, "backoff_delay_duration");
                int c21 = C5371b.m24189c(b, "period_start_time");
                int c22 = C5371b.m24189c(b, "minimum_retention_duration");
                int c23 = C5371b.m24189c(b, "schedule_requested_at");
                int c24 = C5371b.m24189c(b, "run_in_foreground");
                int c25 = C5371b.m24189c(b, "out_of_quota_policy");
                int i2 = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    int i3 = c9;
                    String string2 = b.getString(c11);
                    int i4 = c11;
                    C1423c cVar = new C1423c();
                    int i5 = c;
                    cVar.mo6881k(C6302v.m27683e(b.getInt(c)));
                    cVar.mo6883m(b.getInt(c2) != 0);
                    cVar.mo6884n(b.getInt(c3) != 0);
                    cVar.mo6882l(b.getInt(c4) != 0);
                    cVar.mo6885o(b.getInt(c5) != 0);
                    int i6 = c2;
                    int i7 = c3;
                    cVar.mo6886p(b.getLong(c6));
                    cVar.mo6887q(b.getLong(c7));
                    cVar.mo6880j(C6302v.m27680b(b.getBlob(c8)));
                    C6283p pVar = new C6283p(string, string2);
                    pVar.f25942b = C6302v.m27685g(b.getInt(c10));
                    pVar.f25944d = b.getString(c12);
                    pVar.f25945e = C1427e.m7578g(b.getBlob(c13));
                    int i8 = i2;
                    pVar.f25946f = C1427e.m7578g(b.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = c15;
                    pVar.f25947g = b.getLong(i10);
                    int i11 = c12;
                    int i12 = c16;
                    pVar.f25948h = b.getLong(i12);
                    int i13 = i10;
                    int i14 = c4;
                    int i15 = c17;
                    pVar.f25949i = b.getLong(i15);
                    int i16 = c18;
                    pVar.f25951k = b.getInt(i16);
                    int i17 = c19;
                    int i18 = i12;
                    pVar.f25952l = C6302v.m27682d(b.getInt(i17));
                    c17 = i15;
                    int i19 = i14;
                    int i20 = c20;
                    pVar.f25953m = b.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = c21;
                    pVar.f25954n = b.getLong(i23);
                    int i24 = i20;
                    c21 = i23;
                    int i25 = c22;
                    pVar.f25955o = b.getLong(i25);
                    int i26 = i21;
                    int i27 = c23;
                    pVar.f25956p = b.getLong(i27);
                    int i28 = c24;
                    pVar.f25957q = b.getInt(i28) != 0;
                    int i29 = c25;
                    int i30 = i27;
                    pVar.f25958r = C6302v.m27684f(b.getInt(i29));
                    pVar.f25950j = cVar;
                    arrayList.add(pVar);
                    c25 = i29;
                    c2 = i9;
                    c12 = i11;
                    c15 = i13;
                    c16 = i18;
                    c18 = i26;
                    c23 = i30;
                    c9 = i3;
                    c11 = i4;
                    c = i5;
                    c24 = i28;
                    c22 = i25;
                    c3 = i7;
                    int i31 = i22;
                    c20 = i24;
                    c4 = i19;
                    c19 = i31;
                }
                b.close();
                lVar.mo5951h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                lVar.mo5951h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = e;
            b.close();
            lVar.mo5951h();
            throw th;
        }
    }

    /* renamed from: g */
    public List<C6283p> mo23990g() {
        C1208l lVar;
        C1208l e = C1208l.m6621e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "required_network_type");
            int c2 = C5371b.m24189c(b, "requires_charging");
            int c3 = C5371b.m24189c(b, "requires_device_idle");
            int c4 = C5371b.m24189c(b, "requires_battery_not_low");
            int c5 = C5371b.m24189c(b, "requires_storage_not_low");
            int c6 = C5371b.m24189c(b, "trigger_content_update_delay");
            int c7 = C5371b.m24189c(b, "trigger_max_content_delay");
            int c8 = C5371b.m24189c(b, "content_uri_triggers");
            int c9 = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c10 = C5371b.m24189c(b, "state");
            int c11 = C5371b.m24189c(b, "worker_class_name");
            int c12 = C5371b.m24189c(b, "input_merger_class_name");
            int c13 = C5371b.m24189c(b, "input");
            int c14 = C5371b.m24189c(b, "output");
            lVar = e;
            try {
                int c15 = C5371b.m24189c(b, "initial_delay");
                int c16 = C5371b.m24189c(b, "interval_duration");
                int c17 = C5371b.m24189c(b, "flex_duration");
                int c18 = C5371b.m24189c(b, "run_attempt_count");
                int c19 = C5371b.m24189c(b, "backoff_policy");
                int c20 = C5371b.m24189c(b, "backoff_delay_duration");
                int c21 = C5371b.m24189c(b, "period_start_time");
                int c22 = C5371b.m24189c(b, "minimum_retention_duration");
                int c23 = C5371b.m24189c(b, "schedule_requested_at");
                int c24 = C5371b.m24189c(b, "run_in_foreground");
                int c25 = C5371b.m24189c(b, "out_of_quota_policy");
                int i = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    int i2 = c9;
                    String string2 = b.getString(c11);
                    int i3 = c11;
                    C1423c cVar = new C1423c();
                    int i4 = c;
                    cVar.mo6881k(C6302v.m27683e(b.getInt(c)));
                    cVar.mo6883m(b.getInt(c2) != 0);
                    cVar.mo6884n(b.getInt(c3) != 0);
                    cVar.mo6882l(b.getInt(c4) != 0);
                    cVar.mo6885o(b.getInt(c5) != 0);
                    int i5 = c2;
                    int i6 = c3;
                    cVar.mo6886p(b.getLong(c6));
                    cVar.mo6887q(b.getLong(c7));
                    cVar.mo6880j(C6302v.m27680b(b.getBlob(c8)));
                    C6283p pVar = new C6283p(string, string2);
                    pVar.f25942b = C6302v.m27685g(b.getInt(c10));
                    pVar.f25944d = b.getString(c12);
                    pVar.f25945e = C1427e.m7578g(b.getBlob(c13));
                    int i7 = i;
                    pVar.f25946f = C1427e.m7578g(b.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = c15;
                    pVar.f25947g = b.getLong(i9);
                    int i10 = c13;
                    int i11 = c16;
                    pVar.f25948h = b.getLong(i11);
                    int i12 = i9;
                    int i13 = c4;
                    int i14 = c17;
                    pVar.f25949i = b.getLong(i14);
                    int i15 = c18;
                    pVar.f25951k = b.getInt(i15);
                    int i16 = c19;
                    int i17 = i11;
                    pVar.f25952l = C6302v.m27682d(b.getInt(i16));
                    c17 = i14;
                    int i18 = i13;
                    int i19 = c20;
                    pVar.f25953m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = c21;
                    pVar.f25954n = b.getLong(i22);
                    int i23 = i19;
                    c21 = i22;
                    int i24 = c22;
                    pVar.f25955o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = c23;
                    pVar.f25956p = b.getLong(i26);
                    int i27 = c24;
                    pVar.f25957q = b.getInt(i27) != 0;
                    int i28 = c25;
                    int i29 = i26;
                    pVar.f25958r = C6302v.m27684f(b.getInt(i28));
                    pVar.f25950j = cVar;
                    arrayList.add(pVar);
                    c25 = i28;
                    c2 = i8;
                    c13 = i10;
                    c15 = i12;
                    c16 = i17;
                    c18 = i25;
                    c23 = i29;
                    c9 = i2;
                    c11 = i3;
                    c = i4;
                    c24 = i27;
                    c22 = i24;
                    c3 = i6;
                    int i30 = i21;
                    c20 = i23;
                    c4 = i18;
                    c19 = i30;
                }
                b.close();
                lVar.mo5951h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                lVar.mo5951h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = e;
            b.close();
            lVar.mo5951h();
            throw th;
        }
    }

    /* renamed from: h */
    public void mo23991h(String str, C1427e eVar) {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25970d.acquire();
        byte[] l = C1427e.m7579l(eVar);
        if (l == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5946S(1, l);
        }
        if (str == null) {
            acquire.mo5953j0(2);
        } else {
            acquire.mo5952i(2, str);
        }
        this.f25967a.beginTransaction();
        try {
            acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
        } finally {
            this.f25967a.endTransaction();
            this.f25970d.release(acquire);
        }
    }

    /* renamed from: i */
    public void mo23992i(C6283p pVar) {
        this.f25967a.assertNotSuspendingTransaction();
        this.f25967a.beginTransaction();
        try {
            this.f25968b.insert(pVar);
            this.f25967a.setTransactionSuccessful();
        } finally {
            this.f25967a.endTransaction();
        }
    }

    /* renamed from: j */
    public List<C6283p> mo23993j() {
        C1208l lVar;
        C1208l e = C1208l.m6621e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "required_network_type");
            int c2 = C5371b.m24189c(b, "requires_charging");
            int c3 = C5371b.m24189c(b, "requires_device_idle");
            int c4 = C5371b.m24189c(b, "requires_battery_not_low");
            int c5 = C5371b.m24189c(b, "requires_storage_not_low");
            int c6 = C5371b.m24189c(b, "trigger_content_update_delay");
            int c7 = C5371b.m24189c(b, "trigger_max_content_delay");
            int c8 = C5371b.m24189c(b, "content_uri_triggers");
            int c9 = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c10 = C5371b.m24189c(b, "state");
            int c11 = C5371b.m24189c(b, "worker_class_name");
            int c12 = C5371b.m24189c(b, "input_merger_class_name");
            int c13 = C5371b.m24189c(b, "input");
            int c14 = C5371b.m24189c(b, "output");
            lVar = e;
            try {
                int c15 = C5371b.m24189c(b, "initial_delay");
                int c16 = C5371b.m24189c(b, "interval_duration");
                int c17 = C5371b.m24189c(b, "flex_duration");
                int c18 = C5371b.m24189c(b, "run_attempt_count");
                int c19 = C5371b.m24189c(b, "backoff_policy");
                int c20 = C5371b.m24189c(b, "backoff_delay_duration");
                int c21 = C5371b.m24189c(b, "period_start_time");
                int c22 = C5371b.m24189c(b, "minimum_retention_duration");
                int c23 = C5371b.m24189c(b, "schedule_requested_at");
                int c24 = C5371b.m24189c(b, "run_in_foreground");
                int c25 = C5371b.m24189c(b, "out_of_quota_policy");
                int i = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    int i2 = c9;
                    String string2 = b.getString(c11);
                    int i3 = c11;
                    C1423c cVar = new C1423c();
                    int i4 = c;
                    cVar.mo6881k(C6302v.m27683e(b.getInt(c)));
                    cVar.mo6883m(b.getInt(c2) != 0);
                    cVar.mo6884n(b.getInt(c3) != 0);
                    cVar.mo6882l(b.getInt(c4) != 0);
                    cVar.mo6885o(b.getInt(c5) != 0);
                    int i5 = c2;
                    int i6 = c3;
                    cVar.mo6886p(b.getLong(c6));
                    cVar.mo6887q(b.getLong(c7));
                    cVar.mo6880j(C6302v.m27680b(b.getBlob(c8)));
                    C6283p pVar = new C6283p(string, string2);
                    pVar.f25942b = C6302v.m27685g(b.getInt(c10));
                    pVar.f25944d = b.getString(c12);
                    pVar.f25945e = C1427e.m7578g(b.getBlob(c13));
                    int i7 = i;
                    pVar.f25946f = C1427e.m7578g(b.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = c15;
                    pVar.f25947g = b.getLong(i9);
                    int i10 = c13;
                    int i11 = c16;
                    pVar.f25948h = b.getLong(i11);
                    int i12 = i9;
                    int i13 = c4;
                    int i14 = c17;
                    pVar.f25949i = b.getLong(i14);
                    int i15 = c18;
                    pVar.f25951k = b.getInt(i15);
                    int i16 = c19;
                    int i17 = i11;
                    pVar.f25952l = C6302v.m27682d(b.getInt(i16));
                    c17 = i14;
                    int i18 = i13;
                    int i19 = c20;
                    pVar.f25953m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = c21;
                    pVar.f25954n = b.getLong(i22);
                    int i23 = i19;
                    c21 = i22;
                    int i24 = c22;
                    pVar.f25955o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = c23;
                    pVar.f25956p = b.getLong(i26);
                    int i27 = c24;
                    pVar.f25957q = b.getInt(i27) != 0;
                    int i28 = c25;
                    int i29 = i26;
                    pVar.f25958r = C6302v.m27684f(b.getInt(i28));
                    pVar.f25950j = cVar;
                    arrayList.add(pVar);
                    c25 = i28;
                    c2 = i8;
                    c13 = i10;
                    c15 = i12;
                    c16 = i17;
                    c18 = i25;
                    c23 = i29;
                    c9 = i2;
                    c11 = i3;
                    c = i4;
                    c24 = i27;
                    c22 = i24;
                    c3 = i6;
                    int i30 = i21;
                    c20 = i23;
                    c4 = i18;
                    c19 = i30;
                }
                b.close();
                lVar.mo5951h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                lVar.mo5951h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = e;
            b.close();
            lVar.mo5951h();
            throw th;
        }
    }

    /* renamed from: k */
    public boolean mo23994k() {
        boolean z = false;
        C1208l e = C1208l.m6621e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: l */
    public List<String> mo23995l(String str) {
        C1208l e = C1208l.m6621e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
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

    /* renamed from: m */
    public C1501w.C1502a mo23996m(String str) {
        C1208l e = C1208l.m6621e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25967a.assertNotSuspendingTransaction();
        C1501w.C1502a aVar = null;
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                aVar = C6302v.m27685g(b.getInt(0));
            }
            return aVar;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: n */
    public C6283p mo23997n(String str) {
        C1208l lVar;
        C6283p pVar;
        String str2 = str;
        C1208l e = C1208l.m6621e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str2);
        }
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "required_network_type");
            int c2 = C5371b.m24189c(b, "requires_charging");
            int c3 = C5371b.m24189c(b, "requires_device_idle");
            int c4 = C5371b.m24189c(b, "requires_battery_not_low");
            int c5 = C5371b.m24189c(b, "requires_storage_not_low");
            int c6 = C5371b.m24189c(b, "trigger_content_update_delay");
            int c7 = C5371b.m24189c(b, "trigger_max_content_delay");
            int c8 = C5371b.m24189c(b, "content_uri_triggers");
            int c9 = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c10 = C5371b.m24189c(b, "state");
            int c11 = C5371b.m24189c(b, "worker_class_name");
            int c12 = C5371b.m24189c(b, "input_merger_class_name");
            int c13 = C5371b.m24189c(b, "input");
            int c14 = C5371b.m24189c(b, "output");
            lVar = e;
            try {
                int c15 = C5371b.m24189c(b, "initial_delay");
                int c16 = C5371b.m24189c(b, "interval_duration");
                int c17 = C5371b.m24189c(b, "flex_duration");
                int c18 = C5371b.m24189c(b, "run_attempt_count");
                int c19 = C5371b.m24189c(b, "backoff_policy");
                int c20 = C5371b.m24189c(b, "backoff_delay_duration");
                int c21 = C5371b.m24189c(b, "period_start_time");
                int c22 = C5371b.m24189c(b, "minimum_retention_duration");
                int c23 = C5371b.m24189c(b, "schedule_requested_at");
                int c24 = C5371b.m24189c(b, "run_in_foreground");
                int c25 = C5371b.m24189c(b, "out_of_quota_policy");
                if (b.moveToFirst()) {
                    String string = b.getString(c9);
                    String string2 = b.getString(c11);
                    int i = c25;
                    C1423c cVar = new C1423c();
                    cVar.mo6881k(C6302v.m27683e(b.getInt(c)));
                    cVar.mo6883m(b.getInt(c2) != 0);
                    cVar.mo6884n(b.getInt(c3) != 0);
                    cVar.mo6882l(b.getInt(c4) != 0);
                    cVar.mo6885o(b.getInt(c5) != 0);
                    cVar.mo6886p(b.getLong(c6));
                    cVar.mo6887q(b.getLong(c7));
                    cVar.mo6880j(C6302v.m27680b(b.getBlob(c8)));
                    C6283p pVar2 = new C6283p(string, string2);
                    pVar2.f25942b = C6302v.m27685g(b.getInt(c10));
                    pVar2.f25944d = b.getString(c12);
                    pVar2.f25945e = C1427e.m7578g(b.getBlob(c13));
                    pVar2.f25946f = C1427e.m7578g(b.getBlob(c14));
                    pVar2.f25947g = b.getLong(c15);
                    pVar2.f25948h = b.getLong(c16);
                    pVar2.f25949i = b.getLong(c17);
                    pVar2.f25951k = b.getInt(c18);
                    pVar2.f25952l = C6302v.m27682d(b.getInt(c19));
                    pVar2.f25953m = b.getLong(c20);
                    pVar2.f25954n = b.getLong(c21);
                    pVar2.f25955o = b.getLong(c22);
                    pVar2.f25956p = b.getLong(c23);
                    pVar2.f25957q = b.getInt(c24) != 0;
                    pVar2.f25958r = C6302v.m27684f(b.getInt(i));
                    pVar2.f25950j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b.close();
                lVar.mo5951h();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b.close();
                lVar.mo5951h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = e;
            b.close();
            lVar.mo5951h();
            throw th;
        }
    }

    /* renamed from: o */
    public int mo23998o(String str) {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25973g.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f25967a.beginTransaction();
        try {
            int I = acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
            return I;
        } finally {
            this.f25967a.endTransaction();
            this.f25973g.release(acquire);
        }
    }

    /* renamed from: p */
    public List<C6283p.C6286c> mo23999p(String str) {
        Cursor b;
        C1208l e = C1208l.m6621e("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25967a.assertNotSuspendingTransaction();
        this.f25967a.beginTransaction();
        try {
            b = C5372c.m24191b(this.f25967a, e, true, (CancellationSignal) null);
            int c = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c2 = C5371b.m24189c(b, "state");
            int c3 = C5371b.m24189c(b, "output");
            int c4 = C5371b.m24189c(b, "run_attempt_count");
            C6077a aVar = new C6077a();
            C6077a aVar2 = new C6077a();
            while (b.moveToNext()) {
                if (!b.isNull(c)) {
                    String string = b.getString(c);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                }
                if (!b.isNull(c)) {
                    String string2 = b.getString(c);
                    if (((ArrayList) aVar2.get(string2)) == null) {
                        aVar2.put(string2, new ArrayList());
                    }
                }
            }
            b.moveToPosition(-1);
            m27650x(aVar);
            m27649w(aVar2);
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                ArrayList arrayList2 = !b.isNull(c) ? (ArrayList) aVar.get(b.getString(c)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = !b.isNull(c) ? (ArrayList) aVar2.get(b.getString(c)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                C6283p.C6286c cVar = new C6283p.C6286c();
                cVar.f25961a = b.getString(c);
                cVar.f25962b = C6302v.m27685g(b.getInt(c2));
                cVar.f25963c = C1427e.m7578g(b.getBlob(c3));
                cVar.f25964d = b.getInt(c4);
                cVar.f25965e = arrayList2;
                cVar.f25966f = arrayList3;
                arrayList.add(cVar);
            }
            this.f25967a.setTransactionSuccessful();
            b.close();
            e.mo5951h();
            this.f25967a.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.f25967a.endTransaction();
            throw th;
        }
    }

    /* renamed from: q */
    public List<String> mo24000q(String str) {
        C1208l e = C1208l.m6621e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
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

    /* renamed from: r */
    public List<C1427e> mo24001r(String str) {
        C1208l e = C1208l.m6621e("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(C1427e.m7578g(b.getBlob(0)));
            }
            return arrayList;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: s */
    public int mo24002s(String str) {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25972f.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f25967a.beginTransaction();
        try {
            int I = acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
            return I;
        } finally {
            this.f25967a.endTransaction();
            this.f25972f.release(acquire);
        }
    }

    /* renamed from: t */
    public void mo24003t(String str, long j) {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25971e.acquire();
        acquire.mo5945N(1, j);
        if (str == null) {
            acquire.mo5953j0(2);
        } else {
            acquire.mo5952i(2, str);
        }
        this.f25967a.beginTransaction();
        try {
            acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
        } finally {
            this.f25967a.endTransaction();
            this.f25971e.release(acquire);
        }
    }

    /* renamed from: u */
    public List<C6283p> mo24004u(int i) {
        C1208l lVar;
        C1208l e = C1208l.m6621e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        e.mo5945N(1, (long) i);
        this.f25967a.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f25967a, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "required_network_type");
            int c2 = C5371b.m24189c(b, "requires_charging");
            int c3 = C5371b.m24189c(b, "requires_device_idle");
            int c4 = C5371b.m24189c(b, "requires_battery_not_low");
            int c5 = C5371b.m24189c(b, "requires_storage_not_low");
            int c6 = C5371b.m24189c(b, "trigger_content_update_delay");
            int c7 = C5371b.m24189c(b, "trigger_max_content_delay");
            int c8 = C5371b.m24189c(b, "content_uri_triggers");
            int c9 = C5371b.m24189c(b, TtmlNode.ATTR_ID);
            int c10 = C5371b.m24189c(b, "state");
            int c11 = C5371b.m24189c(b, "worker_class_name");
            int c12 = C5371b.m24189c(b, "input_merger_class_name");
            int c13 = C5371b.m24189c(b, "input");
            int c14 = C5371b.m24189c(b, "output");
            lVar = e;
            try {
                int c15 = C5371b.m24189c(b, "initial_delay");
                int c16 = C5371b.m24189c(b, "interval_duration");
                int c17 = C5371b.m24189c(b, "flex_duration");
                int c18 = C5371b.m24189c(b, "run_attempt_count");
                int c19 = C5371b.m24189c(b, "backoff_policy");
                int c20 = C5371b.m24189c(b, "backoff_delay_duration");
                int c21 = C5371b.m24189c(b, "period_start_time");
                int c22 = C5371b.m24189c(b, "minimum_retention_duration");
                int c23 = C5371b.m24189c(b, "schedule_requested_at");
                int c24 = C5371b.m24189c(b, "run_in_foreground");
                int c25 = C5371b.m24189c(b, "out_of_quota_policy");
                int i2 = c14;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(c9);
                    int i3 = c9;
                    String string2 = b.getString(c11);
                    int i4 = c11;
                    C1423c cVar = new C1423c();
                    int i5 = c;
                    cVar.mo6881k(C6302v.m27683e(b.getInt(c)));
                    cVar.mo6883m(b.getInt(c2) != 0);
                    cVar.mo6884n(b.getInt(c3) != 0);
                    cVar.mo6882l(b.getInt(c4) != 0);
                    cVar.mo6885o(b.getInt(c5) != 0);
                    int i6 = c2;
                    int i7 = c3;
                    cVar.mo6886p(b.getLong(c6));
                    cVar.mo6887q(b.getLong(c7));
                    cVar.mo6880j(C6302v.m27680b(b.getBlob(c8)));
                    C6283p pVar = new C6283p(string, string2);
                    pVar.f25942b = C6302v.m27685g(b.getInt(c10));
                    pVar.f25944d = b.getString(c12);
                    pVar.f25945e = C1427e.m7578g(b.getBlob(c13));
                    int i8 = i2;
                    pVar.f25946f = C1427e.m7578g(b.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = c15;
                    pVar.f25947g = b.getLong(i10);
                    int i11 = c12;
                    int i12 = c16;
                    pVar.f25948h = b.getLong(i12);
                    int i13 = i10;
                    int i14 = c4;
                    int i15 = c17;
                    pVar.f25949i = b.getLong(i15);
                    int i16 = c18;
                    pVar.f25951k = b.getInt(i16);
                    int i17 = c19;
                    int i18 = i12;
                    pVar.f25952l = C6302v.m27682d(b.getInt(i17));
                    c17 = i15;
                    int i19 = i14;
                    int i20 = c20;
                    pVar.f25953m = b.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = c21;
                    pVar.f25954n = b.getLong(i23);
                    int i24 = i20;
                    c21 = i23;
                    int i25 = c22;
                    pVar.f25955o = b.getLong(i25);
                    int i26 = i21;
                    int i27 = c23;
                    pVar.f25956p = b.getLong(i27);
                    int i28 = c24;
                    pVar.f25957q = b.getInt(i28) != 0;
                    int i29 = c25;
                    int i30 = i27;
                    pVar.f25958r = C6302v.m27684f(b.getInt(i29));
                    pVar.f25950j = cVar;
                    arrayList.add(pVar);
                    c25 = i29;
                    c2 = i9;
                    c12 = i11;
                    c15 = i13;
                    c16 = i18;
                    c18 = i26;
                    c23 = i30;
                    c9 = i3;
                    c11 = i4;
                    c = i5;
                    c24 = i28;
                    c22 = i25;
                    c3 = i7;
                    int i31 = i22;
                    c20 = i24;
                    c4 = i19;
                    c19 = i31;
                }
                b.close();
                lVar.mo5951h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                lVar.mo5951h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = e;
            b.close();
            lVar.mo5951h();
            throw th;
        }
    }

    /* renamed from: v */
    public int mo24005v() {
        this.f25967a.assertNotSuspendingTransaction();
        C5444f acquire = this.f25975i.acquire();
        this.f25967a.beginTransaction();
        try {
            int I = acquire.mo21908I();
            this.f25967a.setTransactionSuccessful();
            return I;
        } finally {
            this.f25967a.endTransaction();
            this.f25975i.release(acquire);
        }
    }
}
