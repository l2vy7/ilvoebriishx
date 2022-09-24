package com.appnext.base.moments.p027a.p029b;

import android.database.Cursor;
import com.appnext.base.moments.p027a.p028a.C3128a;
import com.appnext.base.p022a.p024b.C3122a;
import com.appnext.base.p022a.p025c.C3123a;
import org.json.JSONArray;

/* renamed from: com.appnext.base.moments.a.b.a */
public final class C3131a extends C3123a<C3128a> {

    /* renamed from: co */
    private String[] f12223co = {TtmlNode.TAG_P, "c"};

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final String[] mo10540O() {
        return this.f12223co;
    }

    /* renamed from: a */
    public final long mo10571a(JSONArray jSONArray) {
        return super.mo10542a("ct", jSONArray);
    }

    /* renamed from: ag */
    public final void mo10572ag() {
        super.mo10545i("ct");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C3122a mo10544b(Cursor cursor) {
        return new C3128a(cursor.getString(cursor.getColumnIndex(TtmlNode.TAG_P)), Integer.valueOf(cursor.getInt(cursor.getColumnIndex("c"))));
    }
}
