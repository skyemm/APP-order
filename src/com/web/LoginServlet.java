package com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ShangjiaDao;
import com.model.Shangjia;
import com.web.user.User;
import com.web.user.UserDao;
 


public class LoginServlet extends HttpServlet {
 
 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name  = req.getParameter("name");
		String password  = req.getParameter("password"); 
		String type  = req.getParameter("type");

		UserDao userDao = new UserDao(); 
		User user = null ;
		
		if(type.equals("商家")){
			
			ShangjiaDao shangjiaDao = new ShangjiaDao();
			Shangjia shangjia = shangjiaDao.login( name, password);
			
//			普通
			if( shangjia != null ){
			 
				req.getSession().setAttribute("sid", shangjia.getId() ) ;
				req.getSession().setAttribute("screen_name", shangjia.getMingcheng() ) ;
				req.getSession().setAttribute("shangjia666", shangjia.getDianhua() ) ;

				req.getSession().setAttribute("type", "5" ) ;
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
				return ;
			}
		
		}else{
//			管理员
			if( userDao.login("admin", name,  password ) ){
				user = userDao.getUserByName("admin", name, password ) ;
				req.getSession().setAttribute("admin", user.getId() ) ;
				req.getSession().setAttribute("screen_name", user.getScreen_name() ) ;
				req.getSession().setAttribute("sid", user.getId() ) ;
				req.getSession().setAttribute("type", user.type ) ;
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
				return ;
			}
		}
		 
		req.setAttribute("s", "0");
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
	

 

}
