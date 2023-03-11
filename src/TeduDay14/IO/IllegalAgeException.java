package TeduDay14.IO;

/**
 * 自定义异常:通常用于定义那些不满足业务场景的异常
 * 自定义异常的几个要素:
 * 1.类名要见名知意
 * 2.继承自Exception(直接或间接继承都可以)
 * 3.提供所有类型的构造器
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/11  09:29
 **/
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
        super();
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    protected IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
