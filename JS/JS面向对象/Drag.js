/* onload变成构造函数 */
function Drag(id){
    var _this = this;
    this.disX = null;
    this.disY = null;
    this.oDiv = document.getElementById(id);
    this.oDiv.onmousedown=function(ev){
        _this.fnDown(ev)
        return false;
    };
}
Drag.prototype.fnDown = function(ev){
    var _this = this;
    var oEvent = ev||event;
            //clientX 事件属性返回当事件被触发时鼠标指针相对于浏览器页面（或客户区）的水平坐标。
    this.disX = oEvent.clientX - this.oDiv.offsetLeft;
    this.disY = oEvent.clientY - this.oDiv.offsetTop;
    document.onmousemove = function(ev){
        _this.fnMove(ev);
    };
    document.onmouseup = function(ev){
        _this.fnUp(ev);
    };;
}
Drag.prototype.fnMove = function(ev){
    var oEvent = ev || event;
    this.oDiv.style.left = oEvent.clientX - this.disX+'px';
    this.oDiv.style.top = oEvent.clientY - this.disY+'px';
}
Drag.prototype.fnUp = function(){
    document.onmousemove = null;
    document.onmouseup = null;
} 