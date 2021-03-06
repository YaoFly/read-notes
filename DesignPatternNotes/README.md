# 设计模式之蝉

## 设计原则

### 单一职责原则
接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化。面向接口编程，实现多个接口。

### 里氏替换原则
派生类（子类）对象能够替换其基类（超类）对象被使用。   ---书中意图不明

### 依赖倒置原则(面向接口编程)
* 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的。
* 接口或抽象类不依赖于实现类。
* 实现类依赖接口或抽象类。

依赖的三种写法：
* 构造函数传递依赖对象
* Setter方法传递依赖对象
* 接口声明依赖对象

### 接口隔离原则
建立单一接口，不要建立庞大臃肿的接口，尽量细化接口，接口中的方法尽量少，但是要有限度，为依赖接口的类定制服务。

### 迪米特法则
一个对象应该对其他对象有最少的了解。减少耦合(private)

### 开闭原则
 一个软件实体如类、模块、函数应该对扩展开放，对修改关闭