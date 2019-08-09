/* 文件名不可更改 */
const path = require('path')  //node.js的知识???
module.exports = {
    entry:'./src/index.js',
    mode:'development',
    output:{
        filename:'main.js',
        path:path.resolve(__dirname,'dist') //resolve的作用就是把相对路径转换成绝对路径
    }
}