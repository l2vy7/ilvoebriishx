package com.startapp;

import com.startapp.networkTest.enums.MemoryStates;

/* renamed from: com.startapp.b6 */
/* compiled from: Sta */
public class C11801b6 implements Cloneable {
    public long MemoryFree;
    public MemoryStates MemoryState = MemoryStates.Unknown;
    public long MemoryTotal;
    public long MemoryUsed;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
