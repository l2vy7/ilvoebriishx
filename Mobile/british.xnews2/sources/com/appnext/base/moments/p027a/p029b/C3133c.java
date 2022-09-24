package com.appnext.base.moments.p027a.p029b;

import android.database.Cursor;
import android.text.TextUtils;
import com.appnext.base.moments.p027a.p028a.C3130c;
import com.appnext.base.p022a.p024b.C3122a;
import com.appnext.base.p022a.p025c.C3123a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.appnext.base.moments.a.b.c */
public final class C3133c extends C3123a<C3130c> {

    /* renamed from: co */
    private String[] f12224co = {"key", IronSourceConstants.EVENTS_STATUS, "sample", "sample_type", "cycle", "cycle_type", "service_key", "data"};

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final String[] mo10540O() {
        return this.f12224co;
    }

    /* renamed from: ag */
    public final void mo10573ag() {
        super.mo10545i("config_table");
    }

    /* renamed from: ai */
    public final List<C3130c> mo10574ai() {
        return super.mo10546j("config_table");
    }

    /* renamed from: b */
    public final long mo10575b(JSONArray jSONArray) {
        return super.mo10542a("config_table", jSONArray);
    }

    /* renamed from: k */
    public final C3130c mo10576k(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3123a.C3124a.Equals);
        List a = super.mo10543a("config_table", new String[]{"key"}, new String[]{str}, (String) null, arrayList);
        if (a == null || a.size() <= 0) {
            return null;
        }
        return (C3130c) a.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C3122a mo10544b(Cursor cursor) {
        return new C3130c(cursor.getString(cursor.getColumnIndex(IronSourceConstants.EVENTS_STATUS)), cursor.getString(cursor.getColumnIndex("sample")), cursor.getString(cursor.getColumnIndex("sample_type")), cursor.getString(cursor.getColumnIndex("cycle")), cursor.getString(cursor.getColumnIndex("cycle_type")), cursor.getString(cursor.getColumnIndex("key")), cursor.getString(cursor.getColumnIndex("service_key")), cursor.getString(cursor.getColumnIndex("data")));
    }
}
