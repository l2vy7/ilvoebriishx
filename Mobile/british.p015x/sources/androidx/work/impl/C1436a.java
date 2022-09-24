package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import p081g1.C5267a;
import p091i1.C5436b;
import p173x1.C6357c;
import p173x1.C6359e;

/* renamed from: androidx.work.impl.a */
/* compiled from: WorkDatabaseMigrations */
public class C1436a {

    /* renamed from: a */
    public static C5267a f6355a = new C1437a(1, 2);

    /* renamed from: b */
    public static C5267a f6356b = new C1438b(3, 4);

    /* renamed from: c */
    public static C5267a f6357c = new C1439c(4, 5);

    /* renamed from: d */
    public static C5267a f6358d = new C1440d(6, 7);

    /* renamed from: e */
    public static C5267a f6359e = new C1441e(7, 8);

    /* renamed from: f */
    public static C5267a f6360f = new C1442f(8, 9);

    /* renamed from: g */
    public static C5267a f6361g = new C1443g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    /* compiled from: WorkDatabaseMigrations */
    class C1437a extends C5267a {
        C1437a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo21890G("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo21890G("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo21890G("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    /* compiled from: WorkDatabaseMigrations */
    class C1438b extends C5267a {
        C1438b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.mo21890G("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    /* compiled from: WorkDatabaseMigrations */
    class C1439c extends C5267a {
        C1439c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.mo21890G("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    /* compiled from: WorkDatabaseMigrations */
    class C1440d extends C5267a {
        C1440d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    /* compiled from: WorkDatabaseMigrations */
    class C1441e extends C5267a {
        C1441e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    /* compiled from: WorkDatabaseMigrations */
    class C1442f extends C5267a {
        C1442f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    /* compiled from: WorkDatabaseMigrations */
    class C1443g extends C5267a {
        C1443g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1444h extends C5267a {

        /* renamed from: c */
        final Context f6362c;

        public C1444h(Context context, int i, int i2) {
            super(i, i2);
            this.f6362c = context;
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            if (this.f23287b >= 10) {
                bVar.mo21894P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f6362c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1445i extends C5267a {

        /* renamed from: c */
        final Context f6363c;

        public C1445i(Context context) {
            super(9, 10);
            this.f6363c = context;
        }

        /* renamed from: a */
        public void mo6926a(C5436b bVar) {
            bVar.mo21890G("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C6359e.m27999b(this.f6363c, bVar);
            C6357c.m27993a(this.f6363c, bVar);
        }
    }
}
