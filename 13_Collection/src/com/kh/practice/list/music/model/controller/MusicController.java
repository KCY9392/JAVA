package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		int result = 0;
		try {
		list.add(music);
		result = 1;
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int addAtZero(Music music) {
		int result = 0;
		try {
		list.add(0, music);
		result = 1;
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		Music m = null;
		for(int i=0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				m = list.get(i);
				list.remove(i);
				break;
			}
		}
		return m;
	}
	
	
}
