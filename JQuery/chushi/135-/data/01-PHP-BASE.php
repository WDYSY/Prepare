<?php
//1、

//2、如何定义变量
/*$num = 10;*/
//3、如何打印内容
/*echo $num;
echo "<br>";*/
//4、如何定义集合
//4.1 数组
/*$arr = array(1,2,3,3);
print_r($arr);
echo "<br>";
echo $arr[1];
echo "<br>";*/

//4.2 字典Or对象
/*$dict = array('name'=> 'Joann',"age"=>"23");
print_r($dict);
echo "<br>";
//4.2.1、如何获取集合的值
echo $dict['name'];
echo "<br>";*/

//5、J循环分支语句
//if、switch、while、for
$age = 23;
/*if($age>18){
    echo "成年人";
}else{
    echo "小孩子";
}*/

/*switch ($age){
    case 0:
        echo '0';
        break;
    case 23:
        echo '23';
        break;
    default:
        echo "不知道";
        break;
};*/

/*$arr = array(1,2,3,5);
for($i = 0; $i<count($arr); $i++){
    echo $arr[$i];
    echo "<br>";
}*/
$arr = array(1,2,3,5);
$index = 0;
while ($index<count($arr)){
    echo $arr[$index];
    echo '<br>';
    $index++;
}

?>