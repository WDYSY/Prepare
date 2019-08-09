<?php
/*echo "post page";
echo '<br>';

print_r($_POST);
echo '<br>';

print_r($_FILES);
echo '<br>';*/
//1、获取上传文件对应的字典
$fileinfo = $_FILES['upFile'];
print_r($fileinfo);
//2、获取上传文件的名称
$filename = $fileinfo['name'];
//3、获取上传文件的临时路径
$filepath = $fileinfo['tmp_name'];
//4、移动文件
move_uploaded_file($filepath,"source/".$filename)

/*主要学会了看文档的思路*/
?>