##参考博客http://www.blogjava.net/kenzhh/archive/2013/03/15/357824.html

##java创建对象的方式
###使用new关键字	                    } → 调用了构造函数
###使用Class类的newInstance方法	        } → 调用了构造函数
###使用Constructor类的newInstance方法	} → 调用了构造函数
###使用clone方法	                    } → 没有调用构造函数
###使用反序列化	                        } → 没有调用构造函数