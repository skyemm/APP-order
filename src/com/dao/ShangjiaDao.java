package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.web.util.Tool;
import com.origin.base.DAOBase;   
import com.model.Shangjia;


public class ShangjiaDao {

	public  void delete( String id ){
			DAOBase dao = new DAOBase(); 
			String sql = " delete from  shangjia   where  id=" + id  ; 
			dao.executeSql(sql);   	  
	}
	
	public  int  save( Shangjia object ){

    	DAOBase dao = new DAOBase(); 
		String sql =  "insert into   shangjia ( " + 
		         			" yonghuming, " +  
		         			" mima, " +  
		         			" mingcheng, " +  
		         			" dianhua, " +  
		         			" dizhi ) values( '" + 
		         			object.yonghuming + "','" + 
		         			object.mima + "','" + 
		         			object.mingcheng + "','" + 
		         			object.dianhua + "','" + 
		         			object.dizhi + "') ";
		return dao.executeSql(sql);   	 
	}
	
	public  List getAll( String id , String type ){
		
		List<Shangjia> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql=" select * from   shangjia  where 1=1 " ;
			
			if( type != null && !type.equals("") ){
				sql += "  and name = '" + type + "' ";
			}
			sql += " order by id desc  ";  
			
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Shangjia object = new Shangjia();
				object.id =   String.valueOf( rs.getInt(1))  ;
         		object.yonghuming =   rs.getString("yonghuming"); 
         		object.mima =   rs.getString("mima"); 
         		object.mingcheng =   rs.getString("mingcheng"); 
         		object.dianhua =   rs.getString("dianhua"); 
         		object.dizhi =   rs.getString("dizhi"); 
				list.add(object); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return list;
	}
	
	
	public  void update( String id , Shangjia o ){

    	DAOBase dao = new DAOBase(); 
    	String sql = null; 
    	sql = " update   shangjia  set  " + 
		         			"yonghuming =  '" +  o.yonghuming + "' , '" + 
		         			"mima =  '" +  o.mima + "' , '" + 
		         			"mingcheng =  '" +  o.mingcheng + "' , '" + 
		         			"dianhua =  '" +  o.dianhua + "' , '" + 
		         			"dizhi =  '" +  o.dizhi + "' where id = " + id  ; 
		dao.executeSql(sql);   	 
	}

	
	public  Shangjia  getObjectById( String id ){
		
    	DAOBase dao = new DAOBase();
		Shangjia  object =  null ; 
		try { 
			String sql = "select * from  shangjia  where id=" + id ;  
			 
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			if(rs.next()) {

				object = new Shangjia(); 
				object.id =   String.valueOf( rs.getInt(1))  ;
         		object.yonghuming =   rs.getString("yonghuming");
         		object.mima =   rs.getString("mima");
         		object.mingcheng =   rs.getString("mingcheng");
         		object.dianhua =   rs.getString("dianhua");
         		object.dizhi =   rs.getString("dizhi");
				return object ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return null;
	}
	
		
		
	public  Shangjia login( String name , String password){

		DAOBase dao = new DAOBase();
		Shangjia  object =  null ; 
		try { 
			String sql = "select * from  shangjia  where  yonghuming='" + name + "' and mima='" + password +"' ";  
			 
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			if(rs.next()) {

				object = new Shangjia(); 
				object.id =   String.valueOf( rs.getInt(1))  ;
         		object.yonghuming =   rs.getString("yonghuming");
         		object.mima =   rs.getString("mima");
         		object.mingcheng =   rs.getString("mingcheng");
         		object.dianhua =   rs.getString("dianhua");
         		object.dizhi =   rs.getString("dizhi");
				return object ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return null;
	}
	
	
	
		
}
