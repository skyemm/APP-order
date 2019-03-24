package com.web.food;

 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;



@SuppressWarnings("serial")
public class FoodMgrServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	    String flag = req.getParameter("f");
	    
		FoodMgrDao foodMgrDao = new FoodMgrDao();

	 	String type = req.getParameter("type");
	 	
	 	if ( req.getParameter("method") != null){
	 		
	 		if( req.getParameter("method").equals("del") ) {
	 	        String id = req.getParameter("id") ;
	 	        foodMgrDao.delete(id);
	 		}
	 		else  if( req.getParameter("method").equals("search") ) {

	 			JSONArray jsonArray = JSONArray.fromObject( foodMgrDao.search( req.getParameter("search_name") )  );
 
	 			resp.setCharacterEncoding("gb2312");

	 			System.out.println( "jsonArray.toString()====" + jsonArray.toString() );
		      	resp.getWriter().write(jsonArray.toString());
		      	return ;
	 		}
	 		
	 	}
	 		
	 		
	    if (type != null) {
	      JSONArray jsonArray = null;
	      if (flag != null)
	        jsonArray = JSONArray.fromObject( foodMgrDao.getFoodsByFlag(flag));
	      else {
	        jsonArray = JSONArray.fromObject( foodMgrDao.getAll() );
	      }
	      
//	      resp.setContentType("application/x-json");
	      resp.setCharacterEncoding("gb2312");

	      resp.getWriter().write(jsonArray.toString());
	    }  else {
	    
	    	if( req.getParameter("all") != null && !"null".equals( req.getParameter("all") ) ){
	    		req.setAttribute("all",  "1" ); 
	  			req.setAttribute("list",  foodMgrDao.getAll() ); 
	    	}else{
	  	      if ((flag != null) && (!flag.equals(""))) {
		    	  	req.setAttribute("list", foodMgrDao.getFoodsByFlag(flag));
		    	  	req.setAttribute("flag", flag);
		      } else { 
		  			req.setAttribute("all",  "1" ); 
		  			 
		  			String userType = (String)req.getSession().getAttribute("type");
		  			
		  			if(  userType != null && userType.equals("5") ) {
//		  				商家
			  			req.setAttribute("list",  foodMgrDao.getAll( req.getSession().getAttribute("screen_name") )  ); 
		  			}else{
			  			req.setAttribute("list",  foodMgrDao.getAll() ); 
		  			}
		      }
	    	}
			req.getRequestDispatcher("/foodsList.jsp").forward(req, resp);
	    }
		    
	}
 
  
	
}
