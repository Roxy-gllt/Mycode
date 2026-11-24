package day15;

// 自定义分数异常
public class ScoreException extends RuntimeException {
    // 无参
    public ScoreException() {}
    // 带消息，给前端看清晰错误信息
    public ScoreException(String message) {
        super(message);
    }
}
