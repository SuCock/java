package com.yedam.java.example;

public interface Scheduler {
	public void getNextCall();   //int 같이 돌려받는 값이 없음으로 void를 쓴다

	public void sendCallToAgent();
}
