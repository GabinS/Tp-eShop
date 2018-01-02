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
    <li><a href="/product">Products</a></li>
    <li><a href="/order">Orders</a></li>
    <li class="active_menu_item"><a href="/customer">Customers</a></li>
    <li><a href="/">Connection</a></li>
  </ol>
</div>
<!-- END header -->
<div id="container">
  <h1 style="padding: 20px 0">Customers</h1>
  
  <#list customers as customer>
   
	  <div style="display: inline-block; min-width: 250px; margin: 10px;">
	    <div class="heading_bg">
	      <h2>${customer.firstName} ${customer.lastName}</h2>
	    </div>
	    <p><strong>Adresse: </strong>${customer.address}<br>
	      <br>City:${customer.city}
	      <br>Tel: ${customer.phone}<br></p>
	  </div>
	
	</#list>
  
  
  <div style="clear:both; height: 40px"></div>
</div>
<!-- END container -->

</body>
</html>