/* 入口文件 webpack天生支持es6 */
import _ from 'lodash'
import './style/index.css';
function createDomElement(){
    let dom = document.createElement("div");
    //只调用了一个lodash的join函数
    dom.innerHTML=_.join(['Hello', 'stranger of webpack', 'do not panic','I am easy to Learn~~~'])
    dom.classList.add('box')    //dom.className = 'box'
    return dom;
}
let divDom = createDomElement();
document.body.appendChild(divDom);