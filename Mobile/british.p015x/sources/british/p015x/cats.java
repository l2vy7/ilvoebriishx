package british.p015x;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

/* renamed from: british.x.cats */
public class cats extends ExpandableListActivity {

    /* renamed from: b */
    ExpandableListAdapter f6891b;

    /* renamed from: c */
    C1692config f6892c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String[] f6893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String[][] f6894e;

    /* renamed from: f */
    private int[][] f6895f;

    /* renamed from: british.x.cats$a */
    public class C1608a extends BaseExpandableListAdapter {
        public C1608a() {
        }

        /* renamed from: a */
        public TextView mo7314a() {
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, 64);
            TextView textView = new TextView(cats.this);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(8388627);
            if (Build.VERSION.SDK_INT >= 17 && cats.this.getResources().getBoolean(R.bool.es_rtl)) {
                textView.setTextDirection(4);
            }
            textView.setPadding(80, 0, 80, 0);
            return textView;
        }

        public Object getChild(int i, int i2) {
            return cats.this.f6894e[i][i2];
        }

        public long getChildId(int i, int i2) {
            return (long) i2;
        }

        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            TextView a = mo7314a();
            a.setText(getChild(i, i2).toString());
            return a;
        }

        public int getChildrenCount(int i) {
            return cats.this.f6894e[i].length;
        }

        public Object getGroup(int i) {
            return cats.this.f6893d[i];
        }

        public int getGroupCount() {
            return cats.this.f6893d.length;
        }

        public long getGroupId(int i) {
            return (long) i;
        }

        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            TextView a = mo7314a();
            a.setText(getGroup(i).toString());
            return a;
        }

        public boolean hasStableIds() {
            return true;
        }

        public boolean isChildSelectable(int i, int i2) {
            return true;
        }
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        Intent intent = new Intent();
        intent.putExtra("idcat", this.f6895f[i][i2]);
        if (i2 == 0) {
            intent.putExtra("cat", this.f6893d[i]);
        } else {
            intent.putExtra("cat", this.f6894e[i][i2]);
        }
        setResult(-1, intent);
        finish();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1692config config = (C1692config) getApplicationContext();
        this.f6892c = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        C1692config.m8190i(this, this.f6892c.f7313c1);
        SQLiteDatabase readableDatabase = new C2037q(getApplicationContext()).getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT _id,idcat,descr FROM cats WHERE idcat=0 ORDER BY descr", (String[]) null);
        this.f6893d = new String[rawQuery.getCount()];
        this.f6894e = new String[rawQuery.getCount()][];
        this.f6895f = new int[rawQuery.getCount()][];
        if (rawQuery.moveToFirst()) {
            while (!rawQuery.isAfterLast()) {
                this.f6893d[rawQuery.getPosition()] = rawQuery.getString(rawQuery.getColumnIndex("descr"));
                int i = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                Cursor rawQuery2 = readableDatabase.rawQuery("SELECT _id,idcat,descr FROM cats WHERE idcat=" + i + " ORDER BY descr", (String[]) null);
                String[] strArr = new String[(rawQuery2.getCount() + 1)];
                strArr[0] = getResources().getString(R.string.todo);
                int[] iArr = new int[(rawQuery2.getCount() + 1)];
                iArr[0] = i;
                if (rawQuery2.moveToFirst()) {
                    while (!rawQuery2.isAfterLast()) {
                        strArr[rawQuery2.getPosition() + 1] = rawQuery2.getString(rawQuery2.getColumnIndex("descr"));
                        iArr[rawQuery2.getPosition() + 1] = rawQuery2.getInt(rawQuery2.getColumnIndex("_id"));
                        rawQuery2.moveToNext();
                    }
                }
                rawQuery2.close();
                this.f6894e[rawQuery.getPosition()] = strArr;
                this.f6895f[rawQuery.getPosition()] = iArr;
                rawQuery.moveToNext();
            }
        }
        rawQuery.close();
        readableDatabase.close();
        if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
            getExpandableListView().setTextDirection(4);
        }
        C1608a aVar = new C1608a();
        this.f6891b = aVar;
        setListAdapter(aVar);
    }
}
