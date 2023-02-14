package org.vision.chap08;
// Data Access Object - Dao
public interface Dao {
	boolean insert(Object obj); // 데이터를 넣는 것 
	boolean delete(String key); // 데이터를 삭제하는 것
	boolean update(Object obj); // 데이터를 갱신하는 것(수정) - VO를 보고, 갱신이 필요한 데이터를 수정해 주어라.
	Object select(String key); // 데이터를 선택하는 것 - 오브젝트를 리턴 받으라.
	Object[] selectAll(); // 모든 데이터를 선택하는 것 - 오브젝트인데, 배열로 모두 가져오라.

}

/*
 * 데이터베이스 안에 있는 데이터에 접근하는 객체
 * 데이터베이스 접근 객체를 만들어 주는 인터페이스
 */
