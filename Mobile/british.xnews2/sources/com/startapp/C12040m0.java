package com.startapp;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.startapp.m0 */
/* compiled from: Sta */
public class C12040m0 {

    /* renamed from: a */
    public Context f53256a;

    /* renamed from: b */
    public String f53257b;

    public C12040m0(Context context, AttributeSet attributeSet) {
        this.f53256a = context;
        this.f53257b = mo45528a(attributeSet, "adTag");
    }

    /* renamed from: a */
    public final String mo45528a(AttributeSet attributeSet, String str) {
        String str2;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue((String) null, str, -1);
            if (attributeResourceValue != -1) {
                str2 = this.f53256a.getResources().getString(attributeResourceValue);
            } else {
                str2 = attributeSet.getAttributeValue((String) null, str);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }
}
