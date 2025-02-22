package com.example.demo.domain.user.service;

import java.util.List;

import com.example.demo.domain.user.model.MUser;

public interface UserService {

	/** ユーザー登録 */
	public void signup(MUser user);
	
	/** ユーザー取得 */
	public List<MUser> getUsers(MUser user);
	
	/** ユーザー取得(1件) */
	public MUser getUserOne(String userId);
	
	/** ユーザー更新(1件) */
	public void updateUserOne(String userId,
			String passaword,
			String userName);
	
	/** ユーザー削除(1件) */
	public void deleteUserOne(String userId);
}
