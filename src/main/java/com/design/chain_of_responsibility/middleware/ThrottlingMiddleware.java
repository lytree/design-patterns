package com.design.chain_of_responsibility.middleware;

/**
 * 检查请求数量限制 ConcreteHandler。 检查是否有太多失败的登录请求。
 */
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 请不要将checkNext（）调用都插入开头
     * 此方法，最后。
     * <p>
     * 与所有中间件上的简单循环相比，这提供了更大的灵活性
     * 对象。 例如，链中的一个元素可以改变
     * 通过在所有其他检查之后运行其检查来进行检查。
     */
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
