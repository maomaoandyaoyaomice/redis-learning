package org.aptech.redis.redis_learning;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class TestJedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("10.211.55.12", 6379);
//		String result = jedis.ping();
//		System.out.println(result);
		
		//String类型
//		String result = jedis.get("username");
//		System.out.println(result);
//		String aa = jedis.set("material", "stone");
//		System.out.println(aa);
		
		//hash类型
		Map<String, String> computer = jedis.hgetAll("computer");
		for (String key : computer.keySet()) {
			System.out.println(key + " = " + computer.get(key));
		}
		
	}
}






