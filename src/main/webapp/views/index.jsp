<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$('#myTab a').click(function(e) {
		e.preventDefault()
		$(this).tab('show')
	})

$('#myTab a[href="#profile"]').tab('show') // Select tab by name
$('#myTab a:first').tab('show') // Select first tab
$('#myTab a:last').tab('show') // Select last tab
$('#myTab li:eq(2) a').tab('show') // Select third tab (0-indexed)
</script>

<title>:: Spring Test ::</title>
</head>
<body style="text-align: center; margin: 10px 10px 10px 10px;">

<div role="tabpanel">

  <!-- Nav tabs -->
  <ul class="nav nav-tabs" role="tablist">
    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">GET</a></li>
    <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">POST</a></li>
    <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">JPA</a></li>
  </ul>

  <!-- Tab panes -->
  <div class="tab-content">
    <div role="tabpanel" class="tab-pane active" id="home">
    	<!--  form class="form-horizontal" style="margin: 30px 100px;" method="get" name="gfrm" action="/gett">
		  <div class="form-group">
		    <label for="exampleInputName2">Name</label>
		    <input type="text" class="form-control" id="gname" name="gname" placeholder="이지은">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail2">Email</label>
		    <input type="email" class="form-control" id="gemail" name="gemail" placeholder="이지은메일@example.com">
		  </div>
		  <button type="submit" class="btn btn-primary">Send</button>
		</form-->
		<br/><br/><br/>
		<a href="/gett?gname=이지은&gemail=jieun1223@jei.com"> <button type="button" class="btn btn-primary">GET 테스트 </button></a>
    </div>
    
    
    <div role="tabpanel" class="tab-pane" id="profile" >
    	<form class="form-horizontal" style="margin: 30px 100px;" method="post" name="pfrm" action="/pst">
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">이름</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="name" name="name" placeholder="이름">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">폰번호</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="phone" name="phone" placeholder="폰번호">
			    </div>
			  </div>
			  	<div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">나이</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="age" name="age" placeholder="나이">
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			       <button type="submit" class="btn btn-primary">POST 테스트</button>
			    </div>
			  </div>
			</form>
    </div>
    
    
    <div role="tabpanel" class="tab-pane" id="messages">
    	<br/><br/><br/>
    	<a href="/jpalist"><button type="button" class="btn btn-primary"> JPA 테스트</button></a>
    	<form class="form-horizontal" style="margin: 30px 100px;" method="get" name="frmjpa" action="/jpalist">
		  <div class="form-group">
		    <label for="exampleInputName2">Name</label>
		    <input type="text" class="form-control" id="name" name="name" placeholder="검색이름 입력">
		  </div>
		  <button type="submit" class="btn btn-primary">Send</button>
		</form>
    </div>
  </div>

</div>


</body>
</html>