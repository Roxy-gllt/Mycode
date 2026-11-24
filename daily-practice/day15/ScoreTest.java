package day15;

public class ScoreTest {
    public static void checkScore(int score) {
        if (score < 0 || score > 100) {
            // 手动抛出自定义异常
            throw new ScoreException("分数非法：" + score + "，分数必须在0~100之间");
        }
        System.out.println("分数合法：" + score);
    }

    public static void main(String[] args) {
        try {
            checkScore(105);
        } catch (ScoreException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }
    }
}
