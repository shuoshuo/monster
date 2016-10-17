package com.krzn.monster.common;

import com.krzn.monster.common.util.ReadPropertiesUtil;

public class Constants {

    /**
     * 系统标识
     */
    public static final String SYSTEM_FLAG = "TRADE_CONFIGURE_";
    //redis过期时间
    public static final String REDISEXPIRESTIME = "redisExpiresTime";
    //redis默认过期时间
    public static long redisExpiresTime = 60;

    static {
        try {
            redisExpiresTime = Long.valueOf(ReadPropertiesUtil.getString(Constants.REDISEXPIRESTIME));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
