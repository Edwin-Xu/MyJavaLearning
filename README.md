# java核心技术-高阶

## 基础
- 多用lambda，高大上： java.util.function (4个基本的函数式接口)

- 创建对象的几种方式：
>- 静态编码编译：new 
>- 序列化、反序列化
>- 克隆Clone()
>- 反射: newInstance()

-反射的实现机理是什么？
> 我不知道


- String.format???
```text
int n=10;
String s= String.format("%0" + n + "d", 0).replace("0","非常重要");
System.out.println(s);
```

-java接口？？？

- 统计数组中元素出现的次数 
```text
int arr[] = {1,1,1,1,23,2,32332,234,3,434,342,32,32,323,4,44,4};
Map<Integer,Integer> map = new HashMap<>();
for (int i : arr) {
    map.merge(i,1,Integer::sum);
}
```

## JVM
### 内存分区
- jvm栈
- 本地方法栈
- 堆
- 方法区：常量池
- PC


