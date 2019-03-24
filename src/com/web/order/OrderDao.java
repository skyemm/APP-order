package com.web.order;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.origin.base.DAOBase; 
import com.web.food.Food;
import com.web.util.Constant;
import com.web.util.Tool;



public class OrderDao {

	public  void delete( String id ){
			DAOBase dao = new DAOBase(); 
			String sql = " delete from  orders  where  id=" + id  ; 
			dao.executeSql(sql);   	  
	}
	
	public  void save( Order object ){

    	DAOBase dao = new DAOBase(); 
		String sql =  "insert into  orders  (  food_id   , seat , description , order_date , beizhu  , price ,userid,tel) values( '" + 
								object.getFood_id()   + "' , '" + object.getSeat()  + "' , '" + object.getDesc()  + "' , '" + 
								 Tool.getNowTime() + "' , '" + object.beizhu   + "' , '"  + object.price  +  "' , '" + object.userid  +  "' , '" + object.tel  +  "')";   
		dao.executeSql(sql);   	 
	}

	public  void updateOrder( String id  , String state ){
 
    	DAOBase dao = new DAOBase();  
		String sql =  " update orders  set  state = '" + state + "'  where  id=" + id ;   
		dao.executeSql(sql);   	 
	}

	
	
	public  List getAll( Object str  ){
		
		List<Order> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 

			String sql=" select * from orders  where food_id = '" + str + "' order by id desc  "; 
			
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Order object = new Order();
				object.setId( String.valueOf( rs.getInt(1))) ; 
				object.setFood_id(  rs.getString("food_id") );
				object.setSeat(  rs.getString(3) ) ;
				object.setDesc(  rs.getString(4) ); 
				object.setOrder_date(  rs.getString(5) ); 

				object.beizhu = rs.getString(6) ; 
				object.price = rs.getString(7) ; 
				object.state =  rs.getString("state") ; 
				
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
	
	public static  List getuserall(String str  )throws UnsupportedEncodingException{
		
		List<Order> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
    	str=URLDecoder.decode(str, "UTF-8");
		try { 

			String sql=" select * from orders  where userid = '" + str + "' order by id desc  "; 
			
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Order object = new Order();
				object.setId( String.valueOf( rs.getInt(1))) ; 
				object.setFood_id(  rs.getString("food_id") );
				object.setSeat( rs.getString(3) ) ;
				object.setDesc(  rs.getString(4) ); 
				object.setOrder_date(  rs.getString(5) ); 

				object.beizhu = rs.getString(6) ; 
				object.price = rs.getString(7) ; 
				object.state =  rs.getString(8) ; 
				object.tel =  rs.getString(10) ; 
				
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
	
public static  List getuserbystate(String str,String state )throws UnsupportedEncodingException{
		
		List<Order> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
    	str=URLDecoder.decode(str, "UTF-8");
    	state=URLDecoder.decode(state, "UTF-8");
		try { 

			String sql=" select * from orders  where userid = '" + str + "'and state = '" + state + "'order by id desc  "; 
			
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Order object = new Order();
				object.setId( String.valueOf( rs.getInt(1))) ; 
				object.setFood_id(  rs.getString("food_id") );
				object.setSeat( rs.getString(3) ) ;
				object.setDesc(  rs.getString(4) ); 
				object.setOrder_date(  rs.getString(5) ); 

				object.beizhu = rs.getString(6) ; 
				object.price = rs.getString(7) ; 
				object.state =  rs.getString(8) ; 
				object.tel =  rs.getString(10) ; 
				
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


	public  List getAll(){
		
		List<Order> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql=" select * from orders order by id desc ";  
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Order object = new Order();
				object.setId( String.valueOf( rs.getInt(1))) ; 
				object.setFood_id(  rs.getString(2) );
				object.setSeat(  rs.getString(3) ) ;
				object.setDesc(  rs.getString(4) ); 
				object.setOrder_date(  rs.getString(5) ); 

				object.beizhu = rs.getString(6) ; 
				object.price = rs.getString(7) ; 
				object.state =  rs.getString(8) ; 
				
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
	 
	public  String tongji( String  startDate , String endDate  ){
		
		String sum_price = null ;
    	DAOBase dao = new DAOBase();
		try {  
			String sql=" select sum(price) as sum_price  from orders where order_date > '" + startDate + "' and  order_date < '" + endDate + "'";  
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				sum_price  = rs.getString("sum_price") ;  
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return sum_price;
	}

	
//	public  Food getFoodById( String food_id ){
//
//		Food object = null ;
//    	DAOBase dao = new DAOBase();
//		try { 
//			String sql=" select * from " + Constant.DB_PREFIX + "food_info  where food_id=  " + food_id	 + "     order by food_id desc  "  ;  
//	    	dao.querySql(sql);
//    		ResultSet rs = dao.getRes(); 
//			while(rs.next()) {
//				object = new Food();
//				object.setFood_id(  rs.getString("food_id") );
//				object.setFood_name( rs.getString(2) ) ;
//				object.setFood_pic( rs.getString(3) ); 
//				object.setFood_description( rs.getString(4) ); 
//				object.setFood_price(  String.valueOf( rs.getFloat(5) ) );
//				object.setFood_discount_price(  String.valueOf( rs.getFloat(6) ) );
//				object.setFood_flag(  String.valueOf( rs.getInt(7) ) );
//
//				object.food_count =  rs.getString("food_count") ; 
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			if(dao != null)
//				dao.release();			
//		}
//		return object ;
//	}

	
//	public  void updateFoodCount( String food_id , long food_count){
// 
//    	DAOBase dao = new DAOBase(); 
//		String sql =  " update food_info  set  food_count = '" + food_count + "'  where  food_id=" + food_id ;   
//		dao.executeSql(sql);   	 
//	}

	
}
