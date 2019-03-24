package com.action;

 
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;  
import com.dao.ShangjiaDao;
import com.model.Shangjia;
import org.json.JSONObject;
import org.json.JSONException;


@SuppressWarnings("serial")
public class ShangjiaAction extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String method = req.getParameter("method");

		ShangjiaDao dao = new ShangjiaDao();
 
  
		if (method.equals("list")) {

			String type = req.getParameter("type");
		    
		    if (type != null && type.equals("json")) {
		    	
		    	JSONArray jsonArray  =  JSONArray.fromObject( dao.getAll(req.getParameter("id") , req.getParameter("f") )  );
		    	resp.setCharacterEncoding("gb2312");
		    	
		    	try {
		    		resp.getWriter().write(jsonArray.toString());
		    	} catch (IOException e) {
		    		e.printStackTrace();
		    	}
		    	return ;		    	
			}  else {
				getAll(req, dao);
				req.getRequestDispatcher("/shangjialist.jsp").forward(req, resp);
			}
		    
		} else if (   method.equals("goUpdate") ){

			String id = req.getParameter("id");

			req.setAttribute("map", dao.getObjectById(id) ); 
			req.getRequestDispatcher("/shangjia_update.jsp").forward(req, resp);	    
		    
		} else if (   method.equals("update") ){
 
			String id = req.getParameter("id");
			Shangjia object  = dao.getObjectById(id) ;
			object.yonghuming = req.getParameter("yonghuming") ; 
			object.mima = req.getParameter("mima") ; 
			object.mingcheng = req.getParameter("mingcheng") ; 
			object.dianhua = req.getParameter("dianhua") ; 
			object.dizhi = req.getParameter("dizhi") ; 
			dao.update( req.getParameter("id") , object ) ;  

			getAllForUpdate(req, dao);
			req.getRequestDispatcher("/shangjialist.jsp").forward(req, resp);
	
		} else if (method.equals("saveJson")) {
			
			String result = "" ;
			String parameter = req.getParameter("shangjia");
			try {
				JSONObject jsonObject = new JSONObject(parameter);  

			   	Shangjia object  = new Shangjia();  
				object.yonghuming = jsonObject.getString("yonghuming") ; 
				object.mima = jsonObject.getString("mima") ; 
				object.mingcheng = jsonObject.getString("mingcheng") ; 
				object.dianhua = jsonObject.getString("dianhua") ; 
				object.dizhi = jsonObject.getString("dizhi") ; 
			     
			   	int i = dao.save( object ) ;
				if ( i > 0) { 
					result = "SUCCESS";
				} else {
					result = "ERROR";
				} 
			} catch (JSONException e) {
				e.printStackTrace();
			}
			resp.getWriter().println(result);
			return ;
			
		} else if (method.equals("save")) { 
  
			   	Shangjia object  = new Shangjia(); 
			 
				object.yonghuming = req.getParameter("yonghuming") ; 
				object.mima = req.getParameter("mima") ; 
				object.mingcheng = req.getParameter("mingcheng") ; 
				object.dianhua = req.getParameter("dianhua") ; 
				object.dizhi = req.getParameter("dizhi") ; 
			   	dao.save( object ) ;
			    
			   	resp.setCharacterEncoding("utf-8");
				
		    	try {
		    		resp.getWriter().write( "1");
		    	} catch (IOException e) {
		    		e.printStackTrace();
		    	}
			
		} else if (method.equals("del")) {
			String id = req.getParameter("id");
			dao.delete(id);
			getAll(req, dao);
			req.getRequestDispatcher("/news.do?method=list").forward(req, resp);
		}

	}

	private void getAllForUpdate(HttpServletRequest req, ShangjiaDao dao) {

		List list = dao.getAll( req.getParameter("id")  , req.getParameter("t")  );
		req.setAttribute("list", list); 
	}
	
	
	private void getAll(HttpServletRequest req, ShangjiaDao dao) {

		List list = dao.getAll( req.getParameter("id")  , req.getParameter("t")  );

		req.setAttribute("list", list); 
	}
  
	
}
