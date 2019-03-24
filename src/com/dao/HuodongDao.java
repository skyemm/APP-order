package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.origin.base.DAOBase;   
import com.model.Huodong;


public class HuodongDao {

	public  void delete( String id ){
			DAOBase dao = new DAOBase(); 
			String sql = " delete from  huodong   where  id=" + id  ; 
			dao.executeSql(sql);   	  
	}
	
	public  int  save( Huodong object ){

    	DAOBase dao = new DAOBase(); 
		String sql =  "insert into   huodong ( " + 
		         			" biaoti, " +  
		         			" neirong, " +  
		         			" shijian ) values(' " + 
		         			object.biaoti + "','" + 
		         			object.neirong + "','" + 
		         			object.shijian + "') ";
		return dao.executeSql(sql);   	 
	}
	
	public  List getAll( String id , String type ){
		
		List<Huodong> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql=" select * from   huodong  where 1=1 " ;
			
			if( type != null && !type.equals("") ){
				sql += "  and name = '" + type + "' ";
			}
			sql += " order by id desc  ";  
			
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Huodong object = new Huodong();
				object.id =   String.valueOf( rs.getInt(1))  ;
         		object.biaoti =   rs.getString("biaoti"); 
         		object.neirong =   rs.getString("neirong"); 
         		object.shijian =   rs.getString("shijian"); 
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
	
	
	public  void update( String id , Huodong o ){

    	DAOBase dao = new DAOBase(); 
    	String sql = null; 
    	sql = " update   huodong  set  " + 
		         			"biaoti =  '" +  o.biaoti + "' , '" + 
		         			"neirong =  '" +  o.neirong + "' , '" + 
		         			"shijian =  '" +  o.shijian + "' where id = " + id  ; 
		dao.executeSql(sql);   	 
	}

	
	public  Huodong  getObjectById( String id ){
		
    	DAOBase dao = new DAOBase();
		Huodong  object =  null ; 
		try { 
			String sql = "select * from  huodong  where id=" + id ;  
			 
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			if(rs.next()) {

				object = new Huodong(); 
				object.id =   String.valueOf( rs.getInt(1))  ;
         		object.biaoti =   rs.getString("biaoti");
         		object.neirong =   rs.getString("neirong");
         		object.shijian =   rs.getString("shijian");
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
