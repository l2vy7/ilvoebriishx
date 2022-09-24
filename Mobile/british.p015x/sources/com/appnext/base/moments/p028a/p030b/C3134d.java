package com.appnext.base.moments.p028a.p030b;

import android.content.ContentValues;
import android.database.Cursor;
import com.appnext.base.moments.p028a.p029a.C3129b;
import com.appnext.base.moments.p031b.C3139d;
import com.appnext.base.p023a.p025b.C3122a;
import com.appnext.base.p023a.p026c.C3123a;
import java.util.ArrayList;

/* renamed from: com.appnext.base.moments.a.b.d */
public class C3134d extends C3123a<C3129b> {

    /* renamed from: co */
    private String[] f12225co = {"pk", "t", "cd", "cdd", "cdt"};

    /* renamed from: cp */
    private String f12226cp;

    public C3134d(String str) {
        this.f12226cp = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final String[] mo10540O() {
        return this.f12225co;
    }

    /* renamed from: a */
    public final long mo10577a(C3129b bVar) {
        mo10578l(bVar.getType());
        String str = this.f12226cp;
        ContentValues contentValues = new ContentValues();
        contentValues.put("pk", bVar.mo10558U());
        contentValues.put("t", bVar.getType());
        contentValues.put("cd", bVar.mo10559V());
        contentValues.put("cdt", bVar.mo10561X());
        return C3123a.m10560a(str, contentValues);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C3122a mo10544b(Cursor cursor) {
        return new C3129b(cursor.getString(cursor.getColumnIndex("pk")), cursor.getString(cursor.getColumnIndex("t")), cursor.getString(cursor.getColumnIndex("cd")), C3139d.m10616a(cursor.getLong(cursor.getColumnIndex("cdd")) * 1000), cursor.getString(cursor.getColumnIndex("cdt")));
    }

    /* renamed from: l */
    public final void mo10578l(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3123a.C3124a.Equals);
        super.mo10541a(this.f12226cp, new String[]{"t"}, new String[]{str}, arrayList);
    }

    /* renamed from: a */
    protected static String m10606a(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table ");
        sb.append(str);
        sb.append(" ( pk text not null, t text not null " + "" + ", cd" + " text not null, cdd" + " text default (strftime('%s','now')), cdt" + " text)");
        return sb.toString();
    }
}
