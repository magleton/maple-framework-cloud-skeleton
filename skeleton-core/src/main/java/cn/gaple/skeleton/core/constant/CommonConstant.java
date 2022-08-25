package cn.gaple.skeleton.core.constant;

public class CommonConstant {
    /**
     * 管理员的TOKEN加解密密钥
     */
    public static final String ADMIN_TOKEN_SECRET = "XXXX";

    /**
     * 用户的TOKEN加解密密钥
     */
    public static final String USER_TOKEN_SECRET = "XXXX";

    /**
     * token 名字
     */
    public static final String TOKEN_NAME = "token";

    /**
     * 用户登录的token保存时间
     */
    public static final int TOKEN_EXPIRE_TIME = 86400;
    
    private CommonConstant() {
    }
}
