package cn.kpy.DesignPattern.InterceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.InterceptingFilterPattern
 * @data: 2019/3/12 8:10
 * @discription: 过滤器链（Filter Chain） - 过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。
 **/
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addfilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        //所有的过滤器验证通过之后，才允许目前类处理当前请求，比如：用户登录时，密码验证通过，授权通过之后，才允许登录
        for(Filter filter:filters){
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
