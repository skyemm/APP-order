<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>新增菜谱</title>
		<%@ include file="/commons/taglibs.jsp"%>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<link href="common/css.css" rel="stylesheet" type="text/css" />
	</head>
<style type="text/css">
table td {
	padding-bottom: 2px;
	padding-left: 4px;
	padding-right: 4px;
	padding-top: 4px;
	font-size: 12px;
	border-bottom: #c7c7c7 1px solid;
}

body {
	margin: 0;
	font-size: 12px;
	background: url('images/30.gif') repeat-x 0px 0px;
	background-color: #f8f8f8;
}

.loglist {
	width: 90%;
	margin-top: 8px;
	margin-left: 50px;
	padding-bottom: 1px;
	border-bottom: #c7c7c7 1px solid;
}

.list {
	cursor: default;
	margin-top: 1px;
	height: 298px;
	overflow-y: auto;
	overflow-x: hidden;
	scrollbar-shadow-color: #ffffff;
	scrollbar-highlight-color: #ffffff;
	scrollbar-face-color: #d9d9d9;
	scrollbar-3dlight-color: #d9d9d9;
	scrollbar-darkshadow-color: #d9d9d9;
	scrollbar-track-color: #f6f6f6;
	scrollbar-arrow-color: #ffffff;
}
</style>
<body>

	<c:if test="${(not empty s) && (s == 0 )}" >
		<script> 
			alert('新增成功！') ;
		</script>
	</c:if> 
	
	
	<form name="form1" action="foodEdit.do?method=save" method="post" enctype="multipart/form-data">
		<div class="loglist">
				<table width="90%" cellspacing="0" cellpadding="0" align="center">
					<tr>
						<td colspan="2">
							<h3> 新增菜谱 </h3>&nbsp; 
						</td>
					</tr>
					
					<tr align="left">
						<td width="20%">
							 菜名
						</td>
						<td width="70%">
							<input type="hidden"" name="foodId" value="${map.food_id}">
							<input type="text" name="foodName" value="${map.food_name}"  size=70   >
						</td>
					</tr>
					 
					<tr>
						<td  width="20%">
							图片
						</td>
						<td width="70%">
							<input type="file" name="pic" value=""   size=70  >
							<c:if test="${not empty map.food_pic}" >
							    <img src="${map.food_pic}" name="editSrc" height="100" width="100"/>&nbsp;
							</c:if>
						</td>
					</tr>

					
					<tr>
						<td  width="20%">
							原价格：
						</td>
						<td  width="70%">
							<input type="text" name="price" value="${map.food_price}"  size=70  >
						</td>
					</tr>
					<tr>
						<td  width="20%">
							优惠价：
						</td>
						<td  width="70%">
							<input type="text" name="discountPrice" value="${map.food_discount_price}"  size=70   >
						</td>
					</tr>
					
					
					<tr>
						<td  width="20%">
							菜谱类别：
						</td>
						<td  width="70%">
							<select name="flag">
								<option <c:if test="${(not empty map.food_flag) && (map.food_flag == 2 )}" > selected="selected" </c:if>  value="2">普通菜谱</option>
								<option <c:if test="${(not empty map.food_flag) && (map.food_flag == 0 )}" > selected="selected" </c:if> value="0">地区特色菜</option>
								<option <c:if test="${(not empty map.food_flag) && (map.food_flag == 1 )}" > selected="selected" </c:if> value="1">精品推荐</option>
								<option <c:if test="${(not empty map.food_flag) && (map.food_flag == 3 )}" > selected="selected" </c:if> value="3">饮品</option>
								<option <c:if test="${(not empty map.food_flag) && (map.food_flag == 4 )}" > selected="selected" </c:if> value="4">素菜</option>
								<option <c:if test="${(not empty map.food_flag) && (map.food_flag == 5 )}" > selected="selected" </c:if> value="5">汤菜</option>
							</select>
						</td>
					</tr>
					
					<tr>
						<td  width="20%">
							口味： 
						</td>
						<td  width="70%">
							<input type="text" name="kouwei" value="${map.kouwei}"  size=70  >
						</td>
					</tr>
					
					<tr>
						<td  width="20%">
							描述
						</td>
						<td  width="70%">
 							  <textarea name="description" rows="15" cols="60"></textarea>
 
						</td>
					</tr>		
					
					
							<input type="hidden" name="renqun"   value='<%=request.getSession().getAttribute("screen_name")%>' />
					       <input type="hidden" name="shangjia666"   value='<%=request.getSession().getAttribute("shangjia666")%>' />
							
					 
				</table>
				<div class="list">
					<table width="90%" border="0" height="20" align="center">
							<tbody>
								<tr>
									<td>
										<input type="button"" value="提交" onclick="goSubmit();"/> &nbsp;&nbsp;&nbsp;&nbsp;
										<input type="button" name="cancel" value="取消" onclick="history.go(-1);" />
									</td>
								</tr>
							</tbody>
					</table>
				</div>
		</div>
	</form>
	
	
<script>
	function goSubmit(){
		form1.submit();
	}
</script>
	
	
</body>

</html>
