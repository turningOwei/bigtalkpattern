##参考博客http://www.blogjava.net/kenzhh/archive/2013/03/15/357824.html
##参考书籍《大话设计模式》、《head first 设计模式》

##java创建对象的方式
###使用new关键字	                    } → 调用了构造函数
###使用Class类的newInstance方法	        } → 调用了构造函数
###使用Constructor类的newInstance方法	} → 调用了构造函数
###使用clone方法	                    } → 没有调用构造函数
###使用反序列化	                        } → 没有调用构造函数

###时间充裕可以演示

| 实现方式                              | 是否调用构造函数
| -------------                         |------------- 
| 使用new关键字                         |   是 
| 使用Class类的newInstance方法	        |   是
| 使用Constructor类的newInstance方法    |   是
| 使用clone方法                         |   否
| 使用反序列化	                        |   否
