package com.accp.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116665791";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCEqc8vqqgd1+gZlgV6R5J9A1jghZ0axyARzjwjIBoGyrGnLKix1MsL0nCcyof6SHLbrTvlgK1F31P/m0KDXISSUWbKCxZ6/g5uV4SmzJCir3V7wQc/SiyW8p3Aw+YgSX1UAwt/8Zx4t8rqZ+S9BXjU7PMj6kPJZDiP2Oj4Vb6ylfIvYtN0inq3MeqEkcsU/eQtXY9r5m6wUdTIW2HxEsZ/3DsMnF0MfU7oc+DYUJ8JCfblLD+nAalbWtxhW0d+2qx046f7Xj0RXprLI7NLFSAcI4poyO00WitHhs3txV9PNZmAJ5upP9+zk21oQNILnPWHXb0oeFdgoll0sLEcPAetAgMBAAECggEAFXmrqWq11kbqMqIfduD5LLWLAKWAfiI35cn94C3FKM5NHePT1x28VMiXJDqA8pohxb/wT0GaSxJQ9bK7fKpQZ6M3wYMz+2r/CQuv1JSO4VcH7KWdt7gZKcJSmS7dJOLgn+XySZ7iFoSiG3oABD1LhyRoY6r7mDFaGqchZ3nx6dSyE1BX0RhW6mqPz/Nva+JA5Cu5LVsDZrCWkInF7Vf4+GxNnNFB5kBZHqcTe+J+meuDtVGOkanMXpCUdS5Gb2jQqomXUBCuBWzcuuiwp/nf89iIosR2IKFYwCBnHwSjUCudwwDotZkKlQX06gQ0NPcmFIO3taChCYf/DFvWS87pYQKBgQDO/qvfNF2kF3IJKJAzVi2lPRV71CNVwSJ+GQSEh0S0abLQYFb5zd6EGpv73laRNXnSMN77ZhseZyY4u2/r9FT27J1SjBjegZr/KOqJCEo9NwlrmERv+cpsiQ2uDKT+G5kb+8q04Uu/n5Jl6NhQ1lfEu9MPGUjeI6Au4O2UYAC/eQKBgQCkEiGbiVvqqH9TaWSExWiu8SKqeokX+exYqRsCmHOZFkBvsGyz+QvUKqshD++eMF2yEIWjWKkCZBNc4Rf763LDzx2UvLSuW8QJ3fv7Ed4GAvCOXMLqzY2EEkxz/O46hm3AUb7B5cLAA2Om53S1l1ocUQMcD83+oKqbZxNILbx41QKBgQCwelqIs3m+xCp6enXu/uNtxNWDPItfuokw3x2F7Fn8Qz2sAOdGlWnIUXN52scNiH0zYm1KA3TNh/4DUnMKxcaGu5cp4L33PqKqNvU3HbVF2Z2TeT+oBFy8CmF6addlupvgSt05N/hACMllT47V5Njxp307m0AP/Gm+bhDAdtVMaQKBgG2MJaBiMFsXshwRbKox3Nmh65GES3EU0DfKgVxUSirW7qMkWxA3oyxAaQ6kQ0uN46F24qPUGNSd2UfUi10LMg+HhKrA7KrWXqhv7UUQAvxkjhWf3g1Evc6HIUD4il/NTg5xBjsUm9n06V6RgB2XNvVdKgRckSAISqGESx2QXB0ZAoGAJ5VbRqog4KsBBg2buGLPxsgLVwTr3GEHHaAwz76ESVFK3af4XLfuWDPg9NtY6O/hHdk3yI+Y/UoumD9neb5JfHyF2JgoSuEd2/43VP2iWy4wiifze20DzqWXrO0qjTBYzjjg1YUqRzTR9kXe1J1v2WSGy/jgAj0P0TSyJPshILI=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj0Ns2LaxmclzNLN4zDyZvO/h8NR0dOMupUX7Yp4J2bSLavPpnUMQ467046SZO3oLOvTMOj0P/lZ2I4r2CbW6HLGzeftIeaht3/hVSpvjF+9ymwTXTWj+QZWzcG+nvM+PFdrbsmgn5UgZVvU7MJYivhQI6kHZUaqu34BSUU8lx8f5RJPYDpwNZNbD9rtyqjp14m5vk/eTyVTLVU7Zrvz8xJsIhCDB/VcQIdT/6e1dPEHPmkbM7WdhgJjBxzbptdbfUNC9dX4DEAb5Axaqb6ru+3/m0gcd6KgMaYb7xbFfav7n8CZsESLMalgR7KYbLNrlgpgNoFQQtTwEM4DLKAIbswIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8020/dzw_ui/view/CT/successfully.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8020/dzw_ui/view/CT/successfully.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "https://openapi.alipaydev.com/gateway.do";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

