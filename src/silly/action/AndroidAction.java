package silly.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.ServletResponseAware;
import silly.entity.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AndroidAction extends ActionSupport implements ModelDriven<User>, ServletResponseAware {
    //准备user 成员变量
    private User user = new User();
    private HttpServletResponse response;

    public String login() throws IOException {

        response.getWriter().println("{\"session_key\": \"" + user.getName() + "\",\"bank_typename\": \"" + user.getAge() + "\",\"fp_3d\": \"8.3\" }");
        return NONE;
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        response = httpServletResponse;
        response.setContentType("text/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
    }
}
