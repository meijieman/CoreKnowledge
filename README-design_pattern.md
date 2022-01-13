# 设计模式
1.设计模式的目的
设计模式是为了更好的代码重用性，可读性，可靠性，可维护性。


1)单一职责原则
2)里氏替换原则
3)依赖倒转原则
4)接口隔离原则
5)迪米特法则
6)开闭原则


##六大设计原则 SOLID （solid，稳定的）
Single Responsibility Principle：(SRP)单一职责原则
Open Closed Principle：(OCP)开闭原则
Liskov Substitution Principle：(LSP)里氏替换原则
Law of Demeter：(LOD)迪米特法则
Interface Segregation Principle：(ISP)接口隔离原则
Dependence Inversion Principle：(DIP)依赖倒置原则




## 动态代理
生成代理类字节码  
JDK 为我们提供了一个方法 ProxyGenerator.generateProxyClass(String proxyName,class[] interfaces) 来产生动态代理类的字节码，
这个类位于 sun.misc 包中，是属于特殊的 jar 包，于是问题又来了，android studio 创建的 android 工程是没法找到 ProxyGenerator 这个类的。



public Object invoke(Object proxy, Method method, Object[] args)


proxy是真实对象的真实代理对象，invoke方法可以返回调用代理对象方法的返回结果，也可以返回对象的真实代理对象














