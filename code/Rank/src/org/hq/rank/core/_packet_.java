package org.hq.rank.core;

public class _packet_ {
	/**
	 * 最后加try cache，尤其是获取的里面，如果出现空指针之类的
	 * 池要限制最大量，达到最大力量不再放入，或者清理多余
	 * hashCode是否有必要再hash一次，更离散一些
	 * 
	 * 锁和解锁尽量用try 和 finally结构
	 * 
	 * 
	 * 后面加功能的时候，如果有return，别忘了本函数中的锁解锁
	 * 
	 * 
	 * if(currentNodeStep.
					getHead(). // 这个地方有空指针可能
					getValue() < value){
	 */
	/**
	 * 后面要实现的功能：
	 * 1、配置文件：针对所有的rank，针对单个的rank（配置rank）
	 * 2、添加持久化：(1)同步/异步存储到文件/数据库，(2)启动加载，停止存储
	 * 3、失败的操作持久化
	 * 4、统一所有的异常，在service层捕获并处理
	 * 5、异常系统
	 * 6、添加英文注释？
	 * 7、添加AOP特性，对统计，异常等提供低耦合支持
	 * 8、添加网络接口访问
	 * 
	 * 
	 * 修改为maven项目？
	 * 
	 * 项目现在是GBK编码？
	 * 
	 * 实测（MACPRO）
	 * 当数据量较大时，需要设置较大的JVM内存大小
	 * 4g内存1000万数据排行4000000000/10000000=400b，实际应该没有那么大，但是还是需要优化，太高了
	 * 访问复杂度维持在400左右
	 * 每10秒set需求近80000
	 * CPU基本维持在100%（共400%）周期性的冲到近400%
	 * 注意：当内存即将耗尽（既要考虑虚拟机设置内存，又要考虑计算机实际使用内存），CPU会更加多的走高，直到资源耗尽
	 * 以上内存走高可能是JVM回收内存（目前猜测），还是要学习JVM知识啊
	 * 
	 * 添加个两个脚本文件，用于启动rankTest
	 * 
	 */
}
