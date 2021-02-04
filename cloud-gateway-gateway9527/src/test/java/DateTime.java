import java.time.ZonedDateTime;

/**
 * 获取当前时间，带时区
 * 用于配置断言
 *
 * @author zrj
 * @date 2021/2/2
 * @since V1.0
 **/
public class DateTime {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println( zbj );

        //2021-02-02T23:15:43.456+08:00[Asia/Shanghai]
    }
}
