package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.List;
import p115m4.C10768l;

/* renamed from: com.google.android.gms.cast.framework.media.k0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7126k0 extends ArrayAdapter<MediaTrack> implements View.OnClickListener {

    /* renamed from: b */
    private final Context f28720b;

    /* renamed from: c */
    private int f28721c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7126k0(Context context, List<MediaTrack> list, int i) {
        super(context, C10768l.f49446c, list == null ? new ArrayList<>() : list);
        this.f28720b = context;
        this.f28721c = i;
    }

    /* renamed from: a */
    public final MediaTrack mo29571a() {
        int i = this.f28721c;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.f28721c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0033
            android.content.Context r8 = r6.f28720b
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r8 = r8.getSystemService(r1)
            android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
            java.lang.Object r8 = com.google.android.gms.common.internal.C4604n.m20098k(r8)
            android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
            int r1 = p115m4.C10768l.f49446c
            android.view.View r8 = r8.inflate(r1, r9, r0)
            com.google.android.gms.cast.framework.media.j0 r9 = new com.google.android.gms.cast.framework.media.j0
            int r1 = p115m4.C10766k.f49418M
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = p115m4.C10766k.f49413H
            android.view.View r2 = r8.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r3 = 0
            r9.<init>(r6, r1, r2, r3)
            r8.setTag(r9)
            goto L_0x003f
        L_0x0033:
            java.lang.Object r9 = r8.getTag()
            com.google.android.gms.cast.framework.media.j0 r9 = (com.google.android.gms.cast.framework.media.C7124j0) r9
            java.lang.Object r9 = com.google.android.gms.common.internal.C4604n.m20098k(r9)
            com.google.android.gms.cast.framework.media.j0 r9 = (com.google.android.gms.cast.framework.media.C7124j0) r9
        L_0x003f:
            android.widget.RadioButton r1 = r9.f28717b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.setTag(r2)
            android.widget.RadioButton r1 = r9.f28717b
            int r2 = r6.f28721c
            r3 = 1
            if (r2 != r7) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r1.setChecked(r2)
            r8.setOnClickListener(r6)
            java.lang.Object r1 = r6.getItem(r7)
            com.google.android.gms.cast.MediaTrack r1 = (com.google.android.gms.cast.MediaTrack) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.C4604n.m20098k(r1)
            com.google.android.gms.cast.MediaTrack r1 = (com.google.android.gms.cast.MediaTrack) r1
            java.lang.String r2 = r1.mo29366H0()
            java.util.Locale r4 = r1.mo29365G0()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x00a0
            int r1 = r1.mo29368J0()
            r2 = 2
            if (r1 != r2) goto L_0x0082
            android.content.Context r7 = r6.f28720b
            int r0 = p115m4.C10770m.f49472x
            java.lang.String r2 = r7.getString(r0)
            goto L_0x00a0
        L_0x0082:
            if (r4 == 0) goto L_0x008f
            java.lang.String r2 = r4.getDisplayLanguage()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x008f
            goto L_0x00a0
        L_0x008f:
            android.content.Context r1 = r6.f28720b
            int r2 = p115m4.C10770m.f49473y
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r7 = r7 + r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r0] = r7
            java.lang.String r2 = r1.getString(r2, r4)
        L_0x00a0:
            android.widget.TextView r7 = r9.f28716a
            r7.setText(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.C7126k0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final void onClick(View view) {
        this.f28721c = ((Integer) C4604n.m20098k(((C7124j0) C4604n.m20098k((C7124j0) view.getTag())).f28717b.getTag())).intValue();
        notifyDataSetChanged();
    }
}
