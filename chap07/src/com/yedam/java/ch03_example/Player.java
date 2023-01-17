package com.yedam.java.ch03_example;

public class Player {
	// 필드 플레이어가 가지는 정보
	private PlayerLevel level;

	// 생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	// 메소드 해당 플레이어가 레벨이 업되었을때 진행되는
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}// 플레이어가 필사기를 썼을때 진행되는 
	public void play(int count) {
		level.go(count);
	}
}
