package cn.kpy.DesignPattern.InterceptingFilterPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.InterceptingFilterPattern
 * @data: 2019/3/12 8:17
 * @discription: 过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链
 **/
public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addfilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
