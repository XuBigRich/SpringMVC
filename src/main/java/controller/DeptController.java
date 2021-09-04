package controller;

import dao.IDept;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import vo.Dept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class DeptController extends AbstractController {
    private IDept dao;
    private List<Dept> depts;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
        ModelAndView mav = null;
        String cmd = req.getParameter("cmd");
        if (cmd.equals("111")) mav = alldept(req, res);
        return mav;
    }

    //这个是显示的重点
    public ModelAndView alldept(HttpServletRequest req, HttpServletResponse res) {
        depts = dao.findByHQL("from Dept");
        System.out.println(depts.size());
        req.setAttribute("depts", depts);
        return new ModelAndView("alldepts");
    }

    public IDept getDao() {
        return dao;
    }

    public void setDao(IDept dao) {
        this.dao = dao;
    }

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }
}
