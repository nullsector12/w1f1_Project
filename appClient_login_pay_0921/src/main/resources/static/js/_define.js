//var domain = "http://localhost:8080/order";
var domain = "http://ec2-54-180-98-41.ap-northeast-2.compute.amazonaws.com:8080/order_socket";
var loginInfo = document.getElementById("loginInfo").value;
var loginMidx = document.getElementById("loginMidx").value;
var loginName = document.getElementById("loginName").value;



//var domain = "http://localhost:8080/order";



//var domain = "http://ec2-54-180-98-41.ap-northeast-2.compute.amazonaws.com:8080/Order0916";



//var domain = "http://localhost:8080/order";
//var loginMidx = 1;
//var loginName = 'Park Hye Mi';


//item.js
//var domain = "http://ec2-54-180-98-41.ap-northeast-2.compute.amazonaws.com:8080/Order0917";
//var domain = "http://ec2-54-180-98-41.ap-northeast-2.compute.amazonaws.com:8080/Order0916";
//var domain = "http://localhost:8080/order";


//seller.js
//var domain = "http://ec2-54-180-98-41.ap-northeast-2.compute.amazonaws.com:8080/Order0916";
//var domain = "http://localhost:8080/order";

// var loginMidx = 1;



// 프로필 관련 --------------------------------------------------------------------------------------
function profile() {

    var loginInfo = document.getElementById("loginInfo").value;
	var loginMidx = document.getElementById("loginMidx").value;
	var loginName = document.getElementById("loginName").value;
	var loginImg = document.getElementById("loginImg").value;
	var html='';
	
    $.ajax({
        url : domain+'/orders',
        type : 'GET',
        success : function(data){
        
            html +='<div class="aside_myimg">';
            html +='    <img src="'+loginImg+'">';
            html +='</div>';
            html +='<div class="aside_myprofile">';
            html +='    <h3><b>'+loginName+'</b></h3>';
            //html +='    <h4 class="myrvs">Seller ★ '+data.rvs+' </h4> | <h4 class="myrvb"> Buyer ★ '+data.rvb+' </h4>';
            html +='    <h4 class="myrvs">Seller ★ '+data[0]+' </h4> | <h4 class="myrvb"> Buyer ★ '+data[1]+' </h4>';
            html +='</div>';
            
            $('.profile').html(html);
        
        }

    });
}

