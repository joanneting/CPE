```java=  
Integer count = Long.bitCount(number); //計算位元數
String numberStr = Integer.toBinaryString(number); //Integer轉二進制
Integer.toBinaryString(19); //十進位19轉二進位10011
Integer.toHexString(19); //十進位轉19十六進位13
Integer.toOctalString(19); //十進位19轉八進位23

/*
double 轉 int
Double d = new Double(1.23);
int i = d.intValue();
*/

// uva10420
Map<String,Integer> countryMap = new TreeMap<>();  // treeMap 預設升冪排序
countryMap.containsKey(key) // 判斷是否有傳入的key
for(Object key : countryMap.keySet()) {
	System.out.println(key+" "+countryMap.get(key));
}// 遍歷 map
```

* uva10193
	* 通過不停的將除數除以餘數得到公因數

* uva10221
	* 正弦定理
		* ![](https://i.imgur.com/3sb4lrx.png)
	* 弧度計算
		* ![](https://i.imgur.com/nelGQI6.png)
	* Math.sin(弧度)