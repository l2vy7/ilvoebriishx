package com.appnext.base.moments.p031b;

/* renamed from: com.appnext.base.moments.b.b */
public final class C3136b {

    /* renamed from: com.appnext.base.moments.b.b$a */
    public enum C3137a {
        String("String"),
        Long("Long"),
        Double("Double"),
        Integer("Integer"),
        HashMap("HashMap"),
        ArrayList("ArrayList"),
        Boolean("Boolean"),
        JSONArray("JSONArray"),
        JSONObject("JSONObject"),
        Set("Set");
        
        private String mDataType;

        private C3137a(String str) {
            this.mDataType = str;
        }

        public final String getType() {
            return this.mDataType;
        }
    }
}
