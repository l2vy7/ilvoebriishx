package androidx.work.impl;

import android.os.Build;
import androidx.room.C1176a;
import androidx.room.C1185f;
import androidx.room.C1199i;
import androidx.room.C1205k;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p085h1.C5372c;
import p085h1.C5376g;
import p090i1.C5436b;
import p090i1.C5437c;
import p167w1.C6261b;
import p167w1.C6262c;
import p167w1.C6265e;
import p167w1.C6266f;
import p167w1.C6269h;
import p167w1.C6270i;
import p167w1.C6274k;
import p167w1.C6275l;
import p167w1.C6278n;
import p167w1.C6279o;
import p167w1.C6287q;
import p167w1.C6288r;
import p167w1.C6299t;
import p167w1.C6300u;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b */
    private volatile C6287q f6347b;

    /* renamed from: c */
    private volatile C6261b f6348c;

    /* renamed from: d */
    private volatile C6299t f6349d;

    /* renamed from: e */
    private volatile C6269h f6350e;

    /* renamed from: f */
    private volatile C6274k f6351f;

    /* renamed from: g */
    private volatile C6278n f6352g;

    /* renamed from: h */
    private volatile C6265e f6353h;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C1435a extends C1205k.C1206a {
        C1435a(int i) {
            super(i);
        }

        public void createAllTables(C5436b bVar) {
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.mo21890G("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        public void dropAllTables(C5436b bVar) {
            bVar.mo21890G("DROP TABLE IF EXISTS `Dependency`");
            bVar.mo21890G("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.mo21890G("DROP TABLE IF EXISTS `WorkTag`");
            bVar.mo21890G("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.mo21890G("DROP TABLE IF EXISTS `WorkName`");
            bVar.mo21890G("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.mo21890G("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((C1199i.C1201b) WorkDatabase_Impl.this.mCallbacks.get(i)).mo5926b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onCreate(C5436b bVar) {
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((C1199i.C1201b) WorkDatabase_Impl.this.mCallbacks.get(i)).mo5925a(bVar);
                }
            }
        }

        public void onOpen(C5436b bVar) {
            C5436b unused = WorkDatabase_Impl.this.mDatabase = bVar;
            bVar.mo21890G("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(bVar);
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((C1199i.C1201b) WorkDatabase_Impl.this.mCallbacks.get(i)).mo5927c(bVar);
                }
            }
        }

        public void onPostMigrate(C5436b bVar) {
        }

        public void onPreMigrate(C5436b bVar) {
            C5372c.m24190a(bVar);
        }

        /* access modifiers changed from: protected */
        public C1205k.C1207b onValidateSchema(C5436b bVar) {
            C5436b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C5376g.C5377a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C5376g.C5377a("prerequisite_id", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C5376g.C5378b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{TtmlNode.ATTR_ID})));
            hashSet.add(new C5376g.C5378b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{TtmlNode.ATTR_ID})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C5376g.C5380d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new C5376g.C5380d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            C5376g gVar = new C5376g("Dependency", hashMap, hashSet, hashSet2);
            C5376g a = C5376g.m24198a(bVar2, "Dependency");
            if (!gVar.equals(a)) {
                return new C1205k.C1207b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(TtmlNode.ATTR_ID, new C5376g.C5377a(TtmlNode.ATTR_ID, AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap2.put("state", new C5376g.C5377a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C5376g.C5377a("worker_class_name", AdPreferences.TYPE_TEXT, true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C5376g.C5377a("input_merger_class_name", AdPreferences.TYPE_TEXT, false, 0, (String) null, 1));
            hashMap2.put("input", new C5376g.C5377a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C5376g.C5377a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C5376g.C5377a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C5376g.C5377a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C5376g.C5377a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C5376g.C5377a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C5376g.C5377a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C5376g.C5377a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new C5376g.C5377a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C5376g.C5377a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C5376g.C5377a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C5376g.C5377a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C5376g.C5377a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new C5376g.C5377a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C5376g.C5377a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C5376g.C5377a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C5376g.C5377a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C5376g.C5377a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C5376g.C5377a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C5376g.C5377a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C5376g.C5377a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C5376g.C5380d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new C5376g.C5380d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            C5376g gVar2 = new C5376g("WorkSpec", hashMap2, hashSet3, hashSet4);
            C5376g a2 = C5376g.m24198a(bVar2, "WorkSpec");
            if (!gVar2.equals(a2)) {
                return new C1205k.C1207b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C5376g.C5377a("tag", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C5376g.C5377a("work_spec_id", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C5376g.C5378b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{TtmlNode.ATTR_ID})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C5376g.C5380d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C5376g gVar3 = new C5376g("WorkTag", hashMap3, hashSet5, hashSet6);
            C5376g a3 = C5376g.m24198a(bVar2, "WorkTag");
            if (!gVar3.equals(a3)) {
                return new C1205k.C1207b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C5376g.C5377a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap4.put("system_id", new C5376g.C5377a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C5376g.C5378b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{TtmlNode.ATTR_ID})));
            C5376g gVar4 = new C5376g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C5376g a4 = C5376g.m24198a(bVar2, "SystemIdInfo");
            if (!gVar4.equals(a4)) {
                return new C1205k.C1207b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(MediationMetaData.KEY_NAME, new C5376g.C5377a(MediationMetaData.KEY_NAME, AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C5376g.C5377a("work_spec_id", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C5376g.C5378b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{TtmlNode.ATTR_ID})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C5376g.C5380d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C5376g gVar5 = new C5376g("WorkName", hashMap5, hashSet8, hashSet9);
            C5376g a5 = C5376g.m24198a(bVar2, "WorkName");
            if (!gVar5.equals(a5)) {
                return new C1205k.C1207b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C5376g.C5377a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap6.put("progress", new C5376g.C5377a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C5376g.C5378b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{TtmlNode.ATTR_ID})));
            C5376g gVar6 = new C5376g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C5376g a6 = C5376g.m24198a(bVar2, "WorkProgress");
            if (!gVar6.equals(a6)) {
                return new C1205k.C1207b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C5376g.C5377a("key", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap7.put("long_value", new C5376g.C5377a("long_value", "INTEGER", false, 0, (String) null, 1));
            C5376g gVar7 = new C5376g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C5376g a7 = C5376g.m24198a(bVar2, "Preference");
            if (gVar7.equals(a7)) {
                return new C1205k.C1207b(true, (String) null);
            }
            return new C1205k.C1207b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: b */
    public C6261b mo6919b() {
        C6261b bVar;
        if (this.f6348c != null) {
            return this.f6348c;
        }
        synchronized (this) {
            if (this.f6348c == null) {
                this.f6348c = new C6262c(this);
            }
            bVar = this.f6348c;
        }
        return bVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        C5436b writableDatabase = super.getOpenHelper().getWritableDatabase();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                writableDatabase.mo21890G("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                super.endTransaction();
                if (!z) {
                    writableDatabase.mo21890G("PRAGMA foreign_keys = TRUE");
                }
                writableDatabase.mo21895V("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.mo21898n0()) {
                    writableDatabase.mo21890G("VACUUM");
                }
                throw th;
            }
        }
        super.beginTransaction();
        if (z) {
            writableDatabase.mo21890G("PRAGMA defer_foreign_keys = TRUE");
        }
        writableDatabase.mo21890G("DELETE FROM `Dependency`");
        writableDatabase.mo21890G("DELETE FROM `WorkSpec`");
        writableDatabase.mo21890G("DELETE FROM `WorkTag`");
        writableDatabase.mo21890G("DELETE FROM `SystemIdInfo`");
        writableDatabase.mo21890G("DELETE FROM `WorkName`");
        writableDatabase.mo21890G("DELETE FROM `WorkProgress`");
        writableDatabase.mo21890G("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
        super.endTransaction();
        if (!z) {
            writableDatabase.mo21890G("PRAGMA foreign_keys = TRUE");
        }
        writableDatabase.mo21895V("PRAGMA wal_checkpoint(FULL)").close();
        if (!writableDatabase.mo21898n0()) {
            writableDatabase.mo21890G("VACUUM");
        }
    }

    /* access modifiers changed from: protected */
    public C1185f createInvalidationTracker() {
        return new C1185f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public C5437c createOpenHelper(C1176a aVar) {
        return aVar.f5418a.mo5959a(C5437c.C5439b.m24415a(aVar.f5419b).mo21905c(aVar.f5420c).mo21904b(new C1205k(aVar, new C1435a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).mo21903a());
    }

    /* renamed from: f */
    public C6265e mo6920f() {
        C6265e eVar;
        if (this.f6353h != null) {
            return this.f6353h;
        }
        synchronized (this) {
            if (this.f6353h == null) {
                this.f6353h = new C6266f(this);
            }
            eVar = this.f6353h;
        }
        return eVar;
    }

    /* renamed from: g */
    public C6269h mo6921g() {
        C6269h hVar;
        if (this.f6350e != null) {
            return this.f6350e;
        }
        synchronized (this) {
            if (this.f6350e == null) {
                this.f6350e = new C6270i(this);
            }
            hVar = this.f6350e;
        }
        return hVar;
    }

    /* renamed from: h */
    public C6274k mo6922h() {
        C6274k kVar;
        if (this.f6351f != null) {
            return this.f6351f;
        }
        synchronized (this) {
            if (this.f6351f == null) {
                this.f6351f = new C6275l(this);
            }
            kVar = this.f6351f;
        }
        return kVar;
    }

    /* renamed from: i */
    public C6278n mo6923i() {
        C6278n nVar;
        if (this.f6352g != null) {
            return this.f6352g;
        }
        synchronized (this) {
            if (this.f6352g == null) {
                this.f6352g = new C6279o(this);
            }
            nVar = this.f6352g;
        }
        return nVar;
    }

    /* renamed from: j */
    public C6287q mo6924j() {
        C6287q qVar;
        if (this.f6347b != null) {
            return this.f6347b;
        }
        synchronized (this) {
            if (this.f6347b == null) {
                this.f6347b = new C6288r(this);
            }
            qVar = this.f6347b;
        }
        return qVar;
    }

    /* renamed from: k */
    public C6299t mo6925k() {
        C6299t tVar;
        if (this.f6349d != null) {
            return this.f6349d;
        }
        synchronized (this) {
            if (this.f6349d == null) {
                this.f6349d = new C6300u(this);
            }
            tVar = this.f6349d;
        }
        return tVar;
    }
}
