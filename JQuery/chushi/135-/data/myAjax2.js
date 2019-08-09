function ajax(type, url, obj, success, error) {
    function obj2Str(obj) {
        var res = []
        for(var key in obj){
            res.push(key+"="+obj[key]);
        }
        res = res.join('&')
        return res;
    }
    obj.t = new Date().getTime()
    var str = obj2Str(obj);
    var xmlhttp;
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = ActiveXObject('Microsoft.XMLHTTP');
    }
    if(type == "GET"){
        xmlhttp.open(type,url+"?"+str,true);
    }else{
        xmlhttp.open(type, url,true);
        xmlhttp.setRequestHeader('Content-type','application/x-www-form-urlencoded');
        xmlhttp.send(str);
    }
    /*xmlhttp.open("get",url+'?'+str,true);
    xmlhttp.send();*/
    xmlhttp.onreadystatechange = function(ev2){
        if(xmlhttp.readyState == 4){
            if(xmlhttp.status >=200 && xmlhttp.status<=300 || xmlhttp === 304){
                // console.log('接到服务器的响应');
                success(xmlhttp);
                // alert(xmlhttp.responseText);
            }else{
                // console.log('无响应');
                console.log(str);
                error(xmlhttp);
            }
        }
    }
}