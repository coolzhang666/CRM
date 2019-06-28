package cn.edu.cqut.crm.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class TokenUtil {

    // token 过期时间
    private static final long EXPIRE_TIME = 15 * 60 * 1000;

    // token 私钥
    private static final String TOKEN_SECRET = "106d6191-92a2-4f8e-a6cb-82479bbb3386";

    /**
     * 验证token是否有效
     * @param token token 字符串
     * @param userNo 用户编号
     * @return 验证成功返回true，反之返回false
     */
    public static boolean verify(String token, String userNo) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("userNo", userNo)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 从token中获取用户编号
     * @param token token字符串
     * @return 返回用户编号
     */
    public static String getUserNo(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userNo").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 签发token
     * @param userNo 用户编号
     * @return 返回token字符串
     */
    public static String sign(String userNo) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            String token = JWT.create()
                    .withClaim("userNo", userNo)
                    .withExpiresAt(date)
                    .sign(algorithm);
            return token;
        } catch (Exception e) {
            return null;
        }
    }
}
