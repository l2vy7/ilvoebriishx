package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12489f;
import com.unity3d.services.core.log.DeviceLog;
import p327s7.C12878a;
import p333v7.C12911a;
import p339y7.C12972a;

public class ScarAdapterFactory {
    public static final int CODE_19_2 = 201604000;
    public static final int CODE_19_5 = 203404000;
    public static final int CODE_19_8 = 204890000;
    public static final int CODE_20_0 = 210402000;

    public C12489f createScarAdapter(long j, C12487d dVar) {
        if (j >= 210402000) {
            return new C12972a(dVar);
        }
        if (j >= 203404000 && j <= 204890000) {
            return new C12911a(dVar);
        }
        if (j >= 201604000) {
            return new C12878a(dVar);
        }
        String format = String.format("SCAR version %s is not supported.", new Object[]{Long.valueOf(j)});
        dVar.handleError(C12485b.m53823b(format));
        DeviceLog.debug(format);
        return null;
    }
}
