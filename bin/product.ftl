<!DOCTYPE HTML>
<head>
<title>Bigshot</title>
<meta charset="utf-8">
<!-- CSS Files -->
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
<link rel="stylesheet" type="text/css" media="screen" href="menu/css/simple_menu.css">
<!--JS FILES -->
<script src="js/jquery.tools.min.js"></script>
<script>
$(function () {
    $("#prod_nav ul").tabs("#panes > div", {
        effect: 'fade',
        fadeOutSpeed: 400
    });
});
</script>
<script>
$(document).ready(function () {
    $(".pane-list li").click(function () {
        window.location = $(this).find("a").attr("href");
        return false;
    });
});
</script>
</head>
<body>
<div class="header">
  <!-- Logo/Title -->
  <div id="site_title"><a href="/home"> <h1>eShop</h1> </a> </div>
  <!-- Main Menu -->
  <ol id="menu">
    <li><a href="/home">Home</a></li>
    <li class="active_menu_item"><a href="/product">Products</a></li>
    <li><a href="/order">Orders</a></li>
    <li><a href="/customer">Customers</a></li>
    <li><a href="/">Connection</a></li>
  </ol>
</div>
<!-- END header -->
<div id="container">
  <!-- tab panes -->
  <div id="prod_wrapper">
    <div id="panes">
    	<#list products as product>
    	     		
	      <div>
	        <h4>${product.name} </h4>        
	        <h4>$ ${product.price}</h4>	        
	        <h5>Quantity : ${product.quantity}</h5>
	        <p>${product.description}</p>
	      </div>
      	
      	</#list>
      
    </div>
    <!-- END tab panes -->
    <!-- navigator -->
    <div id="prod_nav">
      <ul>
      
      	<#list products as product>
      		
      		<li><a href="#${product.id}"><h2>${product.name}</h2><strong>$ ${product.price}</strong></a></li>
      	
      	</#list>
        
      </ul>
    </div>
    <!-- close navigator -->
  </div>
  <!-- END prod wrapper -->
  <div style="clear:both"></div>
  
  <div style="clear:both; height: 40px"></div>
</div>
<!-- END container -->
</body>
</html>