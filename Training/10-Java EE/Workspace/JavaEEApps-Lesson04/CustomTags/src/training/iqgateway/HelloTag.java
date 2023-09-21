package training.iqgateway;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.*;

public class HelloTag extends TagSupport {


    @Override
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().write("Welcome to the New Era of Developing Web Apps Using Custom Tags...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
