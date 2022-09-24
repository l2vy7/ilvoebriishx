package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.text.cea.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6910a implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6910a f27603b = new C6910a();

    private /* synthetic */ C6910a() {
    }

    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).priority, ((Cea708Decoder.Cea708CueInfo) obj).priority);
    }
}
