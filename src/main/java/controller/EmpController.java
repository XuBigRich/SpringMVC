package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.IEmp;

/*
 * ǰ������뿴����˴����������Ϣ  �ο� DeptController ��alldept����
 * */

public class EmpController extends AbstractController {
    private IEmp dao;
    String cmd;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req,
                                                 HttpServletResponse res) throws Exception {
        ModelAndView mav = null;
        cmd = req.getParameter("cmd");
        if (cmd.equals("111")) mav = allEmp(req, res);
        else if (cmd.equals("222")) delEmp(req, res);
        return mav;
    }

    protected ModelAndView allEmp(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println(cmd);
        System.out.println("������");
        return new ModelAndView("allemps");
    }

    protected void delEmp(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("delEmp����");
        res.sendRedirect("emp.sw?cmd=111");
    }

    public IEmp getDao() {
        return dao;
    }

    public void setDao(IEmp dao) {
        this.dao = dao;
    }


}
