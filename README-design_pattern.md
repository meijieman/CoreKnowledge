# 设计模式



## 动态代理
生成代理类字节码  
JDK 为我们提供了一个方法 ProxyGenerator.generateProxyClass(String proxyName,class[] interfaces) 来产生动态代理类的字节码，
这个类位于 sun.misc 包中，是属于特殊的 jar 包，于是问题又来了，android studio 创建的 android 工程是没法找到 ProxyGenerator 这个类的。



public Object invoke(Object proxy, Method method, Object[] args)


proxy是真实对象的真实代理对象，invoke方法可以返回调用代理对象方法的返回结果，也可以返回对象的真实代理对象














