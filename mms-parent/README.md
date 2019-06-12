## IDEA使用GIT push的时候提示"push to origin/master was rejected"解决方案

**push to origin/master was rejected错误解决方案**

idea中，发布项目到`github`中，当时按照流程添加Git，然后push，提示："push to origin/master war rejected"。

图：···

解决方案如下：

切换到自己项目所在的目录，打开Terminal窗口(Alt+F12)，执行如下命令：

git pull

git pull origin master

git pull origin master --allow-unrelated-histories

命令执行完毕后，在idea中重新push自己的项目，成功！！！


